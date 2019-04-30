/*
 * Copyright 2017-2019 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.micronaut.security.oauth2.endpoint.authorization.response;

import io.micronaut.security.authentication.AuthenticationResponse;
import io.micronaut.security.oauth2.configuration.OauthClientConfiguration;
import io.micronaut.security.oauth2.endpoint.SecureEndpoint;
import io.micronaut.security.oauth2.endpoint.token.request.Oauth2TokenEndpointClient;
import io.micronaut.security.oauth2.endpoint.token.response.Oauth2UserDetailsMapper;
import org.reactivestreams.Publisher;

/**
 * Handles OAuth 2.0 Authorization responses.
 *
 * @author Sergio del Amo
 * @since 1.0.0
 */
public interface Oauth2AuthorizationResponseHandler {

    /**
     * @return A Http Response
     */
    Publisher<AuthenticationResponse> handle(AuthorizationResponse authorizationResponse,
                                             OauthClientConfiguration clientConfiguration,
                                             Oauth2UserDetailsMapper userDetailsMapper,
                                             Oauth2TokenEndpointClient<?> tokenEndpointClient,
                                             SecureEndpoint tokenEndpoint);
}
