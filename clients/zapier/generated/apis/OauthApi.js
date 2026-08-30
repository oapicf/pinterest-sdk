const samples = require('../samples/OauthApi');
const ConversionAccessToken = require('../models/ConversionAccessToken');
const OauthAccessToken = require('../models/OauthAccessToken');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const TokenGrantType = require('../models/TokenGrantType');
const TokenTypeHint = require('../models/TokenTypeHint');
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
                ...ConversionAccessToken.fields('', false),
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
            sample: samples['ConversionAccessTokenSample']
        }
    },
    oauth/token: {
        key: 'oauth/token',
        noun: 'oauth',
        display: {
            label: 'Generate OAuth access token',
            description: 'Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the &#x60;continuous_refresh&#x60; parameter to &#x60;true&#x60; to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. ',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...TokenGrantType.fields(),
                {
                    key: 'code',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'continuous_refresh',
                    label: '  If your app was created before **September 25, 2025**, set to &#x60;true&#x60; to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token.',
                    type: 'string',
                },
                {
                    key: 'redirect_uri',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'refresh_token',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'scope',
                    label: '',
                    type: 'string',
                },
            ],
            outputFields: [
                ...OauthAccessToken.fields('', false),
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
            sample: samples['OauthAccessTokenSample']samples['OauthAccessTokenSample']
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
                ...TokenTypeHint.fields(),
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
