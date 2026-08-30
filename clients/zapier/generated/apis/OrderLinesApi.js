const samples = require('../samples/OrderLinesApi');
const OrderLine = require('../models/OrderLine');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const Pinterest.Lib.PaginationOrder = require('../models/Pinterest.Lib.PaginationOrder');
const order_lines_list_200_response = require('../models/order_lines_list_200_response');
const utils = require('../utils/utils');

module.exports = {
    orderLines/get: {
        key: 'orderLines/get',
        noun: 'order_lines',
        display: {
            label: 'Get order line',
            description: 'Get a specific existing order line associated with an ad account.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'order_line_id',
                    label: 'Order line ID.',
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
                ...OrderLine.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/order_lines/{order_line_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'orderLines/get', response.json);
                    return results;
                })
            },
            sample: samples['OrderLineSample']
        }
    },
    orderLines/list: {
        key: 'orderLines/list',
        noun: 'order_lines',
        display: {
            label: 'Get order lines.',
            description: 'List existing order lines associated with an ad account.',
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
                ...order_lines_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/order_lines'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'orderLines/list', response.json);
                    return results;
                })
            },
            sample: samples['order_lines_list_200_responseSample']
        }
    },
}
