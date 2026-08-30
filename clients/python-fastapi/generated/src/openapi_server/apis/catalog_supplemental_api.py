# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.catalog_supplemental_api_base import BaseCatalogSupplementalApi
import openapi_server.impl

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    HTTPException,
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
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

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/catalogs/{catalog_id}/local_inventory_items/batch",
    responses={
        200: {"model": SupplementalItemsBatchResponse, "description": "The request has succeeded."},
        201: {"model": LocalInventoryItemsBatch, "description": "Resource create operation completed successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["catalog_supplemental"],
    summary="Operate on local inventory item batch",
    response_model_by_alias=True,
)
async def catalogs_local_inventory_items_batch_operate(
    catalog_id: Annotated[str, Field(strict=True, max_length=19, description="Unique identifier of a catalog.")] = Path(..., description="Unique identifier of a catalog.", regex=r"^\d+$", max_length=19),
    local_inventory_items_batch_create: LocalInventoryItemsBatchCreate = Body(None, description=""),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:write"]
    ),
) -> SupplementalItemsBatchResponse:
    """Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)"""
    if not BaseCatalogSupplementalApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogSupplementalApi.subclasses[0]().catalogs_local_inventory_items_batch_operate(catalog_id, local_inventory_items_batch_create, ad_account_id)


@router.post(
    "/catalogs/{catalog_id}/local_inventory_items/query",
    responses={
        200: {"model": LocalInventoryItemsGet, "description": "The request has succeeded."},
        201: {"model": LocalInventoryItemsGet, "description": "Resource create operation completed successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["catalog_supplemental"],
    summary="Get local inventory items (POST)",
    response_model_by_alias=True,
)
async def catalogs_local_inventory_items_post(
    catalog_id: Annotated[str, Field(strict=True, max_length=19, description="Unique identifier of a catalog.")] = Path(..., description="Unique identifier of a catalog.", regex=r"^\d+$", max_length=19),
    local_inventory_items_get_create: LocalInventoryItemsGetCreate = Body(None, description=""),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read"]
    ),
) -> LocalInventoryItemsGet:
    """Get local inventory items for a catalog owned by the \&quot;operation user_account\&quot;.  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)"""
    if not BaseCatalogSupplementalApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogSupplementalApi.subclasses[0]().catalogs_local_inventory_items_post(catalog_id, local_inventory_items_get_create, ad_account_id)


@router.get(
    "/catalogs/{catalog_id}/local_stores",
    responses={
        200: {"model": CatalogsLocalStoresList200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["catalog_supplemental"],
    summary="List local stores",
    response_model_by_alias=True,
)
async def catalogs_local_stores_list(
    catalog_id: Annotated[str, Field(strict=True, max_length=19, description="Unique identifier of a catalog.")] = Path(..., description="Unique identifier of a catalog.", regex=r"^\d+$", max_length=19),
    ids: Annotated[Optional[List[Annotated[str, Field(strict=True)]]], Field(description="List of local store IDs to filter by.")] = Query(None, description="List of local store IDs to filter by.", alias="ids"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read"]
    ),
) -> CatalogsLocalStoresList200Response:
    """Fetch local stores for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)"""
    if not BaseCatalogSupplementalApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogSupplementalApi.subclasses[0]().catalogs_local_stores_list(catalog_id, ids, ad_account_id, bookmark, page_size)


@router.post(
    "/catalogs/{catalog_id}/local_stores",
    responses={
        200: {"model": List[CatalogsLocalStoresCreate200ResponseInner], "description": "The request has succeeded."},
        201: {"model": List[LocalStore], "description": "Resource create operation completed successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["catalog_supplemental"],
    summary="Create local stores",
    response_model_by_alias=True,
)
async def catalogs_local_stores_create(
    catalog_id: Annotated[str, Field(strict=True, max_length=19, description="Unique identifier of a catalog.")] = Path(..., description="Unique identifier of a catalog.", regex=r"^\d+$", max_length=19),
    local_store_create: List[LocalStoreCreate] = Body(None, description=""),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:write"]
    ),
) -> List[CatalogsLocalStoresCreate200ResponseInner]:
    """Create a local store for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)"""
    if not BaseCatalogSupplementalApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogSupplementalApi.subclasses[0]().catalogs_local_stores_create(catalog_id, local_store_create, ad_account_id)


@router.delete(
    "/catalogs/{catalog_id}/local_stores",
    responses={
        200: {"model": List[CatalogsLocalStoresDelete200ResponseInner], "description": "The request has succeeded."},
        204: {"description": "Resource deleted successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["catalog_supplemental"],
    summary="Delete local stores",
    response_model_by_alias=True,
)
async def catalogs_local_stores_delete(
    catalog_id: Annotated[str, Field(strict=True, max_length=19, description="Unique identifier of a catalog.")] = Path(..., description="Unique identifier of a catalog.", regex=r"^\d+$", max_length=19),
    ids: Annotated[List[Annotated[str, Field(strict=True)]], Field(description="List of local store IDs to filter by.")] = Query(None, description="List of local store IDs to filter by.", alias="ids"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:write"]
    ),
) -> List[CatalogsLocalStoresDelete200ResponseInner]:
    """  Delete multiple local stores for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)"""
    if not BaseCatalogSupplementalApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogSupplementalApi.subclasses[0]().catalogs_local_stores_delete(catalog_id, ids, ad_account_id)


@router.patch(
    "/catalogs/{catalog_id}/local_stores",
    responses={
        200: {"model": List[CatalogsLocalStoresCreate200ResponseInner], "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["catalog_supplemental"],
    summary="Update local stores",
    response_model_by_alias=True,
)
async def catalogs_local_stores_update(
    catalog_id: Annotated[str, Field(strict=True, max_length=19, description="Unique identifier of a catalog.")] = Path(..., description="Unique identifier of a catalog.", regex=r"^\d+$", max_length=19),
    local_store_batch_update: List[LocalStoreBatchUpdate] = Body(None, description=""),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:write"]
    ),
) -> List[CatalogsLocalStoresCreate200ResponseInner]:
    """  Update a local store for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)"""
    if not BaseCatalogSupplementalApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogSupplementalApi.subclasses[0]().catalogs_local_stores_update(catalog_id, local_store_batch_update, ad_account_id)


@router.get(
    "/catalogs/{catalog_id}/supplemental_items/batch/{batch_id}",
    responses={
        200: {"model": SupplementalItemsBatchResponse, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["catalog_supplemental"],
    summary="Get supplemental items batch status",
    response_model_by_alias=True,
)
async def catalogs_supplemental_items_batch_get(
    catalog_id: Annotated[str, Field(strict=True, max_length=19, description="Unique identifier of a catalog.")] = Path(..., description="Unique identifier of a catalog.", regex=r"^\d+$", max_length=19),
    batch_id: Annotated[str, Field(strict=True, description="Unique identifier of an items batch operation.")] = Path(..., description="Unique identifier of an items batch operation.", regex=r"^\d+$"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read"]
    ),
) -> SupplementalItemsBatchResponse:
    """Fetch the status and results of a supplemental items batch operation. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)"""
    if not BaseCatalogSupplementalApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogSupplementalApi.subclasses[0]().catalogs_supplemental_items_batch_get(catalog_id, batch_id, ad_account_id)
