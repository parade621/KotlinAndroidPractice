package com.example.lunchtray;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.lunchtray.databinding.FragmentAccompanimentMenuBindingImpl;
import com.example.lunchtray.databinding.FragmentCheckoutBindingImpl;
import com.example.lunchtray.databinding.FragmentEntreeMenuBindingImpl;
import com.example.lunchtray.databinding.FragmentSideMenuBindingImpl;
import com.example.lunchtray.databinding.FragmentStartOrderBindingImpl;
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
  private static final int LAYOUT_FRAGMENTACCOMPANIMENTMENU = 1;

  private static final int LAYOUT_FRAGMENTCHECKOUT = 2;

  private static final int LAYOUT_FRAGMENTENTREEMENU = 3;

  private static final int LAYOUT_FRAGMENTSIDEMENU = 4;

  private static final int LAYOUT_FRAGMENTSTARTORDER = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.lunchtray.R.layout.fragment_accompaniment_menu, LAYOUT_FRAGMENTACCOMPANIMENTMENU);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.lunchtray.R.layout.fragment_checkout, LAYOUT_FRAGMENTCHECKOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.lunchtray.R.layout.fragment_entree_menu, LAYOUT_FRAGMENTENTREEMENU);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.lunchtray.R.layout.fragment_side_menu, LAYOUT_FRAGMENTSIDEMENU);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.lunchtray.R.layout.fragment_start_order, LAYOUT_FRAGMENTSTARTORDER);
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
        case  LAYOUT_FRAGMENTACCOMPANIMENTMENU: {
          if ("layout/fragment_accompaniment_menu_0".equals(tag)) {
            return new FragmentAccompanimentMenuBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_accompaniment_menu is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCHECKOUT: {
          if ("layout/fragment_checkout_0".equals(tag)) {
            return new FragmentCheckoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_checkout is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTENTREEMENU: {
          if ("layout/fragment_entree_menu_0".equals(tag)) {
            return new FragmentEntreeMenuBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_entree_menu is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSIDEMENU: {
          if ("layout/fragment_side_menu_0".equals(tag)) {
            return new FragmentSideMenuBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_side_menu is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSTARTORDER: {
          if ("layout/fragment_start_order_0".equals(tag)) {
            return new FragmentStartOrderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_start_order is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(7);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "accompanimentFragment");
      sKeys.put(2, "checkoutFragment");
      sKeys.put(3, "entreeMenueFragment");
      sKeys.put(4, "sideMenuFragment");
      sKeys.put(5, "startOrderFragment");
      sKeys.put(6, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/fragment_accompaniment_menu_0", com.example.lunchtray.R.layout.fragment_accompaniment_menu);
      sKeys.put("layout/fragment_checkout_0", com.example.lunchtray.R.layout.fragment_checkout);
      sKeys.put("layout/fragment_entree_menu_0", com.example.lunchtray.R.layout.fragment_entree_menu);
      sKeys.put("layout/fragment_side_menu_0", com.example.lunchtray.R.layout.fragment_side_menu);
      sKeys.put("layout/fragment_start_order_0", com.example.lunchtray.R.layout.fragment_start_order);
    }
  }
}
