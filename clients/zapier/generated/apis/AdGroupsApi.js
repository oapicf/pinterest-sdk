const samples = require('../samples/AdGroupsApi');
const AdGroupArrayResponse = require('../models/AdGroupArrayResponse');
const AdGroupCreateRequest = require('../models/AdGroupCreateRequest');
const AdGroupResponse = require('../models/AdGroupResponse');
const AdGroupUpdateRequest = require('../models/AdGroupUpdateRequest');
const AdGroupsAnalyticsResponse_inner = require('../models/AdGroupsAnalyticsResponse_inner');
const AdsAnalyticsTargetingType = require('../models/AdsAnalyticsTargetingType');
const BidFloor = require('../models/BidFloor');
const BidFloorRequest = require('../models/BidFloorRequest');
const ConversionReportAttributionType = require('../models/ConversionReportAttributionType');
const Error = require('../models/Error');
const Granularity = require('../models/Granularity');
const MetricsResponse = require('../models/MetricsResponse');
const ad_groups_list_200_response = require('../models/ad_groups_list_200_response');
const utils = require('../utils/utils');

module.exports = {
    adGroups/analytics: {
        key: 'adGroups/analytics',
        noun: 'ad_groups',
        display: {
            label: 'Get ad group analytics',
            description: 'Get analytics for the specified ad groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.',
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
                    key: 'ad_group_ids',
                    label: 'List of Ad group Ids to use to filter the results.',
                    type: 'string',
                }
                {
                    key: 'columns',
                    label: 'Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned',
                    type: 'string',
                }
                ....fields(),
                {
                    key: 'click_window_days',
                    label: 'Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.',
                    type: 'integer',
                    choices: [
                        '1',
                        '7',
                        '30',
                        '60',
                    ],
                },
                {
                    key: 'engagement_window_days',
                    label: 'Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.',
                    type: 'integer',
                    choices: [
                        '1',
                        '7',
                        '30',
                        '60',
                    ],
                },
                {
                    key: 'view_window_days',
                    label: 'Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.',
                    type: 'integer',
                    choices: [
                        '1',
                        '7',
                        '30',
                        '60',
                    ],
                },
                {
                    key: 'conversion_report_time',
                    label: 'The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.',
                    type: 'string',
                    choices: [
                        'TIME_OF_AD_ACTION',
                        'TIME_OF_CONVERSION',
                    ],
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/ad_groups/analytics'),
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
                        'ad_group_ids': bundle.inputData?.['ad_group_ids'],
                        'columns': bundle.inputData?.['columns'],
                        'granularity': bundle.inputData?.['granularity'],
                        'click_window_days': bundle.inputData?.['click_window_days'],
                        'engagement_window_days': bundle.inputData?.['engagement_window_days'],
                        'view_window_days': bundle.inputData?.['view_window_days'],
                        'conversion_report_time': bundle.inputData?.['conversion_report_time'],
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
            sample: samples['AdGroupsAnalyticsResponse_innerSample']
        }
    },
    adGroups/create: {
        key: 'adGroups/create',
        noun: 'ad_groups',
        display: {
            label: 'Create ad groups',
            description: 'Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/campaign-structure\&quot; target&#x3D;\&quot;_blank\&quot;&gt; click here&lt;/a&gt;.&lt;/p&gt; &lt;strong&gt;Note:&lt;/strong&gt; - &#39;bid_in_micro_currency&#39; and &#39;budget_in_micro_currency&#39; should be expressed in microcurrency amounts based on the currency field set in the advertiser&#39;s profile.&lt;p/&gt; &lt;p&gt;Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Equivalency equations&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;$1 &#x3D; 1,000,000 microdollars&lt;/li&gt;   &lt;li&gt;1 microdollar &#x3D; $0.000001 &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;strong&gt;To convert between currency and microcurrency&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;To convert dollars to microdollars, mutiply dollars by 1,000,000&lt;/li&gt;   &lt;li&gt;To convert microdollars to dollars, divide microdollars by 1,000,000&lt;/li&gt; &lt;/ul&gt; - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message.',
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
                {
                    key: 'AdGroupCreateRequest',
                    label: 'List of ad groups to create, size limit [1, 30].',
                    type: 'string',
                }
            ],
            outputFields: [
                ...AdGroupArrayResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/ad_groups'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...AdGroupCreateRequest.mapping(bundle),
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['AdGroupArrayResponseSample']
        }
    },
    adGroups/get: {
        key: 'adGroups/get',
        noun: 'ad_groups',
        display: {
            label: 'Get ad group',
            description: 'Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the &lt;a href&#x3D;\&quot;https://www.pinterest.com/_/_/policy/advertising-guidelines/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Pinterest advertising standards&lt;/a&gt;.',
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
                {
                    key: 'ad_group_id',
                    label: 'Unique identifier of an ad group.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...AdGroupResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}'),
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
            sample: samples['AdGroupResponseSample']
        }
    },
    adGroups/list: {
        key: 'adGroups/list',
        noun: 'ad_groups',
        display: {
            label: 'List ad groups',
            description: 'List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). &lt;p/&gt; &lt;strong&gt;Note:&lt;/strong&gt;&lt;p/&gt; Provide only campaign_id or ad_group_id. Do not provide both.',
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
                {
                    key: 'campaign_ids',
                    label: 'List of Campaign Ids to use to filter the results.',
                    type: 'string',
                }
                {
                    key: 'ad_group_ids',
                    label: 'List of Ad group Ids to use to filter the results.',
                    type: 'string',
                }
                {
                    key: 'entity_statuses',
                    label: 'Entity status',
                    type: 'string',
                }
                {
                    key: 'page_size',
                    label: 'Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.',
                    type: 'integer',
                },
                {
                    key: 'order',
                    label: 'The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.',
                    type: 'string',
                    choices: [
                        'ASCENDING',
                        'DESCENDING',
                    ],
                },
                {
                    key: 'bookmark',
                    label: 'Cursor used to fetch the next page of items',
                    type: 'string',
                },
                {
                    key: 'translate_interests_to_names',
                    label: 'Return interests as text names (if value is true) rather than topic IDs.',
                    type: 'boolean',
                },
            ],
            outputFields: [
                ...ad_groups_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/ad_groups'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'campaign_ids': bundle.inputData?.['campaign_ids'],
                        'ad_group_ids': bundle.inputData?.['ad_group_ids'],
                        'entity_statuses': bundle.inputData?.['entity_statuses'],
                        'page_size': bundle.inputData?.['page_size'],
                        'order': bundle.inputData?.['order'],
                        'bookmark': bundle.inputData?.['bookmark'],
                        'translate_interests_to_names': bundle.inputData?.['translate_interests_to_names'],
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
            sample: samples['ad_groups_list_200_responseSample']
        }
    },
    adGroups/update: {
        key: 'adGroups/update',
        noun: 'ad_groups',
        display: {
            label: 'Update ad groups',
            description: 'Update multiple existing ad groups.',
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
                {
                    key: 'AdGroupUpdateRequest',
                    label: 'List of ad groups to update, size limit [1, 30].',
                    type: 'string',
                }
            ],
            outputFields: [
                ...AdGroupArrayResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/ad_groups'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...AdGroupUpdateRequest.mapping(bundle),
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['AdGroupArrayResponseSample']
        }
    },
    adGroupsBidFloor/get: {
        key: 'adGroupsBidFloor/get',
        noun: 'ad_groups',
        display: {
            label: 'Get bid floors',
            description: 'List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. &lt;p/&gt; &lt;p&gt;Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Equivalency equations&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;$1 &#x3D; 1,000,000 microdollars&lt;/li&gt;   &lt;li&gt;1 microdollar &#x3D; $0.000001 &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;strong&gt;To convert between currency and microcurrency&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;To convert dollars to microdollars, mutiply dollars by 1,000,000&lt;/li&gt;   &lt;li&gt;To convert microdollars to dollars, divide microdollars by 1,000,000&lt;/li&gt; &lt;/ul&gt; For more on bid floors see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-your-bid\&quot;&gt; Set your bid&lt;/a&gt;.',
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
                ...BidFloorRequest.fields(),
            ],
            outputFields: [
                ...BidFloor.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/bid_floor'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...BidFloorRequest.mapping(bundle),
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['BidFloorSample']
        }
    },
    adGroupsTargetingAnalytics/get: {
        key: 'adGroupsTargetingAnalytics/get',
        noun: 'ad_groups',
        display: {
            label: 'Get targeting analytics for ad groups',
            description: 'Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt; - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.',
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
                {
                    key: 'ad_group_ids',
                    label: 'List of Ad group Ids to use to filter the results.',
                    type: 'string',
                }
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
                    key: 'targeting_types',
                    label: 'Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other.',
                    type: 'string',
                }
                {
                    key: 'columns',
                    label: 'Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned',
                    type: 'string',
                }
                ....fields(),
                {
                    key: 'click_window_days',
                    label: 'Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.',
                    type: 'integer',
                    choices: [
                        '1',
                        '7',
                        '30',
                        '60',
                    ],
                },
                {
                    key: 'engagement_window_days',
                    label: 'Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.',
                    type: 'integer',
                    choices: [
                        '1',
                        '7',
                        '30',
                        '60',
                    ],
                },
                {
                    key: 'view_window_days',
                    label: 'Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.',
                    type: 'integer',
                    choices: [
                        '1',
                        '7',
                        '30',
                        '60',
                    ],
                },
                {
                    key: 'conversion_report_time',
                    label: 'The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.',
                    type: 'string',
                    choices: [
                        'TIME_OF_AD_ACTION',
                        'TIME_OF_CONVERSION',
                    ],
                },
                ....fields(),
            ],
            outputFields: [
                ...MetricsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ad_group_ids': bundle.inputData?.['ad_group_ids'],
                        'start_date': bundle.inputData?.['start_date'],
                        'end_date': bundle.inputData?.['end_date'],
                        'targeting_types': bundle.inputData?.['targeting_types'],
                        'columns': bundle.inputData?.['columns'],
                        'granularity': bundle.inputData?.['granularity'],
                        'click_window_days': bundle.inputData?.['click_window_days'],
                        'engagement_window_days': bundle.inputData?.['engagement_window_days'],
                        'view_window_days': bundle.inputData?.['view_window_days'],
                        'conversion_report_time': bundle.inputData?.['conversion_report_time'],
                        'attribution_types': bundle.inputData?.['attribution_types'],
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
            sample: samples['MetricsResponseSample']
        }
    },
}
