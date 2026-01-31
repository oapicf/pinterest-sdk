import connexion

from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.promotion_create_request import PromotionCreateRequest  # noqa: E501
from app.openapi_server.models.promotion_response import PromotionResponse  # noqa: E501
from app.openapi_server.models.promotion_update_request import PromotionUpdateRequest  # noqa: E501
from app.openapi_server.models.promotions_list200_response import PromotionsList200Response  # noqa: E501
from app.openapi_server.models.promotions_response import PromotionsResponse  # noqa: E501
from openapi_server import util


def promotions_create(ad_account_id, body):  # noqa: E501
    """Create promotions

    Create multiple new promotions. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: List of promotions to create, size limit [1, 30].
    :type body: list | bytes

    :rtype: PromotionsResponse
    """
    if connexion.request.is_json:
        body = [PromotionCreateRequest.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def promotions_delete(ad_account_id, promotion_id):  # noqa: E501
    """Delete promotion by id

    Delete a promotion within Pinterest. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param promotion_id: Unique identifier of a promotion
    :type promotion_id: str

    :rtype: None
    """
    return 'do some magic!'


def promotions_get(ad_account_id, promotion_id):  # noqa: E501
    """Get promotion by id

    Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param promotion_id: Unique identifier of a promotion
    :type promotion_id: str

    :rtype: PromotionResponse
    """
    return 'do some magic!'


def promotions_list(ad_account_id, page_size=None, order=None, bookmark=None):  # noqa: E501
    """Get promotions

    Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param page_size: Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    :type page_size: int
    :param order: The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
    :type order: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str

    :rtype: PromotionsList200Response
    """
    return 'do some magic!'


def promotions_update(ad_account_id, body):  # noqa: E501
    """Update promotions

    Update multiple promotions. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: List of promotions to create, size limit [1, 30].
    :type body: list | bytes

    :rtype: PromotionsResponse
    """
    if connexion.request.is_json:
        body = [PromotionUpdateRequest.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'
