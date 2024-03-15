const samples = require('../samples/AudiencesApi');
const Audience = require('../models/Audience');
const AudienceCreateCustomRequest = require('../models/AudienceCreateCustomRequest');
const AudienceCreateRequest = require('../models/AudienceCreateRequest');
const AudienceUpdateRequest = require('../models/AudienceUpdateRequest');
const Error = require('../models/Error');
const audiences_list_200_response = require('../models/audiences_list_200_response');
const utils = require('../utils/utils');

module.exports = {
    audiences/create: {
        key: 'audiences/create',
        noun: 'audiences',
        display: {
            label: 'Create audience',
            description: 'Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. &lt;p/&gt; For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt;.',
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
                ...AudienceCreateRequest.fields(),
            ],
            outputFields: [
                ...Audience.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/audiences'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...AudienceCreateRequest.mapping(bundle),
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['AudienceSample']
        }
    },
    audiences/createCustom: {
        key: 'audiences/createCustom',
        noun: 'audiences',
        display: {
            label: 'Create custom audience',
            description: 'Create a custom audience and find the audiences you want your ads to reach.',
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
                ...AudienceCreateCustomRequest.fields(),
            ],
            outputFields: [
                ...Audience.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/audiences/custom'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...AudienceCreateCustomRequest.mapping(bundle),
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['AudienceSample']
        }
    },
    audiences/get: {
        key: 'audiences/get',
        noun: 'audiences',
        display: {
            label: 'Get audience',
            description: 'Get a specific audience given the audience ID.',
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
                    key: 'audience_id',
                    label: 'Unique identifier of an audience',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...Audience.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/audiences/{audience_id}'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
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
            sample: samples['AudienceSample']
        }
    },
    audiences/list: {
        key: 'audiences/list',
        noun: 'audiences',
        display: {
            label: 'List audiences',
            description: 'Get list of audiences for the ad account.',
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
                    key: 'order',
                    label: 'The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items.',
                    type: 'string',
                    choices: [
                        'ASCENDING',
                        'DESCENDING',
                    ],
                },
                {
                    key: 'page_size',
                    label: 'Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.',
                    type: 'integer',
                },
                {
                    key: 'ownership_type',
                    label: '&lt;strong&gt;This feature is currently in beta and not available to all apps.&lt;/strong&gt; Filter audiences by ownership type.',
                    type: 'string',
                    choices: [
                        'OWNED',
                        'RECEIVED',
                    ],
                },
            ],
            outputFields: [
                ...audiences_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/audiences'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'bookmark': bundle.inputData?.['bookmark'],
                        'order': bundle.inputData?.['order'],
                        'page_size': bundle.inputData?.['page_size'],
                        'ownership_type': bundle.inputData?.['ownership_type'],
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
            sample: samples['audiences_list_200_responseSample']
        }
    },
    audiences/update: {
        key: 'audiences/update',
        noun: 'audiences',
        display: {
            label: 'Update audience',
            description: 'Update (edit or remove) an existing targeting audience.',
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
                    key: 'audience_id',
                    label: 'Unique identifier of an audience',
                    type: 'string',
                    required: true,
                },
                ...AudienceUpdateRequest.fields(),
            ],
            outputFields: [
                ...Audience.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/audiences/{audience_id}'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...AudienceUpdateRequest.mapping(bundle),
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['AudienceSample']
        }
    },
}
