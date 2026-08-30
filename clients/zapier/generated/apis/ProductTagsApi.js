const samples = require('../samples/ProductTagsApi');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const ProductTagsBulkAddRequest = require('../models/ProductTagsBulkAddRequest');
const ProductTagsBulkDeleteRequest = require('../models/ProductTagsBulkDeleteRequest');
const ProductTagsError = require('../models/ProductTagsError');
const ProductTagsResponse = require('../models/ProductTagsResponse');
const utils = require('../utils/utils');

module.exports = {
    productTags/bulkAdd: {
        key: 'productTags/bulkAdd',
        noun: 'product_tags',
        display: {
            label: 'Add product tags to pin',
            description: 'Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'pin_id',
                    label: 'Unique identifier of the hero pin that will receive product tags.',
                    type: 'string',
                    required: true,
                },
                ...ProductTagsBulkAddRequest.fields(),
            ],
            outputFields: [
                ...ProductTagsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/pins/{pin_id}/product_tags'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...ProductTagsBulkAddRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'productTags/bulkAdd', response.json);
                    return results;
                })
            },
            sample: samples['ProductTagsResponseSample']
        }
    },
    productTags/bulkDelete: {
        key: 'productTags/bulkDelete',
        noun: 'product_tags',
        display: {
            label: 'Delete product tags from pin',
            description: 'Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'pin_id',
                    label: 'Unique identifier of the hero pin that will receive product tags.',
                    type: 'string',
                    required: true,
                },
                ...ProductTagsBulkDeleteRequest.fields(),
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/pins/{pin_id}/product_tags/bulk-delete'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...ProductTagsBulkDeleteRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'productTags/bulkDelete', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
    productTags/list: {
        key: 'productTags/list',
        noun: 'product_tags',
        display: {
            label: 'Get product tags for pin',
            description: 'Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'pin_id',
                    label: 'Unique identifier of the hero pin that will receive product tags.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...ProductTagsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/pins/{pin_id}/product_tags'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'productTags/list', response.json);
                    return results;
                })
            },
            sample: samples['ProductTagsResponseSample']
        }
    },
}
