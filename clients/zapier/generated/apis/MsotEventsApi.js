const samples = require('../samples/MsotEventsApi');
const ConversionMSOTEventsCreate = require('../models/ConversionMSOTEventsCreate');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const utils = require('../utils/utils');

module.exports = {
    msotEvents/create: {
        key: 'msotEvents/create',
        noun: 'msot_events',
        display: {
            label: 'Send Measurement Source Of Truth (MSOT) attributed conversion events',
            description: '**This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their &#x60;ad_account_id&#x60;. The request body should be a JSON object.  - These events will not be used in Reporting.',
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
                ...ConversionMSOTEventsCreate.fields(),
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/msot/events'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...ConversionMSOTEventsCreate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'msotEvents/create', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
}
