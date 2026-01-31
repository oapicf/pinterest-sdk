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
from openapi_server.models.catalogs_product_groups_list200_response import CatalogsProductGroupsList200Response
from openapi_server.models.catalogs_product_groups_update_request import CatalogsProductGroupsUpdateRequest
from openapi_server.models.catalogs_vertical_product_group import CatalogsVerticalProductGroup
from openapi_server.models.error import Error
from openapi_server.models.multiple_product_groups_inner import MultipleProductGroupsInner
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/catalogs/product_groups/multiple",
    responses={
        201: {"model": List[str], "description": "Success"},
        400: {"model": Error, "description": "Invalid body."},
        401: {"model": Error, "description": "Unauthorized access."},
        403: {"model": Error, "description": "Forbidden. Account not approved for catalog product group mutations yet."},
        409: {"model": Error, "description": "Conflict. Can&#39;t create this catalogs product group with this value."},
        "default": {"model": Error, "description": "Unexpected error."},
    },
    tags=["catalog_product_groups"],
    summary="Create product groups",
    response_model_by_alias=True,
)
async def catalogs_product_groups_create_many(
    multiple_product_groups_inner: Annotated[List[MultipleProductGroupsInner], Field(min_length=1, max_length=1000, description="Request object used to create one or more catalogs product groups.")] = Body(None, description="Request object used to create one or more catalogs product groups."),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:write"]
    ),
) -> List[str]:
    """Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager."""
    if not BaseCatalogProductGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogProductGroupsApi.subclasses[0]().catalogs_product_groups_create_many(multiple_product_groups_inner, ad_account_id)


@router.delete(
    "/catalogs/product_groups/multiple",
    responses={
        204: {"description": "Catalogs Product Groups deleted successfully."},
        401: {"model": Error, "description": "Unauthorized access."},
        403: {"model": Error, "description": "Forbidden. Account not approved for catalog product group mutations yet."},
        404: {"model": Error, "description": "Catalogs product group not found."},
        409: {"model": Error, "description": "Conflict. Can&#39;t delete this catalogs product group."},
        "default": {"model": Error, "description": "Unexpected error."},
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
    """Delete product groups owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;"""
    if not BaseCatalogProductGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogProductGroupsApi.subclasses[0]().catalogs_product_groups_delete_many(id, ad_account_id)


@router.get(
    "/catalogs/product_groups",
    responses={
        200: {"model": CatalogsProductGroupsList200Response, "description": "Success"},
        400: {"model": Error, "description": "Invalid feed parameters."},
        401: {"model": Error, "description": "Unauthorized access."},
        403: {"model": Error, "description": "Forbidden. Account not approved for catalog product group mutations yet."},
        404: {"model": Error, "description": "Data feed not found."},
        409: {"model": Error, "description": "Conflict. Can&#39;t create this catalogs product group with this value."},
        "default": {"model": Error, "description": "Unexpected error."},
    },
    tags=["catalog_product_groups"],
    summary="List product groups",
    response_model_by_alias=True,
)
async def catalogs_product_groups_list(
    id: Annotated[Optional[Annotated[List[StrictInt], Field(min_length=1, max_length=1000)]], Field(description="Comma-separated list of product group ids")] = Query(None, description="Comma-separated list of product group ids", alias="id"),
    feed_id: Annotated[Optional[Annotated[str, Field(strict=True)]], Field(description="Filter entities for a given feed_id. If not given, all feeds are considered.")] = Query(None, description="Filter entities for a given feed_id. If not given, all feeds are considered.", alias="feed_id", regex=r"^\d+$"),
    catalog_id: Annotated[Optional[Annotated[str, Field(strict=True)]], Field(description="Filter entities for a given catalog_id. If not given, all catalogs are considered.")] = Query(None, description="Filter entities for a given catalog_id. If not given, all catalogs are considered.", alias="catalog_id", regex=r"^\d+$"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read"]
    ),
) -> CatalogsProductGroupsList200Response:
    """Get a list of product groups for a given Catalogs Feed Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;"""
    if not BaseCatalogProductGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogProductGroupsApi.subclasses[0]().catalogs_product_groups_list(id, feed_id, catalog_id, bookmark, page_size, ad_account_id)


@router.post(
    "/catalogs/product_groups",
    responses={
        201: {"model": CatalogsVerticalProductGroup, "description": "Success"},
        400: {"model": Error, "description": "Invalid body."},
        401: {"model": Error, "description": "Unauthorized access."},
        403: {"model": Error, "description": "Forbidden. Account not approved for catalog product group mutations yet."},
        409: {"model": Error, "description": "Conflict. Can&#39;t create this catalogs product group with this value."},
        "default": {"model": Error, "description": "Unexpected error."},
    },
    tags=["catalog_product_groups"],
    summary="Create product group",
    response_model_by_alias=True,
)
async def catalogs_product_groups_create(
    multiple_product_groups_inner: Annotated[MultipleProductGroupsInner, Field(description="Request object used to create a single catalogs product groups.")] = Body(None, description="Request object used to create a single catalogs product groups."),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:write"]
    ),
) -> CatalogsVerticalProductGroup:
    """Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager. \&quot;Catalog-based product groups\&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \&quot;retail feed-based\&quot; option. &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager."""
    if not BaseCatalogProductGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogProductGroupsApi.subclasses[0]().catalogs_product_groups_create(multiple_product_groups_inner, ad_account_id)


@router.get(
    "/catalogs/product_groups/{product_group_id}",
    responses={
        200: {"model": CatalogsVerticalProductGroup, "description": "Success"},
        400: {"model": Error, "description": "Invalid catalogs product group id parameters."},
        401: {"model": Error, "description": "Unauthorized access."},
        403: {"model": Error, "description": "Forbidden. Account not approved for catalog product group mutations yet."},
        404: {"model": Error, "description": "Catalogs product group not found."},
        409: {"model": Error, "description": "Conflict. Can&#39;t get a catalogs product group without an existing catalog."},
        "default": {"model": Error, "description": "Unexpected error."},
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
    """Get a singe product group for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;"""
    if not BaseCatalogProductGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogProductGroupsApi.subclasses[0]().catalogs_product_groups_get(product_group_id, ad_account_id)


@router.delete(
    "/catalogs/product_groups/{product_group_id}",
    responses={
        204: {"description": "Catalogs Product Group deleted successfully."},
        400: {"model": Error, "description": "Invalid catalogs product group id parameters."},
        401: {"model": Error, "description": "Unauthorized access."},
        403: {"model": Error, "description": "Forbidden. Account not approved for catalog product group mutations yet."},
        404: {"model": Error, "description": "Catalogs product group not found."},
        409: {"model": Error, "description": "Conflict. Can&#39;t delete this catalogs product group."},
        "default": {"model": Error, "description": "Unexpected error."},
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
) -> None:
    """Delete a product group owned by the \&quot;operation user_account\&quot; from being in use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;"""
    if not BaseCatalogProductGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogProductGroupsApi.subclasses[0]().catalogs_product_groups_delete(product_group_id, ad_account_id)


@router.patch(
    "/catalogs/product_groups/{product_group_id}",
    responses={
        200: {"model": CatalogsVerticalProductGroup, "description": "Success"},
        400: {"model": Error, "description": "Invalid parameters."},
        401: {"model": Error, "description": "Unauthorized access."},
        403: {"model": Error, "description": "Forbidden. Account not approved for catalog product group mutations yet."},
        404: {"model": Error, "description": "Catalogs product group not found."},
        409: {"model": Error, "description": "Conflict. Can&#39;t update this catalogs product group to this value."},
        "default": {"model": Error, "description": "Unexpected error."},
    },
    tags=["catalog_product_groups"],
    summary="Update single product group",
    response_model_by_alias=True,
)
async def catalogs_product_groups_update(
    product_group_id: Annotated[str, Field(strict=True, description="Unique identifier of a product group")] = Path(..., description="Unique identifier of a product group", regex=r"^\d+$"),
    catalogs_product_groups_update_request: Annotated[CatalogsProductGroupsUpdateRequest, Field(description="Request object used to Update a catalogs product group.")] = Body(None, description="Request object used to Update a catalogs product group."),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:write"]
    ),
) -> CatalogsVerticalProductGroup:
    """Update product group owned by the \&quot;operation user_account\&quot; to use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager. \&quot;Catalog-based product groups\&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \&quot;retail feed-based\&quot; option. &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager."""
    if not BaseCatalogProductGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogProductGroupsApi.subclasses[0]().catalogs_product_groups_update(product_group_id, catalogs_product_groups_update_request, ad_account_id)


@router.get(
    "/catalogs/product_groups/{product_group_id}/product_counts",
    responses={
        200: {"model": CatalogsProductGroupProductCountsVertical, "description": "Success"},
        404: {"model": Error, "description": "Product Group Not Found."},
        409: {"model": Error, "description": "Can&#39;t access this feature without an existing catalog."},
        "default": {"model": Error, "description": "Unexpected error."},
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
    """Get a product counts for a given Catalogs Product Group owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;"""
    if not BaseCatalogProductGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogProductGroupsApi.subclasses[0]().catalogs_product_groups_product_counts_get(product_group_id, ad_account_id)


@router.get(
    "/catalogs/product_groups/{product_group_id}/products",
    responses={
        200: {"model": CatalogsProductGroupPinsList200Response, "description": "Success"},
        400: {"model": Error, "description": "Invalid parameters."},
        401: {"model": Error, "description": "Unauthorized access."},
        404: {"model": Error, "description": "Catalogs product group not found."},
        "default": {"model": Error, "description": "Unexpected error."},
    },
    tags=["catalog_product_groups"],
    summary="List products by product group",
    response_model_by_alias=True,
)
async def catalogs_product_group_pins_list(
    product_group_id: Annotated[str, Field(strict=True, description="Unique identifier of a product group")] = Path(..., description="Unique identifier of a product group", regex=r"^\d+$"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    pin_metrics: Annotated[Optional[StrictBool], Field(description="Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.")] = Query(False, description="Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.", alias="pin_metrics"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "catalogs:read", "pins:read"]
    ),
) -> CatalogsProductGroupPinsList200Response:
    """Get a list of product pins for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;"""
    if not BaseCatalogProductGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogProductGroupsApi.subclasses[0]().catalogs_product_group_pins_list(product_group_id, bookmark, page_size, ad_account_id, pin_metrics)


@router.post(
    "/catalogs/products/get_by_product_group_filters",
    responses={
        200: {"model": CatalogsProductGroupPinsList200Response, "description": "Success"},
        401: {"model": Error, "description": "Unauthorized access."},
        409: {"model": Error, "description": "Conflict. Can&#39;t get products."},
        "default": {"model": Error, "description": "Unexpected error."},
    },
    tags=["catalog_product_groups"],
    summary="List products by filter",
    response_model_by_alias=True,
)
async def products_by_product_group_filter_list(
    catalogs_list_products_by_filter_request: Annotated[CatalogsListProductsByFilterRequest, Field(description="Object holding a group of filters for a catalog product group")] = Body(None, description="Object holding a group of filters for a catalog product group"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    pin_metrics: Annotated[Optional[StrictBool], Field(description="Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.")] = Query(False, description="Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.", alias="pin_metrics"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "catalogs:read", "pins:read"]
    ),
) -> CatalogsProductGroupPinsList200Response:
    """List products Pins owned by the \&quot;operation user_account\&quot; that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;"""
    if not BaseCatalogProductGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogProductGroupsApi.subclasses[0]().products_by_product_group_filter_list(catalogs_list_products_by_filter_request, bookmark, page_size, ad_account_id, pin_metrics)
