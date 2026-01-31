const samples = require('../samples/OauthApi');
const ConversionAccessTokenResponse = require('../models/ConversionAccessTokenResponse');
const Error = require('../models/Error');
const OauthAccessTokenResponse = require('../models/OauthAccessTokenResponse');
const utils = require('../utils/utils');

module.exports = {
    oauth/conversionToken: {
        key: 'oauth/conversionToken',
        noun: 'oauth',
        display: {
            label: 'Generate OAuth access token for conversion API',
            description: 'Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.',
            hidden: false,
        },
        operation: {
            inputFields: [
            ],
            outputFields: [
                ...ConversionAccessTokenResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/oauth/conversion_token'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'oauth/conversionToken', response.json);
                    return results;
                })
            },
            sample: samples['ConversionAccessTokenResponseSample']
        }
    },
    oauth/token: {
        key: 'oauth/token',
        noun: 'oauth',
        display: {
            label: 'Generate OAuth access token',
            description: 'Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for &lt;a href&#x3D;&#39;/docs/getting-started/set-up-authentication-and-authorization/&#39; target&#x3D;&#39;blank&#39;&gt;requesting and refreshing tokens&lt;/a&gt;.  &lt;strong&gt;Note:&lt;/strong&gt; If your app was created &lt;strong&gt;before September 25, 2025&lt;/strong&gt;, make sure to set the &lt;code&gt;continuous_refresh&lt;/code&gt; parameter to &lt;code&gt;true&lt;/code&gt; to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use &lt;a href&#x3D;&#39;/docs/developer-tools/token-debugger/&#39; target&#x3D;&#39;blank&#39;&gt;Token Debugger&lt;/a&gt; to validate and inspect your access token.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'grant_type',
                    label: '',
                    type: 'string',
                    required: true,
                    choices: [
                        'authorization_code',
                        'refresh_token',
                        'client_credentials',
                    ],
                },
            ],
            outputFields: [
                ...OauthAccessTokenResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/oauth/token'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/x-www-form-urlencoded',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'oauth/token', response.json);
                    return results;
                })
            },
            sample: samples['OauthAccessTokenResponseSample']
        }
    },
    token/revoke: {
        key: 'token/revoke',
        noun: 'oauth',
        display: {
            label: 'Revoke a token',
            description: 'Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'token',
                    label: 'The token to revoke.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'token_type_hint',
                    label: 'The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.',
                    type: 'string',
                    choices: [
                        'access_token',
                        'refresh_token',
                    ],
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/oauth/token/revoke'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/x-www-form-urlencoded',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'token/revoke', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
}
