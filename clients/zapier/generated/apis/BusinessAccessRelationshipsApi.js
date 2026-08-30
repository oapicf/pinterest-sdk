const samples = require('../samples/BusinessAccessRelationshipsApi');
const BrandAccount = require('../models/BrandAccount');
const BrandAccountCreate = require('../models/BrandAccountCreate');
const BrandAccountUpdate = require('../models/BrandAccountUpdate');
const BusinessMembershipMember = require('../models/BusinessMembershipMember');
const DeleteBusinessMembershipBody = require('../models/DeleteBusinessMembershipBody');
const DeleteBusinessPartners = require('../models/DeleteBusinessPartners');
const DeleteBusinessPartnersDelete = require('../models/DeleteBusinessPartnersDelete');
const MemberBusinessRole = require('../models/MemberBusinessRole');
const PartnerType = require('../models/PartnerType');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const SystemUserUpdateWithRequiredBody = require('../models/SystemUserUpdateWithRequiredBody');
const UpdateBusinessMembershipsResponse = require('../models/UpdateBusinessMembershipsResponse');
const delete_business_membership_200_response = require('../models/delete_business_membership_200_response');
const get_business_employers_200_response = require('../models/get_business_employers_200_response');
const utils = require('../utils/utils');

module.exports = {
    brandAccounts/create: {
        key: 'brandAccounts/create',
        noun: 'business_access_relationships',
        display: {
            label: 'Create a Brand Account',
            description: 'Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'business_hierarchy_id',
                    label: 'business hierarchy node id',
                    type: 'string',
                    required: true,
                },
                ...BrandAccountCreate.fields(),
            ],
            outputFields: [
                ...BrandAccount.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...BrandAccountCreate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'brandAccounts/create', response.json);
                    return results;
                })
            },
            sample: samples['BrandAccountSample']samples['BrandAccountSample']
        }
    },
    brandAccounts/update: {
        key: 'brandAccounts/update',
        noun: 'business_access_relationships',
        display: {
            label: 'Update a Brand Account',
            description: 'Update an existing Brand Account',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'brand_account_id',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'business_hierarchy_id',
                    label: 'business hierarchy node id',
                    type: 'string',
                    required: true,
                },
                ...BrandAccountUpdate.fields(),
            ],
            outputFields: [
                ...BrandAccount.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...BrandAccountUpdate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'brandAccounts/update', response.json);
                    return results;
                })
            },
            sample: samples['BrandAccountSample']
        }
    },
    deleteBusinessMembership: {
        key: 'deleteBusinessMembership',
        noun: 'business_access_relationships',
        display: {
            label: 'Terminate business memberships',
            description: 'Terminate memberships between the specified members and your business.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'business_id',
                    label: 'Business id',
                    type: 'string',
                    required: true,
                },
                ...DeleteBusinessMembershipBody.fields(),
            ],
            outputFields: [
                ...delete_business_membership_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/businesses/{business_id}/members'),
                    method: 'DELETE',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...DeleteBusinessMembershipBody.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'deleteBusinessMembership', response.json);
                    return results;
                })
            },
            sample: samples['delete_business_membership_200_responseSample']
        }
    },
    deleteBusinessPartners: {
        key: 'deleteBusinessPartners',
        noun: 'business_access_relationships',
        display: {
            label: 'Terminate business partnerships',
            description: 'Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.',
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
                ...DeleteBusinessPartnersDelete.fields(),
            ],
            outputFields: [
                ...DeleteBusinessPartners.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/businesses/{business_id}/partners'),
                    method: 'DELETE',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...DeleteBusinessPartnersDelete.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'deleteBusinessPartners', response.json);
                    return results;
                })
            },
            sample: samples['DeleteBusinessPartnersSample']
        }
    },
    get/businessEmployers: {
        key: 'get/businessEmployers',
        noun: 'business_access_relationships',
        display: {
            label: 'List business employers for user',
            description: 'Get all of the viewing user&#39;s business employers.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'assets_summary',
                    label: 'Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are',
                    type: 'boolean',
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
                ...get_business_employers_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/businesses/employers'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'assets_summary': bundle.inputData?.['assets_summary'],
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'get/businessEmployers', response.json);
                    return results;
                })
            },
            sample: samples['get_business_employers_200_responseSample']
        }
    },
    get/businessMembers: {
        key: 'get/businessMembers',
        noun: 'business_access_relationships',
        display: {
            label: 'Get business members',
            description: 'Get all members of the specified business. The return response will include the member&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE',
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
                    key: 'fetch_system_users',
                    label: 'Fetches system users if True. Fetches regular user employees if False.',
                    type: 'boolean',
                },
                {
                    key: 'assets_summary',
                    label: 'Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are',
                    type: 'boolean',
                },
                {
                    key: 'business_roles',
                    label: 'A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.',
                    type: 'string',
                }
                {
                    key: 'member_ids',
                    label: 'A list of business members ids separated by comma.',
                    type: 'string',
                },
                {
                    key: 'start_index',
                    label: 'An index to start fetching the results from. Only the results starting from this index will be returned.',
                    type: 'integer',
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
                ...get_business_employers_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/businesses/{business_id}/members'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'fetch_system_users': bundle.inputData?.['fetch_system_users'],
                        'assets_summary': bundle.inputData?.['assets_summary'],
                        'business_roles': bundle.inputData?.['business_roles'],
                        'member_ids': bundle.inputData?.['member_ids'],
                        'start_index': bundle.inputData?.['start_index'],
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'get/businessMembers', response.json);
                    return results;
                })
            },
            sample: samples['get_business_employers_200_responseSample']
        }
    },
    get/businessPartners: {
        key: 'get/businessPartners',
        noun: 'business_access_relationships',
        display: {
            label: 'Get business partners',
            description: 'Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to.',
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
                    key: 'assets_summary',
                    label: 'Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are',
                    type: 'boolean',
                },
                ....fields(),
                {
                    key: 'partner_ids',
                    label: 'A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.',
                    type: 'string',
                },
                {
                    key: 'start_index',
                    label: 'An index to start fetching the results from. Only the results starting from this index will be returned.',
                    type: 'integer',
                },
                {
                    key: 'sort_ascending',
                    label: 'Sort ascending.',
                    type: 'boolean',
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
                ...get_business_employers_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/businesses/{business_id}/partners'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'assets_summary': bundle.inputData?.['assets_summary'],
                        'partner_type': bundle.inputData?.['partner_type'],
                        'partner_ids': bundle.inputData?.['partner_ids'],
                        'start_index': bundle.inputData?.['start_index'],
                        'sort_ascending': bundle.inputData?.['sort_ascending'],
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'get/businessPartners', response.json);
                    return results;
                })
            },
            sample: samples['get_business_employers_200_responseSample']
        }
    },
    systemUser/update: {
        key: 'systemUser/update',
        noun: 'business_access_relationships',
        display: {
            label: 'Update a system user information.',
            description: 'Update a system user information such as name.',
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
                    key: 'system_user_id',
                    label: 'Unique identifier of a system user.',
                    type: 'string',
                    required: true,
                },
                ...SystemUserUpdateWithRequiredBody.fields(),
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/businesses/{business_id}/system_users/{system_user_id}'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...SystemUserUpdateWithRequiredBody.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'systemUser/update', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
    update/businessMemberships: {
        key: 'update/businessMemberships',
        noun: 'business_access_relationships',
        display: {
            label: 'Update member&#39;s business role',
            description: 'Update a member&#39;s business role within the business.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'business_id',
                    label: 'Business id',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'BusinessMembershipMember',
                    label: '',
                    type: 'string',
                }
            ],
            outputFields: [
                ...UpdateBusinessMembershipsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/businesses/{business_id}/members'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...BusinessMembershipMember.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'update/businessMemberships', response.json);
                    return results;
                })
            },
            sample: samples['UpdateBusinessMembershipsResponseSample']
        }
    },
}
