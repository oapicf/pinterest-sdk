import connexion

from app.openapi_server.models.account import Account  # noqa: E501
from app.openapi_server.models.analytics_metrics_response import AnalyticsMetricsResponse  # noqa: E501
from app.openapi_server.models.boards_list200_response import BoardsList200Response  # noqa: E501
from app.openapi_server.models.follow_user import FollowUser  # noqa: E501
from app.openapi_server.models.follow_user_create import FollowUserCreate  # noqa: E501
from app.openapi_server.models.followers_list200_response import FollowersList200Response  # noqa: E501
from app.openapi_server.models.linked_business import LinkedBusiness  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.querymetrictypes_items import QuerymetrictypesItems  # noqa: E501
from app.openapi_server.models.queryvideopinmetrictypes_items import QueryvideopinmetrictypesItems  # noqa: E501
from app.openapi_server.models.top_pins_analytics_response import TopPinsAnalyticsResponse  # noqa: E501
from app.openapi_server.models.top_pins_sort_by import TopPinsSortBy  # noqa: E501
from app.openapi_server.models.top_video_pins_analytics_response import TopVideoPinsAnalyticsResponse  # noqa: E501
from app.openapi_server.models.top_video_pins_sort_by import TopVideoPinsSortBy  # noqa: E501
from app.openapi_server.models.user_account_followed_interests200_response import UserAccountFollowedInterests200Response  # noqa: E501
from app.openapi_server.models.user_following_feed_type import UserFollowingFeedType  # noqa: E501
from app.openapi_server.models.user_website import UserWebsite  # noqa: E501
from app.openapi_server.models.user_website_create import UserWebsiteCreate  # noqa: E501
from app.openapi_server.models.user_website_verification import UserWebsiteVerification  # noqa: E501
from app.openapi_server.models.user_websites_get200_response import UserWebsitesGet200Response  # noqa: E501
from openapi_server import util


def boards_user_follows_list(ad_account_id=None, explicit_following=None, bookmark=None, page_size=None):  # noqa: E501
    """List following boards

    Get a list of the boards a user follows. The request returns a board summary object array. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param explicit_following: Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
    :type explicit_following: bool
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

    :rtype: BoardsList200Response
    """
    return 'do some magic!'


def follow_user_update(username, body):  # noqa: E501
    """Follow user

    **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Use this request, as a signed-in user, to follow another user. # noqa: E501

    :param username: A valid username
    :type username: str
    :param body: 
    :type body: dict | bytes

    :rtype: FollowUser
    """
    if connexion.request.is_json:
        body = FollowUserCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def followers_list(bookmark=None, page_size=None):  # noqa: E501
    """List followers

    Get a list of your followers. # noqa: E501

    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

    :rtype: FollowersList200Response
    """
    return 'do some magic!'


def linked_business_accounts_get():  # noqa: E501
    """List linked businesses

    Get a list of your linked business accounts. # noqa: E501


    :rtype: List[LinkedBusiness]
    """
    return 'do some magic!'


def unverify_website_delete(website):  # noqa: E501
    """Unverify website

    Unverify a website verified by the signed-in user. # noqa: E501

    :param website: Website with path or domain only
    :type website: str

    :rtype: UserWebsite
    """
    return 'do some magic!'


def user_account_analytics(start_date, end_date, from_claimed_content=None, pin_format=None, app_types=None, content_type=None, source=None, metric_types=None, split_field=None, ad_account_id=None):  # noqa: E501
    """Get user account analytics

    Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. # noqa: E501

    :param start_date: Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    :type start_date: str
    :param end_date: Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    :type end_date: str
    :param from_claimed_content: Filter on Pins that match your claimed domain.
    :type from_claimed_content: str
    :param pin_format: Pin formats to get data for, default is all.
    :type pin_format: str
    :param app_types: Apps or devices to get data for, default is all.
    :type app_types: str
    :param content_type: Filter to paid or organic data. Default is all.
    :type content_type: str
    :param source: Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
    :type source: str
    :param metric_types: Metric types to get data for, default is all.
    :type metric_types: list | bytes
    :param split_field: How to split the data into groups. Not including this param means data won&#39;t be split.
    :type split_field: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: Dict[str, AnalyticsMetricsResponse]
    """
    start_date = util.deserialize_date(start_date)
    end_date = util.deserialize_date(end_date)
    if connexion.request.is_json:
        metric_types = [QuerymetrictypesItems.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def user_account_analytics_top_pins(start_date, end_date, sort_by, from_claimed_content=None, pin_format=None, app_types=None, content_type=None, source=None, metric_types=None, num_of_pins=None, created_in_last_n_days=None, ad_account_id=None):  # noqa: E501
    """Get user account top pins analytics

    Gets analytics data about a user&#39;s top pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. # noqa: E501

    :param start_date: Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    :type start_date: str
    :param end_date: Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    :type end_date: str
    :param sort_by: Specify sorting order for metrics
    :type sort_by: dict | bytes
    :param from_claimed_content: Filter on Pins that match your claimed domain.
    :type from_claimed_content: str
    :param pin_format: Pin formats to get data for, default is all.
    :type pin_format: str
    :param app_types: Apps or devices to get data for, default is all.
    :type app_types: str
    :param content_type: Filter to paid or organic data. Default is all.
    :type content_type: str
    :param source: Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
    :type source: str
    :param metric_types: Metric types to get data for, default is all.
    :type metric_types: list | bytes
    :param num_of_pins: Number of pins to include, default is 10. Max is 50.
    :type num_of_pins: int
    :param created_in_last_n_days: Get metrics for pins created in the last \&quot;n\&quot; days.
    :type created_in_last_n_days: 
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: TopPinsAnalyticsResponse
    """
    start_date = util.deserialize_date(start_date)
    end_date = util.deserialize_date(end_date)
    if connexion.request.is_json:
        sort_by = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        metric_types = [QuerymetrictypesItems.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def user_account_analytics_top_video_pins(start_date, end_date, sort_by, from_claimed_content=None, pin_format=None, app_types=None, content_type=None, source=None, metric_types=None, num_of_pins=None, created_in_last_n_days=None, ad_account_id=None):  # noqa: E501
    """Get user account top video pins analytics

    Gets analytics data about a user&#39;s top video pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. # noqa: E501

    :param start_date: Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    :type start_date: str
    :param end_date: Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    :type end_date: str
    :param sort_by: Specify sorting order for video metrics
    :type sort_by: dict | bytes
    :param from_claimed_content: Filter on Pins that match your claimed domain.
    :type from_claimed_content: str
    :param pin_format: Pin formats to get data for, default is all.
    :type pin_format: str
    :param app_types: Apps or devices to get data for, default is all.
    :type app_types: str
    :param content_type: Filter to paid or organic data. Default is all.
    :type content_type: str
    :param source: Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
    :type source: str
    :param metric_types: Metric types to get video data for, default is all.
    :type metric_types: list | bytes
    :param num_of_pins: Number of pins to include, default is 10. Max is 50.
    :type num_of_pins: int
    :param created_in_last_n_days: Get metrics for pins created in the last \&quot;n\&quot; days.
    :type created_in_last_n_days: 
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: TopVideoPinsAnalyticsResponse
    """
    start_date = util.deserialize_date(start_date)
    end_date = util.deserialize_date(end_date)
    if connexion.request.is_json:
        sort_by = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        metric_types = [QueryvideopinmetrictypesItems.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def user_account_followed_interests(username, bookmark=None, page_size=None):  # noqa: E501
    """List following interests

    Get a list of a user&#39;s following interests in one place. # noqa: E501

    :param username: A valid username
    :type username: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

    :rtype: UserAccountFollowedInterests200Response
    """
    return 'do some magic!'


def user_account_get(ad_account_id=None):  # noqa: E501
    """Get user account

    Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  [Understanding Business Access]: https://developers.pinterest.com/docs/getting-started/using-business-access/ \&quot;Understanding Business Access\&quot; If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access] for more information. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: Account
    """
    return 'do some magic!'


def user_following_get(ad_account_id=None, explicit_following=None, feed_type=None, bookmark=None, page_size=None):  # noqa: E501
    """List following

    Get a list of who a certain user follows. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param explicit_following: Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
    :type explicit_following: bool
    :param feed_type: Thrift param specifying what type of followees will be kept. Default to include all followees.
    :type feed_type: dict | bytes
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

    :rtype: FollowersList200Response
    """
    if connexion.request.is_json:
        feed_type = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def user_websites_get(bookmark=None, page_size=None):  # noqa: E501
    """Get user websites

    Get user websites, claimed or not # noqa: E501

    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

    :rtype: UserWebsitesGet200Response
    """
    return 'do some magic!'


def verify_website_update(body, ad_account_id=None):  # noqa: E501
    """Verify website

    Verify a website as a signed-in user. # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: UserWebsite
    """
    if connexion.request.is_json:
        body = UserWebsiteCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def website_verification_get(ad_account_id=None):  # noqa: E501
    """Get user verification code for website claiming

    Get verification code for user to install on the website to claim it. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: UserWebsiteVerification
    """
    return 'do some magic!'
