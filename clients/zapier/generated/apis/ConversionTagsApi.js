const samples = require('../samples/ConversionTagsApi');
const ConversionEventResponse = require('../models/ConversionEventResponse');
const ConversionTag = require('../models/ConversionTag');
const ConversionTagCreate = require('../models/ConversionTagCreate');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const Pinterest.Lib.PaginationOrder = require('../models/Pinterest.Lib.PaginationOrder');
const conversion_tags_list_200_response = require('../models/conversion_tags_list_200_response');
const page_visit_conversion_tags_get_200_response = require('../models/page_visit_conversion_tags_get_200_response');
const utils = require('../utils/utils');

module.exports = {
    conversionTags/create: {
        key: 'conversionTags/create',
        noun: 'conversion_tags',
        display: {
            label: 'Create conversion tag',
            description: 'Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.  The Pinterest Tag tracks actions people take on the ad account&#39;s website after they view the ad account&#39;s ad on Pinterest. The advertiser needs to customize this tag to track conversions.  For more information, see:  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)',
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
                ...ConversionTagCreate.fields(),
            ],
            outputFields: [
                ...ConversionTag.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/conversion_tags'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...ConversionTagCreate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'conversionTags/create', response.json);
                    return results;
                })
            },
            sample: samples['ConversionTagSample']samples['ConversionTagSample']
        }
    },
    conversionTags/get: {
        key: 'conversionTags/get',
        noun: 'conversion_tags',
        display: {
            label: 'Get conversion tag',
            description: 'Get information about an existing conversion tag.',
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
                    key: 'conversion_tag_id',
                    label: 'Id of the conversion tag.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...ConversionTag.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'conversionTags/get', response.json);
                    return results;
                })
            },
            sample: samples['ConversionTagSample']
        }
    },
    conversionTags/list: {
        key: 'conversionTags/list',
        noun: 'conversion_tags',
        display: {
            label: 'List conversion tags',
            description: 'List conversion tags associated with an ad account.',
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
                    key: 'filter_deleted',
                    label: 'Filter by deleted status',
                    type: 'boolean',
                },
            ],
            outputFields: [
                ...conversion_tags_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/conversion_tags'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'filter_deleted': bundle.inputData?.['filter_deleted'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'conversionTags/list', response.json);
                    return results;
                })
            },
            sample: samples['conversion_tags_list_200_responseSample']
        }
    },
    ocpmEligibleConversionTags/get: {
        key: 'ocpmEligibleConversionTags/get',
        noun: 'conversion_tags',
        display: {
            label: 'Get Ocpm eligible conversion tags',
            description: 'Get Ocpm eligible conversion tag events for an ad account.',
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
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'ocpmEligibleConversionTags/get', response.json);
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
    pageVisitConversionTags/get: {
        key: 'pageVisitConversionTags/get',
        noun: 'conversion_tags',
        display: {
            label: 'Get page visit conversion tags',
            description: 'Get all page visit conversion tag events for an ad account.',
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
                ...page_visit_conversion_tags_get_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/conversion_tags/page_visit'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'pageVisitConversionTags/get', response.json);
                    return results;
                })
            },
            sample: samples['page_visit_conversion_tags_get_200_responseSample']
        }
    },
}
