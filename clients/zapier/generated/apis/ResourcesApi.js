const samples = require('../samples/ResourcesApi');
const BookClosed = require('../models/BookClosed');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const PublicTargetingType = require('../models/PublicTargetingType');
const ReportType = require('../models/ReportType');
const SingleInterestTargetingOption = require('../models/SingleInterestTargetingOption');
const ad_account_countries_get_200_response = require('../models/ad_account_countries_get_200_response');
const delivery_metrics_get_200_response = require('../models/delivery_metrics_get_200_response');
const utils = require('../utils/utils');

module.exports = {
    adAccountCountries/get: {
        key: 'adAccountCountries/get',
        noun: 'resources',
        display: {
            label: 'Get ad accounts countries',
            description: 'Get Ad Accounts countries',
            hidden: false,
        },
        operation: {
            inputFields: [
            ],
            outputFields: [
                ...ad_account_countries_get_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/resources/ad_account_countries'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'adAccountCountries/get', response.json);
                    return results;
                })
            },
            sample: samples['ad_account_countries_get_200_responseSample']
        }
    },
    deliveryMetrics/get: {
        key: 'deliveryMetrics/get',
        noun: 'resources',
        display: {
            label: 'Get available metrics&#39; definitions',
            description: 'Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The &#x60;display_name&#x60; attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.',
            hidden: false,
        },
        operation: {
            inputFields: [
                ....fields(),
            ],
            outputFields: [
                ...delivery_metrics_get_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/resources/delivery_metrics'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'report_type': bundle.inputData?.['report_type'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'deliveryMetrics/get', response.json);
                    return results;
                })
            },
            sample: samples['delivery_metrics_get_200_responseSample']
        }
    },
    interestTargetingOptions/get: {
        key: 'interestTargetingOptions/get',
        noun: 'resources',
        display: {
            label: 'Get interest details',
            description: 'Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid&#x3D;118370875) for a spreadsheet listing interests and their IDs.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'interest_id',
                    label: 'Unique identifier of an interest.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...SingleInterestTargetingOption.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/resources/targeting/interests/{interest_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'interestTargetingOptions/get', response.json);
                    return results;
                })
            },
            sample: samples['SingleInterestTargetingOptionSample']
        }
    },
    leadFormQuestions/get: {
        key: 'leadFormQuestions/get',
        noun: 'resources',
        display: {
            label: 'Get lead form questions',
            description: 'Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**',
            hidden: false,
        },
        operation: {
            inputFields: [
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/resources/lead_form_questions'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'leadFormQuestions/get', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
    metricsReadyState/get: {
        key: 'metricsReadyState/get',
        noun: 'resources',
        display: {
            label: 'Get metrics ready state',
            description: 'Learn whether conversion or non-conversion metrics are finalized and ready to query.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'date',
                    label: 'Analytics reports request date (UTC). Format: YYYY-MM-DD',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...BookClosed.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/resources/metrics_ready_state'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'date': bundle.inputData?.['date'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'metricsReadyState/get', response.json);
                    return results;
                })
            },
            sample: samples['BookClosedSample']
        }
    },
    targetingOptions/get: {
        key: 'targetingOptions/get',
        noun: 'resources',
        display: {
            label: 'Get targeting options',
            description: '    You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      &#x60;&#x60;&#x60;     [{\&quot;36313\&quot;: \&quot;Australia: Moreton Bay - North\&quot;, \&quot;124735\&quot;: \&quot;Canada: North Battleford\&quot;, \&quot;36109\&quot;: \&quot;Australia: Murray\&quot;, \&quot;36108\&quot;: \&quot;Australia: Mid North Coast\&quot;, \&quot;36101\&quot;: \&quot;Australia: Capital Region\&quot;, \&quot;811\&quot;: \&quot;U.S.: Reno\&quot;, \&quot;36103\&quot;: \&quot;Australia: Central West\&quot;, \&quot;36102\&quot;: \&quot;Australia: Central Coast\&quot;, \&quot;36105\&quot;: \&quot;Australia: Far West and Orana\&quot;, \&quot;36104\&quot;: \&quot;Australia: Coffs Harbour - Grafton\&quot;, \&quot;36107\&quot;: \&quot;Australia: Illawarra\&quot;, \&quot;36106\&quot;: \&quot;Australia: Hunter Valley Exc Newcastle\&quot;, \&quot;554017\&quot;: \&quot;New Zealand: Wanganui\&quot;, \&quot;554016\&quot;: \&quot;New Zealand: Marlborough\&quot;, \&quot;554015\&quot;: \&quot;New Zealand: Gisborne\&quot;, \&quot;554014\&quot;: \&quot;New Zealand: Tararua\&quot;, \&quot;554013\&quot;: \&quot;New Zealand: Invercargill\&quot;, \&quot;GR\&quot;: \&quot;Greece\&quot;, \&quot;554011\&quot;: \&quot;New Zealand: Whangarei\&quot;, \&quot;554010\&quot;: \&quot;New Zealand: Far North\&quot;, \&quot;717\&quot;: \&quot;U.S.: Quincy-Hannibal-Keokuk\&quot;, \&quot;716\&quot;: \&quot;U.S.: Baton Rouge\&quot;,...}]     &#x60;&#x60;&#x60;',
            hidden: false,
        },
        operation: {
            inputFields: [
                ....fields(),
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
                {
                    key: 'client_id',
                    label: 'Client ID',
                    type: 'string',
                },
                {
                    key: 'oauth_signature',
                    label: 'Oauth signature',
                    type: 'string',
                },
                {
                    key: 'timestamp',
                    label: 'Timestamp.',
                    type: 'string',
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/resources/targeting/{targeting_type}'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                        'client_id': bundle.inputData?.['client_id'],
                        'oauth_signature': bundle.inputData?.['oauth_signature'],
                        'timestamp': bundle.inputData?.['timestamp'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'targetingOptions/get', response.json);
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
}
