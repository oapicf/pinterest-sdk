import connexion

from app.openapi_server.models.catalogs_list_products_by_filter_request import CatalogsListProductsByFilterRequest  # noqa: E501
from app.openapi_server.models.catalogs_product_group_pins_list200_response import CatalogsProductGroupPinsList200Response  # noqa: E501
from app.openapi_server.models.catalogs_product_group_product_counts_vertical import CatalogsProductGroupProductCountsVertical  # noqa: E501
from app.openapi_server.models.catalogs_product_groups_create_many_request_items import CatalogsProductGroupsCreateManyRequestItems  # noqa: E501
from app.openapi_server.models.catalogs_product_groups_create_request_schema import CatalogsProductGroupsCreateRequestSchema  # noqa: E501
from app.openapi_server.models.catalogs_product_groups_list200_response import CatalogsProductGroupsList200Response  # noqa: E501
from app.openapi_server.models.catalogs_product_groups_update_request_schema import CatalogsProductGroupsUpdateRequestSchema  # noqa: E501
from app.openapi_server.models.catalogs_vertical_product_group import CatalogsVerticalProductGroup  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from openapi_server import util


def catalogs_product_group_pins_list(product_group_id, ad_account_id=None, pin_metrics=None, bookmark=None, page_size=None):  # noqa: E501
    """List products by product group

    Get a list of product pins for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/) # noqa: E501

    :param product_group_id: Unique identifier of a product group
    :type product_group_id: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param pin_metrics: Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
    :type pin_metrics: bool
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

    :rtype: CatalogsProductGroupPinsList200Response
    """
    return 'do some magic!'


def catalogs_product_groups_create(body, ad_account_id=None):  # noqa: E501
    """Create product group

    Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \&quot;Catalog-based product groups\&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \&quot;retail feed-based\&quot; option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: CatalogsVerticalProductGroup
    """
    if connexion.request.is_json:
        body = CatalogsProductGroupsCreateRequestSchema.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def catalogs_product_groups_create_many(body, ad_account_id=None):  # noqa: E501
    """Create product groups

    Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. # noqa: E501

    :param body: 
    :type body: list | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: List[str]
    """
    if connexion.request.is_json:
        body = [CatalogsProductGroupsCreateManyRequestItems.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def catalogs_product_groups_delete(product_group_id, ad_account_id=None):  # noqa: E501
    """Delete product group

    Delete a product group owned by the \&quot;operation user_account\&quot; from being in use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/) # noqa: E501

    :param product_group_id: Unique identifier of a product group
    :type product_group_id: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: CatalogsVerticalProductGroup
    """
    return 'do some magic!'


def catalogs_product_groups_delete_many(id, ad_account_id=None):  # noqa: E501
    """Delete product groups

    Delete product groups owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/) # noqa: E501

    :param id: Comma-separated list of product group ids
    :type id: List[int]
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: None
    """
    return 'do some magic!'


def catalogs_product_groups_get(product_group_id, ad_account_id=None):  # noqa: E501
    """Get product group

    Get a single product group for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/) # noqa: E501

    :param product_group_id: Unique identifier of a product group
    :type product_group_id: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: CatalogsVerticalProductGroup
    """
    return 'do some magic!'


def catalogs_product_groups_list(id=None, feed_id=None, catalog_id=None, ad_account_id=None, bookmark=None, page_size=None):  # noqa: E501
    """List product groups

    Get a list of product groups for a given Catalogs Feed Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/) # noqa: E501

    :param id: Comma-separated list of product group ids
    :type id: List[int]
    :param feed_id: Filter entities for a given feed_id. If not given, all feeds are considered.
    :type feed_id: str
    :param catalog_id: Filter entities for a given catalog_id. If not given, all catalogs are considered.
    :type catalog_id: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

    :rtype: CatalogsProductGroupsList200Response
    """
    return 'do some magic!'


def catalogs_product_groups_product_counts_get(product_group_id, ad_account_id=None):  # noqa: E501
    """Get product counts

    Get a product counts for a given Catalogs Product Group owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/) # noqa: E501

    :param product_group_id: Unique identifier of a product group
    :type product_group_id: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: CatalogsProductGroupProductCountsVertical
    """
    return 'do some magic!'


def catalogs_product_groups_update(product_group_id, body, ad_account_id=None):  # noqa: E501
    """Update single product group

    Update product group owned by the \&quot;operation user_account\&quot; to use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \&quot;Catalog-based product groups\&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \&quot;retail feed-based\&quot; option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. # noqa: E501

    :param product_group_id: Unique identifier of a product group
    :type product_group_id: str
    :param body: 
    :type body: dict | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: CatalogsVerticalProductGroup
    """
    if connexion.request.is_json:
        body = CatalogsProductGroupsUpdateRequestSchema.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def products_by_product_group_filter_list(body, bookmark=None, page_size=None, ad_account_id=None, pin_metrics=None):  # noqa: E501
    """List products by filter

    List products Pins owned by the \&quot;operation user_account\&quot; that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  [Learn more](/docs/api-features/shopping-overview/) # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param pin_metrics: Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
    :type pin_metrics: bool

    :rtype: CatalogsProductGroupPinsList200Response
    """
    if connexion.request.is_json:
        body = CatalogsListProductsByFilterRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
