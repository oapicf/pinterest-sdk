const samples = require('../samples/BusinessAccessRelationshipsApi');
const DeletePartnersRequest = require('../models/DeletePartnersRequest');
const DeletePartnersResponse = require('../models/DeletePartnersResponse');
const DeletedMembersResponse = require('../models/DeletedMembersResponse');
const Error = require('../models/Error');
const MemberBusinessRole = require('../models/MemberBusinessRole');
const MembersToDeleteBody = require('../models/MembersToDeleteBody');
const PartnerType = require('../models/PartnerType');
const UpdateMemberBusinessRoleBody = require('../models/UpdateMemberBusinessRoleBody');
const UpdateMemberResultsResponseArray = require('../models/UpdateMemberResultsResponseArray');
const get_business_employers_200_response = require('../models/get_business_employers_200_response');
const get_business_members_200_response = require('../models/get_business_members_200_response');
const get_business_partners_200_response = require('../models/get_business_partners_200_response');
const utils = require('../utils/utils');

module.exports = {
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
                ...MembersToDeleteBody.fields(),
            ],
            outputFields: [
                ...DeletedMembersResponse.fields('', false),
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
                        ...MembersToDeleteBody.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'deleteBusinessMembership', response.json);
                    return results;
                })
            },
            sample: samples['DeletedMembersResponseSample']
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
                ...DeletePartnersRequest.fields(),
            ],
            outputFields: [
                ...DeletePartnersResponse.fields('', false),
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
                        ...DeletePartnersRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'deleteBusinessPartners', response.json);
                    return results;
                })
            },
            sample: samples['DeletePartnersResponseSample']
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
                        'page_size': bundle.inputData?.['page_size'],
                        'bookmark': bundle.inputData?.['bookmark'],
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
                    label: 'Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.',
                    type: 'integer',
                },
            ],
            outputFields: [
                ...get_business_members_200_response.fields('', false),
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
            sample: samples['get_business_members_200_responseSample']
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
                ...get_business_partners_200_response.fields('', false),
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
                        'page_size': bundle.inputData?.['page_size'],
                        'bookmark': bundle.inputData?.['bookmark'],
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
            sample: samples['get_business_partners_200_responseSample']
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
                    key: 'UpdateMemberBusinessRoleBody',
                    label: 'List of objects with the member id and the business_role.',
                    type: 'string',
                }
            ],
            outputFields: [
                ...UpdateMemberResultsResponseArray.fields('', false),
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
                        ...UpdateMemberBusinessRoleBody.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'update/businessMemberships', response.json);
                    return results;
                })
            },
            sample: samples['UpdateMemberResultsResponseArraySample']
        }
    },
}
