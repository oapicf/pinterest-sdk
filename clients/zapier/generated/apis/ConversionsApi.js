const samples = require('../samples/ConversionsApi');
const AdvertiserDefinedEventsResponse = require('../models/AdvertiserDefinedEventsResponse');
const Error = require('../models/Error');
const utils = require('../utils/utils');

module.exports = {
    advertiserDefinedEvents/get: {
        key: 'advertiserDefinedEvents/get',
        noun: 'conversions',
        display: {
            label: 'Get advertiser defined events',
            description: '&lt;p&gt;Get advertiser defined events for the given ad account.&lt;/p&gt;',
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
            ],
            outputFields: [
                ...AdvertiserDefinedEventsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/advertiser_defined_events'),
                    method: 'GET',
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'advertiserDefinedEvents/get', response.json);
                    return results;
                })
            },
            sample: samples['AdvertiserDefinedEventsResponseSample']
        }
    },
}
