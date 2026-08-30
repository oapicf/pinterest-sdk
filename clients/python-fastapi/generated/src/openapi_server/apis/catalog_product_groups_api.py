# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.catalog_product_groups_api_base import BaseCatalogProductGroupsApi
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
from pydantic import Field, StrictBool, StrictInt, StrictStr, field_validator
from typing import Any, List, Optional
from typing_extensions import Annotated
from openapi_server.models.catalogs_list_products_by_filter_request import CatalogsListProductsByFilterRequest
from openapi_server.models.catalogs_product_group_pins_list200_response import CatalogsProductGroupPinsList200Response
from openapi_server.models.catalogs_product_group_product_counts_vertical import CatalogsProductGroupProductCountsVertical
from openapi_server.models.catalogs_product_groups_create_many_request_items import CatalogsProductGroupsCreateManyRequestItems
from openapi_server.models.catalogs_product_groups_create_request_schema import CatalogsProductGroupsCreateRequestSchema
from openapi_server.models.catalogs_product_groups_list200_response import CatalogsProductGroupsList200Response
from openapi_server.models.catalogs_product_groups_update_request_schema import CatalogsProductGroupsUpdateRequestSchema
from openapi_server.models.catalogs_vertical_product_group import CatalogsVerticalProductGroup
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/catalogs/product_groups",
    responses={
        200: {"model": CatalogsProductGroupsList200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["catalog_product_groups"],
    summary="List product groups",
    response_model_by_alias=True,
)
async def catalogs_product_groups_list(
    id: Annotated[Optional[Annotated[List[StrictInt], Field(min_length=1, max_length=1000)]], Field(description="Comma-separated list of product group ids")] = Query(None, description="Comma-separated list of product group ids", alias="id"),
    feed_id: Annotated[Optional[Annotated[str, Field(strict=True)]], Field(description="Filter entities for a given feed_id. If not given, all feeds are considered.")] = Query(None, description="Filter entities for a given feed_id. If not given, all feeds are considered.", alias="feed_id", regex=r"^\d+$"),
    catalog_id: Annotated[Optional[Annotated[str, Field(strict=True)]], Field(description="Filter entities for a given catalog_id. If not given, all catalogs are considered.")] = Query(None, description="Filter entities for a given catalog_id. If not given, all catalogs are considered.", alias="catalog_id", regex=r"^\d+$"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read"]
    ),
) -> CatalogsProductGroupsList200Response:
    """Get a list of product groups for a given Catalogs Feed Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)"""
    if not BaseCatalogProductGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogProductGroupsApi.subclasses[0]().catalogs_product_groups_list(id, feed_id, catalog_id, ad_account_id, bookmark, page_size)


@router.post(
    "/catalogs/product_groups",
    responses={
        200: {"model": CatalogsVerticalProductGroup, "description": "The request has succeeded."},
        201: {"model": CatalogsVerticalProductGroup, "description": "Resource create operation completed successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["catalog_product_groups"],
    summary="Create product group",
    response_model_by_alias=True,
)
async def catalogs_product_groups_create(
    catalogs_product_groups_create_request_schema: CatalogsProductGroupsCreateRequestSchema = Body(None, description=""),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:write"]
    ),
) -> CatalogsVerticalProductGroup:
    """Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \&quot;Catalog-based product groups\&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \&quot;retail feed-based\&quot; option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager."""
    if not BaseCatalogProductGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogProductGroupsApi.subclasses[0]().catalogs_product_groups_create(catalogs_product_groups_create_request_schema, ad_account_id)


@router.post(
    "/catalogs/product_groups/multiple",
    responses={
        201: {"model": List[str], "description": "The request has succeeded and a new resource has been created as a result."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["catalog_product_groups"],
    summary="Create product groups",
    response_model_by_alias=True,
)
async def catalogs_product_groups_create_many(
    catalogs_product_groups_create_many_request_items: Annotated[List[CatalogsProductGroupsCreateManyRequestItems], Field(min_length=1, max_length=1000)] = Body(None, description=""),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:write"]
    ),
) -> List[str]:
    """Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager."""
    if not BaseCatalogProductGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogProductGroupsApi.subclasses[0]().catalogs_product_groups_create_many(catalogs_product_groups_create_many_request_items, ad_account_id)


@router.delete(
    "/catalogs/product_groups/multiple",
    responses={
        204: {"description": "Resource deleted successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["catalog_product_groups"],
    summary="Delete product groups",
    response_model_by_alias=True,
)
async def catalogs_product_groups_delete_many(
    id: Annotated[List[StrictInt], Field(min_length=1, max_length=1000, description="Comma-separated list of product group ids")] = Query(None, description="Comma-separated list of product group ids", alias="id"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:write"]
    ),
) -> None:
    """Delete product groups owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)"""
    if not BaseCatalogProductGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogProductGroupsApi.subclasses[0]().catalogs_product_groups_delete_many(id, ad_account_id)


@router.get(
    "/catalogs/product_groups/{product_group_id}",
    responses={
        200: {"model": CatalogsVerticalProductGroup, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["catalog_product_groups"],
    summary="Get product group",
    response_model_by_alias=True,
)
async def catalogs_product_groups_get(
    product_group_id: Annotated[str, Field(strict=True, description="Unique identifier of a product group")] = Path(..., description="Unique identifier of a product group", regex=r"^\d+$"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read"]
    ),
) -> CatalogsVerticalProductGroup:
    """Get a single product group for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)"""
    if not BaseCatalogProductGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogProductGroupsApi.subclasses[0]().catalogs_product_groups_get(product_group_id, ad_account_id)


@router.delete(
    "/catalogs/product_groups/{product_group_id}",
    responses={
        200: {"model": CatalogsVerticalProductGroup, "description": "The request has succeeded."},
        204: {"description": "Resource deleted successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["catalog_product_groups"],
    summary="Delete product group",
    response_model_by_alias=True,
)
async def catalogs_product_groups_delete(
    product_group_id: Annotated[str, Field(strict=True, description="Unique identifier of a product group")] = Path(..., description="Unique identifier of a product group", regex=r"^\d+$"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:write"]
    ),
) -> CatalogsVerticalProductGroup:
    """Delete a product group owned by the \&quot;operation user_account\&quot; from being in use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)"""
    if not BaseCatalogProductGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogProductGroupsApi.subclasses[0]().catalogs_product_groups_delete(product_group_id, ad_account_id)


@router.patch(
    "/catalogs/product_groups/{product_group_id}",
    responses={
        200: {"model": CatalogsVerticalProductGroup, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["catalog_product_groups"],
    summary="Update single product group",
    response_model_by_alias=True,
)
async def catalogs_product_groups_update(
    product_group_id: Annotated[str, Field(strict=True, description="Unique identifier of a product group")] = Path(..., description="Unique identifier of a product group", regex=r"^\d+$"),
    catalogs_product_groups_update_request_schema: CatalogsProductGroupsUpdateRequestSchema = Body(None, description=""),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:write"]
    ),
) -> CatalogsVerticalProductGroup:
    """Update product group owned by the \&quot;operation user_account\&quot; to use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \&quot;Catalog-based product groups\&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \&quot;retail feed-based\&quot; option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager."""
    if not BaseCatalogProductGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogProductGroupsApi.subclasses[0]().catalogs_product_groups_update(product_group_id, catalogs_product_groups_update_request_schema, ad_account_id)


@router.get(
    "/catalogs/product_groups/{product_group_id}/product_counts",
    responses={
        200: {"model": CatalogsProductGroupProductCountsVertical, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["catalog_product_groups"],
    summary="Get product counts",
    response_model_by_alias=True,
)
async def catalogs_product_groups_product_counts_get(
    product_group_id: Annotated[str, Field(strict=True, description="Unique identifier of a product group")] = Path(..., description="Unique identifier of a product group", regex=r"^\d+$"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read"]
    ),
) -> CatalogsProductGroupProductCountsVertical:
    """Get a product counts for a given Catalogs Product Group owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)"""
    if not BaseCatalogProductGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogProductGroupsApi.subclasses[0]().catalogs_product_groups_product_counts_get(product_group_id, ad_account_id)


@router.get(
    "/catalogs/product_groups/{product_group_id}/products",
    responses={
        200: {"model": CatalogsProductGroupPinsList200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["catalog_product_groups"],
    summary="List products by product group",
    response_model_by_alias=True,
)
async def catalogs_product_group_pins_list(
    product_group_id: Annotated[str, Field(strict=True, description="Unique identifier of a product group")] = Path(..., description="Unique identifier of a product group", regex=r"^\d+$"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    pin_metrics: Annotated[Optional[StrictBool], Field(description="Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.")] = Query(False, description="Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.", alias="pin_metrics"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "catalogs:read", "pins:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["boards:read", "catalogs:read", "pins:read"]
    ),
) -> CatalogsProductGroupPinsList200Response:
    """Get a list of product pins for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)"""
    if not BaseCatalogProductGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogProductGroupsApi.subclasses[0]().catalogs_product_group_pins_list(product_group_id, ad_account_id, pin_metrics, bookmark, page_size)


@router.post(
    "/catalogs/products/get_by_product_group_filters",
    responses={
        200: {"model": CatalogsProductGroupPinsList200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["catalog_product_groups"],
    summary="List products by filter",
    response_model_by_alias=True,
)
async def products_by_product_group_filter_list(
    catalogs_list_products_by_filter_request: CatalogsListProductsByFilterRequest = Body(None, description=""),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    pin_metrics: Annotated[Optional[StrictBool], Field(description="Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.")] = Query(False, description="Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.", alias="pin_metrics"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "catalogs:read", "pins:read"]
    ),
) -> CatalogsProductGroupPinsList200Response:
    """List products Pins owned by the \&quot;operation user_account\&quot; that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  [Learn more](/docs/api-features/shopping-overview/)"""
    if not BaseCatalogProductGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogProductGroupsApi.subclasses[0]().products_by_product_group_filter_list(catalogs_list_products_by_filter_request, bookmark, page_size, ad_account_id, pin_metrics)
