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

package io.micronaut.security.oauth2;

import io.micronaut.security.authentication.Authentication;

import java.util.Optional;

/**
 * Resolves the OAuth 2.0 provider that authenticated the logged in user.
 *
 * @author James Kleeh
 * @since 1.2.0
 */
public interface ProviderResolver {

    /**
     * Resolves the provider
     *
     * @param authentication The authentication
     * @return An optional provider name
     */
    Optional<String> resolveProvider(Authentication authentication);
}
