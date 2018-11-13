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

package com.google.api.services.cloudfunctions.v1beta2.model;

/**
 * Describes the location of the function source in a remote repository.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Functions API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SourceRepository extends com.google.api.client.json.GenericJson {

  /**
   * The name of the branch from which the function should be fetched.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String branch;

  /**
   * Output only. The id of the revision that was resolved at the moment of function creation or
   * update. For example when a user deployed from a branch, it will be the revision id of the
   * latest change on this branch at that time. If user deployed from revision then this value will
   * be always equal to the revision specified by the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deployedRevision;

  /**
   * URL to the hosted repository where the function is defined. Only paths in
   * https://source.developers.google.com domain are supported. The path should contain the name of
   * the repository.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String repositoryUrl;

  /**
   * The id of the revision that captures the state of the repository from which the function should
   * be fetched.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String revision;

  /**
   * The path within the repository where the function is defined. The path should point to the
   * directory where Cloud Functions files are located. Use "/" if the function is defined directly
   * in the root directory of a repository.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourcePath;

  /**
   * The name of the tag that captures the state of the repository from which the function should be
   * fetched.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tag;

  /**
   * The name of the branch from which the function should be fetched.
   * @return value or {@code null} for none
   */
  public java.lang.String getBranch() {
    return branch;
  }

  /**
   * The name of the branch from which the function should be fetched.
   * @param branch branch or {@code null} for none
   */
  public SourceRepository setBranch(java.lang.String branch) {
    this.branch = branch;
    return this;
  }

  /**
   * Output only. The id of the revision that was resolved at the moment of function creation or
   * update. For example when a user deployed from a branch, it will be the revision id of the
   * latest change on this branch at that time. If user deployed from revision then this value will
   * be always equal to the revision specified by the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeployedRevision() {
    return deployedRevision;
  }

  /**
   * Output only. The id of the revision that was resolved at the moment of function creation or
   * update. For example when a user deployed from a branch, it will be the revision id of the
   * latest change on this branch at that time. If user deployed from revision then this value will
   * be always equal to the revision specified by the user.
   * @param deployedRevision deployedRevision or {@code null} for none
   */
  public SourceRepository setDeployedRevision(java.lang.String deployedRevision) {
    this.deployedRevision = deployedRevision;
    return this;
  }

  /**
   * URL to the hosted repository where the function is defined. Only paths in
   * https://source.developers.google.com domain are supported. The path should contain the name of
   * the repository.
   * @return value or {@code null} for none
   */
  public java.lang.String getRepositoryUrl() {
    return repositoryUrl;
  }

  /**
   * URL to the hosted repository where the function is defined. Only paths in
   * https://source.developers.google.com domain are supported. The path should contain the name of
   * the repository.
   * @param repositoryUrl repositoryUrl or {@code null} for none
   */
  public SourceRepository setRepositoryUrl(java.lang.String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
    return this;
  }

  /**
   * The id of the revision that captures the state of the repository from which the function should
   * be fetched.
   * @return value or {@code null} for none
   */
  public java.lang.String getRevision() {
    return revision;
  }

  /**
   * The id of the revision that captures the state of the repository from which the function should
   * be fetched.
   * @param revision revision or {@code null} for none
   */
  public SourceRepository setRevision(java.lang.String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * The path within the repository where the function is defined. The path should point to the
   * directory where Cloud Functions files are located. Use "/" if the function is defined directly
   * in the root directory of a repository.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourcePath() {
    return sourcePath;
  }

  /**
   * The path within the repository where the function is defined. The path should point to the
   * directory where Cloud Functions files are located. Use "/" if the function is defined directly
   * in the root directory of a repository.
   * @param sourcePath sourcePath or {@code null} for none
   */
  public SourceRepository setSourcePath(java.lang.String sourcePath) {
    this.sourcePath = sourcePath;
    return this;
  }

  /**
   * The name of the tag that captures the state of the repository from which the function should be
   * fetched.
   * @return value or {@code null} for none
   */
  public java.lang.String getTag() {
    return tag;
  }

  /**
   * The name of the tag that captures the state of the repository from which the function should be
   * fetched.
   * @param tag tag or {@code null} for none
   */
  public SourceRepository setTag(java.lang.String tag) {
    this.tag = tag;
    return this;
  }

  @Override
  public SourceRepository set(String fieldName, Object value) {
    return (SourceRepository) super.set(fieldName, value);
  }

  @Override
  public SourceRepository clone() {
    return (SourceRepository) super.clone();
  }

}