const samples = require('../samples/TargetingTemplateApi');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const Pinterest.Lib.PaginationOrder = require('../models/Pinterest.Lib.PaginationOrder');
const TargetingTemplate = require('../models/TargetingTemplate');
const TargetingTemplateCreate = require('../models/TargetingTemplateCreate');
const TargetingTemplateUpdateRequestReadOrUpdate = require('../models/TargetingTemplateUpdateRequestReadOrUpdate');
const targeting_template_list_200_response = require('../models/targeting_template_list_200_response');
const utils = require('../utils/utils');

module.exports = {
    targetingTemplate/create: {
        key: 'targetingTemplate/create',
        noun: 'targeting_template',
        display: {
            label: 'Create targeting templates',
            description: 'Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.',
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
                ...TargetingTemplateCreate.fields(),
            ],
            outputFields: [
                ...TargetingTemplate.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/targeting_templates'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...TargetingTemplateCreate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'targetingTemplate/create', response.json);
                    return results;
                })
            },
            sample: samples['TargetingTemplateSample']samples['TargetingTemplateSample']
        }
    },
    targetingTemplate/list: {
        key: 'targetingTemplate/list',
        noun: 'targeting_template',
        display: {
            label: 'List targeting templates',
            description: 'Get a list of the targeting templates in the specified &#x60;ad_account_id&#x60;',
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
                    key: 'include_sizing',
                    label: 'Include audience sizing in result or not',
                    type: 'boolean',
                },
                {
                    key: 'search_query',
                    label: 'Search query. Can contain pin description keywords or comma-separated pin IDs.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...targeting_template_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/targeting_templates'),
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
                        'include_sizing': bundle.inputData?.['include_sizing'],
                        'search_query': bundle.inputData?.['search_query'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'targetingTemplate/list', response.json);
                    return results;
                })
            },
            sample: samples['targeting_template_list_200_responseSample']
        }
    },
    targetingTemplate/update: {
        key: 'targetingTemplate/update',
        noun: 'targeting_template',
        display: {
            label: 'Update targeting templates',
            description: 'Update the targeting template given advertiser ID and targeting template ID',
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
                ...TargetingTemplateUpdateRequestReadOrUpdate.fields(),
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/targeting_templates'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...TargetingTemplateUpdateRequestReadOrUpdate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'targetingTemplate/update', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
}
