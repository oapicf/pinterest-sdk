# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.pins_api_base import BasePinsApi
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
from datetime import date
from pydantic import Field, StrictBool, StrictStr, field_validator
from typing import Any, Dict, List, Optional
from typing_extensions import Annotated
from openapi_server.models.creative_type import CreativeType
from openapi_server.models.error import Error
from openapi_server.models.pin import Pin
from openapi_server.models.pin_analytics_metrics_response import PinAnalyticsMetricsResponse
from openapi_server.models.pin_create import PinCreate
from openapi_server.models.pin_update import PinUpdate
from openapi_server.models.pins_list200_response import PinsList200Response
from openapi_server.models.pins_save_request import PinsSaveRequest
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/pins",
    responses={
        200: {"model": PinsList200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["pins"],
    summary="List Pins",
    response_model_by_alias=True,
)
async def pins_list(
    pin_filter: Annotated[Optional[StrictStr], Field(description="The filter to apply to the pins")] = Query(None, description="The filter to apply to the pins", alias="pin_filter"),
    pin_metrics: Annotated[Optional[StrictBool], Field(description="Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.")] = Query(False, description="Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.", alias="pin_metrics"),
    include_protected_pins: Annotated[Optional[StrictBool], Field(description="Whether to include protected pins in the results")] = Query(False, description="Whether to include protected pins in the results", alias="include_protected_pins"),
    pin_type: Annotated[Optional[StrictStr], Field(description="The type of pins to return, currently only enabled for private pins")] = Query(None, description="The type of pins to return, currently only enabled for private pins", alias="pin_type"),
    creative_types: Annotated[Optional[List[CreativeType]], Field(description="Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.")] = Query(None, description="Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.", alias="creative_types"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "pins:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["boards:read", "pins:read"]
    ),
) -> PinsList200Response:
    """     Get a list of the Pins owned by the \&quot;operation user_account\&quot;.     - By default, the \&quot;operation user_account\&quot; is the token user_account.     - All Pins owned by the \&quot;operation user_account\&quot; are included, regardless of who owns the board they are on.      Optional: Business Access: Specify an &#x60;ad_account_id&#x60; to use the owner of that ad_account as the \&quot;operation user_account\&quot;.      Disclaimer: There are known performance issues when filtering by field &#x60;creative_type&#x60; and including protected pins.     If your request is timing out in this scenario, we encourage you to use [GET List Pins on Board](/docs/api/v5/#operation/boards/list_pins)."""
    if not BasePinsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePinsApi.subclasses[0]().pins_list(pin_filter, pin_metrics, include_protected_pins, pin_type, creative_types, ad_account_id, bookmark, page_size)


@router.post(
    "/pins",
    responses={
        200: {"model": Pin, "description": "The request has succeeded."},
        201: {"model": Pin, "description": "Resource create operation completed successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["pins"],
    summary="Create Pin",
    response_model_by_alias=True,
)
async def pins_create(
    pin_create: PinCreate = Body(None, description=""),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "boards:write", "pins:read", "pins:write"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["boards:read", "boards:write", "pins:read", "pins:write"]
    ),
) -> Pin:
    """  Create a Pin on a board or board section owned by the \&quot;operation user_account\&quot;.   Note: If the current \&quot;operation user_account\&quot; (defined by the access token) has access to another user&#39;s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account&#39;s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id&#x3D;12345&amp;...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called &#39;curated content&#39;, please use our [Save button](/docs/web-features/add-ons-overview/) instead. For more tips on creating fresh content for Pinterest, review our [Content App Solutions Guide](/docs/api-features/content-overview/).  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-image-pins)** about image Pin creation."""
    if not BasePinsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePinsApi.subclasses[0]().pins_create(pin_create, ad_account_id)


@router.get(
    "/pins/{pin_id}",
    responses={
        200: {"model": Pin, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["pins"],
    summary="Get Pin",
    response_model_by_alias=True,
)
async def pins_get(
    pin_id: Annotated[str, Field(strict=True)] = Path(..., description="", regex=r"^\d+$"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    pin_metrics: Annotated[Optional[StrictBool], Field(description="Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.")] = Query(False, description="Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.", alias="pin_metrics"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "pins:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["boards:read", "pins:read"]
    ),
) -> Pin:
    """   Get a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account.   - By default, the \&quot;operation user_account\&quot; is the token user_account.    Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin."""
    if not BasePinsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePinsApi.subclasses[0]().pins_get(pin_id, ad_account_id, pin_metrics)


@router.delete(
    "/pins/{pin_id}",
    responses={
        204: {"description": "Resource deleted successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["pins"],
    summary="Delete Pin",
    response_model_by_alias=True,
)
async def pins_delete(
    pin_id: Annotated[str, Field(strict=True)] = Path(..., description="", regex=r"^\d+$"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "boards:write", "pins:read", "pins:write"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["boards:read", "boards:write", "pins:read", "pins:write"]
    ),
) -> None:
    """   Delete a Pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account.   - By default, the \&quot;operation user_account\&quot; is the token user_account.    Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin."""
    if not BasePinsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePinsApi.subclasses[0]().pins_delete(pin_id, ad_account_id)


@router.patch(
    "/pins/{pin_id}",
    responses={
        200: {"model": Pin, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["pins"],
    summary="Update Pin",
    response_model_by_alias=True,
)
async def pins_update(
    pin_id: Annotated[str, Field(strict=True)] = Path(..., description="", regex=r"^\d+$"),
    pin_update: PinUpdate = Body(None, description=""),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "boards:write", "pins:read", "pins:write"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["boards:read", "boards:write", "pins:read", "pins:write"]
    ),
) -> Pin:
    """Update a pin owned by the \&quot;operating user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**"""
    if not BasePinsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePinsApi.subclasses[0]().pins_update(pin_id, pin_update, ad_account_id)


@router.get(
    "/pins/{pin_id}/analytics",
    responses={
        200: {"model": Dict[str, PinAnalyticsMetricsResponse], "description": "response"},
        400: {"model": Error, "description": "Invalid pins analytics parameters."},
        403: {"model": Error, "description": "Not authorized to access board or Pin."},
        404: {"model": Error, "description": "Pin not found."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["pins"],
    summary="Get Pin analytics",
    response_model_by_alias=True,
)
async def pins_analytics(
    pin_id: Annotated[StrictStr, Field(description="Unique identifier of a Pin.")] = Path(..., description="Unique identifier of a Pin."),
    start_date: Annotated[date, Field(description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")] = Query(None, description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", alias="start_date"),
    end_date: Annotated[date, Field(description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")] = Query(None, description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", alias="end_date"),
    metric_types: Annotated[List[StrictStr], Field(description="Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before <code>2023-03-20</code>, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than <code>NO_SPLIT</code>.")] = Query(None, description="Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt;, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than &lt;code&gt;NO_SPLIT&lt;/code&gt;.", alias="metric_types"),
    app_types: Annotated[Optional[StrictStr], Field(description="Apps or devices to get data for, default is all.")] = Query(ALL, description="Apps or devices to get data for, default is all.", alias="app_types"),
    split_field: Annotated[Optional[StrictStr], Field(description="How to split the data into groups. Not including this param means data won't be split.")] = Query(NO_SPLIT, description="How to split the data into groups. Not including this param means data won&#39;t be split.", alias="split_field"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "pins:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["boards:read", "pins:read"]
    ),
) -> Dict[str, PinAnalyticsMetricsResponse]:
    """Get analytics for a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&quot;/docs/api/v5/#operation/ad_accounts/list\&quot;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then."""
    if not BasePinsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePinsApi.subclasses[0]().pins_analytics(pin_id, start_date, end_date, metric_types, app_types, split_field, ad_account_id)


@router.get(
    "/pins/analytics",
    responses={
        200: {"model": Dict[str, Dict[str, PinAnalyticsMetricsResponse]], "description": "response"},
        400: {"model": Error, "description": "Invalid pins analytics parameters."},
        401: {"model": Error, "description": "Not authorized to access board or Pin."},
        404: {"model": Error, "description": "Pin not found."},
        429: {"model": Error, "description": "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["pins"],
    summary="Get multiple Pin analytics",
    response_model_by_alias=True,
)
async def multi_pins_analytics(
    pin_ids: Annotated[List[Annotated[str, Field(strict=True)]], Field(min_length=1, max_length=100, description="List of Pin IDs.")] = Query(None, description="List of Pin IDs.", alias="pin_ids"),
    start_date: Annotated[date, Field(description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")] = Query(None, description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", alias="start_date"),
    end_date: Annotated[date, Field(description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")] = Query(None, description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", alias="end_date"),
    metric_types: Annotated[List[StrictStr], Field(description="Pin metric types to get data for.")] = Query(None, description="Pin metric types to get data for.", alias="metric_types"),
    app_types: Annotated[Optional[StrictStr], Field(description="Apps or devices to get data for, default is all.")] = Query(ALL, description="Apps or devices to get data for, default is all.", alias="app_types"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "pins:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["boards:read", "pins:read"]
    ),
) -> Dict[str, Dict[str, PinAnalyticsMetricsResponse]]:
    """&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/using-beta-and-restricted-features/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get analytics for multiple pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&quot;/docs/api/v5/#operation/ad_accounts/list\&quot;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then."""
    if not BasePinsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePinsApi.subclasses[0]().multi_pins_analytics(pin_ids, start_date, end_date, metric_types, app_types, ad_account_id)


@router.post(
    "/pins/{pin_id}/save",
    responses={
        201: {"model": Pin, "description": "Successfully saved pin."},
        403: {"model": Error, "description": "Not authorized to access Board or Pin."},
        404: {"model": Error, "description": "Board or Pin not found."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["pins"],
    summary="Save Pin",
    response_model_by_alias=True,
)
async def pins_save(
    pin_id: Annotated[StrictStr, Field(description="Unique identifier of a Pin.")] = Path(..., description="Unique identifier of a Pin."),
    pins_save_request: Annotated[PinsSaveRequest, Field(description="Request object used to save an existing pin")] = Body(None, description="Request object used to save an existing pin"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "boards:write", "pins:read", "pins:write"]
    ),
) -> Pin:
    """Save a Pin on a board or board section owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID."""
    if not BasePinsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePinsApi.subclasses[0]().pins_save(pin_id, pins_save_request, ad_account_id)
