const samples = require('../samples/BusinessAccessAssetsApi');
const AssetGroupDeletion = require('../models/AssetGroupDeletion');
const AssetGroupDeletionDelete = require('../models/AssetGroupDeletionDelete');
const AssetGroupInput = require('../models/AssetGroupInput');
const AssetGroupInputCreate = require('../models/AssetGroupInputCreate');
const AssetGroupModification = require('../models/AssetGroupModification');
const AssetGroupModificationReadOrUpdate = require('../models/AssetGroupModificationReadOrUpdate');
const AssetPermissionType = require('../models/AssetPermissionType');
const AssetSearchBy = require('../models/AssetSearchBy');
const AssetSortBy = require('../models/AssetSortBy');
const BusinessMemberAssetsGetResponse = require('../models/BusinessMemberAssetsGetResponse');
const BusinessMembersAssetAccessDeleteBody = require('../models/BusinessMembersAssetAccessDeleteBody');
const DeleteMemberAccessResultsResponseArray = require('../models/DeleteMemberAccessResultsResponseArray');
const DeletePartnerAssetAccessBody = require('../models/DeletePartnerAssetAccessBody');
const DeletePartnerAssetAccessResultsResponseArray = require('../models/DeletePartnerAssetAccessResultsResponseArray');
const NonDraftEntityStatus = require('../models/NonDraftEntityStatus');
const PermissionsWithOwner = require('../models/PermissionsWithOwner');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const UpdateMemberAssetAccessBody = require('../models/UpdateMemberAssetAccessBody');
const UpdateMemberAssetsResultsResponseArray = require('../models/UpdateMemberAssetsResultsResponseArray');
const UpdatePartnerAssetAccessBody = require('../models/UpdatePartnerAssetAccessBody');
const UpdatePartnerAssetsResultsResponseArray = require('../models/UpdatePartnerAssetsResultsResponseArray');
const business_asset_members_get_200_response = require('../models/business_asset_members_get_200_response');
const business_assets_get_200_response = require('../models/business_assets_get_200_response');
const business_partner_asset_access_get_200_response = require('../models/business_partner_asset_access_get_200_response');
const utils = require('../utils/utils');

module.exports = {
    assetGroup/create: {
        key: 'assetGroup/create',
        noun: 'business_access_assets',
        display: {
            label: 'Create a new asset group.',
            description: 'Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.',
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
                ...AssetGroupInputCreate.fields(),
            ],
            outputFields: [
                ...AssetGroupInput.fields('', false),
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
                        ...AssetGroupInputCreate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'assetGroup/create', response.json);
                    return results;
                })
            },
            sample: samples['AssetGroupInputSample']samples['AssetGroupInputSample']
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
                ...AssetGroupDeletionDelete.fields(),
            ],
            outputFields: [
                ...AssetGroupDeletion.fields('', false),
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
                        ...AssetGroupDeletionDelete.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'assetGroup/delete', response.json);
                    return results;
                })
            },
            sample: samples['AssetGroupDeletionSample']
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
                ...AssetGroupModificationReadOrUpdate.fields(),
            ],
            outputFields: [
                ...AssetGroupModification.fields('', false),
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
                        ...AssetGroupModificationReadOrUpdate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'assetGroup/update', response.json);
                    return results;
                })
            },
            sample: samples['AssetGroupModificationSample']
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
                    key: 'start_index',
                    label: 'An index to start fetching the results from. Only the results starting from this index will be returned.',
                    type: 'integer',
                },
                {
                    key: 'fetch_system_users',
                    label: 'Fetches system users if True. Fetches regular user employees if False.',
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
                        'start_index': bundle.inputData?.['start_index'],
                        'fetch_system_users': bundle.inputData?.['fetch_system_users'],
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
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
                    label: 'Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.',
                    type: 'integer',
                },
            ],
            outputFields: [
                ...business_asset_members_get_200_response.fields('', false),
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
            sample: samples['business_asset_members_get_200_responseSample']
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
                        'CATALOG',
                        'CONSUMER',
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
                    label: 'Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.',
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
                        'CATALOG',
                        'CONSUMER',
                        'CONVERSION_TAG',
                    ],
                },
                {
                    key: 'start_index',
                    label: 'An index to start fetching the results from. Only the results starting from this index will be returned.',
                    type: 'integer',
                },
                ....fields(),
                {
                    key: 'sort_ascending',
                    label: 'Sort assets in ascending order',
                    type: 'boolean',
                },
                ....fields(),
                {
                    key: 'search_value',
                    label: 'The value to search for',
                    type: 'string',
                },
                ....fields(),
                {
                    key: 'ad_account_statuses',
                    label: 'A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT.',
                    type: 'string',
                }
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
                ...BusinessMemberAssetsGetResponse.fields('', false),
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
                        'sort_by': bundle.inputData?.['sort_by'],
                        'sort_ascending': bundle.inputData?.['sort_ascending'],
                        'search_by': bundle.inputData?.['search_by'],
                        'search_value': bundle.inputData?.['search_value'],
                        'asset_permission_type': bundle.inputData?.['asset_permission_type'],
                        'ad_account_statuses': bundle.inputData?.['ad_account_statuses'],
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
            sample: samples['BusinessMemberAssetsGetResponseSample']
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
                ...BusinessMembersAssetAccessDeleteBody.fields(),
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
                        ...BusinessMembersAssetAccessDeleteBody.mapping(bundle),
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
            description: 'Grant multiple members access to assets and/or update multiple member&#39;s exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.',
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
                {
                    key: 'partner_type',
                    label: 'Specifies whether to fetch internal or external (shared) partners.  If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset.',
                    type: 'string',
                    choices: [
                        'INTERNAL',
                        'EXTERNAL',
                    ],
                },
                {
                    key: 'asset_type',
                    label: 'A resource type to filter the assets by. Only assets of the specified type will be returned.',
                    type: 'string',
                    choices: [
                        'AD_ACCOUNT',
                        'PROFILE',
                        'ASSET_GROUP',
                        'PINNER_LIST',
                        'CONVERSION_TAG',
                        'CATALOG',
                        'CONSUMER',
                        'CONVERSION_SEGMENT',
                    ],
                },
                {
                    key: 'start_index',
                    label: 'An index to start fetching the results from. Only the results starting from this index will be returned.',
                    type: 'integer',
                },
                ....fields(),
                {
                    key: 'sort_ascending',
                    label: 'Sort assets in ascending order',
                    type: 'boolean',
                },
                ....fields(),
                {
                    key: 'search_value',
                    label: 'The value to search for',
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
                        'sort_by': bundle.inputData?.['sort_by'],
                        'sort_ascending': bundle.inputData?.['sort_ascending'],
                        'search_by': bundle.inputData?.['search_by'],
                        'search_value': bundle.inputData?.['search_value'],
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
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
                ...DeletePartnerAssetAccessResultsResponseArray.fields('', false),
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
            sample: samples['DeletePartnerAssetAccessResultsResponseArraySample']
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
