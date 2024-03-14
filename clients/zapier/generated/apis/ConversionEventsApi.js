const samples = require('../samples/ConversionEventsApi');
const ConversionApiResponse = require('../models/ConversionApiResponse');
const ConversionEvents = require('../models/ConversionEvents');
const Error = require('../models/Error');
const utils = require('../utils/utils');

module.exports = {
    events/create: {
        key: 'events/create',
        noun: 'conversion_events',
        display: {
            label: 'Send conversion events to the Pinterest API for Conversions',
            description: 'The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their &lt;code&gt;ad_account_id&lt;/code&gt;. The request body should be a JSON object. - This endpoint requires an &lt;code&gt;access_token&lt;/code&gt; be generated through Ads Manager. Review the &lt;a href&#x3D;\&quot;/docs/conversions/conversion-management/#Authenticating%20for%20the%20Conversion%20Tracking%20endpoint\&quot;&gt;Conversions Guide&lt;/a&gt; for more details. - The token&#39;s &lt;code&gt;user_account&lt;/code&gt; must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Audience, Campaign. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                    required: true,
                },
                ...ConversionEvents.fields(),
                {
                    key: 'test',
                    label: 'Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request.',
                    type: 'boolean',
                },
            ],
            outputFields: [
                ...ConversionApiResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/events'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'test': bundle.inputData?.['test'],
                    },
                    body: {
                        ...ConversionEvents.mapping(bundle),
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['ConversionApiResponseSample']
        }
    },
}
