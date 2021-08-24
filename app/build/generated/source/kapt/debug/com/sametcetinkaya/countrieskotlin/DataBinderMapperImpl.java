package com.sametcetinkaya.countrieskotlin;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.sametcetinkaya.countrieskotlin.databinding.FragmentCountryBindingImpl;
import com.sametcetinkaya.countrieskotlin.databinding.FragmentFeedBindingImpl;
import com.sametcetinkaya.countrieskotlin.databinding.ItemCountryBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTCOUNTRY = 1;

  private static final int LAYOUT_FRAGMENTFEED = 2;

  private static final int LAYOUT_ITEMCOUNTRY = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sametcetinkaya.countrieskotlin.R.layout.fragment_country, LAYOUT_FRAGMENTCOUNTRY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sametcetinkaya.countrieskotlin.R.layout.fragment_feed, LAYOUT_FRAGMENTFEED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sametcetinkaya.countrieskotlin.R.layout.item_country, LAYOUT_ITEMCOUNTRY);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTCOUNTRY: {
          if ("layout/fragment_country_0".equals(tag)) {
            return new FragmentCountryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_country is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFEED: {
          if ("layout/fragment_feed_0".equals(tag)) {
            return new FragmentFeedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_feed is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCOUNTRY: {
          if ("layout/item_country_0".equals(tag)) {
            return new ItemCountryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_country is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "country");
      sKeys.put(2, "listener");
      sKeys.put(3, "selectedCountry");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_country_0", com.sametcetinkaya.countrieskotlin.R.layout.fragment_country);
      sKeys.put("layout/fragment_feed_0", com.sametcetinkaya.countrieskotlin.R.layout.fragment_feed);
      sKeys.put("layout/item_country_0", com.sametcetinkaya.countrieskotlin.R.layout.item_country);
    }
  }
}
