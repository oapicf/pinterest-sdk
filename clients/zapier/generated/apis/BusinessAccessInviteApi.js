const samples = require('../samples/BusinessAccessInviteApi');
const AuthRespondInvitesBody = require('../models/AuthRespondInvitesBody');
const CancelInvitesBody = require('../models/CancelInvitesBody');
const CreateAssetAccessRequestBody = require('../models/CreateAssetAccessRequestBody');
const CreateAssetAccessRequestResponse = require('../models/CreateAssetAccessRequestResponse');
const CreateAssetInvitesRequest = require('../models/CreateAssetInvitesRequest');
const CreateInvitesResultsResponseArray = require('../models/CreateInvitesResultsResponseArray');
const CreateMembershipOrPartnershipInvitesBody = require('../models/CreateMembershipOrPartnershipInvitesBody');
const DeleteInvitesResultsResponseArray = require('../models/DeleteInvitesResultsResponseArray');
const Error = require('../models/Error');
const InviteType = require('../models/InviteType');
const RespondToInvitesResponseArray = require('../models/RespondToInvitesResponseArray');
const UpdateInvitesResultsResponseArray = require('../models/UpdateInvitesResultsResponseArray');
const get_invites_200_response = require('../models/get_invites_200_response');
const utils = require('../utils/utils');

module.exports = {
    assetAccessRequests/create: {
        key: 'assetAccessRequests/create',
        noun: 'business_access_invite',
        display: {
            label: 'Create a request to access an existing partner&#39;s assets.',
            description: 'Create a request to access an existing partner&#39;s assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.',
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
                ...CreateAssetAccessRequestBody.fields(),
            ],
            outputFields: [
                ...CreateAssetAccessRequestResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/businesses/{business_id}/requests/assets/access'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CreateAssetAccessRequestBody.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'assetAccessRequests/create', response.json);
                    return results;
                })
            },
            sample: samples['CreateAssetAccessRequestResponseSample']
        }
    },
    cancelInvitesOrRequests: {
        key: 'cancelInvitesOrRequests',
        noun: 'business_access_invite',
        display: {
            label: 'Cancel invites/requests',
            description: 'Cancel membership/partnership invites and/or requests.',
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
                ...CancelInvitesBody.fields(),
            ],
            outputFields: [
                ...DeleteInvitesResultsResponseArray.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/businesses/{business_id}/invites'),
                    method: 'DELETE',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CancelInvitesBody.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'cancelInvitesOrRequests', response.json);
                    return results;
                })
            },
            sample: samples['DeleteInvitesResultsResponseArraySample']
        }
    },
    createAssetInvites: {
        key: 'createAssetInvites',
        noun: 'business_access_invite',
        display: {
            label: 'Update invite/request with an asset permission',
            description: 'Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner&#39;s asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \&quot;Create a request to access an existing partner&#39;s assets\&quot; to request access to your   partner&#39;s assets.     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot; - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \&quot;Assign/Update partner asset permissions\&quot; to assign a partner access to   new assets.     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot; - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \&quot;Assign/Update member asset permissions\&quot; to assign a member access to new   assets.     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.',
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
                ...CreateAssetInvitesRequest.fields(),
            ],
            outputFields: [
                ...UpdateInvitesResultsResponseArray.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/businesses/{business_id}/invites/assets/access'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CreateAssetInvitesRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'createAssetInvites', response.json);
                    return results;
                })
            },
            sample: samples['UpdateInvitesResultsResponseArraySample']
        }
    },
    createMembershipOrPartnershipInvites: {
        key: 'createMembershipOrPartnershipInvites',
        noun: 'business_access_invite',
        display: {
            label: 'Create invites or requests',
            description: 'Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;     - business_role&#x3D;\&quot;EMPLOYEE\&quot; OR business_role&#x3D;\&quot;BIZ_ADMIN\&quot; (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners',
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
                ...CreateMembershipOrPartnershipInvitesBody.fields(),
            ],
            outputFields: [
                ...CreateInvitesResultsResponseArray.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/businesses/{business_id}/invites'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CreateMembershipOrPartnershipInvitesBody.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'createMembershipOrPartnershipInvites', response.json);
                    return results;
                })
            },
            sample: samples['CreateInvitesResultsResponseArraySample']
        }
    },
    get/invites: {
        key: 'get/invites',
        noun: 'business_access_invite',
        display: {
            label: 'Get invites/requests',
            description: 'Get the membership/partnership invites and/or requests for the authorized user.',
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
                    key: 'is_member',
                    label: 'A boolean field to indicate whether the invite is to create a partnership or a membership.',
                    type: 'boolean',
                },
                {
                    key: 'invite_status',
                    label: 'A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned.',
                    type: 'string',
                }
                ....fields(),
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
                ...get_invites_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/businesses/{business_id}/invites'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'is_member': bundle.inputData?.['is_member'],
                        'invite_status': bundle.inputData?.['invite_status'],
                        'invite_type': bundle.inputData?.['invite_type'],
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'get/invites', response.json);
                    return results;
                })
            },
            sample: samples['get_invites_200_responseSample']
        }
    },
    respondBusinessAccessInvites: {
        key: 'respondBusinessAccessInvites',
        noun: 'business_access_invite',
        display: {
            label: 'Accept or decline an invite/request',
            description: 'Accept or decline invites or requests.',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...AuthRespondInvitesBody.fields(),
            ],
            outputFields: [
                ...RespondToInvitesResponseArray.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/businesses/invites'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...AuthRespondInvitesBody.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'respondBusinessAccessInvites', response.json);
                    return results;
                })
            },
            sample: samples['RespondToInvitesResponseArraySample']
        }
    },
}
