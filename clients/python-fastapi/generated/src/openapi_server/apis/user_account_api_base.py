# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

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

class BaseUserAccountApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseUserAccountApi.subclasses = BaseUserAccountApi.subclasses + (cls,)
    async def user_account_get(
        self,
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> Account:
        """Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  [Understanding Business Access]: https://developers.pinterest.com/docs/getting-started/using-business-access/ \&quot;Understanding Business Access\&quot; If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access] for more information."""
        ...


    async def user_account_analytics(
        self,
        start_date: Annotated[date, Field(description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")],
        end_date: Annotated[date, Field(description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")],
        from_claimed_content: Annotated[Optional[StrictStr], Field(description="Filter on Pins that match your claimed domain.")],
        pin_format: Annotated[Optional[StrictStr], Field(description="Pin formats to get data for, default is all.")],
        app_types: Annotated[Optional[StrictStr], Field(description="Apps or devices to get data for, default is all.")],
        content_type: Annotated[Optional[StrictStr], Field(description="Filter to paid or organic data. Default is all.")],
        source: Annotated[Optional[StrictStr], Field(description="Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts")],
        metric_types: Annotated[Optional[List[QuerymetrictypesItems]], Field(description="Metric types to get data for, default is all.")],
        split_field: Annotated[Optional[StrictStr], Field(description="How to split the data into groups. Not including this param means data won't be split.")],
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> Dict[str, AnalyticsMetricsResponse]:
        """Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;."""
        ...


    async def user_account_analytics_top_pins(
        self,
        start_date: Annotated[date, Field(description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")],
        end_date: Annotated[date, Field(description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")],
        sort_by: Annotated[TopPinsSortBy, Field(description="Specify sorting order for metrics")],
        from_claimed_content: Annotated[Optional[StrictStr], Field(description="Filter on Pins that match your claimed domain.")],
        pin_format: Annotated[Optional[StrictStr], Field(description="Pin formats to get data for, default is all.")],
        app_types: Annotated[Optional[StrictStr], Field(description="Apps or devices to get data for, default is all.")],
        content_type: Annotated[Optional[StrictStr], Field(description="Filter to paid or organic data. Default is all.")],
        source: Annotated[Optional[StrictStr], Field(description="Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts")],
        metric_types: Annotated[Optional[List[QuerymetrictypesItems]], Field(description="Metric types to get data for, default is all.")],
        num_of_pins: Annotated[Optional[Annotated[int, Field(le=50, strict=True, ge=1)]], Field(description="Number of pins to include, default is 10. Max is 50.")],
        created_in_last_n_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Get metrics for pins created in the last \"n\" days.")],
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> TopPinsAnalyticsResponse:
        """Gets analytics data about a user&#39;s top pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;."""
        ...


    async def user_account_analytics_top_video_pins(
        self,
        start_date: Annotated[date, Field(description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")],
        end_date: Annotated[date, Field(description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")],
        sort_by: Annotated[TopVideoPinsSortBy, Field(description="Specify sorting order for video metrics")],
        from_claimed_content: Annotated[Optional[StrictStr], Field(description="Filter on Pins that match your claimed domain.")],
        pin_format: Annotated[Optional[StrictStr], Field(description="Pin formats to get data for, default is all.")],
        app_types: Annotated[Optional[StrictStr], Field(description="Apps or devices to get data for, default is all.")],
        content_type: Annotated[Optional[StrictStr], Field(description="Filter to paid or organic data. Default is all.")],
        source: Annotated[Optional[StrictStr], Field(description="Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts")],
        metric_types: Annotated[Optional[List[QueryvideopinmetrictypesItems]], Field(description="Metric types to get video data for, default is all.")],
        num_of_pins: Annotated[Optional[Annotated[int, Field(le=50, strict=True, ge=1)]], Field(description="Number of pins to include, default is 10. Max is 50.")],
        created_in_last_n_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Get metrics for pins created in the last \"n\" days.")],
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> TopVideoPinsAnalyticsResponse:
        """Gets analytics data about a user&#39;s top video pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;."""
        ...


    async def linked_business_accounts_get(
        self,
    ) -> List[LinkedBusiness]:
        """Get a list of your linked business accounts."""
        ...


    async def followers_list(
        self,
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
    ) -> FollowersList200Response:
        """Get a list of your followers."""
        ...


    async def user_following_get(
        self,
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
        explicit_following: Annotated[Optional[StrictBool], Field(description="Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.")],
        feed_type: Annotated[Optional[UserFollowingFeedType], Field(description="Thrift param specifying what type of followees will be kept. Default to include all followees.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
    ) -> FollowersList200Response:
        """Get a list of who a certain user follows."""
        ...


    async def boards_user_follows_list(
        self,
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
        explicit_following: Annotated[Optional[StrictBool], Field(description="Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
    ) -> BoardsList200Response:
        """Get a list of the boards a user follows. The request returns a board summary object array."""
        ...


    async def follow_user_update(
        self,
        username: Annotated[str, Field(strict=True, description="A valid username")],
        follow_user_create: FollowUserCreate,
    ) -> FollowUser:
        """**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Use this request, as a signed-in user, to follow another user."""
        ...


    async def user_websites_get(
        self,
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
    ) -> UserWebsitesGet200Response:
        """Get user websites, claimed or not"""
        ...


    async def verify_website_update(
        self,
        user_website_create: UserWebsiteCreate,
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> UserWebsite:
        """Verify a website as a signed-in user."""
        ...


    async def unverify_website_delete(
        self,
        website: Annotated[StrictStr, Field(description="Website with path or domain only")],
    ) -> UserWebsite:
        """Unverify a website verified by the signed-in user."""
        ...


    async def website_verification_get(
        self,
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> UserWebsiteVerification:
        """Get verification code for user to install on the website to claim it."""
        ...


    async def user_account_followed_interests(
        self,
        username: Annotated[str, Field(strict=True, description="A valid username")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
    ) -> UserAccountFollowedInterests200Response:
        """Get a list of a user&#39;s following interests in one place."""
        ...
