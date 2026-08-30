# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.user_account_api_base import BaseUserAccountApi
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
from pydantic import Field, StrictBool, StrictFloat, StrictInt, StrictStr, field_validator
from typing import Any, Dict, List, Optional, Union
from typing_extensions import Annotated
from openapi_server.models.account import Account
from openapi_server.models.analytics_metrics_response import AnalyticsMetricsResponse
from openapi_server.models.boards_list200_response import BoardsList200Response
from openapi_server.models.follow_user import FollowUser
from openapi_server.models.follow_user_create import FollowUserCreate
from openapi_server.models.followers_list200_response import FollowersList200Response
from openapi_server.models.linked_business import LinkedBusiness
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.querymetrictypes_items import QuerymetrictypesItems
from openapi_server.models.queryvideopinmetrictypes_items import QueryvideopinmetrictypesItems
from openapi_server.models.top_pins_analytics_response import TopPinsAnalyticsResponse
from openapi_server.models.top_pins_sort_by import TopPinsSortBy
from openapi_server.models.top_video_pins_analytics_response import TopVideoPinsAnalyticsResponse
from openapi_server.models.top_video_pins_sort_by import TopVideoPinsSortBy
from openapi_server.models.user_account_followed_interests200_response import UserAccountFollowedInterests200Response
from openapi_server.models.user_following_feed_type import UserFollowingFeedType
from openapi_server.models.user_website import UserWebsite
from openapi_server.models.user_website_create import UserWebsiteCreate
from openapi_server.models.user_website_verification import UserWebsiteVerification
from openapi_server.models.user_websites_get200_response import UserWebsitesGet200Response
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/user_account",
    responses={
        200: {"model": Account, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["user_account"],
    summary="Get user account",
    response_model_by_alias=True,
)
async def user_account_get(
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["user_accounts:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["user_accounts:read"]
    ),
) -> Account:
    """Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  [Understanding Business Access]: https://developers.pinterest.com/docs/getting-started/using-business-access/ \&quot;Understanding Business Access\&quot; If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access] for more information."""
    if not BaseUserAccountApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUserAccountApi.subclasses[0]().user_account_get(ad_account_id)


@router.get(
    "/user_account/analytics",
    responses={
        200: {"model": Dict[str, AnalyticsMetricsResponse], "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["user_account"],
    summary="Get user account analytics",
    response_model_by_alias=True,
)
async def user_account_analytics(
    start_date: Annotated[date, Field(description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")] = Query(None, description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", alias="start_date"),
    end_date: Annotated[date, Field(description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")] = Query(None, description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", alias="end_date"),
    from_claimed_content: Annotated[Optional[StrictStr], Field(description="Filter on Pins that match your claimed domain.")] = Query('BOTH', description="Filter on Pins that match your claimed domain.", alias="from_claimed_content"),
    pin_format: Annotated[Optional[StrictStr], Field(description="Pin formats to get data for, default is all.")] = Query('ALL', description="Pin formats to get data for, default is all.", alias="pin_format"),
    app_types: Annotated[Optional[StrictStr], Field(description="Apps or devices to get data for, default is all.")] = Query('ALL', description="Apps or devices to get data for, default is all.", alias="app_types"),
    content_type: Annotated[Optional[StrictStr], Field(description="Filter to paid or organic data. Default is all.")] = Query('ALL', description="Filter to paid or organic data. Default is all.", alias="content_type"),
    source: Annotated[Optional[StrictStr], Field(description="Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts")] = Query('ALL', description="Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts", alias="source"),
    metric_types: Annotated[Optional[List[QuerymetrictypesItems]], Field(description="Metric types to get data for, default is all.")] = Query(None, description="Metric types to get data for, default is all.", alias="metric_types"),
    split_field: Annotated[Optional[StrictStr], Field(description="How to split the data into groups. Not including this param means data won't be split.")] = Query('NO_SPLIT', description="How to split the data into groups. Not including this param means data won&#39;t be split.", alias="split_field"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["user_accounts:read"]
    ),
) -> Dict[str, AnalyticsMetricsResponse]:
    """Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;."""
    if not BaseUserAccountApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUserAccountApi.subclasses[0]().user_account_analytics(start_date, end_date, from_claimed_content, pin_format, app_types, content_type, source, metric_types, split_field, ad_account_id)


@router.get(
    "/user_account/analytics/top_pins",
    responses={
        200: {"model": TopPinsAnalyticsResponse, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["user_account"],
    summary="Get user account top pins analytics",
    response_model_by_alias=True,
)
async def user_account_analytics_top_pins(
    start_date: Annotated[date, Field(description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")] = Query(None, description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", alias="start_date"),
    end_date: Annotated[date, Field(description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")] = Query(None, description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", alias="end_date"),
    sort_by: Annotated[TopPinsSortBy, Field(description="Specify sorting order for metrics")] = Query(None, description="Specify sorting order for metrics", alias="sort_by"),
    from_claimed_content: Annotated[Optional[StrictStr], Field(description="Filter on Pins that match your claimed domain.")] = Query('BOTH', description="Filter on Pins that match your claimed domain.", alias="from_claimed_content"),
    pin_format: Annotated[Optional[StrictStr], Field(description="Pin formats to get data for, default is all.")] = Query('ALL', description="Pin formats to get data for, default is all.", alias="pin_format"),
    app_types: Annotated[Optional[StrictStr], Field(description="Apps or devices to get data for, default is all.")] = Query('ALL', description="Apps or devices to get data for, default is all.", alias="app_types"),
    content_type: Annotated[Optional[StrictStr], Field(description="Filter to paid or organic data. Default is all.")] = Query('ALL', description="Filter to paid or organic data. Default is all.", alias="content_type"),
    source: Annotated[Optional[StrictStr], Field(description="Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts")] = Query('ALL', description="Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts", alias="source"),
    metric_types: Annotated[Optional[List[QuerymetrictypesItems]], Field(description="Metric types to get data for, default is all.")] = Query(None, description="Metric types to get data for, default is all.", alias="metric_types"),
    num_of_pins: Annotated[Optional[Annotated[int, Field(le=50, strict=True, ge=1)]], Field(description="Number of pins to include, default is 10. Max is 50.")] = Query(10, description="Number of pins to include, default is 10. Max is 50.", alias="num_of_pins", ge=1, le=50),
    created_in_last_n_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Get metrics for pins created in the last \"n\" days.")] = Query(None, description="Get metrics for pins created in the last \&quot;n\&quot; days.", alias="created_in_last_n_days"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["pins:read", "user_accounts:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["pins:read", "user_accounts:read"]
    ),
) -> TopPinsAnalyticsResponse:
    """Gets analytics data about a user&#39;s top pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;."""
    if not BaseUserAccountApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUserAccountApi.subclasses[0]().user_account_analytics_top_pins(start_date, end_date, sort_by, from_claimed_content, pin_format, app_types, content_type, source, metric_types, num_of_pins, created_in_last_n_days, ad_account_id)


@router.get(
    "/user_account/analytics/top_video_pins",
    responses={
        200: {"model": TopVideoPinsAnalyticsResponse, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["user_account"],
    summary="Get user account top video pins analytics",
    response_model_by_alias=True,
)
async def user_account_analytics_top_video_pins(
    start_date: Annotated[date, Field(description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")] = Query(None, description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", alias="start_date"),
    end_date: Annotated[date, Field(description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")] = Query(None, description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", alias="end_date"),
    sort_by: Annotated[TopVideoPinsSortBy, Field(description="Specify sorting order for video metrics")] = Query(None, description="Specify sorting order for video metrics", alias="sort_by"),
    from_claimed_content: Annotated[Optional[StrictStr], Field(description="Filter on Pins that match your claimed domain.")] = Query('BOTH', description="Filter on Pins that match your claimed domain.", alias="from_claimed_content"),
    pin_format: Annotated[Optional[StrictStr], Field(description="Pin formats to get data for, default is all.")] = Query('ALL', description="Pin formats to get data for, default is all.", alias="pin_format"),
    app_types: Annotated[Optional[StrictStr], Field(description="Apps or devices to get data for, default is all.")] = Query('ALL', description="Apps or devices to get data for, default is all.", alias="app_types"),
    content_type: Annotated[Optional[StrictStr], Field(description="Filter to paid or organic data. Default is all.")] = Query('ALL', description="Filter to paid or organic data. Default is all.", alias="content_type"),
    source: Annotated[Optional[StrictStr], Field(description="Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts")] = Query('ALL', description="Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts", alias="source"),
    metric_types: Annotated[Optional[List[QueryvideopinmetrictypesItems]], Field(description="Metric types to get video data for, default is all.")] = Query(None, description="Metric types to get video data for, default is all.", alias="metric_types"),
    num_of_pins: Annotated[Optional[Annotated[int, Field(le=50, strict=True, ge=1)]], Field(description="Number of pins to include, default is 10. Max is 50.")] = Query(10, description="Number of pins to include, default is 10. Max is 50.", alias="num_of_pins", ge=1, le=50),
    created_in_last_n_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Get metrics for pins created in the last \"n\" days.")] = Query(None, description="Get metrics for pins created in the last \&quot;n\&quot; days.", alias="created_in_last_n_days"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["pins:read", "user_accounts:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["pins:read", "user_accounts:read"]
    ),
) -> TopVideoPinsAnalyticsResponse:
    """Gets analytics data about a user&#39;s top video pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;."""
    if not BaseUserAccountApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUserAccountApi.subclasses[0]().user_account_analytics_top_video_pins(start_date, end_date, sort_by, from_claimed_content, pin_format, app_types, content_type, source, metric_types, num_of_pins, created_in_last_n_days, ad_account_id)


@router.get(
    "/user_account/businesses",
    responses={
        200: {"model": List[LinkedBusiness], "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["user_account"],
    summary="List linked businesses",
    response_model_by_alias=True,
)
async def linked_business_accounts_get(
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["user_accounts:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["user_accounts:read"]
    ),
) -> List[LinkedBusiness]:
    """Get a list of your linked business accounts."""
    if not BaseUserAccountApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUserAccountApi.subclasses[0]().linked_business_accounts_get()


@router.get(
    "/user_account/followers",
    responses={
        200: {"model": FollowersList200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["user_account"],
    summary="List followers",
    response_model_by_alias=True,
)
async def followers_list(
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["user_accounts:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["user_accounts:read"]
    ),
) -> FollowersList200Response:
    """Get a list of your followers."""
    if not BaseUserAccountApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUserAccountApi.subclasses[0]().followers_list(bookmark, page_size)


@router.get(
    "/user_account/following",
    responses={
        200: {"model": FollowersList200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["user_account"],
    summary="List following",
    response_model_by_alias=True,
)
async def user_following_get(
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    explicit_following: Annotated[Optional[StrictBool], Field(description="Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.")] = Query(False, description="Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.", alias="explicit_following"),
    feed_type: Annotated[Optional[UserFollowingFeedType], Field(description="Thrift param specifying what type of followees will be kept. Default to include all followees.")] = Query('ALL', description="Thrift param specifying what type of followees will be kept. Default to include all followees.", alias="feed_type"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["user_accounts:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["user_accounts:read"]
    ),
) -> FollowersList200Response:
    """Get a list of who a certain user follows."""
    if not BaseUserAccountApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUserAccountApi.subclasses[0]().user_following_get(ad_account_id, explicit_following, feed_type, bookmark, page_size)


@router.get(
    "/user_account/following/boards",
    responses={
        200: {"model": BoardsList200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["user_account"],
    summary="List following boards",
    response_model_by_alias=True,
)
async def boards_user_follows_list(
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    explicit_following: Annotated[Optional[StrictBool], Field(description="Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.")] = Query(False, description="Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.", alias="explicit_following"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["user_accounts:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["user_accounts:read"]
    ),
) -> BoardsList200Response:
    """Get a list of the boards a user follows. The request returns a board summary object array."""
    if not BaseUserAccountApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUserAccountApi.subclasses[0]().boards_user_follows_list(ad_account_id, explicit_following, bookmark, page_size)


@router.post(
    "/user_account/following/{username}",
    responses={
        200: {"model": FollowUser, "description": "The request has succeeded."},
        201: {"model": FollowUser, "description": "Resource create operation completed successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["user_account"],
    summary="Follow user",
    response_model_by_alias=True,
)
async def follow_user_update(
    username: Annotated[str, Field(strict=True, description="A valid username")] = Path(..., description="A valid username", regex=r"(?!^\d+$)^.+$"),
    follow_user_create: FollowUserCreate = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["user_accounts:write"]
    ),
) -> FollowUser:
    """**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Use this request, as a signed-in user, to follow another user."""
    if not BaseUserAccountApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUserAccountApi.subclasses[0]().follow_user_update(username, follow_user_create)


@router.get(
    "/user_account/websites",
    responses={
        200: {"model": UserWebsitesGet200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["user_account"],
    summary="Get user websites",
    response_model_by_alias=True,
)
async def user_websites_get(
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["user_accounts:read"]
    ),
) -> UserWebsitesGet200Response:
    """Get user websites, claimed or not"""
    if not BaseUserAccountApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUserAccountApi.subclasses[0]().user_websites_get(bookmark, page_size)


@router.post(
    "/user_account/websites",
    responses={
        200: {"model": UserWebsite, "description": "The request has succeeded."},
        201: {"model": UserWebsite, "description": "Resource create operation completed successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["user_account"],
    summary="Verify website",
    response_model_by_alias=True,
)
async def verify_website_update(
    user_website_create: UserWebsiteCreate = Body(None, description=""),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["user_accounts:write"]
    ),
) -> UserWebsite:
    """Verify a website as a signed-in user."""
    if not BaseUserAccountApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUserAccountApi.subclasses[0]().verify_website_update(user_website_create, ad_account_id)


@router.delete(
    "/user_account/websites",
    responses={
        200: {"model": UserWebsite, "description": "The request has succeeded."},
        204: {"description": "Resource deleted successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["user_account"],
    summary="Unverify website",
    response_model_by_alias=True,
)
async def unverify_website_delete(
    website: Annotated[StrictStr, Field(description="Website with path or domain only")] = Query(None, description="Website with path or domain only", alias="website"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["user_accounts:write"]
    ),
) -> UserWebsite:
    """Unverify a website verified by the signed-in user."""
    if not BaseUserAccountApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUserAccountApi.subclasses[0]().unverify_website_delete(website)


@router.get(
    "/user_account/websites/verification",
    responses={
        200: {"model": UserWebsiteVerification, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["user_account"],
    summary="Get user verification code for website claiming",
    response_model_by_alias=True,
)
async def website_verification_get(
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["user_accounts:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["user_accounts:read"]
    ),
) -> UserWebsiteVerification:
    """Get verification code for user to install on the website to claim it."""
    if not BaseUserAccountApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUserAccountApi.subclasses[0]().website_verification_get(ad_account_id)


@router.get(
    "/users/{username}/interests/follow",
    responses={
        200: {"model": UserAccountFollowedInterests200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The server could not understand the request due to invalid syntax."},
        401: {"model": PinterestLibError, "description": "Access is unauthorized."},
        404: {"model": PinterestLibError, "description": "The server cannot find the requested resource."},
        "default": {"model": PinterestLibError, "description": "Unexpected error"},
    },
    tags=["user_account"],
    summary="List following interests",
    response_model_by_alias=True,
)
async def user_account_followed_interests(
    username: Annotated[str, Field(strict=True, description="A valid username")] = Path(..., description="A valid username", regex=r"(?!^\d+$)^.+$"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["user_accounts:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["user_accounts:read"]
    ),
) -> UserAccountFollowedInterests200Response:
    """Get a list of a user&#39;s following interests in one place."""
    if not BaseUserAccountApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUserAccountApi.subclasses[0]().user_account_followed_interests(username, bookmark, page_size)
