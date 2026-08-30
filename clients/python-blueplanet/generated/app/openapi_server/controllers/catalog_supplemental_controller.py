import connexion

from app.openapi_server.models.catalogs_local_stores_create200_response_inner import CatalogsLocalStoresCreate200ResponseInner  # noqa: E501
from app.openapi_server.models.catalogs_local_stores_delete200_response_inner import CatalogsLocalStoresDelete200ResponseInner  # noqa: E501
from app.openapi_server.models.catalogs_local_stores_list200_response import CatalogsLocalStoresList200Response  # noqa: E501
from app.openapi_server.models.local_inventory_items_batch import LocalInventoryItemsBatch  # noqa: E501
from app.openapi_server.models.local_inventory_items_batch_create import LocalInventoryItemsBatchCreate  # noqa: E501
from app.openapi_server.models.local_inventory_items_get import LocalInventoryItemsGet  # noqa: E501
from app.openapi_server.models.local_inventory_items_get_create import LocalInventoryItemsGetCreate  # noqa: E501
from app.openapi_server.models.local_store import LocalStore  # noqa: E501
from app.openapi_server.models.local_store_batch_update import LocalStoreBatchUpdate  # noqa: E501
from app.openapi_server.models.local_store_create import LocalStoreCreate  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.supplemental_items_batch_response import SupplementalItemsBatchResponse  # noqa: E501
from openapi_server import util


def catalogs_local_inventory_items_batch_operate(catalog_id, body, ad_account_id=None):  # noqa: E501
    """Operate on local inventory item batch

    Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/) # noqa: E501

    :param catalog_id: Unique identifier of a catalog.
    :type catalog_id: str
    :param body: 
    :type body: dict | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: SupplementalItemsBatchResponse
    """
    if connexion.request.is_json:
        body = LocalInventoryItemsBatchCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def catalogs_local_inventory_items_post(catalog_id, body, ad_account_id=None):  # noqa: E501
    """Get local inventory items (POST)

    Get local inventory items for a catalog owned by the \&quot;operation user_account\&quot;.  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/) # noqa: E501

    :param catalog_id: Unique identifier of a catalog.
    :type catalog_id: str
    :param body: 
    :type body: dict | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: LocalInventoryItemsGet
    """
    if connexion.request.is_json:
        body = LocalInventoryItemsGetCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def catalogs_local_stores_create(catalog_id, body, ad_account_id=None):  # noqa: E501
    """Create local stores

    Create a local store for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/) # noqa: E501

    :param catalog_id: Unique identifier of a catalog.
    :type catalog_id: str
    :param body: 
    :type body: list | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: List[CatalogsLocalStoresCreate200ResponseInner]
    """
    if connexion.request.is_json:
        body = [LocalStoreCreate.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def catalogs_local_stores_delete(catalog_id, ids, ad_account_id=None):  # noqa: E501
    """Delete local stores

      Delete multiple local stores for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/) # noqa: E501

    :param catalog_id: Unique identifier of a catalog.
    :type catalog_id: str
    :param ids: List of local store IDs to filter by.
    :type ids: List[str]
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: List[CatalogsLocalStoresDelete200ResponseInner]
    """
    return 'do some magic!'


def catalogs_local_stores_list(catalog_id, ids=None, ad_account_id=None, bookmark=None, page_size=None):  # noqa: E501
    """List local stores

    Fetch local stores for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/) # noqa: E501

    :param catalog_id: Unique identifier of a catalog.
    :type catalog_id: str
    :param ids: List of local store IDs to filter by.
    :type ids: List[str]
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

    :rtype: CatalogsLocalStoresList200Response
    """
    return 'do some magic!'


def catalogs_local_stores_update(catalog_id, body, ad_account_id=None):  # noqa: E501
    """Update local stores

      Update a local store for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/) # noqa: E501

    :param catalog_id: Unique identifier of a catalog.
    :type catalog_id: str
    :param body: 
    :type body: list | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: List[CatalogsLocalStoresCreate200ResponseInner]
    """
    if connexion.request.is_json:
        body = [LocalStoreBatchUpdate.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def catalogs_supplemental_items_batch_get(catalog_id, batch_id, ad_account_id=None):  # noqa: E501
    """Get supplemental items batch status

    Fetch the status and results of a supplemental items batch operation. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/) # noqa: E501

    :param catalog_id: Unique identifier of a catalog.
    :type catalog_id: str
    :param batch_id: Unique identifier of an items batch operation.
    :type batch_id: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: SupplementalItemsBatchResponse
    """
    return 'do some magic!'
