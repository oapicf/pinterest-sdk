# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.catalogs_api_base import BaseCatalogsApi
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
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.catalog import Catalog
from openapi_server.models.catalogs_available_filter_values import CatalogsAvailableFilterValues
from openapi_server.models.catalogs_create_request import CatalogsCreateRequest
from openapi_server.models.catalogs_list200_response import CatalogsList200Response
from openapi_server.models.catalogs_locale import CatalogsLocale
from openapi_server.models.country import Country
from openapi_server.models.error import Error
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/catalogs",
    responses={
        200: {"model": CatalogsList200Response, "description": "Success"},
        400: {"model": Error, "description": "Invalid parameters."},
        401: {"model": Error, "description": "Unauthorized access."},
        "default": {"model": Error, "description": "Unexpected error."},
    },
    tags=["catalogs"],
    summary="List catalogs",
    response_model_by_alias=True,
)
async def catalogs_list(
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read"]
    ),
) -> CatalogsList200Response:
    """Fetch catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;"""
    if not BaseCatalogsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogsApi.subclasses[0]().catalogs_list(bookmark, page_size, ad_account_id)


@router.post(
    "/catalogs",
    responses={
        200: {"model": Catalog, "description": "Success"},
        400: {"model": Error, "description": "Invalid parameters."},
        401: {"model": Error, "description": "Unauthorized access."},
        "default": {"model": Error, "description": "Unexpected error."},
    },
    tags=["catalogs"],
    summary="Create catalog",
    response_model_by_alias=True,
)
async def catalogs_create(
    catalogs_create_request: Annotated[CatalogsCreateRequest, Field(description="Request object used to created a feed.")] = Body(None, description="Request object used to created a feed."),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:write"]
    ),
) -> Catalog:
    """Create a new catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager."""
    if not BaseCatalogsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogsApi.subclasses[0]().catalogs_create(catalogs_create_request, ad_account_id)


@router.get(
    "/catalogs/available_filter_values",
    responses={
        200: {"model": CatalogsAvailableFilterValues, "description": "Success"},
        400: {"model": Error, "description": "Invalid parameters."},
        401: {"model": Error, "description": "Unauthorized access."},
        403: {"model": Error, "description": "Forbidden. Account not authorized to access available filter values."},
        404: {"model": Error, "description": "Data feed not found."},
        409: {"model": Error, "description": "Can&#39;t access this feature without an existing catalog."},
        "default": {"model": Error, "description": "Unexpected error."},
    },
    tags=["catalogs"],
    summary="List available filter values",
    response_model_by_alias=True,
)
async def catalogs_available_filter_values(
    catalog_id: Annotated[str, Field(strict=True, description="Filter entities for a given catalog_id.")] = Query(None, description="Filter entities for a given catalog_id.", alias="catalog_id", regex=r"^\d+$"),
    feed_id: Annotated[Optional[Annotated[str, Field(strict=True)]], Field(description="Filter entities for a given feed_id. If not given, all feeds are considered.")] = Query(None, description="Filter entities for a given feed_id. If not given, all feeds are considered.", alias="feed_id", regex=r"^\d+$"),
    country: Annotated[Optional[Country], Field(description="Country for the Catalogs Items")] = Query(None, description="Country for the Catalogs Items", alias="country"),
    language: Annotated[Optional[CatalogsLocale], Field(description="Language for the Catalogs Items")] = Query(None, description="Language for the Catalogs Items", alias="language"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read"]
    ),
) -> CatalogsAvailableFilterValues:
    """Get the available filter attributes and values associated with a given feed or catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - &lt;code&gt;country&lt;/code&gt;, &lt;code&gt;language&lt;/code&gt;, and &lt;code&gt;feed_id&lt;/code&gt; are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;"""
    if not BaseCatalogsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogsApi.subclasses[0]().catalogs_available_filter_values(catalog_id, feed_id, country, language, ad_account_id)
