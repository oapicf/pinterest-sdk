import connexion

from app.openapi_server.models.ad_accounts_audience import AdAccountsAudience  # noqa: E501
from app.openapi_server.models.ad_accounts_audience_create import AdAccountsAudienceCreate  # noqa: E501
from app.openapi_server.models.ad_accounts_audience_update import AdAccountsAudienceUpdate  # noqa: E501
from app.openapi_server.models.audience_ownership_type import AudienceOwnershipType  # noqa: E501
from app.openapi_server.models.audiences_list200_response import AudiencesList200Response  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: E501
from openapi_server import util


def audiences_create(ad_account_id, body):  # noqa: E501
    """Create audience

    Create a new audience for the ad account. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: AdAccountsAudience
    """
    if connexion.request.is_json:
        body = AdAccountsAudienceCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def audiences_get(audience_id, ad_account_id):  # noqa: E501
    """Get audience

    Get a specific audience given the audience ID. # noqa: E501

    :param audience_id: Audience ID.
    :type audience_id: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: AdAccountsAudience
    """
    return 'do some magic!'


def audiences_list(ad_account_id, bookmark=None, page_size=None, order=None, ownership_type=None, exclude_nca=None):  # noqa: E501
    """List audiences

    Get list of audiences for the ad account. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int
    :param order: The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
    :type order: dict | bytes
    :param ownership_type: 
    :type ownership_type: dict | bytes
    :param exclude_nca: When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all).
    :type exclude_nca: bool

    :rtype: AudiencesList200Response
    """
    if connexion.request.is_json:
        order = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        ownership_type = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def audiences_update(audience_id, ad_account_id, body):  # noqa: E501
    """Update audience

    Update an existing audience for the ad account. # noqa: E501

    :param audience_id: Audience ID.
    :type audience_id: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: AdAccountsAudience
    """
    if connexion.request.is_json:
        body = AdAccountsAudienceUpdate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
