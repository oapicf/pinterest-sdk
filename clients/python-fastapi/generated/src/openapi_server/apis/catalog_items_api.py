# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.catalog_items_api_base import BaseCatalogItemsApi
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
from pydantic import Field, field_validator
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.catalogs_items_batch import CatalogsItemsBatch
from openapi_server.models.catalogs_items_batch_post_request import CatalogsItemsBatchPostRequest
from openapi_server.models.catalogs_items_request import CatalogsItemsRequest
from openapi_server.models.items_post200_response import ItemsPost200Response
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/catalogs/items",
    responses={
        200: {"model": ItemsPost200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["catalog_items"],
    summary="Get catalogs items (POST)",
    response_model_by_alias=True,
)
async def items_post(
    catalogs_items_request: CatalogsItemsRequest = Body(None, description=""),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read"]
    ),
) -> ItemsPost200Response:
    """Get the items of the catalog owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager."""
    if not BaseCatalogItemsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogItemsApi.subclasses[0]().items_post(catalogs_items_request, ad_account_id)


@router.post(
    "/catalogs/items/batch",
    responses={
        200: {"model": CatalogsItemsBatch, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["catalog_items"],
    summary="Operate on item batch",
    response_model_by_alias=True,
)
async def items_batch_post(
    catalogs_items_batch_post_request: CatalogsItemsBatchPostRequest = Body(None, description=""),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read", "catalogs:write"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["catalogs:read", "catalogs:write"]
    ),
) -> CatalogsItemsBatch:
    """This endpoint supports multiple operations on a set of one or more catalog items owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/work-with-catalogs/modify-items-in-batch/) - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance."""
    if not BaseCatalogItemsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogItemsApi.subclasses[0]().items_batch_post(catalogs_items_batch_post_request, ad_account_id)


@router.get(
    "/catalogs/items/batch/{batch_id}",
    responses={
        200: {"model": CatalogsItemsBatch, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["catalog_items"],
    summary="Get item batch status",
    response_model_by_alias=True,
)
async def items_batch_get(
    batch_id: Annotated[str, Field(strict=True, description="Id of a catalogs items batch to fetch")] = Path(..., description="Id of a catalogs items batch to fetch", regex=r"^\d+$"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["catalogs:read"]
    ),
) -> CatalogsItemsBatch:
    """Get a single catalogs items batch owned by the \&quot;operating user_account\&quot;. [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager."""
    if not BaseCatalogItemsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogItemsApi.subclasses[0]().items_batch_get(batch_id, ad_account_id)
