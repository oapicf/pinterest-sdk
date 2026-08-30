const samples = require('../samples/AudiencesApi');
const AdAccountsAudience = require('../models/AdAccountsAudience');
const AdAccountsAudienceCreate = require('../models/AdAccountsAudienceCreate');
const AdAccountsAudienceUpdate = require('../models/AdAccountsAudienceUpdate');
const AudienceOwnershipType = require('../models/AudienceOwnershipType');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const Pinterest.Lib.PaginationOrder = require('../models/Pinterest.Lib.PaginationOrder');
const audiences_list_200_response = require('../models/audiences_list_200_response');
const utils = require('../utils/utils');

module.exports = {
    audiences/create: {
        key: 'audiences/create',
        noun: 'audiences',
        display: {
            label: 'Create audience',
            description: 'Create a new audience for the ad account.',
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
                ...AdAccountsAudienceCreate.fields(),
            ],
            outputFields: [
                ...AdAccountsAudience.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/audiences'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...AdAccountsAudienceCreate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'audiences/create', response.json);
                    return results;
                })
            },
            sample: samples['AdAccountsAudienceSample']samples['AdAccountsAudienceSample']
        }
    },
    audiences/get: {
        key: 'audiences/get',
        noun: 'audiences',
        display: {
            label: 'Get audience',
            description: 'Get a specific audience given the audience ID.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'audience_id',
                    label: 'Audience ID.',
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
                ...AdAccountsAudience.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/audiences/{audience_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'audiences/get', response.json);
                    return results;
                })
            },
            sample: samples['AdAccountsAudienceSample']
        }
    },
    audiences/list: {
        key: 'audiences/list',
        noun: 'audiences',
        display: {
            label: 'List audiences',
            description: 'Get list of audiences for the ad account.',
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
                ....fields(),
                {
                    key: 'exclude_nca',
                    label: 'When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all).',
                    type: 'boolean',
                },
            ],
            outputFields: [
                ...audiences_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/audiences'),
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
                        'ownership_type': bundle.inputData?.['ownership_type'],
                        'exclude_nca': bundle.inputData?.['exclude_nca'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'audiences/list', response.json);
                    return results;
                })
            },
            sample: samples['audiences_list_200_responseSample']
        }
    },
    audiences/update: {
        key: 'audiences/update',
        noun: 'audiences',
        display: {
            label: 'Update audience',
            description: 'Update an existing audience for the ad account.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'audience_id',
                    label: 'Audience ID.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                    required: true,
                },
                ...AdAccountsAudienceUpdate.fields(),
            ],
            outputFields: [
                ...AdAccountsAudience.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/audiences/{audience_id}'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...AdAccountsAudienceUpdate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'audiences/update', response.json);
                    return results;
                })
            },
            sample: samples['AdAccountsAudienceSample']
        }
    },
}
