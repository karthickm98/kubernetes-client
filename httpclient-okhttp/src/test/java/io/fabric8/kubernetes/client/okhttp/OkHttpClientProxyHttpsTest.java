/*
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.kubernetes.client.okhttp;

import io.fabric8.kubernetes.client.http.AbstractHttpClientProxyHttpsTest;
import io.fabric8.kubernetes.client.http.HttpClient;
import okhttp3.OkHttpClient.Builder;

@SuppressWarnings("java:S2187")
public class OkHttpClientProxyHttpsTest extends AbstractHttpClientProxyHttpsTest {
  @Override
  protected HttpClient.Factory getHttpClientFactory() {
    return new OkHttpClientFactory() {
      @Override
      protected Builder newOkHttpClientBuilder() {
        Builder builder = super.newOkHttpClientBuilder();
        builder.hostnameVerifier((hostname, session) -> true);
        return builder;
      }
    };
  }
}