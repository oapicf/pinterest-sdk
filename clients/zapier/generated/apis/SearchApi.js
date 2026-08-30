const samples = require('../samples/SearchApi');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const boards_list_200_response = require('../models/boards_list_200_response');
const pins_list_200_response = require('../models/pins_list_200_response');
const search_partner_pins_200_response = require('../models/search_partner_pins_200_response');
const utils = require('../utils/utils');

module.exports = {
    searchPartnerPins: {
        key: 'searchPartnerPins',
        noun: 'search',
        display: {
            label: 'Search pins by a given search term',
            description: '**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get the top 10 Pins by a given search term.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'term',
                    label: 'Search term to look up pins.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'country_code',
                    label: 'Two letter country code (ISO 3166-1 alpha-2)',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'bookmark',
                    label: 'Cursor used to fetch the next page of items',
                    type: 'string',
                },
                {
                    key: 'locale',
                    label: 'Search locale.',
                    type: 'string',
                },
                {
                    key: 'limit',
                    label: 'Max search result size',
                    type: 'integer',
                },
            ],
            outputFields: [
                ...search_partner_pins_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/search/partner/pins'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'term': bundle.inputData?.['term'],
                        'country_code': bundle.inputData?.['country_code'],
                        'bookmark': bundle.inputData?.['bookmark'],
                        'locale': bundle.inputData?.['locale'],
                        'limit': bundle.inputData?.['limit'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'searchPartnerPins', response.json);
                    return results;
                })
            },
            sample: samples['search_partner_pins_200_responseSample']
        }
    },
    searchUserBoards/get: {
        key: 'searchUserBoards/get',
        noun: 'search',
        display: {
            label: 'Search user&#39;s boards',
            description: 'Search for boards for the \&quot;operation user_account\&quot;. This includes boards of all board types. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
                {
                    key: 'query',
                    label: 'Search query. Can contain pin description keywords or comma-separated pin IDs.',
                    type: 'string',
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
            ],
            outputFields: [
                ...boards_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/search/boards'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                        'query': bundle.inputData?.['query'],
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'searchUserBoards/get', response.json);
                    return results;
                })
            },
            sample: samples['boards_list_200_responseSample']
        }
    },
    searchUserPins/list: {
        key: 'searchUserPins/list',
        noun: 'search',
        display: {
            label: 'Search user&#39;s Pins',
            description: 'Search for pins for the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'query',
                    label: 'Search query. Can contain pin description keywords or comma-separated pin IDs.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
                {
                    key: 'bookmark',
                    label: 'Cursor used to fetch the next page of items',
                    type: 'string',
                },
            ],
            outputFields: [
                ...pins_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/search/pins'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'query': bundle.inputData?.['query'],
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                        'bookmark': bundle.inputData?.['bookmark'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'searchUserPins/list', response.json);
                    return results;
                })
            },
            sample: samples['pins_list_200_responseSample']
        }
    },
}
