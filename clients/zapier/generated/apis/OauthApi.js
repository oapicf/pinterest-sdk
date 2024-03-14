const samples = require('../samples/OauthApi');
const Error = require('../models/Error');
const OauthAccessTokenResponse = require('../models/OauthAccessTokenResponse');
const utils = require('../utils/utils');

module.exports = {
    oauth/token: {
        key: 'oauth/token',
        noun: 'oauth',
        display: {
            label: 'Generate OAuth access token',
            description: 'Generate an OAuth access token by using an authorization code or a refresh token.  See &lt;a href&#x3D;&#39;/docs/getting-started/authentication/&#39;&gt;Authentication&lt;/a&gt; for more.',
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
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/x-www-form-urlencoded',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['OauthAccessTokenResponseSample']
        }
    },
}
