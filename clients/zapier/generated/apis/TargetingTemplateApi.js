const samples = require('../samples/TargetingTemplateApi');
const Error = require('../models/Error');
const TargetingTemplateCreate = require('../models/TargetingTemplateCreate');
const TargetingTemplateGetResponseData = require('../models/TargetingTemplateGetResponseData');
const TargetingTemplateUpdateRequest = require('../models/TargetingTemplateUpdateRequest');
const targeting_template_list_200_response = require('../models/targeting_template_list_200_response');
const utils = require('../utils/utils');

module.exports = {
    targetingTemplate/create: {
        key: 'targetingTemplate/create',
        noun: 'targeting_template',
        display: {
            label: 'Create targeting templates',
            description: '&lt;p&gt;Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.&lt;/p&gt;  &lt;p&gt;Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.&lt;/p&gt;',
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
                ...TargetingTemplateGetResponseData.fields('', false),
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
            sample: samples['TargetingTemplateGetResponseDataSample']
        }
    },
    targetingTemplate/list: {
        key: 'targetingTemplate/list',
        noun: 'targeting_template',
        display: {
            label: 'List targeting templates',
            description: 'Get a list of the targeting templates in the specified &lt;code&gt;ad_account_id&lt;/code&gt;',
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
                    key: 'order',
                    label: 'The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.',
                    type: 'string',
                    choices: [
                        'ASCENDING',
                        'DESCENDING',
                    ],
                },
                {
                    key: 'include_sizing',
                    label: 'Include audience sizing in result or not',
                    type: 'boolean',
                },
                {
                    key: 'search_query',
                    label: 'Search keyword for targeting templates',
                    type: 'string',
                },
                {
                    key: 'page_size',
                    label: 'Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.',
                    type: 'integer',
                },
                {
                    key: 'bookmark',
                    label: 'Cursor used to fetch the next page of items',
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
                        'order': bundle.inputData?.['order'],
                        'include_sizing': bundle.inputData?.['include_sizing'],
                        'search_query': bundle.inputData?.['search_query'],
                        'page_size': bundle.inputData?.['page_size'],
                        'bookmark': bundle.inputData?.['bookmark'],
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
            description: '&lt;p&gt;Update the targeting template given advertiser ID and targeting template ID&lt;/p&gt;',
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
                ...TargetingTemplateUpdateRequest.fields(),
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
                        ...TargetingTemplateUpdateRequest.mapping(bundle),
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
