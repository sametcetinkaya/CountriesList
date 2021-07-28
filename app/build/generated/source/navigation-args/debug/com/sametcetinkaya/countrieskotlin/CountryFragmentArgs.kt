package com.sametcetinkaya.countrieskotlin

import android.os.Bundle
import androidx.navigation.NavArgs
import kotlin.Int
import kotlin.jvm.JvmStatic

data class CountryFragmentArgs(
  val countryUuid: Int = 0
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("countryUuid", this.countryUuid)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): CountryFragmentArgs {
      bundle.setClassLoader(CountryFragmentArgs::class.java.classLoader)
      val __countryUuid : Int
      if (bundle.containsKey("countryUuid")) {
        __countryUuid = bundle.getInt("countryUuid")
      } else {
        __countryUuid = 0
      }
      return CountryFragmentArgs(__countryUuid)
    }
  }
}
