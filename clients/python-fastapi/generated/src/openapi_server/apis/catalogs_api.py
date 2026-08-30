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
from openapi_server.models.catalog_create import CatalogCreate
from openapi_server.models.catalogs_available_filter_values import CatalogsAvailableFilterValues
from openapi_server.models.catalogs_list200_response import CatalogsList200Response
from openapi_server.models.catalogs_locale import CatalogsLocale
from openapi_server.models.country import Country
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/catalogs",
    responses={
        200: {"model": CatalogsList200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["catalogs"],
    summary="List catalogs",
    response_model_by_alias=True,
)
async def catalogs_list(
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read"]
    ),
) -> CatalogsList200Response:
    """Fetch catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)"""
    if not BaseCatalogsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogsApi.subclasses[0]().catalogs_list(ad_account_id, bookmark, page_size)


@router.post(
    "/catalogs",
    responses={
        200: {"model": Catalog, "description": "The request has succeeded."},
        201: {"model": Catalog, "description": "Resource create operation completed successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["catalogs"],
    summary="Create catalog",
    response_model_by_alias=True,
)
async def catalogs_create(
    catalog_create: CatalogCreate = Body(None, description=""),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:write"]
    ),
) -> Catalog:
    """Create a new catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager."""
    if not BaseCatalogsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogsApi.subclasses[0]().catalogs_create(catalog_create, ad_account_id)


@router.get(
    "/catalogs/available_filter_values",
    responses={
        200: {"model": CatalogsAvailableFilterValues, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
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
    """Get the available filter attributes and values associated with a given feed or catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - &#x60;country&#x60;, &#x60;language&#x60;, and &#x60;feed_id&#x60; are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)"""
    if not BaseCatalogsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogsApi.subclasses[0]().catalogs_available_filter_values(catalog_id, feed_id, country, language, ad_account_id)
