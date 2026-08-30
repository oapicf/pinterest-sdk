const samples = require('../samples/ConversionDeletionRequestsApi');
const ConversionDeletionRequest = require('../models/ConversionDeletionRequest');
const ConversionDeletionRequestCreate = require('../models/ConversionDeletionRequestCreate');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const Pinterest.Lib.PaginationOrder = require('../models/Pinterest.Lib.PaginationOrder');
const conversion_deletion_request_list_200_response = require('../models/conversion_deletion_request_list_200_response');
const utils = require('../utils/utils');

module.exports = {
    conversionDeletionRequest/create: {
        key: 'conversionDeletionRequest/create',
        noun: 'conversion_deletion_requests',
        display: {
            label: 'Create a conversion deletion request',
            description: '**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified &#x60;ad_account_id&#x60;. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.',
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
                ...ConversionDeletionRequestCreate.fields(),
            ],
            outputFields: [
                ...ConversionDeletionRequest.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/conversion_deletion_requests'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...ConversionDeletionRequestCreate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'conversionDeletionRequest/create', response.json);
                    return results;
                })
            },
            sample: samples['ConversionDeletionRequestSample']samples['ConversionDeletionRequestSample']
        }
    },
    conversionDeletionRequest/delete: {
        key: 'conversionDeletionRequest/delete',
        noun: 'conversion_deletion_requests',
        display: {
            label: 'Delete a conversion deletion request',
            description: '**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;. This will cancel the request and prevent it from being processed. This can only be done if the request is in the &#x60;PENDING&#x60; status and before the 72 hours mark.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'request_id',
                    label: 'Unique identifier of the conversion deletion request',
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
                ...ConversionDeletionRequest.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'conversionDeletionRequest/delete', response.json);
                    return results;
                })
            },
            sample: samples['ConversionDeletionRequestSample']
        }
    },
    conversionDeletionRequest/get: {
        key: 'conversionDeletionRequest/get',
        noun: 'conversion_deletion_requests',
        display: {
            label: 'Get a single conversion deletion request',
            description: '**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'request_id',
                    label: 'Unique identifier of the conversion deletion request',
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
                ...ConversionDeletionRequest.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'conversionDeletionRequest/get', response.json);
                    return results;
                })
            },
            sample: samples['ConversionDeletionRequestSample']
        }
    },
    conversionDeletionRequest/list: {
        key: 'conversionDeletionRequest/list',
        noun: 'conversion_deletion_requests',
        display: {
            label: 'List conversion deletion requests',
            description: '**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified &#x60;ad_account_id&#x60;.',
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
                ...conversion_deletion_request_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/conversion_deletion_requests'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'conversionDeletionRequest/list', response.json);
                    return results;
                })
            },
            sample: samples['conversion_deletion_request_list_200_responseSample']
        }
    },
}
