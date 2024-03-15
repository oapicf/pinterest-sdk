const samples = require('../samples/BoardsApi');
const Board = require('../models/Board');
const BoardSection = require('../models/BoardSection');
const BoardUpdate = require('../models/BoardUpdate');
const Error = require('../models/Error');
const board_sections_list_200_response = require('../models/board_sections_list_200_response');
const boards_list_200_response = require('../models/boards_list_200_response');
const boards_list_pins_200_response = require('../models/boards_list_pins_200_response');
const utils = require('../utils/utils');

module.exports = {
    boardSections/create: {
        key: 'boardSections/create',
        noun: 'boards',
        display: {
            label: 'Create board section',
            description: 'Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'board_id',
                    label: 'Unique identifier of a board.',
                    type: 'string',
                    required: true,
                },
                ...BoardSection.fields(),
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...BoardSection.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/boards/{board_id}/sections'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                    },
                    body: {
                        ...BoardSection.mapping(bundle),
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['BoardSectionSample']
        }
    },
    boardSections/delete: {
        key: 'boardSections/delete',
        noun: 'boards',
        display: {
            label: 'Delete board section',
            description: 'Delete a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'board_id',
                    label: 'Unique identifier of a board.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'section_id',
                    label: 'Unique identifier of a board section.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/boards/{board_id}/sections/{section_id}'),
                    method: 'DELETE',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
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
            sample: { data: {} }
        }
    },
    boardSections/list: {
        key: 'boardSections/list',
        noun: 'boards',
        display: {
            label: 'List board sections',
            description: 'Get a list of all board sections from a board owned by the \&quot;operation user_account\&quot; - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'board_id',
                    label: 'Unique identifier of a board.',
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
                {
                    key: 'page_size',
                    label: 'Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.',
                    type: 'integer',
                },
            ],
            outputFields: [
                ...board_sections_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/boards/{board_id}/sections'),
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
            sample: samples['board_sections_list_200_responseSample']
        }
    },
    boardSections/listPins: {
        key: 'boardSections/listPins',
        noun: 'boards',
        display: {
            label: 'List Pins on board section',
            description: 'Get a list of the Pins on a board section of a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'board_id',
                    label: 'Unique identifier of a board.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'section_id',
                    label: 'Unique identifier of a board section.',
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
                {
                    key: 'page_size',
                    label: 'Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.',
                    type: 'integer',
                },
            ],
            outputFields: [
                ...boards_list_pins_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/boards/{board_id}/sections/{section_id}/pins'),
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
            sample: samples['boards_list_pins_200_responseSample']
        }
    },
    boardSections/update: {
        key: 'boardSections/update',
        noun: 'boards',
        display: {
            label: 'Update board section',
            description: 'Update a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'board_id',
                    label: 'Unique identifier of a board.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'section_id',
                    label: 'Unique identifier of a board section.',
                    type: 'string',
                    required: true,
                },
                ...BoardSection.fields(),
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...BoardSection.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/boards/{board_id}/sections/{section_id}'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                    },
                    body: {
                        ...BoardSection.mapping(bundle),
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['BoardSectionSample']
        }
    },
    boards/create: {
        key: 'boards/create',
        noun: 'boards',
        display: {
            label: 'Create board',
            description: 'Create a board owned by the \&quot;operation user_account\&quot;. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...Board.fields(),
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...Board.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/boards'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                    },
                    body: {
                        ...Board.mapping(bundle),
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['BoardSample']
        }
    },
    boards/delete: {
        key: 'boards/delete',
        noun: 'boards',
        display: {
            label: 'Delete board',
            description: 'Delete a board owned by the \&quot;operation user_account\&quot;. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'board_id',
                    label: 'Unique identifier of a board.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/boards/{board_id}'),
                    method: 'DELETE',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
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
            sample: { data: {} }
        }
    },
    boards/get: {
        key: 'boards/get',
        noun: 'boards',
        display: {
            label: 'Get board',
            description: 'Get a board owned by the operation user_account - or a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'board_id',
                    label: 'Unique identifier of a board.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...Board.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/boards/{board_id}'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
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
            sample: samples['BoardSample']
        }
    },
    boards/list: {
        key: 'boards/list',
        noun: 'boards',
        display: {
            label: 'List boards',
            description: 'Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.',
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
                    key: 'privacy',
                    label: 'Privacy setting for a board.',
                    type: 'string',
                    choices: [
                        'ALL',
                        'PROTECTED',
                        'PUBLIC',
                        'SECRET',
                        'PUBLIC_AND_SECRET',
                    ],
                },
            ],
            outputFields: [
                ...boards_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/boards'),
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
                        'privacy': bundle.inputData?.['privacy'],
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
            sample: samples['boards_list_200_responseSample']
        }
    },
    boards/listPins: {
        key: 'boards/listPins',
        noun: 'boards',
        display: {
            label: 'List Pins on board',
            description: 'Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'board_id',
                    label: 'Unique identifier of a board.',
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
                    label: 'Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.',
                    type: 'integer',
                },
                {
                    key: 'creative_types',
                    label: 'Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.',
                    type: 'string',
                }
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
                {
                    key: 'pin_metrics',
                    label: 'Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.',
                    type: 'boolean',
                },
            ],
            outputFields: [
                ...boards_list_pins_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/boards/{board_id}/pins'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                        'creative_types': bundle.inputData?.['creative_types'],
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                        'pin_metrics': bundle.inputData?.['pin_metrics'],
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
            sample: samples['boards_list_pins_200_responseSample']
        }
    },
    boards/update: {
        key: 'boards/update',
        noun: 'boards',
        display: {
            label: 'Update board',
            description: 'Update a board owned by the \&quot;operating user_account\&quot;. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'board_id',
                    label: 'Unique identifier of a board.',
                    type: 'string',
                    required: true,
                },
                ...BoardUpdate.fields(),
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...Board.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/boards/{board_id}'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                    },
                    body: {
                        ...BoardUpdate.mapping(bundle),
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['BoardSample']
        }
    },
}
