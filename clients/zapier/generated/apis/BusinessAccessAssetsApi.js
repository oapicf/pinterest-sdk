const samples = require('../samples/BusinessAccessAssetsApi');
const CreateAssetGroupBody = require('../models/CreateAssetGroupBody');
const CreateAssetGroupResponse = require('../models/CreateAssetGroupResponse');
const DeleteAssetGroupBody = require('../models/DeleteAssetGroupBody');
const DeleteAssetGroupResponse = require('../models/DeleteAssetGroupResponse');
const DeleteMemberAccessResultsResponseArray = require('../models/DeleteMemberAccessResultsResponseArray');
const DeletePartnerAssetAccessBody = require('../models/DeletePartnerAssetAccessBody');
const DeletePartnerAssetsResultsResponseArray = require('../models/DeletePartnerAssetsResultsResponseArray');
const Error = require('../models/Error');
const PartnerType = require('../models/PartnerType');
const PermissionsWithOwner = require('../models/PermissionsWithOwner');
const UpdateAssetGroupBody = require('../models/UpdateAssetGroupBody');
const UpdateAssetGroupResponse = require('../models/UpdateAssetGroupResponse');
const UpdateMemberAssetAccessBody = require('../models/UpdateMemberAssetAccessBody');
const UpdateMemberAssetsResultsResponseArray = require('../models/UpdateMemberAssetsResultsResponseArray');
const UpdatePartnerAssetAccessBody = require('../models/UpdatePartnerAssetAccessBody');
const UpdatePartnerAssetsResultsResponseArray = require('../models/UpdatePartnerAssetsResultsResponseArray');
const business_asset_members_get_200_response = require('../models/business_asset_members_get_200_response');
const business_asset_partners_get_200_response = require('../models/business_asset_partners_get_200_response');
const business_assets_get_200_response = require('../models/business_assets_get_200_response');
const business_member_assets_get_200_response = require('../models/business_member_assets_get_200_response');
const business_members_asset_access_delete_request = require('../models/business_members_asset_access_delete_request');
const business_partner_asset_access_get_200_response = require('../models/business_partner_asset_access_get_200_response');
const utils = require('../utils/utils');

module.exports = {
    assetGroup/create: {
        key: 'assetGroup/create',
        noun: 'business_access_assets',
        display: {
            label: 'Create a new asset group.',
            description: 'Create a new asset group with the specified parameters. - An &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/asset-groups\&quot;&gt;asset group&lt;/a&gt; is a custom group of assets based on how you’d like to manage your accounts.',
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
                ...CreateAssetGroupBody.fields(),
            ],
            outputFields: [
                ...CreateAssetGroupResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/businesses/{business_id}/asset_groups'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CreateAssetGroupBody.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'assetGroup/create', response.json);
                    return results;
                })
            },
            sample: samples['CreateAssetGroupResponseSample']
        }
    },
    assetGroup/delete: {
        key: 'assetGroup/delete',
        noun: 'business_access_assets',
        display: {
            label: 'Delete asset groups.',
            description: 'Delete a batch of asset groups.',
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
                ...DeleteAssetGroupBody.fields(),
            ],
            outputFields: [
                ...DeleteAssetGroupResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/businesses/{business_id}/asset_groups'),
                    method: 'DELETE',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...DeleteAssetGroupBody.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'assetGroup/delete', response.json);
                    return results;
                })
            },
            sample: samples['DeleteAssetGroupResponseSample']
        }
    },
    assetGroup/update: {
        key: 'assetGroup/update',
        noun: 'business_access_assets',
        display: {
            label: 'Update asset groups.',
            description: 'Update a batch of asset groups with the specified parameters.',
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
                ...UpdateAssetGroupBody.fields(),
            ],
            outputFields: [
                ...UpdateAssetGroupResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/businesses/{business_id}/asset_groups'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...UpdateAssetGroupBody.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'assetGroup/update', response.json);
                    return results;
                })
            },
            sample: samples['UpdateAssetGroupResponseSample']
        }
    },
    businessAssetMembers/get: {
        key: 'businessAssetMembers/get',
        noun: 'business_access_assets',
        display: {
            label: 'Get members with access to asset',
            description: 'Get all the members the requesting business has granted access to on the given asset.',
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
                    key: 'asset_id',
                    label: 'Unique identifier of a business asset.',
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
                    label: 'Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.',
                    type: 'integer',
                },
                {
                    key: 'start_index',
                    label: 'An index to start fetching the results from. Only the results starting from this index will be returned.',
                    type: 'integer',
                },
            ],
            outputFields: [
                ...business_asset_members_get_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/businesses/{business_id}/assets/{asset_id}/members'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                        'start_index': bundle.inputData?.['start_index'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'businessAssetMembers/get', response.json);
                    return results;
                })
            },
            sample: samples['business_asset_members_get_200_responseSample']
        }
    },
    businessAssetPartners/get: {
        key: 'businessAssetPartners/get',
        noun: 'business_access_assets',
        display: {
            label: 'Get partners with access to asset',
            description: 'Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.',
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
                    key: 'asset_id',
                    label: 'Unique identifier of a business asset.',
                    type: 'string',
                    required: true,
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
                ...business_asset_partners_get_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/businesses/{business_id}/assets/{asset_id}/partners'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'start_index': bundle.inputData?.['start_index'],
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'businessAssetPartners/get', response.json);
                    return results;
                })
            },
            sample: samples['business_asset_partners_get_200_responseSample']
        }
    },
    businessAssets/get: {
        key: 'businessAssets/get',
        noun: 'business_access_assets',
        display: {
            label: 'List business assets',
            description: 'Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.',
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
                    key: 'permissions',
                    label: 'A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.',
                    type: 'string',
                }
                {
                    key: 'child_asset_id',
                    label: 'A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.',
                    type: 'string',
                },
                {
                    key: 'asset_group_id',
                    label: 'An asset group unique identifier. Used to fetch assets contained within the specified asset group.',
                    type: 'string',
                },
                {
                    key: 'asset_type',
                    label: 'A resource type to filter the assets by. Only assets of the specified type will be returned.',
                    type: 'string',
                    choices: [
                        'AD_ACCOUNT',
                        'PROFILE',
                        'ASSET_GROUP',
                    ],
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
                ...business_assets_get_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/businesses/{business_id}/assets'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'permissions': bundle.inputData?.['permissions'],
                        'child_asset_id': bundle.inputData?.['child_asset_id'],
                        'asset_group_id': bundle.inputData?.['asset_group_id'],
                        'asset_type': bundle.inputData?.['asset_type'],
                        'start_index': bundle.inputData?.['start_index'],
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'businessAssets/get', response.json);
                    return results;
                })
            },
            sample: samples['business_assets_get_200_responseSample']
        }
    },
    businessMemberAssets/get: {
        key: 'businessMemberAssets/get',
        noun: 'business_access_assets',
        display: {
            label: 'Get assets assigned to a member',
            description: 'Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.',
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
                    key: 'member_id',
                    label: 'The member id to fetch assets for.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'asset_type',
                    label: 'A resource type to filter the assets by. Only assets of the specified type will be returned.',
                    type: 'string',
                    choices: [
                        'AD_ACCOUNT',
                        'PROFILE',
                        'ASSET_GROUP',
                    ],
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
                ...business_member_assets_get_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/businesses/{business_id}/members/{member_id}/assets'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'asset_type': bundle.inputData?.['asset_type'],
                        'start_index': bundle.inputData?.['start_index'],
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'businessMemberAssets/get', response.json);
                    return results;
                })
            },
            sample: samples['business_member_assets_get_200_responseSample']
        }
    },
    businessMembersAssetAccess/delete: {
        key: 'businessMembersAssetAccess/delete',
        noun: 'business_access_assets',
        display: {
            label: 'Delete member access to asset',
            description: 'Terminate multiple members&#39; access to an asset.',
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
                ...business_members_asset_access_delete_request.fields(),
            ],
            outputFields: [
                ...DeleteMemberAccessResultsResponseArray.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/businesses/{business_id}/members/assets/access'),
                    method: 'DELETE',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...business_members_asset_access_delete_request.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'businessMembersAssetAccess/delete', response.json);
                    return results;
                })
            },
            sample: samples['DeleteMemberAccessResultsResponseArraySample']
        }
    },
    businessMembersAssetAccess/update: {
        key: 'businessMembersAssetAccess/update',
        noun: 'business_access_assets',
        display: {
            label: 'Assign/Update member asset permissions',
            description: 'Grant multiple members access to assets and/or update multiple member&#39;s exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. ',
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
                ...UpdateMemberAssetAccessBody.fields(),
            ],
            outputFields: [
                ...UpdateMemberAssetsResultsResponseArray.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/businesses/{business_id}/members/assets/access'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...UpdateMemberAssetAccessBody.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'businessMembersAssetAccess/update', response.json);
                    return results;
                })
            },
            sample: samples['UpdateMemberAssetsResultsResponseArraySample']
        }
    },
    businessPartnerAssetAccess/get: {
        key: 'businessPartnerAssetAccess/get',
        noun: 'business_access_assets',
        display: {
            label: 'Get assets assigned to a partner or assets assigned by a partner',
            description: 'Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type&#x3D;INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type&#x3D;EXTERNAL, you will retrieve the partner&#39;s business assets that the partner has granted you access to.',
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
                    key: 'partner_id',
                    label: 'The partner id to be bound to the Business',
                    type: 'string',
                    required: true,
                },
                ....fields(),
                {
                    key: 'asset_type',
                    label: 'A resource type to filter the assets by. Only assets of the specified type will be returned.',
                    type: 'string',
                    choices: [
                        'AD_ACCOUNT',
                        'PROFILE',
                        'ASSET_GROUP',
                    ],
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
                ...business_partner_asset_access_get_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/businesses/{business_id}/partners/{partner_id}/assets'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'partner_type': bundle.inputData?.['partner_type'],
                        'asset_type': bundle.inputData?.['asset_type'],
                        'start_index': bundle.inputData?.['start_index'],
                        'page_size': bundle.inputData?.['page_size'],
                        'bookmark': bundle.inputData?.['bookmark'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'businessPartnerAssetAccess/get', response.json);
                    return results;
                })
            },
            sample: samples['business_partner_asset_access_get_200_responseSample']
        }
    },
    deletePartnerAssetAccessHandlerImpl: {
        key: 'deletePartnerAssetAccessHandlerImpl',
        noun: 'business_access_assets',
        display: {
            label: 'Delete partner access to asset',
            description: 'Terminate multiple partners&#39; access to an asset. If - partner_type&#x3D;INTERNAL: You will terminate a partner&#39;s asset access to your business assets. - partner_type&#x3D;EXTERNAL: You will terminate your own access to your partner&#39;s business assets.',
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
                ...DeletePartnerAssetAccessBody.fields(),
            ],
            outputFields: [
                ...DeletePartnerAssetsResultsResponseArray.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/businesses/{business_id}/partners/assets'),
                    method: 'DELETE',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...DeletePartnerAssetAccessBody.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'deletePartnerAssetAccessHandlerImpl', response.json);
                    return results;
                })
            },
            sample: samples['DeletePartnerAssetsResultsResponseArraySample']
        }
    },
    updatePartnerAssetAccessHandlerImpl: {
        key: 'updatePartnerAssetAccessHandlerImpl',
        noun: 'business_access_assets',
        display: {
            label: 'Assign/Update partner asset permissions',
            description: 'Grant multiple partners access to assets and/or update multiple partner&#39;s exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.',
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
                ...UpdatePartnerAssetAccessBody.fields(),
            ],
            outputFields: [
                ...UpdatePartnerAssetsResultsResponseArray.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/businesses/{business_id}/partners/assets'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...UpdatePartnerAssetAccessBody.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'updatePartnerAssetAccessHandlerImpl', response.json);
                    return results;
                })
            },
            sample: samples['UpdatePartnerAssetsResultsResponseArraySample']
        }
    },
}
