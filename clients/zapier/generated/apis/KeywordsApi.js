const samples = require('../samples/KeywordsApi');
const Keywords = require('../models/Keywords');
const KeywordsCreate = require('../models/KeywordsCreate');
const KeywordsMetricsArrayResponse = require('../models/KeywordsMetricsArrayResponse');
const KeywordsUpdate = require('../models/KeywordsUpdate');
const MatchType = require('../models/MatchType');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const TrendType = require('../models/TrendType');
const TrendingKeywordsResponse = require('../models/TrendingKeywordsResponse');
const TrendsAgeBucket = require('../models/TrendsAgeBucket');
const TrendsGenderFilter = require('../models/TrendsGenderFilter');
const TrendsL1Interest = require('../models/TrendsL1Interest');
const TrendsSupportedRegion = require('../models/TrendsSupportedRegion');
const keywords_get_200_response = require('../models/keywords_get_200_response');
const utils = require('../utils/utils');

module.exports = {
    countryKeywordsMetrics/get: {
        key: 'countryKeywordsMetrics/get',
        noun: 'keywords',
        display: {
            label: 'Get country&#39;s keyword metrics',
            description: '  See keyword metrics for a specified country, aggregated across all of Pinterest.   (Definitions are available from the \&quot;Get delivery metrics definitions\&quot;   [API endpoint](/docs/api/v5/#operation/delivery_metrics/get)).',
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
                    key: 'country_code',
                    label: 'Two letter country code (ISO 3166-1 alpha-2)',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'keywords',
                    label: 'Comma-separated keywords',
                    type: 'string',
                }
            ],
            outputFields: [
                ...KeywordsMetricsArrayResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/keywords/metrics'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'country_code': bundle.inputData?.['country_code'],
                        'keywords': bundle.inputData?.['keywords'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'countryKeywordsMetrics/get', response.json);
                    return results;
                })
            },
            sample: samples['KeywordsMetricsArrayResponseSample']
        }
    },
    keywords/create: {
        key: 'keywords/create',
        noun: 'keywords',
        display: {
            label: 'Create keywords',
            description: '  Create keywords for the following entity types (advertiser, campaign, ad group, or ad). For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).    **Notes:**   - Advertisers and campaigns can only be assigned keywords with excluding (&#x60;_NEGATIVE&#x60;).   - All keyword match types are available for ad groups.    For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).    **Returns:**   - A successful call returns an object containing an array of new keyword objects and an empty &#x60;errors&#x60; object array.   - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the &#x60;errors&#x60; object array:     &#x60;&#x60;&#x60;json     {       \&quot;keywords\&quot;: [],       \&quot;errors\&quot;: [         {           \&quot;data\&quot;: {             \&quot;archived\&quot;: null,             \&quot;match_type\&quot;: \&quot;EXACT\&quot;,             \&quot;parent_type\&quot;: null,             \&quot;value\&quot;: \&quot;foobar\&quot;,             \&quot;parent_id\&quot;: null,             \&quot;type\&quot;: \&quot;keyword\&quot;,             \&quot;id\&quot;: null           },           \&quot;error_messages\&quot;: [             \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot;           ]         }       ]     }',
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
                ...KeywordsCreate.fields(),
            ],
            outputFields: [
                ...Keywords.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/keywords'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...KeywordsCreate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'keywords/create', response.json);
                    return results;
                })
            },
            sample: samples['KeywordsSample']samples['KeywordsSample']
        }
    },
    keywords/get: {
        key: 'keywords/get',
        noun: 'keywords',
        display: {
            label: 'Get keywords',
            description: '    Get a list of keywords based on the filters provided. If no filter is provided, it will default to the &#x60;ad_account_id&#x60; filter, which means it will only return keywords that specifically have &#x60;parent_id&#x60; set to the &#x60;ad_account_id&#x60;. Note: Keywords can have &#x60;ad_account_ids&#x60;, &#x60;campaign_ids&#x60;, and &#x60;ad_group_ids&#x60; set as their &#x60;parent_ids&#x60;. Keywords created through Ads Manager will have their &#x60;parent_id&#x60; set to an &#x60;ad_group_id&#x60;, not &#x60;ad_account_id&#x60;.      For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).      **Notes:**     - Advertisers and campaigns can only be assigned keywords with excluding (&#x60;_NEGATIVE&#x60;).     - All keyword match types are available for ad groups.      For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).      **Returns:**     - A successful call returns an object containing an array of new keyword objects and an empty &#x60;errors&#x60; object array.     - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the &#x60;errors&#x60; object array:       &#x60;&#x60;&#x60;json       {         \&quot;keywords\&quot;: [],         \&quot;errors\&quot;: [           {             \&quot;data\&quot;: {               \&quot;archived\&quot;: null,               \&quot;match_type\&quot;: \&quot;EXACT\&quot;,               \&quot;parent_type\&quot;: null,               \&quot;value\&quot;: \&quot;foobar\&quot;,               \&quot;parent_id\&quot;: null,               \&quot;type\&quot;: \&quot;keyword\&quot;,               \&quot;id\&quot;: null             },             \&quot;error_messages\&quot;: [               \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot;             ]           }         ]       }',
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
                    key: 'campaign_id',
                    label: 'Campaign Id to use to filter the results.',
                    type: 'string',
                },
                {
                    key: 'ad_group_id',
                    label: 'Ad group Id.',
                    type: 'string',
                },
                {
                    key: 'ad_group_ids',
                    label: 'List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.',
                    type: 'string',
                }
                {
                    key: 'match_types',
                    label: 'Keyword [match type](/docs/api-features/targeting-overview/)',
                    type: 'string',
                }
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
                ...keywords_get_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/keywords'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'campaign_id': bundle.inputData?.['campaign_id'],
                        'ad_group_id': bundle.inputData?.['ad_group_id'],
                        'ad_group_ids': bundle.inputData?.['ad_group_ids'],
                        'match_types': bundle.inputData?.['match_types'],
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'keywords/get', response.json);
                    return results;
                })
            },
            sample: samples['keywords_get_200_responseSample']
        }
    },
    keywords/update: {
        key: 'keywords/update',
        noun: 'keywords',
        display: {
            label: 'Update keywords',
            description: '  Update one or more keywords&#39; bid and archived fields. Archiving   a keyword effectively deletes it - keywords no longer receive metrics and   are no longer visible within the parent entity&#39;s keywords list.',
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
                ...KeywordsUpdate.fields(),
            ],
            outputFields: [
                ...Keywords.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/keywords'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...KeywordsUpdate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'keywords/update', response.json);
                    return results;
                })
            },
            sample: samples['KeywordsSample']
        }
    },
    trendingKeywords/list: {
        key: 'trendingKeywords/list',
        noun: 'keywords',
        display: {
            label: 'List trending keywords',
            description: 'Get the top trending search keywords among the Pinterest user audience.  Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.  Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.  For an interactive way to explore this data, please visit [trends.pinterest.com](https://trends.pinterest.com).',
            hidden: false,
        },
        operation: {
            inputFields: [
                ....fields(),
                ....fields(),
                {
                    key: 'interests',
                    label: '  The list of supported interests is:   - &#x60;animals&#x60; - Animals   - &#x60;architecture&#x60; - Architecture   - &#x60;art&#x60; - Art   - &#x60;beauty&#x60; - Beauty   - &#x60;childrens_fashion&#x60; - Children&#39;s Fashion   - &#x60;design&#x60; - Design   - &#x60;diy_and_crafts&#x60; - DIY &amp; Crafts   - &#x60;education&#x60; - Education   - &#x60;electronics&#x60; - Electronics   - &#x60;entertainment&#x60; - Entertainment   - &#x60;event_planning&#x60; - Event Planning   - &#x60;finance&#x60; - Finance   - &#x60;food_and_drinks&#x60; - Food &amp; Drink   - &#x60;gardening&#x60; - Gardening   - &#x60;health&#x60; - Health   - &#x60;home_decor&#x60; - Home Decor   - &#x60;mens_fashion&#x60; - Men&#39;s Fashion   - &#x60;parenting&#x60; - Parenting   - &#x60;quotes&#x60; - Quotes   - &#x60;sport&#x60; - Sports   - &#x60;travel&#x60; - Travel   - &#x60;vehicles&#x60; - Vehicles   - &#x60;wedding&#x60; - Wedding   - &#x60;womens_fashion&#x60; - Women&#39;s Fashion',
                    type: 'string',
                }
                {
                    key: 'genders',
                    label: 'If set, filters the results to trends among users who identify with the specified gender(s). If unset, trends among all genders will be returned. The &#x60;unknown&#x60; group includes users with unspecified or customized gender profile settings.',
                    type: 'string',
                }
                {
                    key: 'ages',
                    label: 'If set, filters the results to trends among users in the specified age range(s). If unset, trends among all age groups will be returned.',
                    type: 'string',
                }
                {
                    key: 'include_keywords',
                    label: 'If set, filters the results to top trends which include at least one of the specified keywords. If unset, no keyword filtering logic is applied.',
                    type: 'string',
                }
                {
                    key: 'normalize_against_group',
                    label: ' Governs how the resulting time series data will be normalized to a [0-100] scale.    By default (&#x60;false&#x60;), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword&#39;s time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.    If set to &#x60;true&#x60;, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords.',
                    type: 'boolean',
                },
                {
                    key: 'limit',
                    label: 'The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a &#x60;limit&#x60; of 50 will return the top 50 trends.',
                    type: 'integer',
                },
                {
                    key: 'include_demographics',
                    label: 'Including the age and gender distribution for each keyword. By default (&#x60;false&#x60;), the response will not include demographics data.',
                    type: 'boolean',
                },
            ],
            outputFields: [
                ...TrendingKeywordsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/trends/keywords/{region}/top/{trend_type}'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'interests': bundle.inputData?.['interests'],
                        'genders': bundle.inputData?.['genders'],
                        'ages': bundle.inputData?.['ages'],
                        'include_keywords': bundle.inputData?.['include_keywords'],
                        'normalize_against_group': bundle.inputData?.['normalize_against_group'],
                        'limit': bundle.inputData?.['limit'],
                        'include_demographics': bundle.inputData?.['include_demographics'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'trendingKeywords/list', response.json);
                    return results;
                })
            },
            sample: samples['TrendingKeywordsResponseSample']
        }
    },
}
