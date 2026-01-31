const samples = require('../samples/ConversionEqsApi');
const EventQualityScore = require('../models/EventQualityScore');
const IngestionSourceOptions = require('../models/IngestionSourceOptions');
const LookbackPeriodOptions = require('../models/LookbackPeriodOptions');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const SourcePlatformOptions = require('../models/SourcePlatformOptions');
const utils = require('../utils/utils');

module.exports = {
    conversionEqs/list: {
        key: 'conversionEqs/list',
        noun: 'conversion_eqs',
        display: {
            label: 'Get event quality score (EQS)',
            description: 'Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.',
            hidden: false,
        },
        operation: {
            inputFields: [
                ....fields(),
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                    required: true,
                },
                ....fields(),
                ....fields(),
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/conversion_eqs'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'lookback_period': bundle.inputData?.['lookback_period'],
                        'source_platform': bundle.inputData?.['source_platform'],
                        'ingestion_source': bundle.inputData?.['ingestion_source'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'conversionEqs/list', response.json);
                    return results;
                })
            },
            sample: samples['EventQualityScoreSample']
        }
    },
}
