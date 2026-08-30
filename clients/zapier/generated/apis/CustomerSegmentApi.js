const samples = require('../samples/CustomerSegmentApi');
const CustomerSegment = require('../models/CustomerSegment');
const CustomerSegmentCreate = require('../models/CustomerSegmentCreate');
const CustomerSegmentUpdateRequestUpdateWithRequiredBody = require('../models/CustomerSegmentUpdateRequestUpdateWithRequiredBody');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const Pinterest.Lib.PaginationOrder = require('../models/Pinterest.Lib.PaginationOrder');
const customer_segment_list_200_response = require('../models/customer_segment_list_200_response');
const utils = require('../utils/utils');

module.exports = {
    customerSegment/create: {
        key: 'customerSegment/create',
        noun: 'customer_segment',
        display: {
            label: 'Create customer segments',
            description: 'Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.',
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
                ...CustomerSegmentCreate.fields(),
            ],
            outputFields: [
                ...CustomerSegment.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/customer_segments'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CustomerSegmentCreate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'customerSegment/create', response.json);
                    return results;
                })
            },
            sample: samples['CustomerSegmentSample']samples['CustomerSegmentSample']
        }
    },
    customerSegment/list: {
        key: 'customerSegment/list',
        noun: 'customer_segment',
        display: {
            label: 'List customer segments',
            description: 'Get a list of the customer segments in the specified &#x60;ad_account_id&#x60;.',
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
                ...customer_segment_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/customer_segments'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'customerSegment/list', response.json);
                    return results;
                })
            },
            sample: samples['customer_segment_list_200_responseSample']
        }
    },
    customerSegment/update: {
        key: 'customerSegment/update',
        noun: 'customer_segment',
        display: {
            label: 'Update customer segments',
            description: 'Update the customer segment given advertiser ID and customer segment ID',
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
                ...CustomerSegmentUpdateRequestUpdateWithRequiredBody.fields(),
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/customer_segments'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CustomerSegmentUpdateRequestUpdateWithRequiredBody.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'customerSegment/update', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
}
