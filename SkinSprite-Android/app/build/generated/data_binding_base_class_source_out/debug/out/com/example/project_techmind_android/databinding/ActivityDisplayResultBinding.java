// Generated by view binder compiler. Do not edit!
package com.example.project_techmind_android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.project_techmind_android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDisplayResultBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView textViewJson;

  @NonNull
  public final TextView textViewResult;

  private ActivityDisplayResultBinding(@NonNull LinearLayout rootView,
      @NonNull TextView textViewJson, @NonNull TextView textViewResult) {
    this.rootView = rootView;
    this.textViewJson = textViewJson;
    this.textViewResult = textViewResult;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDisplayResultBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDisplayResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_display_result, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDisplayResultBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.textViewJson;
      TextView textViewJson = ViewBindings.findChildViewById(rootView, id);
      if (textViewJson == null) {
        break missingId;
      }

      id = R.id.textViewResult;
      TextView textViewResult = ViewBindings.findChildViewById(rootView, id);
      if (textViewResult == null) {
        break missingId;
      }

      return new ActivityDisplayResultBinding((LinearLayout) rootView, textViewJson,
          textViewResult);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}