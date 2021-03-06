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

package com.google.api.services.healthcare.v1alpha.model;

/**
 * Request to export resources.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExportResourcesRequest extends com.google.api.client.json.GenericJson {

  /**
   * The BigQuery destination location. The output will be one BigQuery table per resource type. The
   * server implements a data-driven FHIR-to-SQL schema mapping in support of analytics workloads
   * with BigQuery. Incompatible changes to the output schema may be introduced in the future as a
   * result of continuous collaboration with the FHIR community to refine the [desired SQL
   * projection of FHIR resources](https://github.com/rbrush/sql-on-fhir/blob/master/sql-on-
   * fhir.md).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BigQueryLocation bigqueryDestinationLocation;

  /**
   * The Cloud Storage destination location. Specify a path to a Cloud Storage bucket or folder
   * rather than a concrete object. The exported outputs are organized by FHIR resource types. The
   * server will create one object per resource type. Each object contains newline delimited JSON,
   * and each line is a FHIR resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GcsDataLocation gcsDestinationLocation;

  /**
   * The BigQuery destination location. The output will be one BigQuery table per resource type. The
   * server implements a data-driven FHIR-to-SQL schema mapping in support of analytics workloads
   * with BigQuery. Incompatible changes to the output schema may be introduced in the future as a
   * result of continuous collaboration with the FHIR community to refine the [desired SQL
   * projection of FHIR resources](https://github.com/rbrush/sql-on-fhir/blob/master/sql-on-
   * fhir.md).
   * @return value or {@code null} for none
   */
  public BigQueryLocation getBigqueryDestinationLocation() {
    return bigqueryDestinationLocation;
  }

  /**
   * The BigQuery destination location. The output will be one BigQuery table per resource type. The
   * server implements a data-driven FHIR-to-SQL schema mapping in support of analytics workloads
   * with BigQuery. Incompatible changes to the output schema may be introduced in the future as a
   * result of continuous collaboration with the FHIR community to refine the [desired SQL
   * projection of FHIR resources](https://github.com/rbrush/sql-on-fhir/blob/master/sql-on-
   * fhir.md).
   * @param bigqueryDestinationLocation bigqueryDestinationLocation or {@code null} for none
   */
  public ExportResourcesRequest setBigqueryDestinationLocation(BigQueryLocation bigqueryDestinationLocation) {
    this.bigqueryDestinationLocation = bigqueryDestinationLocation;
    return this;
  }

  /**
   * The Cloud Storage destination location. Specify a path to a Cloud Storage bucket or folder
   * rather than a concrete object. The exported outputs are organized by FHIR resource types. The
   * server will create one object per resource type. Each object contains newline delimited JSON,
   * and each line is a FHIR resource.
   * @return value or {@code null} for none
   */
  public GcsDataLocation getGcsDestinationLocation() {
    return gcsDestinationLocation;
  }

  /**
   * The Cloud Storage destination location. Specify a path to a Cloud Storage bucket or folder
   * rather than a concrete object. The exported outputs are organized by FHIR resource types. The
   * server will create one object per resource type. Each object contains newline delimited JSON,
   * and each line is a FHIR resource.
   * @param gcsDestinationLocation gcsDestinationLocation or {@code null} for none
   */
  public ExportResourcesRequest setGcsDestinationLocation(GcsDataLocation gcsDestinationLocation) {
    this.gcsDestinationLocation = gcsDestinationLocation;
    return this;
  }

  @Override
  public ExportResourcesRequest set(String fieldName, Object value) {
    return (ExportResourcesRequest) super.set(fieldName, value);
  }

  @Override
  public ExportResourcesRequest clone() {
    return (ExportResourcesRequest) super.clone();
  }

}
