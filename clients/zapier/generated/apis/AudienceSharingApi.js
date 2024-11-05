const samples = require('../samples/AudienceSharingApi');
const AudienceAccountType = require('../models/AudienceAccountType');
const BusinessSharedAudience = require('../models/BusinessSharedAudience');
const BusinessSharedAudienceResponse = require('../models/BusinessSharedAudienceResponse');
const Error = require('../models/Error');
const SharedAudience = require('../models/SharedAudience');
const SharedAudienceResponse = require('../models/SharedAudienceResponse');
const ad_accounts_audiences_shared_accounts_list_200_response = require('../models/ad_accounts_audiences_shared_accounts_list_200_response');
const audiences_list_200_response = require('../models/audiences_list_200_response');
const utils = require('../utils/utils');

module.exports = {
    adAccountsAudiencesSharedAccounts/list: {
        key: 'adAccountsAudiencesSharedAccounts/list',
        noun: 'audience_sharing',
        display: {
            label: 'List accounts with access to an audience owned by an ad account',
            description: 'List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.',
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
                    label: 'Unique identifier of the audience to use to filter the results.',
                    type: 'string',
                    required: true,
                },
                ....fields(),
                {
                    key: 'page_size',
                    label: 'Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.',
                    type: 'integer',
                },
                {
                    key: 'bookmark',
                    label: 'Cursor used to fetch the next page of items',
                    type: 'string',
                },
            ],
            outputFields: [
                ...ad_accounts_audiences_shared_accounts_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/audiences/shared/accounts'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'audience_id': bundle.inputData?.['audience_id'],
                        'account_type': bundle.inputData?.['account_type'],
                        'page_size': bundle.inputData?.['page_size'],
                        'bookmark': bundle.inputData?.['bookmark'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'adAccountsAudiencesSharedAccounts/list', response.json);
                    return results;
                })
            },
            sample: samples['ad_accounts_audiences_shared_accounts_list_200_responseSample']
        }
    },
    businessAccountAudiencesSharedAccounts/list: {
        key: 'businessAccountAudiencesSharedAccounts/list',
        noun: 'audience_sharing',
        display: {
            label: 'List accounts with access to an audience owned by a business',
            description: 'List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'business_id',
                    label: 'Unique identifier of the requesting business.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'audience_id',
                    label: 'Unique identifier of the audience to use to filter the results.',
                    type: 'string',
                    required: true,
                },
                ....fields(),
                {
                    key: 'page_size',
                    label: 'Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.',
                    type: 'integer',
                },
                {
                    key: 'bookmark',
                    label: 'Cursor used to fetch the next page of items',
                    type: 'string',
                },
            ],
            outputFields: [
                ...ad_accounts_audiences_shared_accounts_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/businesses/{business_id}/audiences/shared/accounts'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'audience_id': bundle.inputData?.['audience_id'],
                        'account_type': bundle.inputData?.['account_type'],
                        'page_size': bundle.inputData?.['page_size'],
                        'bookmark': bundle.inputData?.['bookmark'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'businessAccountAudiencesSharedAccounts/list', response.json);
                    return results;
                })
            },
            sample: samples['ad_accounts_audiences_shared_accounts_list_200_responseSample']
        }
    },
    sharedAudiencesForBusiness/list: {
        key: 'sharedAudiencesForBusiness/list',
        noun: 'audience_sharing',
        display: {
            label: 'List received audiences for a business',
            description: 'Get a list of received audiences for the given business.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'business_id',
                    label: 'Unique identifier of the requesting business.',
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
                    label: 'The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.',
                    type: 'string',
                    choices: [
                        'ASCENDING',
                        'DESCENDING',
                    ],
                },
                {
                    key: 'page_size',
                    label: 'Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.',
                    type: 'integer',
                },
            ],
            outputFields: [
                ...audiences_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/businesses/{business_id}/audiences'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'bookmark': bundle.inputData?.['bookmark'],
                        'order': bundle.inputData?.['order'],
                        'page_size': bundle.inputData?.['page_size'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'sharedAudiencesForBusiness/list', response.json);
                    return results;
                })
            },
            sample: samples['audiences_list_200_responseSample']
        }
    },
    updateAdAccountToAdAccountSharedAudience: {
        key: 'updateAdAccountToAdAccountSharedAudience',
        noun: 'audience_sharing',
        display: {
            label: 'Update audience sharing between ad accounts',
            description: 'From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/create-and-manage-accounts&#39;&gt;Pinterest Business Hierarchy&lt;/a&gt; as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.',
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
                ...SharedAudience.fields(),
            ],
            outputFields: [
                ...SharedAudienceResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...SharedAudience.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'updateAdAccountToAdAccountSharedAudience', response.json);
                    return results;
                })
            },
            sample: samples['SharedAudienceResponseSample']
        }
    },
    updateAdAccountToBusinessSharedAudience: {
        key: 'updateAdAccountToBusinessSharedAudience',
        noun: 'audience_sharing',
        display: {
            label: 'Update audience sharing from an ad account to businesses',
            description: 'From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.',
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
                ...BusinessSharedAudience.fields(),
            ],
            outputFields: [
                ...BusinessSharedAudienceResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/audiences/businesses/shared'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...BusinessSharedAudience.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'updateAdAccountToBusinessSharedAudience', response.json);
                    return results;
                })
            },
            sample: samples['BusinessSharedAudienceResponseSample']
        }
    },
    updateBusinessToAdAccountSharedAudience: {
        key: 'updateBusinessToAdAccountSharedAudience',
        noun: 'audience_sharing',
        display: {
            label: 'Update audience sharing from a business to ad accounts',
            description: 'From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. &lt;ul&gt; &lt;li&gt;If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.&lt;/li&gt; &lt;li&gt;If the business is the recipient of the audience, it can share with any of its owned ad accounts.&lt;/li&gt; &lt;/ul&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'business_id',
                    label: 'Unique identifier of the requesting business.',
                    type: 'string',
                    required: true,
                },
                ...SharedAudience.fields(),
            ],
            outputFields: [
                ...SharedAudienceResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/businesses/{business_id}/audiences/ad_accounts/shared'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...SharedAudience.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'updateBusinessToAdAccountSharedAudience', response.json);
                    return results;
                })
            },
            sample: samples['SharedAudienceResponseSample']
        }
    },
    updateBusinessToBusinessSharedAudience: {
        key: 'updateBusinessToBusinessSharedAudience',
        noun: 'audience_sharing',
        display: {
            label: 'Update audience sharing between businesses',
            description: 'From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'business_id',
                    label: 'Unique identifier of the requesting business.',
                    type: 'string',
                    required: true,
                },
                ...BusinessSharedAudience.fields(),
            ],
            outputFields: [
                ...BusinessSharedAudienceResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/businesses/{business_id}/audiences/businesses/shared'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...BusinessSharedAudience.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'updateBusinessToBusinessSharedAudience', response.json);
                    return results;
                })
            },
            sample: samples['BusinessSharedAudienceResponseSample']
        }
    },
}
