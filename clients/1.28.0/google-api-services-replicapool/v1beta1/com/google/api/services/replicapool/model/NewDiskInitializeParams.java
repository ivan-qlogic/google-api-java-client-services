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

package com.google.api.services.replicapool.model;

/**
 * Initialization parameters for creating a new disk.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Replica Pool API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NewDiskInitializeParams extends com.google.api.client.json.GenericJson {

  /**
   * The size of the created disk in gigabytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long diskSizeGb;

  /**
   * Name of the disk type resource describing which disk type to use to create the disk. For
   * example 'pd-ssd' or 'pd-standard'. Default is 'pd-standard'
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String diskType;

  /**
   * The name or fully-qualified URL of a source image to use to create this disk. If you provide a
   * name of the source image, Replica Pool will look for an image with that name in your project.
   * If you are specifying an image provided by Compute Engine, you will need to provide the full
   * URL with the correct project, such as: http://www.googleapis.com/compute/v1/projects/debian-
   * cloud/ global/images/debian-wheezy-7-vYYYYMMDD
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceImage;

  /**
   * The size of the created disk in gigabytes.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDiskSizeGb() {
    return diskSizeGb;
  }

  /**
   * The size of the created disk in gigabytes.
   * @param diskSizeGb diskSizeGb or {@code null} for none
   */
  public NewDiskInitializeParams setDiskSizeGb(java.lang.Long diskSizeGb) {
    this.diskSizeGb = diskSizeGb;
    return this;
  }

  /**
   * Name of the disk type resource describing which disk type to use to create the disk. For
   * example 'pd-ssd' or 'pd-standard'. Default is 'pd-standard'
   * @return value or {@code null} for none
   */
  public java.lang.String getDiskType() {
    return diskType;
  }

  /**
   * Name of the disk type resource describing which disk type to use to create the disk. For
   * example 'pd-ssd' or 'pd-standard'. Default is 'pd-standard'
   * @param diskType diskType or {@code null} for none
   */
  public NewDiskInitializeParams setDiskType(java.lang.String diskType) {
    this.diskType = diskType;
    return this;
  }

  /**
   * The name or fully-qualified URL of a source image to use to create this disk. If you provide a
   * name of the source image, Replica Pool will look for an image with that name in your project.
   * If you are specifying an image provided by Compute Engine, you will need to provide the full
   * URL with the correct project, such as: http://www.googleapis.com/compute/v1/projects/debian-
   * cloud/ global/images/debian-wheezy-7-vYYYYMMDD
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceImage() {
    return sourceImage;
  }

  /**
   * The name or fully-qualified URL of a source image to use to create this disk. If you provide a
   * name of the source image, Replica Pool will look for an image with that name in your project.
   * If you are specifying an image provided by Compute Engine, you will need to provide the full
   * URL with the correct project, such as: http://www.googleapis.com/compute/v1/projects/debian-
   * cloud/ global/images/debian-wheezy-7-vYYYYMMDD
   * @param sourceImage sourceImage or {@code null} for none
   */
  public NewDiskInitializeParams setSourceImage(java.lang.String sourceImage) {
    this.sourceImage = sourceImage;
    return this;
  }

  @Override
  public NewDiskInitializeParams set(String fieldName, Object value) {
    return (NewDiskInitializeParams) super.set(fieldName, value);
  }

  @Override
  public NewDiskInitializeParams clone() {
    return (NewDiskInitializeParams) super.clone();
  }

}
