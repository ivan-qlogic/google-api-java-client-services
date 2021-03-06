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

package com.google.api.services.speech.v1p1beta1.model;

/**
 * Contains stats about the data which was uploaded and preprocessed to be use by downstream
 * pipelines like training, evals pipelines.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Speech API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DataStats extends com.google.api.client.json.GenericJson {

  /**
   * Different types of data errors and the counts associated with them.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DataErrors> dataErrors;

  /**
   * The number of examples used for testing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer testExampleCount;

  /**
   * The number of examples used for training.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer trainingExampleCount;

  /**
   * Different types of data errors and the counts associated with them.
   * @return value or {@code null} for none
   */
  public java.util.List<DataErrors> getDataErrors() {
    return dataErrors;
  }

  /**
   * Different types of data errors and the counts associated with them.
   * @param dataErrors dataErrors or {@code null} for none
   */
  public DataStats setDataErrors(java.util.List<DataErrors> dataErrors) {
    this.dataErrors = dataErrors;
    return this;
  }

  /**
   * The number of examples used for testing.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTestExampleCount() {
    return testExampleCount;
  }

  /**
   * The number of examples used for testing.
   * @param testExampleCount testExampleCount or {@code null} for none
   */
  public DataStats setTestExampleCount(java.lang.Integer testExampleCount) {
    this.testExampleCount = testExampleCount;
    return this;
  }

  /**
   * The number of examples used for training.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTrainingExampleCount() {
    return trainingExampleCount;
  }

  /**
   * The number of examples used for training.
   * @param trainingExampleCount trainingExampleCount or {@code null} for none
   */
  public DataStats setTrainingExampleCount(java.lang.Integer trainingExampleCount) {
    this.trainingExampleCount = trainingExampleCount;
    return this;
  }

  @Override
  public DataStats set(String fieldName, Object value) {
    return (DataStats) super.set(fieldName, value);
  }

  @Override
  public DataStats clone() {
    return (DataStats) super.clone();
  }

}
