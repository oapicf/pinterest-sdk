import connexion

from app.openapi_server.models.creative_type import CreativeType  # noqa: E501
from app.openapi_server.models.multi_pins_analytics_metric_types_item import MultiPinsAnalyticsMetricTypesItem  # noqa: E501
from app.openapi_server.models.pin import Pin  # noqa: E501
from app.openapi_server.models.pin_analytics_metrics_response import PinAnalyticsMetricsResponse  # noqa: E501
from app.openapi_server.models.pin_create import PinCreate  # noqa: E501
from app.openapi_server.models.pin_filter import PinFilter  # noqa: E501
from app.openapi_server.models.pin_type import PinType  # noqa: E501
from app.openapi_server.models.pin_update import PinUpdate  # noqa: E501
from app.openapi_server.models.pins_list200_response import PinsList200Response  # noqa: E501
from app.openapi_server.models.pins_save_request_create import PinsSaveRequestCreate  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.querypinanalyticsmetrictypes_items import QuerypinanalyticsmetrictypesItems  # noqa: E501
from openapi_server import util


def multi_pins_analytics(pin_ids, start_date, end_date, metric_types, app_types=None, ad_account_id=None):  # noqa: E501
    """Get multiple Pin analytics

    **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get analytics for multiple pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. # noqa: E501

    :param pin_ids: List of Pin IDs.
    :type pin_ids: List[str]
    :param start_date: Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    :type start_date: str
    :param end_date: Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    :type end_date: str
    :param metric_types: Pin metric types to get data for.
    :type metric_types: list | bytes
    :param app_types: Apps or devices to get data for, default is all.
    :type app_types: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: Dict[str, Dict[str, PinAnalyticsMetricsResponse]]
    """
    start_date = util.deserialize_date(start_date)
    end_date = util.deserialize_date(end_date)
    if connexion.request.is_json:
        metric_types = [MultiPinsAnalyticsMetricTypesItem.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def pins_analytics(pin_id, start_date, end_date, metric_types, app_types=None, split_field=None, ad_account_id=None):  # noqa: E501
    """Get Pin analytics

    Get analytics for a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. # noqa: E501

    :param pin_id: Unique identifier of a Pin.
    :type pin_id: str
    :param start_date: Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    :type start_date: str
    :param end_date: Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    :type end_date: str
    :param metric_types: Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before &#x60;2023-03-20&#x60;, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than &#x60;NO_SPLIT&#x60;.
    :type metric_types: list | bytes
    :param app_types: Apps or devices to get data for, default is all.
    :type app_types: str
    :param split_field: How to split the data into groups. Not including this param means data won&#39;t be split.
    :type split_field: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: Dict[str, PinAnalyticsMetricsResponse]
    """
    start_date = util.deserialize_date(start_date)
    end_date = util.deserialize_date(end_date)
    if connexion.request.is_json:
        metric_types = [QuerypinanalyticsmetrictypesItems.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def pins_create(body, ad_account_id=None):  # noqa: E501
    """Create Pin

     Create a Pin on a board or board section owned by the \&quot;operation user_account\&quot;.   Note: If the current \&quot;operation user_account\&quot; (defined by the access token) has access to another user&#39;s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account&#39;s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id&#x3D;12345&amp;...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called &#39;curated content&#39;, please use our [Save button](/docs/web-features/add-ons-overview/) instead. For more tips on creating fresh content for Pinterest, review our [Content App Solutions Guide](/docs/api-features/content-overview/).  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-image-pins)** about image Pin creation. # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: Pin
    """
    if connexion.request.is_json:
        body = PinCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def pins_delete(pin_id, ad_account_id=None):  # noqa: E501
    """Delete Pin

      Delete a Pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account.   - By default, the \&quot;operation user_account\&quot; is the token user_account.    Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin. # noqa: E501

    :param pin_id: 
    :type pin_id: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: Pin
    """
    return 'do some magic!'


def pins_get(pin_id, ad_account_id=None, pin_metrics=None):  # noqa: E501
    """Get Pin

      Get a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account.   - By default, the \&quot;operation user_account\&quot; is the token user_account.    Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin. # noqa: E501

    :param pin_id: 
    :type pin_id: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param pin_metrics: Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
    :type pin_metrics: bool

    :rtype: Pin
    """
    return 'do some magic!'


def pins_list(pin_filter=None, pin_metrics=None, include_protected_pins=None, pin_type=None, creative_types=None, ad_account_id=None, domain=None, domains=None, include_product_tag_obj=None, bookmark=None, page_size=None):  # noqa: E501
    """List Pins

        Get a list of the Pins owned by the \&quot;operation user_account\&quot;.     - By default, the \&quot;operation user_account\&quot; is the token user_account.     - All Pins owned by the \&quot;operation user_account\&quot; are included, regardless of who owns the board they are on.      Optional: Business Access: Specify an &#x60;ad_account_id&#x60; to use the owner of that ad_account as the \&quot;operation user_account\&quot;.      Disclaimer: There are known performance issues when filtering by field &#x60;creative_type&#x60; and including protected pins.     If your request is timing out in this scenario, we encourage you to use [GET List Pins on Board](/docs/api/v5/#operation/boards/list_pins). # noqa: E501

    :param pin_filter: The filter to apply to the pins
    :type pin_filter: dict | bytes
    :param pin_metrics: Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
    :type pin_metrics: bool
    :param include_protected_pins: Whether to include protected pins in the results
    :type include_protected_pins: bool
    :param pin_type: The type of pins to return, currently only enabled for private pins
    :type pin_type: dict | bytes
    :param creative_types: Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
    :type creative_types: list | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param domain: Only return pins with links that match the exact domain. Domain should not include &#39;www.&#39; prefix. For example, &#39;pinterest.com&#39; is a valid domain, but &#39;www.pinterest.com&#39; is not (will not match any pins).
    :type domain: str
    :param domains: Only return pins with links whose domain matches any value in the list. Values are joined comma-separated on the wire (e.g. &#x60;?domains&#x3D;instagram.com,jcpenney.com&#x60;).
    :type domains: List[str]
    :param include_product_tag_obj: Include product tag objects in the response with their associated links.
    :type include_product_tag_obj: bool
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

    :rtype: PinsList200Response
    """
    if connexion.request.is_json:
        pin_filter = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        pin_type = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        creative_types = [CreativeType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def pins_save(pin_id, body, ad_account_id=None):  # noqa: E501
    """Save Pin

    Save a Pin on a board or board section owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID. # noqa: E501

    :param pin_id: Unique identifier of a Pin.
    :type pin_id: str
    :param body: 
    :type body: dict | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: Pin
    """
    if connexion.request.is_json:
        body = PinsSaveRequestCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def pins_update(pin_id, body, ad_account_id=None):  # noqa: E501
    """Update Pin

    Update a pin owned by the \&quot;operating user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).** # noqa: E501

    :param pin_id: 
    :type pin_id: str
    :param body: 
    :type body: dict | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: Pin
    """
    if connexion.request.is_json:
        body = PinUpdate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
