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

package com.google.api.services.streetviewpublish.v1.model;

/**
 * Request to delete multiple Photos.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Street View Publish API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BatchDeletePhotosRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. IDs of the Photos. For HTTP GET requests, the URL query parameter should be
   * `photoIds==&...`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> photoIds;

  /**
   * Required. IDs of the Photos. For HTTP GET requests, the URL query parameter should be
   * `photoIds==&...`.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPhotoIds() {
    return photoIds;
  }

  /**
   * Required. IDs of the Photos. For HTTP GET requests, the URL query parameter should be
   * `photoIds==&...`.
   * @param photoIds photoIds or {@code null} for none
   */
  public BatchDeletePhotosRequest setPhotoIds(java.util.List<java.lang.String> photoIds) {
    this.photoIds = photoIds;
    return this;
  }

  @Override
  public BatchDeletePhotosRequest set(String fieldName, Object value) {
    return (BatchDeletePhotosRequest) super.set(fieldName, value);
  }

  @Override
  public BatchDeletePhotosRequest clone() {
    return (BatchDeletePhotosRequest) super.clone();
  }

}
