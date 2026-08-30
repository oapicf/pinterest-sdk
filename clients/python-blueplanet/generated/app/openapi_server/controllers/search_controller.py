import connexion

from app.openapi_server.models.boards_list200_response import BoardsList200Response  # noqa: E501
from app.openapi_server.models.pins_list200_response import PinsList200Response  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.search_partner_pins200_response import SearchPartnerPins200Response  # noqa: E501
from openapi_server import util


def search_partner_pins(term, country_code, bookmark=None, locale=None, limit=None):  # noqa: E501
    """Search pins by a given search term

    **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get the top 10 Pins by a given search term. # noqa: E501

    :param term: Search term to look up pins.
    :type term: str
    :param country_code: Two letter country code (ISO 3166-1 alpha-2)
    :type country_code: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param locale: Search locale.
    :type locale: str
    :param limit: Max search result size
    :type limit: int

    :rtype: SearchPartnerPins200Response
    """
    return 'do some magic!'


def search_user_boards_get(ad_account_id=None, query=None, bookmark=None, page_size=None):  # noqa: E501
    """Search user&#39;s boards

    Search for boards for the \&quot;operation user_account\&quot;. This includes boards of all board types. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param query: Search query. Can contain pin description keywords or comma-separated pin IDs.
    :type query: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

    :rtype: BoardsList200Response
    """
    return 'do some magic!'


def search_user_pins_list(query, ad_account_id=None, bookmark=None):  # noqa: E501
    """Search user&#39;s Pins

    Search for pins for the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information. # noqa: E501

    :param query: Search query. Can contain pin description keywords or comma-separated pin IDs.
    :type query: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str

    :rtype: PinsList200Response
    """
    return 'do some magic!'
