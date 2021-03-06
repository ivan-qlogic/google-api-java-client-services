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

package com.google.api.services.containeranalysis.v1beta1.model;

/**
 * This message wraps a location affected by a vulnerability and its associated fix (if one is
 * available).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PackageIssue extends com.google.api.client.json.GenericJson {

  /**
   * Required. The location of the vulnerability.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VulnerabilityLocation affectedLocation;

  /**
   * The location of the available fix for vulnerability.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VulnerabilityLocation fixedLocation;

  /**
   * The severity (e.g., distro assigned severity) for this vulnerability.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String severityName;

  /**
   * Required. The location of the vulnerability.
   * @return value or {@code null} for none
   */
  public VulnerabilityLocation getAffectedLocation() {
    return affectedLocation;
  }

  /**
   * Required. The location of the vulnerability.
   * @param affectedLocation affectedLocation or {@code null} for none
   */
  public PackageIssue setAffectedLocation(VulnerabilityLocation affectedLocation) {
    this.affectedLocation = affectedLocation;
    return this;
  }

  /**
   * The location of the available fix for vulnerability.
   * @return value or {@code null} for none
   */
  public VulnerabilityLocation getFixedLocation() {
    return fixedLocation;
  }

  /**
   * The location of the available fix for vulnerability.
   * @param fixedLocation fixedLocation or {@code null} for none
   */
  public PackageIssue setFixedLocation(VulnerabilityLocation fixedLocation) {
    this.fixedLocation = fixedLocation;
    return this;
  }

  /**
   * The severity (e.g., distro assigned severity) for this vulnerability.
   * @return value or {@code null} for none
   */
  public java.lang.String getSeverityName() {
    return severityName;
  }

  /**
   * The severity (e.g., distro assigned severity) for this vulnerability.
   * @param severityName severityName or {@code null} for none
   */
  public PackageIssue setSeverityName(java.lang.String severityName) {
    this.severityName = severityName;
    return this;
  }

  @Override
  public PackageIssue set(String fieldName, Object value) {
    return (PackageIssue) super.set(fieldName, value);
  }

  @Override
  public PackageIssue clone() {
    return (PackageIssue) super.clone();
  }

}
