const samples = require('../samples/ResourcesApi');
const AdAccountsCountryResponse = require('../models/AdAccountsCountryResponse');
const BookClosedResponse = require('../models/BookClosedResponse');
const DeliveryMetricsResponse = require('../models/DeliveryMetricsResponse');
const Error = require('../models/Error');
const SingleInterestTargetingOptionResponse = require('../models/SingleInterestTargetingOptionResponse');
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
                ...AdAccountsCountryResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/resources/ad_account_countries'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
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
            sample: samples['AdAccountsCountryResponseSample']
        }
    },
    deliveryMetrics/get: {
        key: 'deliveryMetrics/get',
        noun: 'resources',
        display: {
            label: 'Get available delivery metrics&#39; definitions',
            description: 'Get the definitions for the delivery metrics available for synchronous or asynchronous reports.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'report_type',
                    label: 'Report type.',
                    type: 'string',
                    choices: [
                        'SYNC',
                        'ASYNC',
                    ],
                },
            ],
            outputFields: [
                ...DeliveryMetricsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/resources/delivery_metrics'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'report_type': bundle.inputData?.['report_type'],
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
            sample: samples['DeliveryMetricsResponseSample']
        }
    },
    interestTargetingOptions/get: {
        key: 'interestTargetingOptions/get',
        noun: 'resources',
        display: {
            label: 'Get interest details',
            description: '&lt;p&gt;Get details of a specific interest given interest ID.&lt;/p&gt; &lt;p&gt;Click &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid&#x3D;118370875\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; for a spreadsheet listing interests and their IDs.&lt;/p&gt;',
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
                ...SingleInterestTargetingOptionResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/resources/targeting/interests/{interest_id}'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
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
            sample: samples['SingleInterestTargetingOptionResponseSample']
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
                ...BookClosedResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/resources/metrics_ready_state'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'date': bundle.inputData?.['date'],
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
            sample: samples['BookClosedResponseSample']
        }
    },
    targetingOptions/get: {
        key: 'targetingOptions/get',
        noun: 'resources',
        display: {
            label: 'Get targeting options',
            description: '&lt;p&gt;You can use targeting values in ads placement to define your intended audience. &lt;/p&gt; &lt;p&gt;Targeting metrics are organized around targeting specifications.&lt;/p&gt; &lt;p&gt;For more information on ads targeting, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Sample return:&lt;/b&gt;&lt;/p&gt; &lt;pre class&#x3D;\&quot;literal-block\&quot;&gt; [{&amp;quot;36313&amp;quot;: &amp;quot;Australia: Moreton Bay - North&amp;quot;, &amp;quot;124735&amp;quot;: &amp;quot;Canada: North Battleford&amp;quot;, &amp;quot;36109&amp;quot;: &amp;quot;Australia: Murray&amp;quot;, &amp;quot;36108&amp;quot;: &amp;quot;Australia: Mid North Coast&amp;quot;, &amp;quot;36101&amp;quot;: &amp;quot;Australia: Capital Region&amp;quot;, &amp;quot;811&amp;quot;: &amp;quot;U.S.: Reno&amp;quot;, &amp;quot;36103&amp;quot;: &amp;quot;Australia: Central West&amp;quot;, &amp;quot;36102&amp;quot;: &amp;quot;Australia: Central Coast&amp;quot;, &amp;quot;36105&amp;quot;: &amp;quot;Australia: Far West and Orana&amp;quot;, &amp;quot;36104&amp;quot;: &amp;quot;Australia: Coffs Harbour - Grafton&amp;quot;, &amp;quot;36107&amp;quot;: &amp;quot;Australia: Illawarra&amp;quot;, &amp;quot;36106&amp;quot;: &amp;quot;Australia: Hunter Valley Exc Newcastle&amp;quot;, &amp;quot;554017&amp;quot;: &amp;quot;New Zealand: Wanganui&amp;quot;, &amp;quot;554016&amp;quot;: &amp;quot;New Zealand: Marlborough&amp;quot;, &amp;quot;554015&amp;quot;: &amp;quot;New Zealand: Gisborne&amp;quot;, &amp;quot;554014&amp;quot;: &amp;quot;New Zealand: Tararua&amp;quot;, &amp;quot;554013&amp;quot;: &amp;quot;New Zealand: Invercargill&amp;quot;, &amp;quot;GR&amp;quot;: &amp;quot;Greece&amp;quot;, &amp;quot;554011&amp;quot;: &amp;quot;New Zealand: Whangarei&amp;quot;, &amp;quot;554010&amp;quot;: &amp;quot;New Zealand: Far North&amp;quot;, &amp;quot;717&amp;quot;: &amp;quot;U.S.: Quincy-Hannibal-Keokuk&amp;quot;, &amp;quot;716&amp;quot;: &amp;quot;U.S.: Baton Rouge&amp;quot;,...}] &lt;/pre&gt;',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'targeting_type',
                    label: 'Public targeting type.',
                    type: 'string',
                    required: true,
                    choices: [
                        'APPTYPE',
                        'GENDER',
                        'LOCALE',
                        'AGE_BUCKET',
                        'LOCATION',
                        'GEO',
                        'INTEREST',
                        'KEYWORD',
                        'AUDIENCE_INCLUDE',
                        'AUDIENCE_EXCLUDE',
                    ],
                },
                {
                    key: 'client_id',
                    label: 'Client ID.',
                    type: 'string',
                },
                {
                    key: 'oauth_signature',
                    label: 'Oauth signature',
                    type: 'string',
                },
                {
                    key: 'timestamp',
                    label: 'Timestamp',
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
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'client_id': bundle.inputData?.['client_id'],
                        'oauth_signature': bundle.inputData?.['oauth_signature'],
                        'timestamp': bundle.inputData?.['timestamp'],
                    },
                    body: {
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
}
