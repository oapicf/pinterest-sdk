const samples = require('../samples/UserAccountApi');
const Account = require('../models/Account');
const AnalyticsMetricsResponse = require('../models/AnalyticsMetricsResponse');
const Error = require('../models/Error');
const TopPinsAnalyticsResponse = require('../models/TopPinsAnalyticsResponse');
const TopVideoPinsAnalyticsResponse = require('../models/TopVideoPinsAnalyticsResponse');
const utils = require('../utils/utils');

module.exports = {
    userAccount/analytics: {
        key: 'userAccount/analytics',
        noun: 'user_account',
        display: {
            label: 'Get user account analytics',
            description: 'Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'start_date',
                    label: 'Metric report start date (UTC). Format: YYYY-MM-DD',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'end_date',
                    label: 'Metric report end date (UTC). Format: YYYY-MM-DD',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'from_claimed_content',
                    label: 'Filter on Pins that match your claimed domain.',
                    type: 'string',
                    choices: [
                        'OTHER',
                        'CLAIMED',
                        'BOTH',
                    ],
                },
                {
                    key: 'pin_format',
                    label: 'Pin formats to get data for, default is all.',
                    type: 'string',
                    choices: [
                        'ALL',
                        'PRODUCT',
                        'REGULAR',
                        'VIDEO',
                    ],
                },
                {
                    key: 'app_types',
                    label: 'Apps or devices to get data for, default is all.',
                    type: 'string',
                    choices: [
                        'ALL',
                        'MOBILE',
                        'TABLET',
                        'WEB',
                    ],
                },
                {
                    key: 'metric_types',
                    label: 'Metric types to get data for, default is all. ',
                    type: 'string',
                }
                {
                    key: 'split_field',
                    label: 'How to split the data into groups. Not including this param means data won&#39;t be split.',
                    type: 'string',
                    choices: [
                        'NO_SPLIT',
                        'APP_TYPE',
                        'OWNED_CONTENT',
                        'PIN_FORMAT',
                    ],
                },
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...object.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/user_account/analytics'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'start_date': bundle.inputData?.['start_date'],
                        'end_date': bundle.inputData?.['end_date'],
                        'from_claimed_content': bundle.inputData?.['from_claimed_content'],
                        'pin_format': bundle.inputData?.['pin_format'],
                        'app_types': bundle.inputData?.['app_types'],
                        'metric_types': bundle.inputData?.['metric_types'],
                        'split_field': bundle.inputData?.['split_field'],
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
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
            sample: samples['AnalyticsMetricsResponseSample']
        }
    },
    userAccount/analytics/topPins: {
        key: 'userAccount/analytics/topPins',
        noun: 'user_account',
        display: {
            label: 'Get user account top pins analytics',
            description: 'Gets analytics data about a user&#39;s top pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'start_date',
                    label: 'Metric report start date (UTC). Format: YYYY-MM-DD',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'end_date',
                    label: 'Metric report end date (UTC). Format: YYYY-MM-DD',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'sort_by',
                    label: 'Specify sorting order for metrics',
                    type: 'string',
                    required: true,
                    choices: [
                        'ENGAGEMENT',
                        'IMPRESSION',
                        'OUTBOUND_CLICK',
                        'PIN_CLICK',
                        'SAVE',
                    ],
                },
                {
                    key: 'from_claimed_content',
                    label: 'Filter on Pins that match your claimed domain.',
                    type: 'string',
                    choices: [
                        'OTHER',
                        'CLAIMED',
                        'BOTH',
                    ],
                },
                {
                    key: 'pin_format',
                    label: 'Pin formats to get data for, default is all.',
                    type: 'string',
                    choices: [
                        'ALL',
                        'PRODUCT',
                        'REGULAR',
                        'VIDEO',
                    ],
                },
                {
                    key: 'app_types',
                    label: 'Apps or devices to get data for, default is all.',
                    type: 'string',
                    choices: [
                        'ALL',
                        'MOBILE',
                        'TABLET',
                        'WEB',
                    ],
                },
                {
                    key: 'metric_types',
                    label: 'Metric types to get data for, default is all. ',
                    type: 'string',
                }
                {
                    key: 'num_of_pins',
                    label: 'Number of pins to include, default is 10. Max is 50.',
                    type: 'integer',
                },
                {
                    key: 'created_in_last_n_days',
                    label: 'Get metrics for pins created in the last \&quot;n\&quot; days.',
                    type: 'integer',
                    choices: [
                        '30',
                    ],
                },
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...TopPinsAnalyticsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/user_account/analytics/top_pins'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'start_date': bundle.inputData?.['start_date'],
                        'end_date': bundle.inputData?.['end_date'],
                        'sort_by': bundle.inputData?.['sort_by'],
                        'from_claimed_content': bundle.inputData?.['from_claimed_content'],
                        'pin_format': bundle.inputData?.['pin_format'],
                        'app_types': bundle.inputData?.['app_types'],
                        'metric_types': bundle.inputData?.['metric_types'],
                        'num_of_pins': bundle.inputData?.['num_of_pins'],
                        'created_in_last_n_days': bundle.inputData?.['created_in_last_n_days'],
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
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
            sample: samples['TopPinsAnalyticsResponseSample']
        }
    },
    userAccount/analytics/topVideoPins: {
        key: 'userAccount/analytics/topVideoPins',
        noun: 'user_account',
        display: {
            label: 'Get user account top video pins analytics',
            description: 'Gets analytics data about a user&#39;s top video pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'start_date',
                    label: 'Metric report start date (UTC). Format: YYYY-MM-DD',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'end_date',
                    label: 'Metric report end date (UTC). Format: YYYY-MM-DD',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'sort_by',
                    label: 'Specify sorting order for video metrics',
                    type: 'string',
                    required: true,
                    choices: [
                        'IMPRESSION',
                        'SAVE',
                        'OUTBOUND_CLICK',
                        'VIDEO_MRC_VIEW',
                        'VIDEO_AVG_WATCH_TIME',
                        'VIDEO_V50_WATCH_TIME',
                        'QUARTILE_95_PERCENT_VIEW',
                        'VIDEO_10S_VIEW',
                        'VIDEO_START',
                    ],
                },
                {
                    key: 'from_claimed_content',
                    label: 'Filter on Pins that match your claimed domain.',
                    type: 'string',
                    choices: [
                        'OTHER',
                        'CLAIMED',
                        'BOTH',
                    ],
                },
                {
                    key: 'pin_format',
                    label: 'Pin formats to get data for, default is all.',
                    type: 'string',
                    choices: [
                        'ALL',
                        'PRODUCT',
                        'REGULAR',
                        'VIDEO',
                    ],
                },
                {
                    key: 'app_types',
                    label: 'Apps or devices to get data for, default is all.',
                    type: 'string',
                    choices: [
                        'ALL',
                        'MOBILE',
                        'TABLET',
                        'WEB',
                    ],
                },
                {
                    key: 'metric_types',
                    label: 'Metric types to get video data for, default is all. ',
                    type: 'string',
                }
                {
                    key: 'num_of_pins',
                    label: 'Number of pins to include, default is 10. Max is 50.',
                    type: 'integer',
                },
                {
                    key: 'created_in_last_n_days',
                    label: 'Get metrics for pins created in the last \&quot;n\&quot; days.',
                    type: 'integer',
                    choices: [
                        '30',
                    ],
                },
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...TopVideoPinsAnalyticsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/user_account/analytics/top_video_pins'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'start_date': bundle.inputData?.['start_date'],
                        'end_date': bundle.inputData?.['end_date'],
                        'sort_by': bundle.inputData?.['sort_by'],
                        'from_claimed_content': bundle.inputData?.['from_claimed_content'],
                        'pin_format': bundle.inputData?.['pin_format'],
                        'app_types': bundle.inputData?.['app_types'],
                        'metric_types': bundle.inputData?.['metric_types'],
                        'num_of_pins': bundle.inputData?.['num_of_pins'],
                        'created_in_last_n_days': bundle.inputData?.['created_in_last_n_days'],
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
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
            sample: samples['TopVideoPinsAnalyticsResponseSample']
        }
    },
    userAccount/get: {
        key: 'userAccount/get',
        noun: 'user_account',
        display: {
            label: 'Get user account',
            description: 'Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/reference/business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...Account.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/user_account'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
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
            sample: samples['AccountSample']
        }
    },
}
