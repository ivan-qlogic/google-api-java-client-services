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

package com.google.api.services.webmasters.model;

/**
 * List of sitemaps.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Search Console API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SitemapsListResponse extends com.google.api.client.json.GenericJson {

  /**
   * Contains detailed information about a specific URL submitted as a sitemap.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<WmxSitemap> sitemap;

  /**
   * Contains detailed information about a specific URL submitted as a sitemap.
   * @return value or {@code null} for none
   */
  public java.util.List<WmxSitemap> getSitemap() {
    return sitemap;
  }

  /**
   * Contains detailed information about a specific URL submitted as a sitemap.
   * @param sitemap sitemap or {@code null} for none
   */
  public SitemapsListResponse setSitemap(java.util.List<WmxSitemap> sitemap) {
    this.sitemap = sitemap;
    return this;
  }

  @Override
  public SitemapsListResponse set(String fieldName, Object value) {
    return (SitemapsListResponse) super.set(fieldName, value);
  }

  @Override
  public SitemapsListResponse clone() {
    return (SitemapsListResponse) super.clone();
  }

}
