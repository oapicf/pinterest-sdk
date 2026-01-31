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
from openapi_server.models.error import Error
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/advanced_auction/items/get",
    responses={
        200: {"model": AdvancedAuctionItems, "description": "Response containing the bid option values for the requested retail catalog items. Items that don&#39;t exist or do not have bid options set won&#39;t be present in the response."},
        400: {"model": Error, "description": "Invalid request parameters."},
        401: {"model": Error, "description": "Not authenticated to get item bid options"},
        403: {"model": Error, "description": "Not authorized to get item bid options"},
        500: {"model": Error, "description": "Internal error"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["advanced_auction"],
    summary="Get item bid options (POST)",
    response_model_by_alias=True,
)
async def advanced_auction_items_get_post(
    advanced_auction_items_get_request: Annotated[AdvancedAuctionItemsGetRequest, Field(description="Request object used to get bid options values for a batch of retail catalog items")] = Body(None, description="Request object used to get bid options values for a batch of retail catalog items"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read", "catalogs:read"]
    ),
) -> AdvancedAuctionItems:
    """Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/api-features/shopping-overview/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users."""
    if not BaseAdvancedAuctionApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdvancedAuctionApi.subclasses[0]().advanced_auction_items_get_post(advanced_auction_items_get_request, ad_account_id)


@router.post(
    "/advanced_auction/items/submit",
    responses={
        200: {"model": AdvancedAuctionProcessedItems, "description": "Response containing the results of the item bid options operations"},
        206: {"model": AdvancedAuctionProcessedItems, "description": "Response containing the results of the item bid options operations (where some/all operation results have errors)"},
        400: {"model": Error, "description": "Invalid request parameters."},
        401: {"model": Error, "description": "Not authenticated to post item bid options"},
        403: {"model": Error, "description": "Not authorized to post item bid options"},
        500: {"model": Error, "description": "Internal error"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["advanced_auction"],
    summary="Operate on item level bid options",
    response_model_by_alias=True,
)
async def advanced_auction_items_submit_post(
    advanced_auction_items_submit_request: Annotated[AdvancedAuctionItemsSubmitRequest, Field(description="Request object used to upsert or delete bid options for a batch of retail catalog items")] = Body(None, description="Request object used to upsert or delete bid options for a batch of retail catalog items"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write", "catalogs:read"]
    ),
) -> AdvancedAuctionProcessedItems:
    """This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type &#x60;CATALOG_SALES&#x60; and ad groups using bid_strategy_type &#x60;MAX_BID&#x60;.  The catalog must be owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/api-features/modify-items-in-batch/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users."""
    if not BaseAdvancedAuctionApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdvancedAuctionApi.subclasses[0]().advanced_auction_items_submit_post(advanced_auction_items_submit_request, ad_account_id)
