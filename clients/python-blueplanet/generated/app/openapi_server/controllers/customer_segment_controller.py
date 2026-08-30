import connexion

from app.openapi_server.models.customer_segment import CustomerSegment  # noqa: E501
from app.openapi_server.models.customer_segment_create import CustomerSegmentCreate  # noqa: E501
from app.openapi_server.models.customer_segment_list200_response import CustomerSegmentList200Response  # noqa: E501
from app.openapi_server.models.customer_segment_update_request_update_with_required_body import CustomerSegmentUpdateRequestUpdateWithRequiredBody  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: E501
from openapi_server import util


def customer_segment_create(ad_account_id, body):  # noqa: E501
    """Create customer segments

    Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: CustomerSegment
    """
    if connexion.request.is_json:
        body = CustomerSegmentCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def customer_segment_list(ad_account_id, bookmark=None, page_size=None, order=None, include_sizing=None, search_query=None):  # noqa: E501
    """List customer segments

    Get a list of the customer segments in the specified &#x60;ad_account_id&#x60;. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int
    :param order: The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
    :type order: dict | bytes
    :param include_sizing: Include audience sizing in result or not
    :type include_sizing: bool
    :param search_query: Search query. Can contain pin description keywords or comma-separated pin IDs.
    :type search_query: str

    :rtype: CustomerSegmentList200Response
    """
    if connexion.request.is_json:
        order = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def customer_segment_update(ad_account_id, body):  # noqa: E501
    """Update customer segments

    Update the customer segment given advertiser ID and customer segment ID # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        body = CustomerSegmentUpdateRequestUpdateWithRequiredBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
