
// Copyright 2017 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../ui/android/resources/system_ui_resource_type.h

package org.chromium.ui.resources;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class SystemUIResourceType {
  @IntDef({
      OVERSCROLL_EDGE, OVERSCROLL_GLOW, OVERSCROLL_GLOW_L
  })
  @Retention(RetentionPolicy.SOURCE)
  public @interface SystemUIResourceTypeEnum {}
  public static final int OVERSCROLL_EDGE = 0;
  public static final int OVERSCROLL_GLOW = 1;
  public static final int OVERSCROLL_GLOW_L = 2;
}