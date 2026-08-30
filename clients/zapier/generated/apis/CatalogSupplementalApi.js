const samples = require('../samples/CatalogSupplementalApi');
const LocalInventoryItemsBatch = require('../models/LocalInventoryItemsBatch');
const LocalInventoryItemsBatchCreate = require('../models/LocalInventoryItemsBatchCreate');
const LocalInventoryItemsGet = require('../models/LocalInventoryItemsGet');
const LocalInventoryItemsGetCreate = require('../models/LocalInventoryItemsGetCreate');
const LocalStore = require('../models/LocalStore');
const LocalStoreBatchUpdate = require('../models/LocalStoreBatchUpdate');
const LocalStoreCreate = require('../models/LocalStoreCreate');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const SupplementalItemsBatchResponse = require('../models/SupplementalItemsBatchResponse');
const catalogs_local_stores_create_200_response_inner = require('../models/catalogs_local_stores_create_200_response_inner');
const catalogs_local_stores_delete_200_response_inner = require('../models/catalogs_local_stores_delete_200_response_inner');
const catalogs_local_stores_list_200_response = require('../models/catalogs_local_stores_list_200_response');
const utils = require('../utils/utils');

module.exports = {
    catalogsLocalInventoryItems/post: {
        key: 'catalogsLocalInventoryItems/post',
        noun: 'catalog_supplemental',
        display: {
            label: 'Get local inventory items (POST)',
            description: 'Get local inventory items for a catalog owned by the \&quot;operation user_account\&quot;.  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'catalog_id',
                    label: 'Unique identifier of a catalog.',
                    type: 'string',
                    required: true,
                },
                ...LocalInventoryItemsGetCreate.fields(),
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...LocalInventoryItemsGet.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/catalogs/{catalog_id}/local_inventory_items/query'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                    },
                    body: {
                        ...LocalInventoryItemsGetCreate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'catalogsLocalInventoryItems/post', response.json);
                    return results;
                })
            },
            sample: samples['LocalInventoryItemsGetSample']samples['LocalInventoryItemsGetSample']
        }
    },
    catalogsLocalInventoryItemsBatch/operate: {
        key: 'catalogsLocalInventoryItemsBatch/operate',
        noun: 'catalog_supplemental',
        display: {
            label: 'Operate on local inventory item batch',
            description: 'Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'catalog_id',
                    label: 'Unique identifier of a catalog.',
                    type: 'string',
                    required: true,
                },
                ...LocalInventoryItemsBatchCreate.fields(),
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...SupplementalItemsBatchResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/catalogs/{catalog_id}/local_inventory_items/batch'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                    },
                    body: {
                        ...LocalInventoryItemsBatchCreate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'catalogsLocalInventoryItemsBatch/operate', response.json);
                    return results;
                })
            },
            sample: samples['SupplementalItemsBatchResponseSample']samples['LocalInventoryItemsBatchSample']
        }
    },
    catalogsLocalStores/create: {
        key: 'catalogsLocalStores/create',
        noun: 'catalog_supplemental',
        display: {
            label: 'Create local stores',
            description: 'Create a local store for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'catalog_id',
                    label: 'Unique identifier of a catalog.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'LocalStoreCreate',
                    label: '',
                    type: 'string',
                }
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
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/catalogs/{catalog_id}/local_stores'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                    },
                    body: {
                        ...LocalStoreCreate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'catalogsLocalStores/create', response.json);
                    return results;
                })
            },
            sample: samples['catalogs_local_stores_create_200_response_innerSample']samples['LocalStoreSample']
        }
    },
    catalogsLocalStores/delete: {
        key: 'catalogsLocalStores/delete',
        noun: 'catalog_supplemental',
        display: {
            label: 'Delete local stores',
            description: '  Delete multiple local stores for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'catalog_id',
                    label: 'Unique identifier of a catalog.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'ids',
                    label: 'List of local store IDs to filter by.',
                    type: 'string',
                }
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
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/catalogs/{catalog_id}/local_stores'),
                    method: 'DELETE',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ids': bundle.inputData?.['ids'],
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'catalogsLocalStores/delete', response.json);
                    return results;
                })
            },
            sample: samples['catalogs_local_stores_delete_200_response_innerSample']
        }
    },
    catalogsLocalStores/list: {
        key: 'catalogsLocalStores/list',
        noun: 'catalog_supplemental',
        display: {
            label: 'List local stores',
            description: 'Fetch local stores for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'catalog_id',
                    label: 'Unique identifier of a catalog.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'ids',
                    label: 'List of local store IDs to filter by.',
                    type: 'string',
                }
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
                    label: 'Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.',
                    type: 'integer',
                },
            ],
            outputFields: [
                ...catalogs_local_stores_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/catalogs/{catalog_id}/local_stores'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ids': bundle.inputData?.['ids'],
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'catalogsLocalStores/list', response.json);
                    return results;
                })
            },
            sample: samples['catalogs_local_stores_list_200_responseSample']
        }
    },
    catalogsLocalStores/update: {
        key: 'catalogsLocalStores/update',
        noun: 'catalog_supplemental',
        display: {
            label: 'Update local stores',
            description: '  Update a local store for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'catalog_id',
                    label: 'Unique identifier of a catalog.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'LocalStoreBatchUpdate',
                    label: '',
                    type: 'string',
                }
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
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/catalogs/{catalog_id}/local_stores'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                    },
                    body: {
                        ...LocalStoreBatchUpdate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'catalogsLocalStores/update', response.json);
                    return results;
                })
            },
            sample: samples['catalogs_local_stores_create_200_response_innerSample']
        }
    },
    catalogsSupplementalItemsBatch/get: {
        key: 'catalogsSupplementalItemsBatch/get',
        noun: 'catalog_supplemental',
        display: {
            label: 'Get supplemental items batch status',
            description: 'Fetch the status and results of a supplemental items batch operation. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'catalog_id',
                    label: 'Unique identifier of a catalog.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'batch_id',
                    label: 'Unique identifier of an items batch operation.',
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
                ...SupplementalItemsBatchResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/catalogs/{catalog_id}/supplemental_items/batch/{batch_id}'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'catalogsSupplementalItemsBatch/get', response.json);
                    return results;
                })
            },
            sample: samples['SupplementalItemsBatchResponseSample']
        }
    },
}
