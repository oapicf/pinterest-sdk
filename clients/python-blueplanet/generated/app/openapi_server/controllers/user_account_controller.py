import connexion

from app.openapi_server.models.account import Account  # noqa: E501
from app.openapi_server.models.analytics_metrics_response import AnalyticsMetricsResponse  # noqa: E501
from app.openapi_server.models.boards_user_follows_list200_response import BoardsUserFollowsList200Response  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.follow_user_request import FollowUserRequest  # noqa: E501
from app.openapi_server.models.followers_list200_response import FollowersList200Response  # noqa: E501
from app.openapi_server.models.linked_business import LinkedBusiness  # noqa: E501
from app.openapi_server.models.top_pins_analytics_response import TopPinsAnalyticsResponse  # noqa: E501
from app.openapi_server.models.top_video_pins_analytics_response import TopVideoPinsAnalyticsResponse  # noqa: E501
from app.openapi_server.models.user_account_followed_interests200_response import UserAccountFollowedInterests200Response  # noqa: E501
from app.openapi_server.models.user_following_feed_type import UserFollowingFeedType  # noqa: E501
from app.openapi_server.models.user_following_get200_response import UserFollowingGet200Response  # noqa: E501
from app.openapi_server.models.user_summary import UserSummary  # noqa: E501
from app.openapi_server.models.user_website_summary import UserWebsiteSummary  # noqa: E501
from app.openapi_server.models.user_website_verification_code import UserWebsiteVerificationCode  # noqa: E501
from app.openapi_server.models.user_website_verify_request import UserWebsiteVerifyRequest  # noqa: E501
from app.openapi_server.models.user_websites_get200_response import UserWebsitesGet200Response  # noqa: E501
from openapi_server import util


def boards_user_follows_list(bookmark=None, page_size=None, explicit_following=None, ad_account_id=None):  # noqa: E501
    """List following boards

    Get a list of the boards a user follows. The request returns a board summary object array. # noqa: E501

    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    :type page_size: int
    :param explicit_following: Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
    :type explicit_following: bool
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: BoardsUserFollowsList200Response
    """
    return 'do some magic!'


def follow_user_update(username, body):  # noqa: E501
    """Follow user

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/using-beta-and-restricted-features/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Use this request, as a signed-in user, to follow another user. # noqa: E501

    :param username: A valid username
    :type username: str
    :param body: Follow a user.
    :type body: dict | bytes

    :rtype: UserSummary
    """
    if connexion.request.is_json:
        body = FollowUserRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def followers_list(bookmark=None, page_size=None):  # noqa: E501
    """List followers

    Get a list of your followers. # noqa: E501

    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
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

    Unverifu a website verified by the signed-in user. # noqa: E501

    :param website: Website with path or domain only
    :type website: str

    :rtype: None
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
    :type metric_types: List[str]
    :param split_field: How to split the data into groups. Not including this param means data won&#39;t be split.
    :type split_field: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: Dict[str, AnalyticsMetricsResponse]
    """
    start_date = util.deserialize_date(start_date)
    end_date = util.deserialize_date(end_date)
    return 'do some magic!'


def user_account_analytics_top_pins(start_date, end_date, sort_by, from_claimed_content=None, pin_format=None, app_types=None, content_type=None, source=None, metric_types=None, num_of_pins=None, created_in_last_n_days=None, ad_account_id=None):  # noqa: E501
    """Get user account top pins analytics

    Gets analytics data about a user&#39;s top pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. # noqa: E501

    :param start_date: Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    :type start_date: str
    :param end_date: Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    :type end_date: str
    :param sort_by: Specify sorting order for metrics
    :type sort_by: str
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
    :type metric_types: List[str]
    :param num_of_pins: Number of pins to include, default is 10. Max is 50.
    :type num_of_pins: int
    :param created_in_last_n_days: Get metrics for pins created in the last \&quot;n\&quot; days.
    :type created_in_last_n_days: int
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: TopPinsAnalyticsResponse
    """
    start_date = util.deserialize_date(start_date)
    end_date = util.deserialize_date(end_date)
    return 'do some magic!'


def user_account_analytics_top_video_pins(start_date, end_date, sort_by, from_claimed_content=None, pin_format=None, app_types=None, content_type=None, source=None, metric_types=None, num_of_pins=None, created_in_last_n_days=None, ad_account_id=None):  # noqa: E501
    """Get user account top video pins analytics

    Gets analytics data about a user&#39;s top video pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. # noqa: E501

    :param start_date: Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    :type start_date: str
    :param end_date: Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    :type end_date: str
    :param sort_by: Specify sorting order for video metrics
    :type sort_by: str
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
    :type metric_types: List[str]
    :param num_of_pins: Number of pins to include, default is 10. Max is 50.
    :type num_of_pins: int
    :param created_in_last_n_days: Get metrics for pins created in the last \&quot;n\&quot; days.
    :type created_in_last_n_days: int
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: TopVideoPinsAnalyticsResponse
    """
    start_date = util.deserialize_date(start_date)
    end_date = util.deserialize_date(end_date)
    return 'do some magic!'


def user_account_followed_interests(username, bookmark=None, page_size=None):  # noqa: E501
    """List following interests

    Get a list of a user&#39;s following interests in one place. # noqa: E501

    :param username: A valid username
    :type username: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    :type page_size: int

    :rtype: UserAccountFollowedInterests200Response
    """
    return 'do some magic!'


def user_account_get(ad_account_id=None):  # noqa: E501
    """Get user account

    Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/getting-started/using-business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: Account
    """
    return 'do some magic!'


def user_following_get(bookmark=None, page_size=None, feed_type=None, explicit_following=None, ad_account_id=None):  # noqa: E501
    """List following

    Get a list of who a certain user follows. # noqa: E501

    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    :type page_size: int
    :param feed_type: Thrift param specifying what type of followees will be kept. Default to include all followees.
    :type feed_type: str
    :param explicit_following: Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
    :type explicit_following: bool
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: UserFollowingGet200Response
    """
    return 'do some magic!'


def user_websites_get(bookmark=None, page_size=None):  # noqa: E501
    """Get user websites

    Get user websites, claimed or not # noqa: E501

    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    :type page_size: int

    :rtype: UserWebsitesGet200Response
    """
    return 'do some magic!'


def verify_website_update(body, ad_account_id=None):  # noqa: E501
    """Verify website

    Verify a website as a signed-in user. # noqa: E501

    :param body: Verify a website.
    :type body: dict | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: UserWebsiteSummary
    """
    if connexion.request.is_json:
        body = UserWebsiteVerifyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def website_verification_get(ad_account_id=None):  # noqa: E501
    """Get user verification code for website claiming

    Get verification code for user to install on the website to claim it. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: UserWebsiteVerificationCode
    """
    return 'do some magic!'
