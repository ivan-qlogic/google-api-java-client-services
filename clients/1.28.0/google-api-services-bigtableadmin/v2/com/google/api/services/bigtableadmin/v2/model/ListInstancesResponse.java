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

package com.google.api.services.bigtableadmin.v2.model;

/**
 * Response message for BigtableInstanceAdmin.ListInstances.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Bigtable Admin API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListInstancesResponse extends com.google.api.client.json.GenericJson {

  /**
   * Locations from which Instance information could not be retrieved, due to an outage or some
   * other transient condition. Instances whose Clusters are all in one of the failed locations may
   * be missing from `instances`, and Instances with at least one Cluster in a failed location may
   * only have partial information returned. Values are of the form `projects//locations/`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> failedLocations;

  /**
   * The list of requested instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Instance> instances;

  static {
    // hack to force ProGuard to consider Instance used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Instance.class);
  }

  /**
   * DEPRECATED: This field is unused and ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Locations from which Instance information could not be retrieved, due to an outage or some
   * other transient condition. Instances whose Clusters are all in one of the failed locations may
   * be missing from `instances`, and Instances with at least one Cluster in a failed location may
   * only have partial information returned. Values are of the form `projects//locations/`
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFailedLocations() {
    return failedLocations;
  }

  /**
   * Locations from which Instance information could not be retrieved, due to an outage or some
   * other transient condition. Instances whose Clusters are all in one of the failed locations may
   * be missing from `instances`, and Instances with at least one Cluster in a failed location may
   * only have partial information returned. Values are of the form `projects//locations/`
   * @param failedLocations failedLocations or {@code null} for none
   */
  public ListInstancesResponse setFailedLocations(java.util.List<java.lang.String> failedLocations) {
    this.failedLocations = failedLocations;
    return this;
  }

  /**
   * The list of requested instances.
   * @return value or {@code null} for none
   */
  public java.util.List<Instance> getInstances() {
    return instances;
  }

  /**
   * The list of requested instances.
   * @param instances instances or {@code null} for none
   */
  public ListInstancesResponse setInstances(java.util.List<Instance> instances) {
    this.instances = instances;
    return this;
  }

  /**
   * DEPRECATED: This field is unused and ignored.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * DEPRECATED: This field is unused and ignored.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListInstancesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListInstancesResponse set(String fieldName, Object value) {
    return (ListInstancesResponse) super.set(fieldName, value);
  }

  @Override
  public ListInstancesResponse clone() {
    return (ListInstancesResponse) super.clone();
  }

}
