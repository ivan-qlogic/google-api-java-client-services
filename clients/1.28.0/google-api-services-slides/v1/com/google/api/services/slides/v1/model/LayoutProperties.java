/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.slides.v1.model;

/**
 * The properties of Page are only relevant for pages with page_type LAYOUT.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LayoutProperties extends com.google.api.client.json.GenericJson {

  /**
   * The human-readable name of the layout.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The object ID of the master that this layout is based on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String masterObjectId;

  /**
   * The name of the layout.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The human-readable name of the layout.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The human-readable name of the layout.
   * @param displayName displayName or {@code null} for none
   */
  public LayoutProperties setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The object ID of the master that this layout is based on.
   * @return value or {@code null} for none
   */
  public java.lang.String getMasterObjectId() {
    return masterObjectId;
  }

  /**
   * The object ID of the master that this layout is based on.
   * @param masterObjectId masterObjectId or {@code null} for none
   */
  public LayoutProperties setMasterObjectId(java.lang.String masterObjectId) {
    this.masterObjectId = masterObjectId;
    return this;
  }

  /**
   * The name of the layout.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the layout.
   * @param name name or {@code null} for none
   */
  public LayoutProperties setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public LayoutProperties set(String fieldName, Object value) {
    return (LayoutProperties) super.set(fieldName, value);
  }

  @Override
  public LayoutProperties clone() {
    return (LayoutProperties) super.clone();
  }

}
