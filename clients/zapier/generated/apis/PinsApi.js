const samples = require('../samples/PinsApi');
const Error = require('../models/Error');
const Pin = require('../models/Pin');
const PinAnalyticsMetricsResponse = require('../models/PinAnalyticsMetricsResponse');
const PinCreate = require('../models/PinCreate');
const PinUpdate = require('../models/PinUpdate');
const pins_analytics_metric_types_parameter_inner = require('../models/pins_analytics_metric_types_parameter_inner');
const pins_list_200_response = require('../models/pins_list_200_response');
const pins_save_request = require('../models/pins_save_request');
const utils = require('../utils/utils');

module.exports = {
    pins/analytics: {
        key: 'pins/analytics',
        noun: 'pins',
        display: {
            label: 'Get Pin analytics',
            description: 'Get analytics for a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\&quot;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'pin_id',
                    label: 'Unique identifier of a Pin.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'start_date',
                    label: 'Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'end_date',
                    label: 'Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'metric_types',
                    label: 'Pin metric types to get data for, default is all.',
                    type: 'string',
                }
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
                    key: 'split_field',
                    label: 'How to split the data into groups. Not including this param means data won&#39;t be split.',
                    type: 'string',
                    choices: [
                        'NO_SPLIT',
                        'APP_TYPE',
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
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/pins/{pin_id}/analytics'),
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
                        'metric_types': bundle.inputData?.['metric_types'],
                        'app_types': bundle.inputData?.['app_types'],
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
            sample: samples['PinAnalyticsMetricsResponseSample']
        }
    },
    pins/create: {
        key: 'pins/create',
        noun: 'pins',
        display: {
            label: 'Create Pin',
            description: 'Create a Pin on a board or board section owned by the \&quot;operation user_account\&quot;.  Note: If the current \&quot;operation user_account\&quot; (defined by the access token) has access to another user&#39;s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account&#39;s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id&#x3D;12345&amp;...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called &#39;curated content&#39;, please use our &lt;a href&#x3D;&#39;/docs/add-ons/save-button&#39;&gt;Save button&lt;/a&gt; instead. For more tips on creating fresh content for Pinterest, review our &lt;a href&#x3D;&#39;/docs/content/content-creation/&#39;&gt;Content App Solutions Guide&lt;/a&gt;.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/content/content-creation/#Creating%20video%20Pins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...PinCreate.fields(),
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...Pin.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/pins'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                    },
                    body: {
                        ...PinCreate.mapping(bundle),
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['PinSample']
        }
    },
    pins/delete: {
        key: 'pins/delete',
        noun: 'pins',
        display: {
            label: 'Delete Pin',
            description: 'Delete a Pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'pin_id',
                    label: 'Unique identifier of a Pin.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/pins/{pin_id}'),
                    method: 'DELETE',
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
            sample: { data: {} }
        }
    },
    pins/get: {
        key: 'pins/get',
        noun: 'pins',
        display: {
            label: 'Get Pin',
            description: 'Get a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'pin_id',
                    label: 'Unique identifier of a Pin.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'pin_metrics',
                    label: 'Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.',
                    type: 'boolean',
                },
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...Pin.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/pins/{pin_id}'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'pin_metrics': bundle.inputData?.['pin_metrics'],
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
            sample: samples['PinSample']
        }
    },
    pins/list: {
        key: 'pins/list',
        noun: 'pins',
        display: {
            label: 'List Pins',
            description: 'Get a list of the Pins owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - All Pins owned by the \&quot;operation user_account\&quot; are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'bookmark',
                    label: 'Cursor used to fetch the next page of items',
                    type: 'string',
                },
                {
                    key: 'page_size',
                    label: 'Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.',
                    type: 'integer',
                },
                {
                    key: 'pin_filter',
                    label: 'Pin filter.',
                    type: 'string',
                    choices: [
                        'exclude_native',
                        'exclude_repins',
                        'has_been_promoted',
                    ],
                },
                {
                    key: 'include_protected_pins',
                    label: 'Specify if return pins from protected boards',
                    type: 'boolean',
                },
                {
                    key: 'pin_type',
                    label: 'The type of pins to return, currently only enabled for private pins',
                    type: 'string',
                    choices: [
                        'PRIVATE',
                    ],
                },
                {
                    key: 'creative_types',
                    label: 'Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.',
                    type: 'string',
                }
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
                {
                    key: 'pin_metrics',
                    label: 'Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.',
                    type: 'boolean',
                },
            ],
            outputFields: [
                ...pins_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/pins'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                        'pin_filter': bundle.inputData?.['pin_filter'],
                        'include_protected_pins': bundle.inputData?.['include_protected_pins'],
                        'pin_type': bundle.inputData?.['pin_type'],
                        'creative_types': bundle.inputData?.['creative_types'],
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                        'pin_metrics': bundle.inputData?.['pin_metrics'],
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
            sample: samples['pins_list_200_responseSample']
        }
    },
    pins/save: {
        key: 'pins/save',
        noun: 'pins',
        display: {
            label: 'Save Pin',
            description: 'Save a Pin on a board or board section owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'pin_id',
                    label: 'Unique identifier of a Pin.',
                    type: 'string',
                    required: true,
                },
                ...pins_save_request.fields(),
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...Pin.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/pins/{pin_id}/save'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                    },
                    body: {
                        ...pins_save_request.mapping(bundle),
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['PinSample']
        }
    },
    pins/update: {
        key: 'pins/update',
        noun: 'pins',
        display: {
            label: 'Update Pin',
            description: 'Update a pin owned by the \&quot;operating user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'pin_id',
                    label: 'Unique identifier of a Pin.',
                    type: 'string',
                    required: true,
                },
                ...PinUpdate.fields(),
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...Pin.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/pins/{pin_id}'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                    },
                    body: {
                        ...PinUpdate.mapping(bundle),
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['PinSample']
        }
    },
}
