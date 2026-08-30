const samples = require('../samples/AdsApi');
const Ad = require('../models/Ad');
const AdBatchUpdate = require('../models/AdBatchUpdate');
const AdBatchWriteResponseModel = require('../models/AdBatchWriteResponseModel');
const AdCreate = require('../models/AdCreate');
const AdPreviewRequest = require('../models/AdPreviewRequest');
const AdPreviewURLResponse = require('../models/AdPreviewURLResponse');
const AdsAnalytics = require('../models/AdsAnalytics');
const AdsAnalyticsAdTargetingType = require('../models/AdsAnalyticsAdTargetingType');
const CampaignAdPreview = require('../models/CampaignAdPreview');
const CampaignAdPreviewCreate = require('../models/CampaignAdPreviewCreate');
const ConversionAttributionWindowDays = require('../models/ConversionAttributionWindowDays');
const ConversionReportAttributionType = require('../models/ConversionReportAttributionType');
const ConversionReportTimeType = require('../models/ConversionReportTimeType');
const EntityStatus = require('../models/EntityStatus');
const Granularity = require('../models/Granularity');
const MetricsResponse = require('../models/MetricsResponse');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const Pinterest.Lib.PaginationOrder = require('../models/Pinterest.Lib.PaginationOrder');
const ReportingColumnSync = require('../models/ReportingColumnSync');
const ReportingTimeZone = require('../models/ReportingTimeZone');
const ads_list_200_response = require('../models/ads_list_200_response');
const campaign_ad_preview_create_200_response_inner = require('../models/campaign_ad_preview_create_200_response_inner');
const campaign_ad_preview_delete_200_response_inner = require('../models/campaign_ad_preview_delete_200_response_inner');
const utils = require('../utils/utils');

module.exports = {
    adPreviews/create: {
        key: 'adPreviews/create',
        noun: 'ads',
        display: {
            label: 'Create ad preview with pin or image',
            description: 'Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.',
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
                ...AdPreviewRequest.fields(),
            ],
            outputFields: [
                ...AdPreviewURLResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/ad_previews'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...AdPreviewRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'adPreviews/create', response.json);
                    return results;
                })
            },
            sample: samples['AdPreviewURLResponseSample']samples['AdPreviewURLResponseSample']
        }
    },
    adTargetingAnalytics/get: {
        key: 'adTargetingAnalytics/get',
        noun: 'ads',
        display: {
            label: 'Get targeting analytics for ads',
            description: 'Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.',
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
                    key: 'ad_ids',
                    label: 'List of Ad Ids to use to filter the results.',
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
                ....fields(),
                ....fields(),
                ....fields(),
                ....fields(),
                {
                    key: 'attribution_types',
                    label: 'List of types of attribution for the conversion report',
                    type: 'string',
                }
                ....fields(),
                {
                    key: 'sort_columns',
                    label: 'Sort Columns.',
                    type: 'string',
                }
                {
                    key: 'sort_ascending',
                    label: 'Sort ascending.',
                    type: 'boolean',
                },
            ],
            outputFields: [
                ...MetricsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/ads/targeting_analytics'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ad_ids': bundle.inputData?.['ad_ids'],
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
                        'sort_columns': bundle.inputData?.['sort_columns'],
                        'sort_ascending': bundle.inputData?.['sort_ascending'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'adTargetingAnalytics/get', response.json);
                    return results;
                })
            },
            sample: samples['MetricsResponseSample']
        }
    },
    ads/analytics: {
        key: 'ads/analytics',
        noun: 'ads',
        display: {
            label: 'Get ad analytics',
            description: '    Get analytics for the specified ads in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.     - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.',
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
                    key: 'pin_ids',
                    label: 'List of Pin IDs.',
                    type: 'string',
                }
                {
                    key: 'ad_ids',
                    label: 'List of Ad Ids to use to filter the results.',
                    type: 'string',
                }
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
                    key: 'campaign_ids',
                    label: 'List of Campaign Ids to use to filter the results.',
                    type: 'string',
                }
                ....fields(),
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/ads/analytics'),
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
                        'pin_ids': bundle.inputData?.['pin_ids'],
                        'ad_ids': bundle.inputData?.['ad_ids'],
                        'click_window_days': bundle.inputData?.['click_window_days'],
                        'engagement_window_days': bundle.inputData?.['engagement_window_days'],
                        'view_window_days': bundle.inputData?.['view_window_days'],
                        'conversion_report_time': bundle.inputData?.['conversion_report_time'],
                        'campaign_ids': bundle.inputData?.['campaign_ids'],
                        'reporting_timezone': bundle.inputData?.['reporting_timezone'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'ads/analytics', response.json);
                    return results;
                })
            },
            sample: samples['AdsAnalyticsSample']
        }
    },
    ads/create: {
        key: 'ads/create',
        noun: 'ads',
        display: {
            label: 'Create ads',
            description: 'Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.',
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
                    key: 'AdCreate',
                    label: '',
                    type: 'string',
                }
            ],
            outputFields: [
                ...AdBatchWriteResponseModel.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/ads'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...AdCreate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'ads/create', response.json);
                    return results;
                })
            },
            sample: samples['AdBatchWriteResponseModelSample']
        }
    },
    ads/get: {
        key: 'ads/get',
        noun: 'ads',
        display: {
            label: 'Get ad',
            description: 'Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ad_id',
                    label: 'The ID of this ad.',
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
                ...Ad.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/ads/{ad_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'ads/get', response.json);
                    return results;
                })
            },
            sample: samples['AdSample']
        }
    },
    ads/list: {
        key: 'ads/list',
        noun: 'ads',
        display: {
            label: 'List ads',
            description: 'List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only &#x60;campaign_id&#x60; or &#x60;ad_group_id&#x60; or &#x60;ad_id&#x60;. Do not provide more than one type.  Review status is provided for each ad; if &#x60;review_status&#x60; is &#x60;REJECTED&#x60;, the &#x60;rejected_reasons&#x60; field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).',
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
                    key: 'ad_group_ids',
                    label: 'List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.',
                    type: 'string',
                }
                {
                    key: 'ad_ids',
                    label: 'List of Ad Ids to use to filter the results.',
                    type: 'string',
                }
                {
                    key: 'entity_statuses',
                    label: 'Entity status',
                    type: 'string',
                }
            ],
            outputFields: [
                ...ads_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/ads'),
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
                        'ad_group_ids': bundle.inputData?.['ad_group_ids'],
                        'ad_ids': bundle.inputData?.['ad_ids'],
                        'entity_statuses': bundle.inputData?.['entity_statuses'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'ads/list', response.json);
                    return results;
                })
            },
            sample: samples['ads_list_200_responseSample']
        }
    },
    ads/update: {
        key: 'ads/update',
        noun: 'ads',
        display: {
            label: 'Update ads',
            description: 'Update multiple existing ads',
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
                    key: 'AdBatchUpdate',
                    label: '',
                    type: 'string',
                }
            ],
            outputFields: [
                ...AdBatchWriteResponseModel.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/ads'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...AdBatchUpdate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'ads/update', response.json);
                    return results;
                })
            },
            sample: samples['AdBatchWriteResponseModelSample']
        }
    },
    campaignAdPreview/create: {
        key: 'campaignAdPreview/create',
        noun: 'ads',
        display: {
            label: 'Create ad preview records for one or more ad groups',
            description: 'Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.',
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
                    key: 'CampaignAdPreviewCreate',
                    label: '',
                    type: 'string',
                }
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/campaign_ad_preview'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CampaignAdPreviewCreate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'campaignAdPreview/create', response.json);
                    return results;
                })
            },
            sample: samples['campaign_ad_preview_create_200_response_innerSample']samples['CampaignAdPreviewSample']
        }
    },
    campaignAdPreview/delete: {
        key: 'campaignAdPreview/delete',
        noun: 'ads',
        display: {
            label: 'Delete ad preview records for one or more ad groups',
            description: 'Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ad_group_ids',
                    label: 'List of Ad group Ids to use to filter the results.',
                    type: 'string',
                }
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
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/campaign_ad_preview'),
                    method: 'DELETE',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ad_group_ids': bundle.inputData?.['ad_group_ids'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'campaignAdPreview/delete', response.json);
                    return results;
                })
            },
            sample: samples['campaign_ad_preview_delete_200_response_innerSample']
        }
    },
    campaignAdPreview/read: {
        key: 'campaignAdPreview/read',
        noun: 'ads',
        display: {
            label: 'Fetch ad preview records for one or more ad groups',
            description: 'Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ad_group_ids',
                    label: 'List of Ad group Ids to use to filter the results.',
                    type: 'string',
                }
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
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/campaign_ad_preview'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ad_group_ids': bundle.inputData?.['ad_group_ids'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'campaignAdPreview/read', response.json);
                    return results;
                })
            },
            sample: samples['CampaignAdPreviewSample']
        }
    },
}
