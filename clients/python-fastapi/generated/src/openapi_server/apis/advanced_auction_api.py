# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.advanced_auction_api_base import BaseAdvancedAuctionApi
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
from openapi_server.models.advanced_auction_items import AdvancedAuctionItems
from openapi_server.models.advanced_auction_items_get_request import AdvancedAuctionItemsGetRequest
from openapi_server.models.advanced_auction_items_submit_request import AdvancedAuctionItemsSubmitRequest
from openapi_server.models.advanced_auction_processed_items import AdvancedAuctionProcessedItems
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/advanced_auction/items/get",
    responses={
        200: {"model": AdvancedAuctionItems, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        500: {"model": PinterestLibError, "description": "The server encountered an unexpected condition that prevented it from fulfilling the request."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["advanced_auction"],
    summary="Get item bid options (POST)",
    response_model_by_alias=True,
)
async def advanced_auction_items_get_post(
    advanced_auction_items_get_request: AdvancedAuctionItemsGetRequest = Body(None, description=""),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read", "catalogs:read"]
    ),
) -> AdvancedAuctionItems:
    """Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users."""
    if not BaseAdvancedAuctionApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdvancedAuctionApi.subclasses[0]().advanced_auction_items_get_post(advanced_auction_items_get_request, ad_account_id)


@router.post(
    "/advanced_auction/items/submit",
    responses={
        200: {"model": AdvancedAuctionProcessedItems, "description": "The request has succeeded."},
        206: {"model": AdvancedAuctionProcessedItems, "description": "Successful"},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        500: {"model": PinterestLibError, "description": "The server encountered an unexpected condition that prevented it from fulfilling the request."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["advanced_auction"],
    summary="Operate on item level bid options",
    response_model_by_alias=True,
)
async def advanced_auction_items_submit_post(
    advanced_auction_items_submit_request: AdvancedAuctionItemsSubmitRequest = Body(None, description=""),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write", "catalogs:read"]
    ),
) -> AdvancedAuctionProcessedItems:
    """This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type &#x60;CATALOG_SALES&#x60; and ad groups using bid_strategy_type &#x60;MAX_BID&#x60;.  The catalog must be owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/api-features/modify-items-in-batch/) By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users."""
    if not BaseAdvancedAuctionApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdvancedAuctionApi.subclasses[0]().advanced_auction_items_submit_post(advanced_auction_items_submit_request, ad_account_id)
