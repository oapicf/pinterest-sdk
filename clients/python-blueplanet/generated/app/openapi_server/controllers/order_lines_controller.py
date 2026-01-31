import connexion

from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.order_line import OrderLine  # noqa: E501
from app.openapi_server.models.order_lines_list200_response import OrderLinesList200Response  # noqa: E501
from openapi_server import util


def order_lines_get(ad_account_id, order_line_id):  # noqa: E501
    """Get order line

    Get a specific existing order line associated with an ad account. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param order_line_id: Unique identifier of an order line.
    :type order_line_id: str

    :rtype: OrderLine
    """
    return 'do some magic!'


def order_lines_list(ad_account_id, page_size=None, order=None, bookmark=None):  # noqa: E501
    """Get order lines

    List existing order lines associated with an ad account. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param page_size: Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    :type page_size: int
    :param order: The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
    :type order: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str

    :rtype: OrderLinesList200Response
    """
    return 'do some magic!'
