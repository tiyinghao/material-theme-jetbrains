/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2017 Chris Magnussen and Elior Boukhobza
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 *
 */

package com.chrisrm.idea.themes;

public final class MTDefaultTheme implements LafTheme {
  public final String BACKGROUND = "263238"; // 38, 50, 56
  public final String FOREGROUND = "B0BEC5"; // 176, 190, 197
  public final String CARET = "FFCC00"; // 255, 204, 0
  public final String BORDER = "222D33"; // 34, 45, 51
  public final String TEXT = "607D8B"; // 96, 125, 139
  public final String SELECTION_BACKGROUND = "546E7A"; // 84, 110, 122
  public final String SELECTION_FOREGROUND = "FFFFFF";
  public final String LABEL = "B0BEC5"; // 176, 190, 197
  public final String SUB_LABEL = "546E7A"; // 84, 110, 122
  public final String DISABLED = "2E3C43"; // 65, 89, 103
  public final String SIDEBAR_HEADING = "CFD8DC"; // 207, 216, 220
  public final String STATUS_LABEL = "78909C"; // 120, 144, 156
  public final String INPUT_BORDER = "37474F"; //55, 71, 79
  public final String BUTTON_BACKGROUND = "2C3C41"; // 44, 60, 65
  public final String BUTTON_FOREGROUND = "607D8B"; // 96, 125, 139
  public final String BUTTON_SELECTED = "314549"; // 49, 69, 73
  public final String ACCENT_COLOR = "80CBC4"; // 128, 203, 196

  @Override
  public String getDisabled() {
    return DISABLED;
  }
}