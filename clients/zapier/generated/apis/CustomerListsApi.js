const samples = require('../samples/CustomerListsApi');
const CustomerList = require('../models/CustomerList');
const CustomerListCreate = require('../models/CustomerListCreate');
const CustomerListUpdateWithRequiredBody = require('../models/CustomerListUpdateWithRequiredBody');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const Pinterest.Lib.PaginationOrder = require('../models/Pinterest.Lib.PaginationOrder');
const customer_lists_list_200_response = require('../models/customer_lists_list_200_response');
const utils = require('../utils/utils');

module.exports = {
    customerLists/create: {
        key: 'customerLists/create',
        noun: 'customer_lists',
        display: {
            label: 'Create customer lists',
            description: 'Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the &#x60;CUSTOMER_LIST&#x60; audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ad_account_id',
                    label: '',
                    type: 'string',
                    required: true,
                },
                ...CustomerListCreate.fields(),
            ],
            outputFields: [
                ...CustomerList.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/customer_lists'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CustomerListCreate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'customerLists/create', response.json);
                    return results;
                })
            },
            sample: samples['CustomerListSample']samples['CustomerListSample']
        }
    },
    customerLists/get: {
        key: 'customerLists/get',
        noun: 'customer_lists',
        display: {
            label: 'Get customer list',
            description: 'Gets a specific customer list given the customer list ID.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ad_account_id',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'customer_list_id',
                    label: 'Customer list ID.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...CustomerList.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'customerLists/get', response.json);
                    return results;
                })
            },
            sample: samples['CustomerListSample']
        }
    },
    customerLists/list: {
        key: 'customerLists/list',
        noun: 'customer_lists',
        display: {
            label: 'Get customer lists',
            description: 'Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ad_account_id',
                    label: '',
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
                    key: 'exclude_nca',
                    label: 'When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all).',
                    type: 'boolean',
                },
            ],
            outputFields: [
                ...customer_lists_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/customer_lists'),
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
                        'exclude_nca': bundle.inputData?.['exclude_nca'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'customerLists/list', response.json);
                    return results;
                })
            },
            sample: samples['customer_lists_list_200_responseSample']
        }
    },
    customerLists/update: {
        key: 'customerLists/update',
        noun: 'customer_lists',
        display: {
            label: 'Update customer list',
            description: 'Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \&quot;CUSTOMER_LIST\&quot; audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ad_account_id',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'customer_list_id',
                    label: 'Customer list ID.',
                    type: 'string',
                    required: true,
                },
                ...CustomerListUpdateWithRequiredBody.fields(),
            ],
            outputFields: [
                ...CustomerList.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CustomerListUpdateWithRequiredBody.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'customerLists/update', response.json);
                    return results;
                })
            },
            sample: samples['CustomerListSample']
        }
    },
}
