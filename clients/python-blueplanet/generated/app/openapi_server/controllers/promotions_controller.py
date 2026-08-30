import connexion

from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: E501
from app.openapi_server.models.promotion import Promotion  # noqa: E501
from app.openapi_server.models.promotion_batch_update import PromotionBatchUpdate  # noqa: E501
from app.openapi_server.models.promotion_create import PromotionCreate  # noqa: E501
from app.openapi_server.models.promotions_list200_response import PromotionsList200Response  # noqa: E501
from app.openapi_server.models.promotions_response import PromotionsResponse  # noqa: E501
from openapi_server import util


def promotions_create(ad_account_id, body):  # noqa: E501
    """Create promotions

    Create multiple new promotions. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: list | bytes

    :rtype: PromotionsResponse
    """
    if connexion.request.is_json:
        body = [PromotionCreate.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def promotions_delete(promotion_id, ad_account_id):  # noqa: E501
    """Delete promotion by id

    Delete a promotion within Pinterest. # noqa: E501

    :param promotion_id: Promotion ID
    :type promotion_id: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: Promotion
    """
    return 'do some magic!'


def promotions_get(promotion_id, ad_account_id):  # noqa: E501
    """Get promotion by id

    Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id. # noqa: E501

    :param promotion_id: Promotion ID
    :type promotion_id: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: Promotion
    """
    return 'do some magic!'


def promotions_list(ad_account_id, bookmark=None, page_size=None, order=None):  # noqa: E501
    """Get promotions

    Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int
    :param order: The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
    :type order: dict | bytes

    :rtype: PromotionsList200Response
    """
    if connexion.request.is_json:
        order = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def promotions_update(ad_account_id, body):  # noqa: E501
    """Update promotions

    Update multiple promotions. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: list | bytes

    :rtype: PromotionsResponse
    """
    if connexion.request.is_json:
        body = [PromotionBatchUpdate.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'
