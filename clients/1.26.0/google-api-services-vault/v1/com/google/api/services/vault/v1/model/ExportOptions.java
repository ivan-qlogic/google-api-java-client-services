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

package com.google.api.services.vault.v1.model;

/**
 * Export advanced options
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the G Suite Vault API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExportOptions extends com.google.api.client.json.GenericJson {

  /**
   * Option available for Drive export.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DriveExportOptions driveOptions;

  /**
   * Option available for groups export.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GroupsExportOptions groupsOptions;

  /**
   * Option available for hangouts chat export.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HangoutsChatExportOptions hangoutsChatOptions;

  /**
   * Option available for mail export.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MailExportOptions mailOptions;

  /**
   * The requested export location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * Option available for Drive export.
   * @return value or {@code null} for none
   */
  public DriveExportOptions getDriveOptions() {
    return driveOptions;
  }

  /**
   * Option available for Drive export.
   * @param driveOptions driveOptions or {@code null} for none
   */
  public ExportOptions setDriveOptions(DriveExportOptions driveOptions) {
    this.driveOptions = driveOptions;
    return this;
  }

  /**
   * Option available for groups export.
   * @return value or {@code null} for none
   */
  public GroupsExportOptions getGroupsOptions() {
    return groupsOptions;
  }

  /**
   * Option available for groups export.
   * @param groupsOptions groupsOptions or {@code null} for none
   */
  public ExportOptions setGroupsOptions(GroupsExportOptions groupsOptions) {
    this.groupsOptions = groupsOptions;
    return this;
  }

  /**
   * Option available for hangouts chat export.
   * @return value or {@code null} for none
   */
  public HangoutsChatExportOptions getHangoutsChatOptions() {
    return hangoutsChatOptions;
  }

  /**
   * Option available for hangouts chat export.
   * @param hangoutsChatOptions hangoutsChatOptions or {@code null} for none
   */
  public ExportOptions setHangoutsChatOptions(HangoutsChatExportOptions hangoutsChatOptions) {
    this.hangoutsChatOptions = hangoutsChatOptions;
    return this;
  }

  /**
   * Option available for mail export.
   * @return value or {@code null} for none
   */
  public MailExportOptions getMailOptions() {
    return mailOptions;
  }

  /**
   * Option available for mail export.
   * @param mailOptions mailOptions or {@code null} for none
   */
  public ExportOptions setMailOptions(MailExportOptions mailOptions) {
    this.mailOptions = mailOptions;
    return this;
  }

  /**
   * The requested export location.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * The requested export location.
   * @param region region or {@code null} for none
   */
  public ExportOptions setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  @Override
  public ExportOptions set(String fieldName, Object value) {
    return (ExportOptions) super.set(fieldName, value);
  }

  @Override
  public ExportOptions clone() {
    return (ExportOptions) super.clone();
  }

}
