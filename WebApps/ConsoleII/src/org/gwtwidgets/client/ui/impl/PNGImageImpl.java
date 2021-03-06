/*
 * Copyright 2006 Robert Hanson <iamroberthanson AT gmail.com>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gwtwidgets.client.ui.impl;

import org.gwtwidgets.client.ui.PNGImage;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;


public class PNGImageImpl
{
    
    public Element createElement (String url, int width, int height)
    {
        Element result = DOM.createImg();
        DOM.setAttribute(result, "src", url);
        DOM.setIntAttribute(result, "width", width);
        DOM.setIntAttribute(result, "height", height);
        return result;
    }

    public String getUrl (PNGImage image)
    {
        return DOM.getAttribute(image.getElement(), "src");
    }

}
