const samples = require('../samples/PromotionsApi');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const Pinterest.Lib.PaginationOrder = require('../models/Pinterest.Lib.PaginationOrder');
const Promotion = require('../models/Promotion');
const PromotionBatchUpdate = require('../models/PromotionBatchUpdate');
const PromotionCreate = require('../models/PromotionCreate');
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
                    key: 'PromotionCreate',
                    label: '',
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
                        ...PromotionCreate.mapping(bundle),
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
                    key: 'promotion_id',
                    label: 'Promotion ID',
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
                ...Promotion.fields('', false),
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
            sample: samples['PromotionSample']
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
                    key: 'promotion_id',
                    label: 'Promotion ID',
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
                ...Promotion.fields('', false),
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
            sample: samples['PromotionSample']
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
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                        'order': bundle.inputData?.['order'],
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
                    key: 'PromotionBatchUpdate',
                    label: '',
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
                        ...PromotionBatchUpdate.mapping(bundle),
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
