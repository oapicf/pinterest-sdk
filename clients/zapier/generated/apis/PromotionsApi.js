const samples = require('../samples/PromotionsApi');
const Error = require('../models/Error');
const PromotionCreateRequest = require('../models/PromotionCreateRequest');
const PromotionResponse = require('../models/PromotionResponse');
const PromotionUpdateRequest = require('../models/PromotionUpdateRequest');
const PromotionsResponse = require('../models/PromotionsResponse');
const promotions_list_200_response = require('../models/promotions_list_200_response');
const utils = require('../utils/utils');

module.exports = {
    promotions/create: {
        key: 'promotions/create',
        noun: 'promotions',
        display: {
            label: 'Create promotions',
            description: 'Create multiple new promotions.',
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
                    key: 'PromotionCreateRequest',
                    label: 'List of promotions to create, size limit [1, 30].',
                    type: 'string',
                }
            ],
            outputFields: [
                ...PromotionsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/promotions'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...PromotionCreateRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'promotions/create', response.json);
                    return results;
                })
            },
            sample: samples['PromotionsResponseSample']
        }
    },
    promotions/delete: {
        key: 'promotions/delete',
        noun: 'promotions',
        display: {
            label: 'Delete promotion by id',
            description: 'Delete a promotion within Pinterest.',
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
                    key: 'promotion_id',
                    label: 'Unique identifier of a promotion',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/promotions/{promotion_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'promotions/delete', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
    promotions/get: {
        key: 'promotions/get',
        noun: 'promotions',
        display: {
            label: 'Get promotion by id',
            description: 'Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.',
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
                    key: 'promotion_id',
                    label: 'Unique identifier of a promotion',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...PromotionResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/promotions/{promotion_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'promotions/get', response.json);
                    return results;
                })
            },
            sample: samples['PromotionResponseSample']
        }
    },
    promotions/list: {
        key: 'promotions/list',
        noun: 'promotions',
        display: {
            label: 'Get promotions',
            description: 'Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.',
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
                    key: 'page_size',
                    label: 'Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.',
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
            ],
            outputFields: [
                ...promotions_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/promotions'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'page_size': bundle.inputData?.['page_size'],
                        'order': bundle.inputData?.['order'],
                        'bookmark': bundle.inputData?.['bookmark'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'promotions/list', response.json);
                    return results;
                })
            },
            sample: samples['promotions_list_200_responseSample']
        }
    },
    promotions/update: {
        key: 'promotions/update',
        noun: 'promotions',
        display: {
            label: 'Update promotions',
            description: 'Update multiple promotions.',
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
                    key: 'PromotionUpdateRequest',
                    label: 'List of promotions to create, size limit [1, 30].',
                    type: 'string',
                }
            ],
            outputFields: [
                ...PromotionsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/promotions'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...PromotionUpdateRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'promotions/update', response.json);
                    return results;
                })
            },
            sample: samples['PromotionsResponseSample']
        }
    },
}
