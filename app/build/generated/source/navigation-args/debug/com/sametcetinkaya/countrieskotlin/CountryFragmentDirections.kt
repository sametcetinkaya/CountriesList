package com.sametcetinkaya.countrieskotlin

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

class CountryFragmentDirections private constructor() {
  companion object {
    fun actionCountryFragmentToFeedFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_countryFragment_to_feedFragment)
  }
}
