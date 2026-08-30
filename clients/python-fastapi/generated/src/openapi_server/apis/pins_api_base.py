# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from datetime import date
from pydantic import Field, StrictBool, StrictStr, field_validator
from typing import Any, Dict, List, Optional
from typing_extensions import Annotated
from openapi_server.models.creative_type import CreativeType
from openapi_server.models.multi_pins_analytics_metric_types_item import MultiPinsAnalyticsMetricTypesItem
from openapi_server.models.pin import Pin
from openapi_server.models.pin_analytics_metrics_response import PinAnalyticsMetricsResponse
from openapi_server.models.pin_create import PinCreate
from openapi_server.models.pin_filter import PinFilter
from openapi_server.models.pin_type import PinType
from openapi_server.models.pin_update import PinUpdate
from openapi_server.models.pins_list200_response import PinsList200Response
from openapi_server.models.pins_save_request_create import PinsSaveRequestCreate
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.querypinanalyticsmetrictypes_items import QuerypinanalyticsmetrictypesItems
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

class BasePinsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BasePinsApi.subclasses = BasePinsApi.subclasses + (cls,)
    async def pins_list(
        self,
        pin_filter: Annotated[Optional[PinFilter], Field(description="The filter to apply to the pins")],
        pin_metrics: Annotated[Optional[StrictBool], Field(description="Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.")],
        include_protected_pins: Annotated[Optional[StrictBool], Field(description="Whether to include protected pins in the results")],
        pin_type: Annotated[Optional[PinType], Field(description="The type of pins to return, currently only enabled for private pins")],
        creative_types: Annotated[Optional[List[CreativeType]], Field(description="Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.")],
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
        domain: Annotated[Optional[StrictStr], Field(description="Only return pins with links that match the exact domain. Domain should not include 'www.' prefix. For example, 'pinterest.com' is a valid domain, but 'www.pinterest.com' is not (will not match any pins).")],
        domains: Annotated[Optional[Annotated[List[StrictStr], Field(min_length=1, max_length=100)]], Field(description="Only return pins with links whose domain matches any value in the list. Values are joined comma-separated on the wire (e.g. `?domains=instagram.com,jcpenney.com`).")],
        include_product_tag_obj: Annotated[Optional[StrictBool], Field(description="Include product tag objects in the response with their associated links.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
    ) -> PinsList200Response:
        """    Get a list of the Pins owned by the \&quot;operation user_account\&quot;.     - By default, the \&quot;operation user_account\&quot; is the token user_account.     - All Pins owned by the \&quot;operation user_account\&quot; are included, regardless of who owns the board they are on.      Optional: Business Access: Specify an &#x60;ad_account_id&#x60; to use the owner of that ad_account as the \&quot;operation user_account\&quot;.      Disclaimer: There are known performance issues when filtering by field &#x60;creative_type&#x60; and including protected pins.     If your request is timing out in this scenario, we encourage you to use [GET List Pins on Board](/docs/api/v5/#operation/boards/list_pins)."""
        ...


    async def pins_create(
        self,
        pin_create: PinCreate,
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> Pin:
        """ Create a Pin on a board or board section owned by the \&quot;operation user_account\&quot;.   Note: If the current \&quot;operation user_account\&quot; (defined by the access token) has access to another user&#39;s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account&#39;s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id&#x3D;12345&amp;...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called &#39;curated content&#39;, please use our [Save button](/docs/web-features/add-ons-overview/) instead. For more tips on creating fresh content for Pinterest, review our [Content App Solutions Guide](/docs/api-features/content-overview/).  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-image-pins)** about image Pin creation."""
        ...


    async def multi_pins_analytics(
        self,
        pin_ids: Annotated[List[Annotated[str, Field(strict=True)]], Field(min_length=1, max_length=100, description="List of Pin IDs.")],
        start_date: Annotated[date, Field(description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")],
        end_date: Annotated[date, Field(description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")],
        metric_types: Annotated[List[MultiPinsAnalyticsMetricTypesItem], Field(description="Pin metric types to get data for.")],
        app_types: Annotated[Optional[StrictStr], Field(description="Apps or devices to get data for, default is all.")],
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> Dict[str, Dict[str, PinAnalyticsMetricsResponse]]:
        """**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get analytics for multiple pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then."""
        ...


    async def pins_get(
        self,
        pin_id: Annotated[str, Field(strict=True)],
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
        pin_metrics: Annotated[Optional[StrictBool], Field(description="Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.")],
    ) -> Pin:
        """  Get a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account.   - By default, the \&quot;operation user_account\&quot; is the token user_account.    Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin."""
        ...


    async def pins_delete(
        self,
        pin_id: Annotated[str, Field(strict=True)],
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> Pin:
        """  Delete a Pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account.   - By default, the \&quot;operation user_account\&quot; is the token user_account.    Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin."""
        ...


    async def pins_update(
        self,
        pin_id: Annotated[str, Field(strict=True)],
        pin_update: PinUpdate,
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> Pin:
        """Update a pin owned by the \&quot;operating user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**"""
        ...


    async def pins_analytics(
        self,
        pin_id: Annotated[StrictStr, Field(description="Unique identifier of a Pin.")],
        start_date: Annotated[date, Field(description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")],
        end_date: Annotated[date, Field(description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")],
        metric_types: Annotated[List[QuerypinanalyticsmetrictypesItems], Field(description="Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before `2023-03-20`, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than `NO_SPLIT`.")],
        app_types: Annotated[Optional[StrictStr], Field(description="Apps or devices to get data for, default is all.")],
        split_field: Annotated[Optional[StrictStr], Field(description="How to split the data into groups. Not including this param means data won't be split.")],
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> Dict[str, PinAnalyticsMetricsResponse]:
        """Get analytics for a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then."""
        ...


    async def pins_save(
        self,
        pin_id: Annotated[StrictStr, Field(description="Unique identifier of a Pin.")],
        pins_save_request_create: PinsSaveRequestCreate,
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> Pin:
        """Save a Pin on a board or board section owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID."""
        ...
