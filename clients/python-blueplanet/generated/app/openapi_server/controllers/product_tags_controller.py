import connexion

from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.product_tags_bulk_add_request import ProductTagsBulkAddRequest  # noqa: E501
from app.openapi_server.models.product_tags_bulk_delete_request import ProductTagsBulkDeleteRequest  # noqa: E501
from app.openapi_server.models.product_tags_error import ProductTagsError  # noqa: E501
from app.openapi_server.models.product_tags_response import ProductTagsResponse  # noqa: E501
from openapi_server import util


def product_tags_bulk_add(pin_id, body):  # noqa: E501
    """Add product tags to pin

    Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success. # noqa: E501

    :param pin_id: Unique identifier of the hero pin that will receive product tags.
    :type pin_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: ProductTagsResponse
    """
    if connexion.request.is_json:
        body = ProductTagsBulkAddRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def product_tags_bulk_delete(pin_id, body):  # noqa: E501
    """Delete product tags from pin

    Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success. # noqa: E501

    :param pin_id: Unique identifier of the hero pin that will receive product tags.
    :type pin_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        body = ProductTagsBulkDeleteRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def product_tags_list(pin_id):  # noqa: E501
    """Get product tags for pin

    Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags. # noqa: E501

    :param pin_id: Unique identifier of the hero pin that will receive product tags.
    :type pin_id: str

    :rtype: ProductTagsResponse
    """
    return 'do some magic!'
