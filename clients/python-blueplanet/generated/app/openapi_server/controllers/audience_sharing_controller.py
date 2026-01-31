import connexion

from app.openapi_server.models.ad_accounts_audiences_shared_accounts_list200_response import AdAccountsAudiencesSharedAccountsList200Response  # noqa: E501
from app.openapi_server.models.audience_account_type import AudienceAccountType  # noqa: E501
from app.openapi_server.models.audiences_list200_response import AudiencesList200Response  # noqa: E501
from app.openapi_server.models.business_shared_audience import BusinessSharedAudience  # noqa: E501
from app.openapi_server.models.business_shared_audience_response import BusinessSharedAudienceResponse  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.shared_audience import SharedAudience  # noqa: E501
from app.openapi_server.models.shared_audience_response import SharedAudienceResponse  # noqa: E501
from openapi_server import util


def ad_accounts_audiences_shared_accounts_list(ad_account_id, audience_id, account_type, page_size=None, bookmark=None):  # noqa: E501
    """List accounts with access to an audience owned by an ad account

    List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param audience_id: Unique identifier of the audience to use to filter the results.
    :type audience_id: str
    :param account_type: Filter accounts by account type.
    :type account_type: dict | bytes
    :param page_size: Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    :type page_size: int
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str

    :rtype: AdAccountsAudiencesSharedAccountsList200Response
    """
    if connexion.request.is_json:
        account_type = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def business_account_audiences_shared_accounts_list(business_id, audience_id, account_type, page_size=None, bookmark=None):  # noqa: E501
    """List accounts with access to an audience owned by a business

    List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned. # noqa: E501

    :param business_id: Unique identifier of the requesting business.
    :type business_id: str
    :param audience_id: Unique identifier of the audience to use to filter the results.
    :type audience_id: str
    :param account_type: Filter accounts by account type.
    :type account_type: dict | bytes
    :param page_size: Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    :type page_size: int
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str

    :rtype: AdAccountsAudiencesSharedAccountsList200Response
    """
    if connexion.request.is_json:
        account_type = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def shared_audiences_for_business_list(business_id, bookmark=None, order=None, page_size=None):  # noqa: E501
    """List received audiences for a business

    Get a list of received audiences for the given business. # noqa: E501

    :param business_id: Unique identifier of the requesting business.
    :type business_id: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param order: The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
    :type order: str
    :param page_size: Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    :type page_size: int

    :rtype: AudiencesList200Response
    """
    return 'do some magic!'


def update_ad_account_to_ad_account_shared_audience(ad_account_id, body):  # noqa: E501
    """Update audience sharing between ad accounts

    From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/create-and-manage-accounts&#39;&gt;Pinterest Business Hierarchy&lt;/a&gt; as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/using-beta-and-restricted-features/&#39;&gt;Learn more&lt;/a&gt;. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: SharedAudienceResponse
    """
    if connexion.request.is_json:
        body = SharedAudience.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_ad_account_to_business_shared_audience(ad_account_id, body):  # noqa: E501
    """Update audience sharing from an ad account to businesses

    From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/using-beta-and-restricted-features/&#39;&gt;Learn more&lt;/a&gt;. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: BusinessSharedAudienceResponse
    """
    if connexion.request.is_json:
        body = BusinessSharedAudience.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_business_to_ad_account_shared_audience(business_id, body):  # noqa: E501
    """Update audience sharing from a business to ad accounts

    From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. &lt;ul&gt; &lt;li&gt;If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.&lt;/li&gt; &lt;li&gt;If the business is the recipient of the audience, it can share with any of its owned ad accounts.&lt;/li&gt; &lt;/ul&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/using-beta-and-restricted-features/&#39;&gt;Learn more&lt;/a&gt;. # noqa: E501

    :param business_id: Unique identifier of the requesting business.
    :type business_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: SharedAudienceResponse
    """
    if connexion.request.is_json:
        body = SharedAudience.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_business_to_business_shared_audience(business_id, body):  # noqa: E501
    """Update audience sharing between businesses

    From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/using-beta-and-restricted-features/&#39;&gt;Learn more&lt;/a&gt;. # noqa: E501

    :param business_id: Unique identifier of the requesting business.
    :type business_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: BusinessSharedAudienceResponse
    """
    if connexion.request.is_json:
        body = BusinessSharedAudience.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
