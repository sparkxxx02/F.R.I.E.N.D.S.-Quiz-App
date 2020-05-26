package com.example.friendstrivia;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.friendstrivia.databinding.AboutLayoutBindingImpl;
import com.example.friendstrivia.databinding.ActivityMainBindingImpl;
import com.example.friendstrivia.databinding.CreditialsBindingImpl;
import com.example.friendstrivia.databinding.HomeLayoutBindingImpl;
import com.example.friendstrivia.databinding.LostLayoutBindingImpl;
import com.example.friendstrivia.databinding.QuizLayoutBindingImpl;
import com.example.friendstrivia.databinding.WinnerLayoutBindingImpl;
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
  private static final int LAYOUT_ABOUTLAYOUT = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_CREDITIALS = 3;

  private static final int LAYOUT_HOMELAYOUT = 4;

  private static final int LAYOUT_LOSTLAYOUT = 5;

  private static final int LAYOUT_QUIZLAYOUT = 6;

  private static final int LAYOUT_WINNERLAYOUT = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.friendstrivia.R.layout.about_layout, LAYOUT_ABOUTLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.friendstrivia.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.friendstrivia.R.layout.creditials, LAYOUT_CREDITIALS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.friendstrivia.R.layout.home_layout, LAYOUT_HOMELAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.friendstrivia.R.layout.lost_layout, LAYOUT_LOSTLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.friendstrivia.R.layout.quiz_layout, LAYOUT_QUIZLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.friendstrivia.R.layout.winner_layout, LAYOUT_WINNERLAYOUT);
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
        case  LAYOUT_ABOUTLAYOUT: {
          if ("layout/about_layout_0".equals(tag)) {
            return new AboutLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for about_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_CREDITIALS: {
          if ("layout/creditials_0".equals(tag)) {
            return new CreditialsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for creditials is invalid. Received: " + tag);
        }
        case  LAYOUT_HOMELAYOUT: {
          if ("layout/home_layout_0".equals(tag)) {
            return new HomeLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for home_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_LOSTLAYOUT: {
          if ("layout/lost_layout_0".equals(tag)) {
            return new LostLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for lost_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_QUIZLAYOUT: {
          if ("layout/quiz_layout_0".equals(tag)) {
            return new QuizLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for quiz_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_WINNERLAYOUT: {
          if ("layout/winner_layout_0".equals(tag)) {
            return new WinnerLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for winner_layout is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "quiz");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/about_layout_0", com.example.friendstrivia.R.layout.about_layout);
      sKeys.put("layout/activity_main_0", com.example.friendstrivia.R.layout.activity_main);
      sKeys.put("layout/creditials_0", com.example.friendstrivia.R.layout.creditials);
      sKeys.put("layout/home_layout_0", com.example.friendstrivia.R.layout.home_layout);
      sKeys.put("layout/lost_layout_0", com.example.friendstrivia.R.layout.lost_layout);
      sKeys.put("layout/quiz_layout_0", com.example.friendstrivia.R.layout.quiz_layout);
      sKeys.put("layout/winner_layout_0", com.example.friendstrivia.R.layout.winner_layout);
    }
  }
}
