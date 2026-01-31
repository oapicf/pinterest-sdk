import connexion

from app.openapi_server.models.ad_accounts_subscriptions_get_list200_response import AdAccountsSubscriptionsGetList200Response  # noqa: E501
from app.openapi_server.models.lead_subscription import LeadSubscription  # noqa: E501
from app.openapi_server.models.lead_subscription_post_params_create import LeadSubscriptionPostParamsCreate  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from openapi_server import util


def ad_accounts_subscriptions_del_by_id(ad_account_id, subscription_id):  # noqa: E501
    """Delete lead ads subscription

    Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.&#39; # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param subscription_id: Unique identifier of a subscription.
    :type subscription_id: str

    :rtype: None
    """
    return 'do some magic!'


def ad_accounts_subscriptions_get_by_id(ad_account_id, subscription_id):  # noqa: E501
    """Get lead ads subscription by ID

    Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.&#39; # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param subscription_id: Unique identifier of a subscription.
    :type subscription_id: str

    :rtype: LeadSubscription
    """
    return 'do some magic!'


def ad_accounts_subscriptions_get_list(ad_account_id, bookmark=None, page_size=None):  # noqa: E501
    """Get lead ads subscriptions

    Get the advertiser&#39;s list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

    :rtype: AdAccountsSubscriptionsGetList200Response
    """
    return 'do some magic!'


def ad_accounts_subscriptions_post(ad_account_id, body):  # noqa: E501
    """Create lead ads subscription

    Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: LeadSubscription
    """
    if connexion.request.is_json:
        body = LeadSubscriptionPostParamsCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
