const samples = require('../samples/AudienceSharingApi');
const AdAccountToAdAccountSharedAudience = require('../models/AdAccountToAdAccountSharedAudience');
const AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody = require('../models/AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody');
const AdAccountToBusinessSharedAudience = require('../models/AdAccountToBusinessSharedAudience');
const AdAccountToBusinessSharedAudienceUpdateWithRequiredBody = require('../models/AdAccountToBusinessSharedAudienceUpdateWithRequiredBody');
const AudienceAccountType = require('../models/AudienceAccountType');
const BusinessToAdAccountSharedAudience = require('../models/BusinessToAdAccountSharedAudience');
const BusinessToAdAccountSharedAudienceUpdateWithRequiredBody = require('../models/BusinessToAdAccountSharedAudienceUpdateWithRequiredBody');
const BusinessToBusinessSharedAudience = require('../models/BusinessToBusinessSharedAudience');
const BusinessToBusinessSharedAudienceUpdateWithRequiredBody = require('../models/BusinessToBusinessSharedAudienceUpdateWithRequiredBody');
const Order = require('../models/Order');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const ad_accounts_audiences_shared_accounts_list_200_response = require('../models/ad_accounts_audiences_shared_accounts_list_200_response');
const shared_audiences_for_business_list_200_response = require('../models/shared_audiences_for_business_list_200_response');
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
                    key: 'audience_id',
                    label: 'Unique identifier of the audience to use to filter the results.',
                    type: 'string',
                    required: true,
                },
                ....fields(),
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
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
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
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
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
                ....fields(),
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
                ...shared_audiences_for_business_list_200_response.fields('', false),
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
                        'order': bundle.inputData?.['order'],
                        'bookmark': bundle.inputData?.['bookmark'],
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
            sample: samples['shared_audiences_for_business_list_200_responseSample']
        }
    },
    updateAdAccountToAdAccountSharedAudience: {
        key: 'updateAdAccountToAdAccountSharedAudience',
        noun: 'audience_sharing',
        display: {
            label: 'Update audience sharing between ad accounts',
            description: 'From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same [Pinterest Business Hierarchy](https://help.pinterest.com/en/business/article/create-and-manage-accounts) as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).',
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
                ...AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody.fields(),
            ],
            outputFields: [
                ...AdAccountToAdAccountSharedAudience.fields('', false),
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
                        ...AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'updateAdAccountToAdAccountSharedAudience', response.json);
                    return results;
                })
            },
            sample: samples['AdAccountToAdAccountSharedAudienceSample']
        }
    },
    updateAdAccountToBusinessSharedAudience: {
        key: 'updateAdAccountToBusinessSharedAudience',
        noun: 'audience_sharing',
        display: {
            label: 'Update audience sharing from an ad account to businesses',
            description: 'From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).',
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
                ...AdAccountToBusinessSharedAudienceUpdateWithRequiredBody.fields(),
            ],
            outputFields: [
                ...AdAccountToBusinessSharedAudience.fields('', false),
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
                        ...AdAccountToBusinessSharedAudienceUpdateWithRequiredBody.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'updateAdAccountToBusinessSharedAudience', response.json);
                    return results;
                })
            },
            sample: samples['AdAccountToBusinessSharedAudienceSample']
        }
    },
    updateBusinessToAdAccountSharedAudience: {
        key: 'updateBusinessToAdAccountSharedAudience',
        noun: 'audience_sharing',
        display: {
            label: 'Update audience sharing from a business to ad accounts',
            description: 'From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience.  - If the business is the owner of the audience, it can share with any ad account within the same business hierarchy. - If the business is the recipient of the audience, it can share with any of its owned ad accounts.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).',
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
                ...BusinessToAdAccountSharedAudienceUpdateWithRequiredBody.fields(),
            ],
            outputFields: [
                ...BusinessToAdAccountSharedAudience.fields('', false),
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
                        ...BusinessToAdAccountSharedAudienceUpdateWithRequiredBody.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'updateBusinessToAdAccountSharedAudience', response.json);
                    return results;
                })
            },
            sample: samples['BusinessToAdAccountSharedAudienceSample']
        }
    },
    updateBusinessToBusinessSharedAudience: {
        key: 'updateBusinessToBusinessSharedAudience',
        noun: 'audience_sharing',
        display: {
            label: 'Update audience sharing between businesses',
            description: 'From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).',
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
                ...BusinessToBusinessSharedAudienceUpdateWithRequiredBody.fields(),
            ],
            outputFields: [
                ...BusinessToBusinessSharedAudience.fields('', false),
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
                        ...BusinessToBusinessSharedAudienceUpdateWithRequiredBody.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'updateBusinessToBusinessSharedAudience', response.json);
                    return results;
                })
            },
            sample: samples['BusinessToBusinessSharedAudienceSample']
        }
    },
}
