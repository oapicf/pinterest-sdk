# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictStr, field_validator
from typing import Any, List, Optional
from typing_extensions import Annotated
from openapi_server.models.catalogs_local_stores_create200_response_inner import CatalogsLocalStoresCreate200ResponseInner
from openapi_server.models.catalogs_local_stores_delete200_response_inner import CatalogsLocalStoresDelete200ResponseInner
from openapi_server.models.catalogs_local_stores_list200_response import CatalogsLocalStoresList200Response
from openapi_server.models.local_inventory_items_batch import LocalInventoryItemsBatch
from openapi_server.models.local_inventory_items_batch_create import LocalInventoryItemsBatchCreate
from openapi_server.models.local_inventory_items_get import LocalInventoryItemsGet
from openapi_server.models.local_inventory_items_get_create import LocalInventoryItemsGetCreate
from openapi_server.models.local_store import LocalStore
from openapi_server.models.local_store_batch_update import LocalStoreBatchUpdate
from openapi_server.models.local_store_create import LocalStoreCreate
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.supplemental_items_batch_response import SupplementalItemsBatchResponse
from openapi_server.security_api import get_token_pinterest_oauth2

class BaseCatalogSupplementalApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseCatalogSupplementalApi.subclasses = BaseCatalogSupplementalApi.subclasses + (cls,)
    async def catalogs_local_inventory_items_batch_operate(
        self,
        catalog_id: Annotated[str, Field(strict=True, max_length=19, description="Unique identifier of a catalog.")],
        local_inventory_items_batch_create: LocalInventoryItemsBatchCreate,
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> SupplementalItemsBatchResponse:
        """Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)"""
        ...


    async def catalogs_local_inventory_items_post(
        self,
        catalog_id: Annotated[str, Field(strict=True, max_length=19, description="Unique identifier of a catalog.")],
        local_inventory_items_get_create: LocalInventoryItemsGetCreate,
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> LocalInventoryItemsGet:
        """Get local inventory items for a catalog owned by the \&quot;operation user_account\&quot;.  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)"""
        ...


    async def catalogs_local_stores_list(
        self,
        catalog_id: Annotated[str, Field(strict=True, max_length=19, description="Unique identifier of a catalog.")],
        ids: Annotated[Optional[List[Annotated[str, Field(strict=True)]]], Field(description="List of local store IDs to filter by.")],
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
    ) -> CatalogsLocalStoresList200Response:
        """Fetch local stores for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)"""
        ...


    async def catalogs_local_stores_create(
        self,
        catalog_id: Annotated[str, Field(strict=True, max_length=19, description="Unique identifier of a catalog.")],
        local_store_create: List[LocalStoreCreate],
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> List[CatalogsLocalStoresCreate200ResponseInner]:
        """Create a local store for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)"""
        ...


    async def catalogs_local_stores_delete(
        self,
        catalog_id: Annotated[str, Field(strict=True, max_length=19, description="Unique identifier of a catalog.")],
        ids: Annotated[List[Annotated[str, Field(strict=True)]], Field(description="List of local store IDs to filter by.")],
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> List[CatalogsLocalStoresDelete200ResponseInner]:
        """  Delete multiple local stores for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)"""
        ...


    async def catalogs_local_stores_update(
        self,
        catalog_id: Annotated[str, Field(strict=True, max_length=19, description="Unique identifier of a catalog.")],
        local_store_batch_update: List[LocalStoreBatchUpdate],
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> List[CatalogsLocalStoresCreate200ResponseInner]:
        """  Update a local store for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)"""
        ...


    async def catalogs_supplemental_items_batch_get(
        self,
        catalog_id: Annotated[str, Field(strict=True, max_length=19, description="Unique identifier of a catalog.")],
        batch_id: Annotated[str, Field(strict=True, description="Unique identifier of an items batch operation.")],
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> SupplementalItemsBatchResponse:
        """Fetch the status and results of a supplemental items batch operation. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)"""
        ...
