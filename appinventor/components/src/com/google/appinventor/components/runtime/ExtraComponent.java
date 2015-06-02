// -*- mode: java; c-basic-offset: 2; -*-
// Copyright 2009-2011 Google, All Rights reserved
// Copyright 2011-2012 MIT, All rights reserved
// Released under the Apache License, Version 2.0
// http://www.apache.org/licenses/LICENSE-2.0

package com.google.appinventor.components.runtime;

import com.google.appinventor.components.annotations.DesignerComponent;
import com.google.appinventor.components.annotations.DesignerProperty;
import com.google.appinventor.components.annotations.PropertyCategory;
import com.google.appinventor.components.annotations.SimpleEvent;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.annotations.UsesLibraries;
import com.google.appinventor.components.annotations.UsesPermissions;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.common.YaVersion;
import android.content.Context;


/**
 *  The component has a block and a method called Extra.
 *  For simplicity, assume that the Extra method takes a numeric input and produces a numeric output.
 *  The component has another method called load-dynamic that takes a file spec.
 *  The file contains a jar/dex file that is loaded.
 *  And that code executes the computation for the Extra method
 *
 * @author CDK dev team: Ethan Hon <e.hon.dev@gmail.com>
                         Justus Raju <quixoticquixer@gmail.com>
                         Mouhamadou Oumar Sall <mouha.oumar@gmail.com>

 */


@DesignerComponent(version = YaVersion.EXTRA_COMPONENT_VERSION,
    description = "Non-visible component for CDK Testing purpose ",
    category = ComponentCategory.CDKDEV,
    nonVisible = true,
    iconName = "images/cdk.png") //FIXME
@SimpleObject
public class ExtraComponent extends AndroidNonvisibleComponent implements Component {

  private static final String LOG_TAG = "ExtraComponent";

  private String filePath;
  private Context context;

  /**
   * Creates a new ExtraComponent component.
   *
   * @param container the Form that this component is contained in.
   */
  public ExtraComponent(ComponentContainer container) {
    super(container.$form());
    context = (Context) container.$context();
  }


  /**
   * Returns the path of the file.
   */
  @SimpleProperty(
      category = PropertyCategory.BEHAVIOR)
  public String FilePath() {
    return filePath;
  }

  /**
   * Specifies the path of the uploaded file.
   */
  @DesignerProperty(editorType = PropertyTypeConstants.PROPERTY_TYPE_STRING,
      defaultValue = "")
  @SimpleProperty
  public void FilePath(String path) {
    filePath = path;
  }


  /**
   * Takes a numeric input and produces a numeric output
   *
   * @param input The taken input
   */
  @SimpleFunction
  public int Extra(final int input) {

    return 0;//Nothing is made here yet
  }

}
