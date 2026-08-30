const samples = require('../samples/AdAccountsApi');
const AdAccount = require('../models/AdAccount');
const AdAccountAnalyticsItems = require('../models/AdAccountAnalyticsItems');
const AdAccountCreate = require('../models/AdAccountCreate');
const AdsAnalyticsAccountTargetingType = require('../models/AdsAnalyticsAccountTargetingType');
const AdsAnalyticsCreateAsyncRequest = require('../models/AdsAnalyticsCreateAsyncRequest');
const AdsAnalyticsCreateAsyncResponse = require('../models/AdsAnalyticsCreateAsyncResponse');
const AdsAnalyticsGetAsyncResponse = require('../models/AdsAnalyticsGetAsyncResponse');
const ConversionProductReport = require('../models/ConversionProductReport');
const ConversionProductReportCreate = require('../models/ConversionProductReportCreate');
const ConversionReportAttributionType = require('../models/ConversionReportAttributionType');
const Granularity = require('../models/Granularity');
const MMMReport = require('../models/MMMReport');
const MMMReportCreate = require('../models/MMMReportCreate');
const MetricsResponse = require('../models/MetricsResponse');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const Pinterest.Lib.PaginationOrder = require('../models/Pinterest.Lib.PaginationOrder');
const ReportingColumnSync = require('../models/ReportingColumnSync');
const ReportingTimeZone = require('../models/ReportingTimeZone');
const TemplateBasedReport = require('../models/TemplateBasedReport');
const ad_accounts_list_200_response = require('../models/ad_accounts_list_200_response');
const templates_list_200_response = require('../models/templates_list_200_response');
const utils = require('../utils/utils');

module.exports = {
    adAccount/analytics: {
        key: 'adAccount/analytics',
        noun: 'ad_accounts',
        display: {
            label: 'Get ad account analytics',
            description: '  Get analytics for the specified &#x60;ad_account_id&#x60;, filtered by the specified options.    - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.    - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.    - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.',
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
                ....fields(),
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/analytics'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'start_date': bundle.inputData?.['start_date'],
                        'end_date': bundle.inputData?.['end_date'],
                        'columns': bundle.inputData?.['columns'],
                        'granularity': bundle.inputData?.['granularity'],
                        'click_window_days': bundle.inputData?.['click_window_days'],
                        'engagement_window_days': bundle.inputData?.['engagement_window_days'],
                        'view_window_days': bundle.inputData?.['view_window_days'],
                        'conversion_report_time': bundle.inputData?.['conversion_report_time'],
                        'reporting_timezone': bundle.inputData?.['reporting_timezone'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'adAccount/analytics', response.json);
                    return results;
                })
            },
            sample: samples['AdAccountAnalyticsItemsSample']
        }
    },
    adAccountTargetingAnalytics/get: {
        key: 'adAccountTargetingAnalytics/get',
        noun: 'ad_accounts',
        display: {
            label: 'Get targeting analytics for an ad account',
            description: 'Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt;  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.',
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
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/targeting_analytics'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'adAccountTargetingAnalytics/get', response.json);
                    return results;
                })
            },
            sample: samples['MetricsResponseSample']
        }
    },
    adAccounts/create: {
        key: 'adAccounts/create',
        noun: 'ad_accounts',
        display: {
            label: 'Create ad account',
            description: 'Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...AdAccountCreate.fields(),
            ],
            outputFields: [
                ...AdAccount.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...AdAccountCreate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'adAccounts/create', response.json);
                    return results;
                })
            },
            sample: samples['AdAccountSample']samples['AdAccountSample']
        }
    },
    adAccounts/get: {
        key: 'adAccounts/get',
        noun: 'ad_accounts',
        display: {
            label: 'Get ad account',
            description: 'Get an ad account',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ad_account_id',
                    label: '',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...AdAccount.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'adAccounts/get', response.json);
                    return results;
                })
            },
            sample: samples['AdAccountSample']
        }
    },
    adAccounts/list: {
        key: 'adAccounts/list',
        noun: 'ad_accounts',
        display: {
            label: 'List ad accounts',
            description: 'Get a list of the ad_accounts that the \&quot;operation user_account\&quot; has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'include_shared_accounts',
                    label: 'Include shared ad accounts',
                    type: 'boolean',
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
            ],
            outputFields: [
                ...ad_accounts_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'include_shared_accounts': bundle.inputData?.['include_shared_accounts'],
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'adAccounts/list', response.json);
                    return results;
                })
            },
            sample: samples['ad_accounts_list_200_responseSample']
        }
    },
    analytics/createConversionProductReport: {
        key: 'analytics/createConversionProductReport',
        noun: 'ad_accounts',
        display: {
            label: 'Create a request for a brand, category, SKU report',
            description: '  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.',
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
                ...ConversionProductReportCreate.fields(),
            ],
            outputFields: [
                ...ConversionProductReport.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/reports/brand_category_sku'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...ConversionProductReportCreate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'analytics/createConversionProductReport', response.json);
                    return results;
                })
            },
            sample: samples['ConversionProductReportSample']samples['ConversionProductReportSample']
        }
    },
    analytics/createMmmReport: {
        key: 'analytics/createMmmReport',
        noun: 'ad_accounts',
        display: {
            label: 'Create a request for a Marketing Mix Modeling (MMM) report',
            description: '    This creates an asynchronous mmm report based on the given request.     It returns a token that you can use to download the report when it is     ready. NOTE: An additional limit of 5 queries per minute per advertiser     applies to this endpoint while it&#39;s in beta release.     For the ADVERTISER_PAID_SPEND_IN_DOLLAR,     ADVERTISER_PAID_ECPC_IN_DOLLAR, and ADVERTISER_PAID_ECPM_IN_DOLLAR     columns: if you receive bonus media, this value still includes that spend, and it will     need to be removed manually with support from your Pinterest account team for a     fully netted value. Over time, we&#39;ll also subtract bonus media and other incentives as     data becomes available. Production and other non-media fees are excluded.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ad_account_id',
                    label: '',
                    type: 'string',
                    required: true,
                },
                ...MMMReportCreate.fields(),
            ],
            outputFields: [
                ...MMMReport.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/mmm_reports'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...MMMReportCreate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'analytics/createMmmReport', response.json);
                    return results;
                })
            },
            sample: samples['MMMReportSample']samples['MMMReportSample']
        }
    },
    analytics/createReport: {
        key: 'analytics/createReport',
        noun: 'ad_accounts',
        display: {
            label: 'Create async request for an account analytics report',
            description: '  This returns a token that you can use to download the report when it is ready.   Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.   - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.   - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days.   - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.   - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days.   - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.',
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
                ...AdsAnalyticsCreateAsyncRequest.fields(),
            ],
            outputFields: [
                ...AdsAnalyticsCreateAsyncResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/reports'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...AdsAnalyticsCreateAsyncRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'analytics/createReport', response.json);
                    return results;
                })
            },
            sample: samples['AdsAnalyticsCreateAsyncResponseSample']
        }
    },
    analytics/createTemplateReport: {
        key: 'analytics/createTemplateReport',
        noun: 'ad_accounts',
        display: {
            label: 'Create async request for an analytics report using a template',
            description: '  This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ad_account_id',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'template_id',
                    label: 'Unique identifier of a template.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'start_date',
                    label: 'Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today.',
                    type: 'string',
                },
                {
                    key: 'end_date',
                    label: 'Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date.',
                    type: 'string',
                },
                ....fields(),
            ],
            outputFields: [
                ...TemplateBasedReport.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/templates/{template_id}/reports'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'start_date': bundle.inputData?.['start_date'],
                        'end_date': bundle.inputData?.['end_date'],
                        'granularity': bundle.inputData?.['granularity'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'analytics/createTemplateReport', response.json);
                    return results;
                })
            },
            sample: samples['TemplateBasedReportSample']samples['TemplateBasedReportSample']
        }
    },
    analytics/getConversionProductReport: {
        key: 'analytics/getConversionProductReport',
        noun: 'ad_accounts',
        display: {
            label: 'Get advertiser brand, category, SKU report',
            description: '  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.',
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
                    key: 'token',
                    label: 'Token returned from the post request creation call',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...ConversionProductReport.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/reports/brand_category_sku'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'token': bundle.inputData?.['token'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'analytics/getConversionProductReport', response.json);
                    return results;
                })
            },
            sample: samples['ConversionProductReportSample']
        }
    },
    analytics/getMmmReport: {
        key: 'analytics/getMmmReport',
        noun: 'ad_accounts',
        display: {
            label: 'Get advertiser Marketing Mix Modeling (MMM) report.',
            description: '    Get an mmm report for an ad account. This returns a URL to an     mmm metrics report given a token returned from the create mmm report endpoint.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ad_account_id',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'token',
                    label: 'Token returned from the post request creation call',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...MMMReport.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/mmm_reports'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'token': bundle.inputData?.['token'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'analytics/getMmmReport', response.json);
                    return results;
                })
            },
            sample: samples['MMMReportSample']
        }
    },
    analytics/getReport: {
        key: 'analytics/getReport',
        noun: 'ad_accounts',
        display: {
            label: 'Get the account analytics report created by the async call',
            description: '  This returns a URL to an analytics report given a token returned from the post request report creation call.   You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour.   - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.',
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
                    key: 'token',
                    label: 'Token returned from the post request creation call',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...AdsAnalyticsGetAsyncResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/reports'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'token': bundle.inputData?.['token'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'analytics/getReport', response.json);
                    return results;
                })
            },
            sample: samples['AdsAnalyticsGetAsyncResponseSample']
        }
    },
    sandbox/delete: {
        key: 'sandbox/delete',
        noun: 'ad_accounts',
        display: {
            label: 'Delete ads data for ad account in API Sandbox',
            description: 'Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.',
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
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/sandbox'),
                    method: 'DELETE',
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'sandbox/delete', response.json);
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
    templates/list: {
        key: 'templates/list',
        noun: 'ad_accounts',
        display: {
            label: 'List templates',
            description: 'Gets all Templates associated with an ad account ID.',
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
            ],
            outputFields: [
                ...templates_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/templates'),
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
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'templates/list', response.json);
                    return results;
                })
            },
            sample: samples['templates_list_200_responseSample']
        }
    },
}
