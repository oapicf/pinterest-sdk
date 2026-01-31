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
from openapi_server.models.catalogs_items import CatalogsItems
from openapi_server.models.catalogs_items_batch import CatalogsItemsBatch
from openapi_server.models.catalogs_items_request import CatalogsItemsRequest
from openapi_server.models.error import Error
from openapi_server.models.items_batch_post_request import ItemsBatchPostRequest
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/catalogs/items",
    responses={
        200: {"model": CatalogsItems, "description": "Response containing the requested catalogs items"},
        400: {"model": Error, "description": "Invalid request"},
        401: {"model": Error, "description": "Not authorized to access catalogs items"},
        403: {"model": Error, "description": "Not authorized to access catalogs items"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["catalog_items"],
    summary="Get catalogs items (POST)",
    response_model_by_alias=True,
)
async def items_post(
    catalogs_items_request: Annotated[CatalogsItemsRequest, Field(description="Request object used to get catalogs items")] = Body(None, description="Request object used to get catalogs items"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read"]
    ),
) -> CatalogsItems:
    """Get the items of the catalog owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/api-features/shopping-overview/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager."""
    if not BaseCatalogItemsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogItemsApi.subclasses[0]().items_post(catalogs_items_request, ad_account_id)


@router.post(
    "/catalogs/items/batch",
    responses={
        200: {"model": CatalogsItemsBatch, "description": "Response containing the requested catalogs items batch"},
        400: {"model": Error, "description": "Invalid request parameters."},
        401: {"model": Error, "description": "Not authenticated to post catalogs items"},
        403: {"model": Error, "description": "Not authorized to post catalogs items"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["catalog_items"],
    summary="Operate on item batch",
    response_model_by_alias=True,
)
async def items_batch_post(
    items_batch_post_request: Annotated[ItemsBatchPostRequest, Field(description="Request object used to create catalogs items in a batch")] = Body(None, description="Request object used to create catalogs items in a batch"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read", "catalogs:write"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["catalogs:read", "catalogs:write"]
    ),
) -> CatalogsItemsBatch:
    """This endpoint supports multiple operations on a set of one or more catalog items owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/api-features/shopping-overview/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance."""
    if not BaseCatalogItemsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogItemsApi.subclasses[0]().items_batch_post(items_batch_post_request, ad_account_id)


@router.get(
    "/catalogs/items/batch/{batch_id}",
    responses={
        200: {"model": CatalogsItemsBatch, "description": "Response containing the requested catalogs items batch"},
        401: {"model": Error, "description": "Not authenticated to access catalogs items batch"},
        403: {"model": Error, "description": "Not authorized to access catalogs items batch"},
        404: {"model": Error, "description": "Catalogs items batch not found"},
        405: {"model": Error, "description": "Method Not Allowed."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["catalog_items"],
    summary="Get item batch status",
    response_model_by_alias=True,
)
async def items_batch_get(
    batch_id: Annotated[str, Field(strict=True, description="Id of a catalogs items batch to fetch")] = Path(..., description="Id of a catalogs items batch to fetch", regex=r"^[a-zA-Z0-9]+$"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["catalogs:read"]
    ),
) -> CatalogsItemsBatch:
    """Get a single catalogs items batch owned by the \&quot;operating user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/api-features/shopping-overview/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager."""
    if not BaseCatalogItemsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogItemsApi.subclasses[0]().items_batch_get(batch_id, ad_account_id)
