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

package com.google.api.services.iam.v1.model;

/**
 * The service account sign blob request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity and Access Management (IAM) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SignBlobRequest extends com.google.api.client.json.GenericJson {

  /**
   * The bytes to sign.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bytesToSign;

  /**
   * The bytes to sign.
   * @see #decodeBytesToSign()
   * @return value or {@code null} for none
   */
  public java.lang.String getBytesToSign() {
    return bytesToSign;
  }

  /**
   * The bytes to sign.
   * @see #getBytesToSign()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeBytesToSign() {
    return com.google.api.client.util.Base64.decodeBase64(bytesToSign);
  }

  /**
   * The bytes to sign.
   * @see #encodeBytesToSign()
   * @param bytesToSign bytesToSign or {@code null} for none
   */
  public SignBlobRequest setBytesToSign(java.lang.String bytesToSign) {
    this.bytesToSign = bytesToSign;
    return this;
  }

  /**
   * The bytes to sign.
   * @see #setBytesToSign()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public SignBlobRequest encodeBytesToSign(byte[] bytesToSign) {
    this.bytesToSign = com.google.api.client.util.Base64.encodeBase64URLSafeString(bytesToSign);
    return this;
  }

  @Override
  public SignBlobRequest set(String fieldName, Object value) {
    return (SignBlobRequest) super.set(fieldName, value);
  }

  @Override
  public SignBlobRequest clone() {
    return (SignBlobRequest) super.clone();
  }

}
