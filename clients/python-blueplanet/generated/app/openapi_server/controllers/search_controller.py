import connexion

from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.search_partner_pins200_response import SearchPartnerPins200Response  # noqa: E501
from app.openapi_server.models.search_user_boards_get200_response import SearchUserBoardsGet200Response  # noqa: E501
from app.openapi_server.models.search_user_pins_list200_response import SearchUserPinsList200Response  # noqa: E501
from openapi_server import util


def search_partner_pins(term, country_code, bookmark=None, locale=None, limit=None):  # noqa: E501
    """Search pins by a given search term

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/using-beta-and-restricted-features/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get the top 10 Pins by a given search term. # noqa: E501

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


def search_user_boards_get(ad_account_id=None, bookmark=None, page_size=None, query=None):  # noqa: E501
    """Search user&#39;s boards

    Search for boards for the \&quot;operation user_account\&quot;. This includes boards of all board types. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/getting-started/using-business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    :type page_size: int
    :param query: Search query. Can contain pin description keywords or comma-separated pin IDs.
    :type query: str

    :rtype: SearchUserBoardsGet200Response
    """
    return 'do some magic!'


def search_user_pins_list(query, ad_account_id=None, bookmark=None):  # noqa: E501
    """Search user&#39;s Pins

    Search for pins for the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/getting-started/using-business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information. # noqa: E501

    :param query: Search query. Can contain pin description keywords or comma-separated pin IDs.
    :type query: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str

    :rtype: SearchUserPinsList200Response
    """
    return 'do some magic!'
