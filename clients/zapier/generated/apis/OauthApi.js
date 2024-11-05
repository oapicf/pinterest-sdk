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
            description: 'Generate an OAuth access token by using an authorization code or a refresh token.  IMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).  See &lt;a href&#x3D;&#39;/docs/getting-started/authentication-and-scopes/&#39;&gt;Authentication&lt;/a&gt; for more.  &lt;strong&gt;Parameter &lt;i&gt;refresh_on&lt;/i&gt; and its corresponding response type &lt;i&gt;everlasting_refresh&lt;/i&gt; are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  &lt;strong&gt;Grant type &lt;i&gt;client_credentials&lt;/i&gt; and its corresponding response type are not fully available. You will likely get a default error if you attempt to use this grant_type.&lt;/strong&gt;',
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
}
