# coding: utf-8

from typing import Dict, List  # noqa: F401

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
from openapi_server.models.catalogs_feed import CatalogsFeed
from openapi_server.models.catalogs_feeds_create_request import CatalogsFeedsCreateRequest
from openapi_server.models.catalogs_feeds_update_request import CatalogsFeedsUpdateRequest
from openapi_server.models.catalogs_items import CatalogsItems
from openapi_server.models.catalogs_items_batch import CatalogsItemsBatch
from openapi_server.models.catalogs_items_batch_request import CatalogsItemsBatchRequest
from openapi_server.models.catalogs_product_group import CatalogsProductGroup
from openapi_server.models.catalogs_product_group_create_request import CatalogsProductGroupCreateRequest
from openapi_server.models.catalogs_product_group_update_request import CatalogsProductGroupUpdateRequest
from openapi_server.models.error import Error
from openapi_server.models.paginated import Paginated
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()


@router.post(
    "/catalogs/product_groups",
    responses={
        201: {"model": object, "description": "Success"},
        400: {"model": Error, "description": "Invalid body."},
        401: {"model": Error, "description": "Unauthorized access."},
        403: {"model": Error, "description": "Forbidden. Account not approved for feed mutations yet."},
        409: {"model": Error, "description": "Conflict. Can&#39;t create this catalogs product group with this value."},
        200: {"model": Error, "description": "Unexpected error."},
    },
    tags=["catalogs"],
    summary="Create product group",
)
async def catalogs_product_groups_create(
    catalogs_product_group_create_request: CatalogsProductGroupCreateRequest = Body(None, description="Request object used to created a catalogs product group."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:write"]
    ),
) -> object:
    """&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Create product group to use in Catalogs."""
    ...


@router.delete(
    "/catalogs/product_groups/{product_group_id}",
    responses={
        204: {"description": "Catalogs Product Group deleted successfully."},
        400: {"model": Error, "description": "Invalid catalogs product group id parameters."},
        401: {"model": Error, "description": "Unauthorized access."},
        403: {"model": Error, "description": "Forbidden. Account not approved for feed mutations yet."},
        404: {"model": Error, "description": "Catalogs product group not found."},
        409: {"model": Error, "description": "Conflict. Can&#39;t delete this catalogs product group."},
        200: {"model": Error, "description": "Unexpected error."},
    },
    tags=["catalogs"],
    summary="Delete product group",
)
async def catalogs_product_groups_delete(
    product_group_id: str = Path(None, description="Unique identifier of a product group", regex=r"^\d+$"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:write"]
    ),
) -> None:
    """&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Delete a product group from being in use in Catalogs."""
    ...


@router.get(
    "/catalogs/product_groups",
    responses={
        200: {"model": Paginated, "description": "Success"},
        400: {"model": Error, "description": "Invalid feed parameters."},
        401: {"model": Error, "description": "Unauthorized access."},
        403: {"model": Error, "description": "Forbidden. Account not approved for feed mutations yet."},
        404: {"model": Error, "description": "Data feed not found."},
        409: {"model": Error, "description": "Conflict. Can&#39;t create this catalogs product group with this value."},
        200: {"model": Error, "description": "Unexpected error."},
    },
    tags=["catalogs"],
    summary="Get product groups list",
)
async def catalogs_product_groups_list(
    feed_id: str = Query(None, description="Unique identifier of a feed", regex=r"^\d+$"),
    bookmark: str = Query(None, description="Cursor used to fetch the next page of items"),
    page_size: int = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.", ge=1, le=100),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read"]
    ),
) -> Paginated:
    """&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a list of product groups for a given Catalogs Feed Id."""
    ...


@router.patch(
    "/catalogs/product_groups/{product_group_id}",
    responses={
        200: {"model": CatalogsProductGroup, "description": "Success"},
        400: {"model": Error, "description": "Invalid parameters."},
        401: {"model": Error, "description": "Unauthorized access."},
        404: {"model": Error, "description": "Catalogs product group not found."},
        409: {"model": Error, "description": "Conflict. Can&#39;t update this catalogs product group to this value."},
        200: {"model": Error, "description": "Unexpected error."},
    },
    tags=["catalogs"],
    summary="Update product group",
)
async def catalogs_product_groups_update(
    product_group_id: str = Path(None, description="Unique identifier of a product group", regex=r"^\d+$"),
    catalogs_product_group_update_request: CatalogsProductGroupUpdateRequest = Body(None, description="Request object used to Update a catalogs product group."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:write"]
    ),
) -> CatalogsProductGroup:
    """&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Update product group to use in Catalogs."""
    ...


@router.get(
    "/catalogs/feeds/{feed_id}/processing_results",
    responses={
        200: {"model": Paginated, "description": "Success"},
        400: {"model": Error, "description": "Invalid parameters."},
        401: {"model": Error, "description": "Unauthorized access."},
        404: {"model": Error, "description": "Feed not found."},
        200: {"model": Error, "description": "Unexpected error."},
    },
    tags=["catalogs"],
    summary="List processing results for a given feed",
)
async def feed_processing_results_list(
    feed_id: str = Path(None, description="Unique identifier of a feed", regex=r"^\d+$"),
    bookmark: str = Query(None, description="Cursor used to fetch the next page of items"),
    page_size: int = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.", ge=1, le=100),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read"]
    ),
) -> Paginated:
    """&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Fetch a feed processing results owned by the owner user account."""
    ...


@router.post(
    "/catalogs/feeds",
    responses={
        201: {"model": CatalogsFeed, "description": "Success"},
        400: {"model": Error, "description": "Invalid feed parameters."},
        401: {"model": Error, "description": "Unauthorized access."},
        403: {"model": Error, "description": "Business account required."},
        409: {"model": Error, "description": "User website required."},
        422: {"model": Error, "description": "Unique feed name is required."},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["catalogs"],
    summary="Create feed",
)
async def feeds_create(
    catalogs_feeds_create_request: CatalogsFeedsCreateRequest = Body(None, description="Request object used to created a feed."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read", "catalogs:write"]
    ),
) -> CatalogsFeed:
    """&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Create a new feed owned by the \&quot;operating user_account\&quot;."""
    ...


@router.delete(
    "/catalogs/feeds/{feed_id}",
    responses={
        204: {"description": "Feed deleted successfully."},
        400: {"model": Error, "description": "Invalid feed parameters."},
        403: {"model": Error, "description": "Forbidden. Account not approved for feed mutations yet."},
        404: {"model": Error, "description": "Data feed not found."},
        409: {"model": Error, "description": "Conflict. Can&#39;t delete a feed with active promotions."},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["catalogs"],
    summary="Delete feed",
)
async def feeds_delete(
    feed_id: str = Path(None, description="Unique identifier of a feed", regex=r"^\d+$"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read", "catalogs:write"]
    ),
) -> None:
    """&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Delete a feed owned by the \&quot;operating user_account\&quot;."""
    ...


@router.get(
    "/catalogs/feeds/{feed_id}",
    responses={
        200: {"model": CatalogsFeed, "description": "Success"},
        400: {"model": Error, "description": "Invalid feed parameters."},
        401: {"model": Error, "description": "Unauthorized access."},
        404: {"model": Error, "description": "Data feed not found."},
        200: {"model": Error, "description": "Unexpected error."},
    },
    tags=["catalogs"],
    summary="Get feed",
)
async def feeds_get(
    feed_id: str = Path(None, description="Unique identifier of a feed", regex=r"^\d+$"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read"]
    ),
) -> CatalogsFeed:
    """&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a single feed owned by the \&quot;operating user_account\&quot;."""
    ...


@router.get(
    "/catalogs/feeds",
    responses={
        200: {"model": Paginated, "description": "Success"},
        400: {"model": Error, "description": "Invalid parameters."},
        401: {"model": Error, "description": "Unauthorized access."},
        200: {"model": Error, "description": "Unexpected error."},
    },
    tags=["catalogs"],
    summary="List feeds",
)
async def feeds_list(
    bookmark: str = Query(None, description="Cursor used to fetch the next page of items"),
    page_size: int = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.", ge=1, le=100),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read"]
    ),
) -> Paginated:
    """&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Fetch feeds owned by the \&quot;operating user_account\&quot;."""
    ...


@router.patch(
    "/catalogs/feeds/{feed_id}",
    responses={
        200: {"model": CatalogsFeed, "description": "Success"},
        400: {"model": Error, "description": "Invalid feed parameters."},
        403: {"model": Error, "description": "Forbidden. Account not approved for feed mutations yet."},
        404: {"model": Error, "description": "Data feed not found."},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["catalogs"],
    summary="Update feed",
)
async def feeds_update(
    feed_id: str = Path(None, description="Unique identifier of a feed", regex=r"^\d+$"),
    catalogs_feeds_update_request: CatalogsFeedsUpdateRequest = Body(None, description="Request object used to update a feed."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read", "catalogs:write"]
    ),
) -> CatalogsFeed:
    """&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Update a feed owned by the \&quot;operating user_account\&quot;."""
    ...


@router.get(
    "/catalogs/items/batch/{batch_id}",
    responses={
        200: {"model": CatalogsItemsBatch, "description": "Response containing the requested catalogs items batch"},
        401: {"model": Error, "description": "Not authorized to access catalogs items batch"},
        403: {"model": Error, "description": "Not authorized to access catalogs items batch"},
        404: {"model": Error, "description": "Catalogs items batch not found"},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["catalogs"],
    summary="Get catalogs items batch",
)
async def items_batch_get(
    batch_id: str = Path(None, description="Id of a catalogs items batch to fetch"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read"]
    ),
) -> CatalogsItemsBatch:
    """&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a single catalogs items batch created by the \&quot;operating user_account\&quot;."""
    ...


@router.post(
    "/catalogs/items/batch",
    responses={
        200: {"model": CatalogsItemsBatch, "description": "Response containing the requested catalogs items batch"},
        401: {"model": Error, "description": "Not authorized to post catalogs items"},
        403: {"model": Error, "description": "Not authorized to post catalogs items"},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["catalogs"],
    summary="Perform an operation on an item batch",
)
async def items_batch_post(
    catalogs_items_batch_request: CatalogsItemsBatchRequest = Body(None, description="Request object used to create catalogs items in a batch"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read", "catalogs:write"]
    ),
) -> CatalogsItemsBatch:
    """&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  This endpoint supports multiple operations on a set of one or more catalog items."""
    ...


@router.get(
    "/catalogs/items",
    responses={
        200: {"model": CatalogsItems, "description": "Response containing the requested catalogs items"},
        401: {"model": Error, "description": "Not authorized to access catalogs items"},
        403: {"model": Error, "description": "Not authorized to access catalogs items"},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["catalogs"],
    summary="Get catalogs items",
)
async def items_get(
    country: str = Query(None, description="Country for the Catalogs Items"),
    item_ids: List[str] = Query(None, description="Catalos Item ids"),
    language: str = Query(None, description="Language for the Catalogs Items"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read"]
    ),
) -> CatalogsItems:
    """Get the items of the catalog created by the \&quot;operating user_account\&quot;"""
    ...
