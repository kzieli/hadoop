/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.slider.common.params;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import com.beust.jcommander.ParametersDelegate;

@Parameters(commandNames = {SliderActions.ACTION_INSTALL_PACKAGE},
            commandDescription = SliderActions.DESCRIBE_ACTION_INSTALL_PACKAGE)

public class ActionInstallPackageArgs extends AbstractActionArgs {
  
  @Override
  public String getActionName() {
    return SliderActions.ACTION_INSTALL_PACKAGE;
  }

  @Parameter(names = {ARG_PACKAGE},
             description = "Path to app package on local disk")
  public String packageURI;

  @Parameter(names = {ARG_NAME},
             description = "The type of the package")
  public String name;

  @Parameter(names = {ARG_REPLACE_PKG}, description = "Overwrite existing package")
  public boolean replacePkg = false;

  /**
   * Get the min #of params expected
   * @return the min number of params in the {@link #parameters} field
   */
  public int getMinParams() {
    return 0;
  }

  @Override
  public int getMaxParams() {
    return 1;
  }
}