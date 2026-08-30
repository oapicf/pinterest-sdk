import connexion

from app.openapi_server.models.order_line import OrderLine  # noqa: E501
from app.openapi_server.models.order_lines_list200_response import OrderLinesList200Response  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: E501
from openapi_server import util


def order_lines_get(order_line_id, ad_account_id):  # noqa: E501
    """Get order line

    Get a specific existing order line associated with an ad account. # noqa: E501

    :param order_line_id: Order line ID.
    :type order_line_id: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: OrderLine
    """
    return 'do some magic!'


def order_lines_list(ad_account_id, bookmark=None, page_size=None, order=None):  # noqa: E501
    """Get order lines.

    List existing order lines associated with an ad account. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int
    :param order: The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
    :type order: dict | bytes

    :rtype: OrderLinesList200Response
    """
    if connexion.request.is_json:
        order = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
