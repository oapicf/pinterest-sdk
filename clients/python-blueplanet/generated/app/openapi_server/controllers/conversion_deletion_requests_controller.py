import connexion

from app.openapi_server.models.conversion_deletion_request import ConversionDeletionRequest  # noqa: E501
from app.openapi_server.models.conversion_deletion_request_create import ConversionDeletionRequestCreate  # noqa: E501
from app.openapi_server.models.conversion_deletion_request_list200_response import ConversionDeletionRequestList200Response  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: E501
from openapi_server import util


def conversion_deletion_request_create(ad_account_id, body):  # noqa: E501
    """Create a conversion deletion request

    **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified &#x60;ad_account_id&#x60;. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: ConversionDeletionRequest
    """
    if connexion.request.is_json:
        body = ConversionDeletionRequestCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def conversion_deletion_request_delete(request_id, ad_account_id):  # noqa: E501
    """Delete a conversion deletion request

    **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;. This will cancel the request and prevent it from being processed. This can only be done if the request is in the &#x60;PENDING&#x60; status and before the 72 hours mark. # noqa: E501

    :param request_id: Unique identifier of the conversion deletion request
    :type request_id: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: ConversionDeletionRequest
    """
    return 'do some magic!'


def conversion_deletion_request_get(request_id, ad_account_id):  # noqa: E501
    """Get a single conversion deletion request

    **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;. # noqa: E501

    :param request_id: Unique identifier of the conversion deletion request
    :type request_id: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: ConversionDeletionRequest
    """
    return 'do some magic!'


def conversion_deletion_request_list(ad_account_id, bookmark=None, page_size=None, order=None):  # noqa: E501
    """List conversion deletion requests

    **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified &#x60;ad_account_id&#x60;. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int
    :param order: The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
    :type order: dict | bytes

    :rtype: ConversionDeletionRequestList200Response
    """
    if connexion.request.is_json:
        order = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
