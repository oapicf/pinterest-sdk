const samples = require('../samples/CatalogProductGroupsApi');
const CatalogsListProductsByFilterRequest = require('../models/CatalogsListProductsByFilterRequest');
const CatalogsProductGroupProductCountsVertical = require('../models/CatalogsProductGroupProductCountsVertical');
const CatalogsProductGroupsCreateManyRequestItems = require('../models/CatalogsProductGroupsCreateManyRequestItems');
const CatalogsProductGroupsCreateRequestSchema = require('../models/CatalogsProductGroupsCreateRequestSchema');
const CatalogsProductGroupsUpdateRequestSchema = require('../models/CatalogsProductGroupsUpdateRequestSchema');
const CatalogsVerticalProductGroup = require('../models/CatalogsVerticalProductGroup');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const catalogs_product_group_pins_list_200_response = require('../models/catalogs_product_group_pins_list_200_response');
const catalogs_product_groups_list_200_response = require('../models/catalogs_product_groups_list_200_response');
const utils = require('../utils/utils');

module.exports = {
    catalogsProductGroupPins/list: {
        key: 'catalogsProductGroupPins/list',
        noun: 'catalog_product_groups',
        display: {
            label: 'List products by product group',
            description: 'Get a list of product pins for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'product_group_id',
                    label: 'Unique identifier of a product group',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
                {
                    key: 'pin_metrics',
                    label: 'Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.',
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
                ...catalogs_product_group_pins_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/catalogs/product_groups/{product_group_id}/products'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                        'pin_metrics': bundle.inputData?.['pin_metrics'],
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'catalogsProductGroupPins/list', response.json);
                    return results;
                })
            },
            sample: samples['catalogs_product_group_pins_list_200_responseSample']
        }
    },
    catalogsProductGroups/create: {
        key: 'catalogsProductGroups/create',
        noun: 'catalog_product_groups',
        display: {
            label: 'Create product group',
            description: 'Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \&quot;Catalog-based product groups\&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \&quot;retail feed-based\&quot; option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...CatalogsProductGroupsCreateRequestSchema.fields(),
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...CatalogsVerticalProductGroup.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/catalogs/product_groups'),
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
                        ...CatalogsProductGroupsCreateRequestSchema.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'catalogsProductGroups/create', response.json);
                    return results;
                })
            },
            sample: samples['CatalogsVerticalProductGroupSample']samples['CatalogsVerticalProductGroupSample']
        }
    },
    catalogsProductGroups/createMany: {
        key: 'catalogsProductGroups/createMany',
        noun: 'catalog_product_groups',
        display: {
            label: 'Create product groups',
            description: 'Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'CatalogsProductGroupsCreateManyRequestItems',
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
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/catalogs/product_groups/multiple'),
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
                        ...CatalogsProductGroupsCreateManyRequestItems.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'catalogsProductGroups/createMany', response.json);
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
    catalogsProductGroups/delete: {
        key: 'catalogsProductGroups/delete',
        noun: 'catalog_product_groups',
        display: {
            label: 'Delete product group',
            description: 'Delete a product group owned by the \&quot;operation user_account\&quot; from being in use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'product_group_id',
                    label: 'Unique identifier of a product group',
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
                ...CatalogsVerticalProductGroup.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/catalogs/product_groups/{product_group_id}'),
                    method: 'DELETE',
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'catalogsProductGroups/delete', response.json);
                    return results;
                })
            },
            sample: samples['CatalogsVerticalProductGroupSample']
        }
    },
    catalogsProductGroups/deleteMany: {
        key: 'catalogsProductGroups/deleteMany',
        noun: 'catalog_product_groups',
        display: {
            label: 'Delete product groups',
            description: 'Delete product groups owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'id',
                    label: 'Comma-separated list of product group ids',
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
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/catalogs/product_groups/multiple'),
                    method: 'DELETE',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'id': bundle.inputData?.['id'],
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'catalogsProductGroups/deleteMany', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
    catalogsProductGroups/get: {
        key: 'catalogsProductGroups/get',
        noun: 'catalog_product_groups',
        display: {
            label: 'Get product group',
            description: 'Get a single product group for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'product_group_id',
                    label: 'Unique identifier of a product group',
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
                ...CatalogsVerticalProductGroup.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/catalogs/product_groups/{product_group_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'catalogsProductGroups/get', response.json);
                    return results;
                })
            },
            sample: samples['CatalogsVerticalProductGroupSample']
        }
    },
    catalogsProductGroups/list: {
        key: 'catalogsProductGroups/list',
        noun: 'catalog_product_groups',
        display: {
            label: 'List product groups',
            description: 'Get a list of product groups for a given Catalogs Feed Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'id',
                    label: 'Comma-separated list of product group ids',
                    type: 'string',
                }
                {
                    key: 'feed_id',
                    label: 'Filter entities for a given feed_id. If not given, all feeds are considered.',
                    type: 'string',
                },
                {
                    key: 'catalog_id',
                    label: 'Filter entities for a given catalog_id. If not given, all catalogs are considered.',
                    type: 'string',
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
                    label: 'Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.',
                    type: 'integer',
                },
            ],
            outputFields: [
                ...catalogs_product_groups_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/catalogs/product_groups'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'id': bundle.inputData?.['id'],
                        'feed_id': bundle.inputData?.['feed_id'],
                        'catalog_id': bundle.inputData?.['catalog_id'],
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'catalogsProductGroups/list', response.json);
                    return results;
                })
            },
            sample: samples['catalogs_product_groups_list_200_responseSample']
        }
    },
    catalogsProductGroups/productCountsGet: {
        key: 'catalogsProductGroups/productCountsGet',
        noun: 'catalog_product_groups',
        display: {
            label: 'Get product counts',
            description: 'Get a product counts for a given Catalogs Product Group owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'product_group_id',
                    label: 'Unique identifier of a product group',
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
                ...CatalogsProductGroupProductCountsVertical.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/catalogs/product_groups/{product_group_id}/product_counts'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'catalogsProductGroups/productCountsGet', response.json);
                    return results;
                })
            },
            sample: samples['CatalogsProductGroupProductCountsVerticalSample']
        }
    },
    catalogsProductGroups/update: {
        key: 'catalogsProductGroups/update',
        noun: 'catalog_product_groups',
        display: {
            label: 'Update single product group',
            description: 'Update product group owned by the \&quot;operation user_account\&quot; to use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \&quot;Catalog-based product groups\&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \&quot;retail feed-based\&quot; option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'product_group_id',
                    label: 'Unique identifier of a product group',
                    type: 'string',
                    required: true,
                },
                ...CatalogsProductGroupsUpdateRequestSchema.fields(),
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...CatalogsVerticalProductGroup.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/catalogs/product_groups/{product_group_id}'),
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
                        ...CatalogsProductGroupsUpdateRequestSchema.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'catalogsProductGroups/update', response.json);
                    return results;
                })
            },
            sample: samples['CatalogsVerticalProductGroupSample']
        }
    },
    productsByProductGroupFilter/list: {
        key: 'productsByProductGroupFilter/list',
        noun: 'catalog_product_groups',
        display: {
            label: 'List products by filter',
            description: 'List products Pins owned by the \&quot;operation user_account\&quot; that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  [Learn more](/docs/api-features/shopping-overview/)',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...CatalogsListProductsByFilterRequest.fields(),
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
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
                {
                    key: 'pin_metrics',
                    label: 'Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.',
                    type: 'boolean',
                },
            ],
            outputFields: [
                ...catalogs_product_group_pins_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/catalogs/products/get_by_product_group_filters'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                        'pin_metrics': bundle.inputData?.['pin_metrics'],
                    },
                    body: {
                        ...CatalogsListProductsByFilterRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'productsByProductGroupFilter/list', response.json);
                    return results;
                })
            },
            sample: samples['catalogs_product_group_pins_list_200_responseSample']
        }
    },
}
