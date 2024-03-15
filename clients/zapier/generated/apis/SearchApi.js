const samples = require('../samples/SearchApi');
const Error = require('../models/Error');
const pins_list_200_response = require('../models/pins_list_200_response');
const search_partner_pins_200_response = require('../models/search_partner_pins_200_response');
const search_user_boards_get_200_response = require('../models/search_user_boards_get_200_response');
const utils = require('../utils/utils');

module.exports = {
    searchPartnerPins: {
        key: 'searchPartnerPins',
        noun: 'search',
        display: {
            label: 'Search pins by a given search term',
            description: '&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get the top 10 Pins by a given search term.',
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
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
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
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
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
            description: 'Search for boards for the \&quot;operation user_account\&quot;. This includes boards of all board types. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/reference/business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.',
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
                    key: 'bookmark',
                    label: 'Cursor used to fetch the next page of items',
                    type: 'string',
                },
                {
                    key: 'page_size',
                    label: 'Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.',
                    type: 'integer',
                },
                {
                    key: 'query',
                    label: 'Search query. Can contain pin description keywords or comma-separated pin IDs.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...search_user_boards_get_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/search/boards'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                        'query': bundle.inputData?.['query'],
                    },
                    body: {
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['search_user_boards_get_200_responseSample']
        }
    },
    searchUserPins/list: {
        key: 'searchUserPins/list',
        noun: 'search',
        display: {
            label: 'Search user&#39;s Pins',
            description: 'Search for pins for the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/reference/business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.',
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
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
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
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['pins_list_200_responseSample']
        }
    },
}
