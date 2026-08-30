const samples = require('../samples/CampaignsApi');
const AdPinAnalytics = require('../models/AdPinAnalytics');
const AdsAnalyticsCampaignTargetingType = require('../models/AdsAnalyticsCampaignTargetingType');
const Campaign = require('../models/Campaign');
const CampaignBatchUpdateItem = require('../models/CampaignBatchUpdateItem');
const CampaignBatchWriteResponseModel = require('../models/CampaignBatchWriteResponseModel');
const CampaignCreateItem = require('../models/CampaignCreateItem');
const CampaignDeliveryEstimatesCampaign = require('../models/CampaignDeliveryEstimatesCampaign');
const CampaignDeliveryEstimatesResponse = require('../models/CampaignDeliveryEstimatesResponse');
const CampaignsAnalyticsMetrics = require('../models/CampaignsAnalyticsMetrics');
const ConversionReportAttributionType = require('../models/ConversionReportAttributionType');
const EntityStatus = require('../models/EntityStatus');
const Granularity = require('../models/Granularity');
const MetricsResponse = require('../models/MetricsResponse');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const Pinterest.Lib.PaginationOrder = require('../models/Pinterest.Lib.PaginationOrder');
const ReportingColumnSync = require('../models/ReportingColumnSync');
const ReportingTimeZone = require('../models/ReportingTimeZone');
const campaigns_list_200_response = require('../models/campaigns_list_200_response');
const utils = require('../utils/utils');

module.exports = {
    adPins/analytics: {
        key: 'adPins/analytics',
        noun: 'campaigns',
        display: {
            label: 'Get pins analytics',
            description: 'Get analytics for the pins given a campaign and pins in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'campaign_id',
                    label: 'Campaign Id to use to filter the results.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'pin_ids',
                    label: 'List of Pin IDs.',
                    type: 'string',
                }
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
                    key: 'columns',
                    label: 'Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.',
                    type: 'string',
                }
                ....fields(),
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'click_window_days',
                    label: 'Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.',
                    type: 'number',
                    choices: [
                        '0',
                        '1',
                        '7',
                        '14',
                        '30',
                        '60',
                    ],
                },
                {
                    key: 'engagement_window_days',
                    label: 'Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.',
                    type: 'number',
                    choices: [
                        '0',
                        '1',
                        '7',
                        '14',
                        '30',
                        '60',
                    ],
                },
                {
                    key: 'view_window_days',
                    label: 'Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.',
                    type: 'number',
                    choices: [
                        '0',
                        '1',
                        '7',
                        '14',
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
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/pins/analytics'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'campaign_id': bundle.inputData?.['campaign_id'],
                        'pin_ids': bundle.inputData?.['pin_ids'],
                        'start_date': bundle.inputData?.['start_date'],
                        'end_date': bundle.inputData?.['end_date'],
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
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'adPins/analytics', response.json);
                    return results;
                })
            },
            sample: samples['AdPinAnalyticsSample']
        }
    },
    campaignTargetingAnalytics/get: {
        key: 'campaignTargetingAnalytics/get',
        noun: 'campaigns',
        display: {
            label: 'Get targeting analytics for campaigns',
            description: 'Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.',
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
                    key: 'targeting_types',
                    label: 'Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users.',
                    type: 'string',
                }
                {
                    key: 'columns',
                    label: 'Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.',
                    type: 'string',
                }
                ....fields(),
                {
                    key: 'click_window_days',
                    label: 'Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.',
                    type: 'number',
                    choices: [
                        '0',
                        '1',
                        '7',
                        '14',
                        '30',
                        '60',
                    ],
                },
                {
                    key: 'engagement_window_days',
                    label: 'Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.',
                    type: 'number',
                    choices: [
                        '0',
                        '1',
                        '7',
                        '14',
                        '30',
                        '60',
                    ],
                },
                {
                    key: 'view_window_days',
                    label: 'Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.',
                    type: 'number',
                    choices: [
                        '0',
                        '1',
                        '7',
                        '14',
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
                {
                    key: 'attribution_types',
                    label: 'List of types of attribution for the conversion report',
                    type: 'string',
                }
                ....fields(),
            ],
            outputFields: [
                ...MetricsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/campaigns/targeting_analytics'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'campaign_ids': bundle.inputData?.['campaign_ids'],
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
                        'reporting_timezone': bundle.inputData?.['reporting_timezone'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'campaignTargetingAnalytics/get', response.json);
                    return results;
                })
            },
            sample: samples['MetricsResponseSample']
        }
    },
    campaigns/analytics: {
        key: 'campaigns/analytics',
        noun: 'campaigns',
        display: {
            label: 'Get campaign analytics',
            description: 'Get analytics for the specified campaigns in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.',
            hidden: false,
        },
        operation: {
            inputFields: [
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
                    key: 'campaign_ids',
                    label: 'List of Campaign Ids to use to filter the results.',
                    type: 'string',
                }
                {
                    key: 'columns',
                    label: 'Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.',
                    type: 'string',
                }
                ....fields(),
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'click_window_days',
                    label: 'Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.',
                    type: 'number',
                    choices: [
                        '0',
                        '1',
                        '7',
                        '14',
                        '30',
                        '60',
                    ],
                },
                {
                    key: 'engagement_window_days',
                    label: 'Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.',
                    type: 'number',
                    choices: [
                        '0',
                        '1',
                        '7',
                        '14',
                        '30',
                        '60',
                    ],
                },
                {
                    key: 'view_window_days',
                    label: 'Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.',
                    type: 'number',
                    choices: [
                        '0',
                        '1',
                        '7',
                        '14',
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
                {
                    key: 'aggregate_report_rows',
                    label: 'Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.',
                    type: 'boolean',
                },
                ....fields(),
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/campaigns/analytics'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'start_date': bundle.inputData?.['start_date'],
                        'end_date': bundle.inputData?.['end_date'],
                        'campaign_ids': bundle.inputData?.['campaign_ids'],
                        'columns': bundle.inputData?.['columns'],
                        'granularity': bundle.inputData?.['granularity'],
                        'click_window_days': bundle.inputData?.['click_window_days'],
                        'engagement_window_days': bundle.inputData?.['engagement_window_days'],
                        'view_window_days': bundle.inputData?.['view_window_days'],
                        'conversion_report_time': bundle.inputData?.['conversion_report_time'],
                        'aggregate_report_rows': bundle.inputData?.['aggregate_report_rows'],
                        'reporting_timezone': bundle.inputData?.['reporting_timezone'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'campaigns/analytics', response.json);
                    return results;
                })
            },
            sample: samples['CampaignsAnalyticsMetricsSample']
        }
    },
    campaigns/create: {
        key: 'campaigns/create',
        noun: 'campaigns',
        display: {
            label: 'Create campaigns',
            description: 'Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.  For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).  **Note:** - The values for &#x60;lifetime_spend_cap&#x60; and &#x60;daily_spend_cap&#x60; are microcurrency amounts based on the currency field set in the advertiser&#39;s profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000',
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
                    key: 'CampaignCreateItem',
                    label: '',
                    type: 'string',
                }
            ],
            outputFields: [
                ...CampaignBatchWriteResponseModel.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/campaigns'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CampaignCreateItem.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'campaigns/create', response.json);
                    return results;
                })
            },
            sample: samples['CampaignBatchWriteResponseModelSample']
        }
    },
    campaigns/get: {
        key: 'campaigns/get',
        noun: 'campaigns',
        display: {
            label: 'Get campaign',
            description: 'Get a specific campaign given the campaign ID.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'campaign_id',
                    label: 'Campaign ID, must be associated with the ad account ID provided in the path.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...Campaign.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/campaigns/{campaign_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'campaigns/get', response.json);
                    return results;
                })
            },
            sample: samples['CampaignSample']
        }
    },
    campaigns/list: {
        key: 'campaigns/list',
        noun: 'campaigns',
        display: {
            label: 'List campaigns',
            description: 'Get a list of the campaigns in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.',
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
                    key: 'bookmark',
                    label: 'Cursor used to fetch the next page of items',
                    type: 'string',
                },
                {
                    key: 'page_size',
                    label: 'Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.',
                    type: 'integer',
                },
                ....fields(),
                {
                    key: 'campaign_ids',
                    label: 'List of Campaign Ids to use to filter the results.',
                    type: 'string',
                }
                {
                    key: 'entity_statuses',
                    label: 'Entity status',
                    type: 'string',
                }
            ],
            outputFields: [
                ...campaigns_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/campaigns'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                        'order': bundle.inputData?.['order'],
                        'campaign_ids': bundle.inputData?.['campaign_ids'],
                        'entity_statuses': bundle.inputData?.['entity_statuses'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'campaigns/list', response.json);
                    return results;
                })
            },
            sample: samples['campaigns_list_200_responseSample']
        }
    },
    campaigns/update: {
        key: 'campaigns/update',
        noun: 'campaigns',
        display: {
            label: 'Update campaigns',
            description: 'Update multiple ad campaigns based on campaign_ids.  **Note:** - The values for &#x60;lifetime_spend_cap&#x60; and &#x60;daily_spend_cap&#x60; are microcurrency amounts based on the currency field set in the advertiser&#39;s profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000',
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
                    key: 'CampaignBatchUpdateItem',
                    label: '',
                    type: 'string',
                }
            ],
            outputFields: [
                ...CampaignBatchWriteResponseModel.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/campaigns'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CampaignBatchUpdateItem.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'campaigns/update', response.json);
                    return results;
                })
            },
            sample: samples['CampaignBatchWriteResponseModelSample']
        }
    },
    getCampaignDeliveryEstimates: {
        key: 'getCampaignDeliveryEstimates',
        noun: 'campaigns',
        display: {
            label: 'Get campaign delivery estimates',
            description: 'Get delivery estimates for an ads campaign  **This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**',
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
                    key: 'CampaignDeliveryEstimatesCampaign',
                    label: '',
                    type: 'string',
                }
            ],
            outputFields: [
                ...CampaignDeliveryEstimatesResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/campaigns/delivery_estimates'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CampaignDeliveryEstimatesCampaign.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getCampaignDeliveryEstimates', response.json);
                    return results;
                })
            },
            sample: samples['CampaignDeliveryEstimatesResponseSample']
        }
    },
}
