package com.sametcetinkaya.countrieskotlin

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int

class FeedFragmentDirections private constructor() {
  private data class ActionFeedFragmentToCountryFragment(
    val countryUuid: Int = 0
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_feedFragment_to_countryFragment

    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putInt("countryUuid", this.countryUuid)
      return result
    }
  }

  companion object {
    fun actionFeedFragmentToCountryFragment(countryUuid: Int = 0): NavDirections =
        ActionFeedFragmentToCountryFragment(countryUuid)
  }
}
