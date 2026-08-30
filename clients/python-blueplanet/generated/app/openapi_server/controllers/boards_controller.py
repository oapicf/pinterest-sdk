import connexion

from app.openapi_server.models.board import Board  # noqa: E501
from app.openapi_server.models.board_create import BoardCreate  # noqa: E501
from app.openapi_server.models.board_privacy_filter import BoardPrivacyFilter  # noqa: E501
from app.openapi_server.models.board_section import BoardSection  # noqa: E501
from app.openapi_server.models.board_section_create import BoardSectionCreate  # noqa: E501
from app.openapi_server.models.board_section_update_with_required_body import BoardSectionUpdateWithRequiredBody  # noqa: E501
from app.openapi_server.models.board_sections_list200_response import BoardSectionsList200Response  # noqa: E501
from app.openapi_server.models.board_with_update_privacy import BoardWithUpdatePrivacy  # noqa: E501
from app.openapi_server.models.board_with_update_privacy_update import BoardWithUpdatePrivacyUpdate  # noqa: E501
from app.openapi_server.models.boards_list200_response import BoardsList200Response  # noqa: E501
from app.openapi_server.models.boards_list_pins200_response import BoardsListPins200Response  # noqa: E501
from app.openapi_server.models.creative_type import CreativeType  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from openapi_server import util


def board_sections_create(board_id, body, ad_account_id=None):  # noqa: E501
    """Create board section

    Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. # noqa: E501

    :param board_id: Unique identifier of a board.
    :type board_id: str
    :param body: 
    :type body: dict | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: BoardSection
    """
    if connexion.request.is_json:
        body = BoardSectionCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def board_sections_delete(board_id, section_id, ad_account_id=None):  # noqa: E501
    """Delete board section

    Delete a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. # noqa: E501

    :param board_id: Unique identifier of a board.
    :type board_id: str
    :param section_id: Unique identifier of a board section.
    :type section_id: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: BoardSection
    """
    return 'do some magic!'


def board_sections_list(board_id, ad_account_id=None, bookmark=None, page_size=None):  # noqa: E501
    """List board sections

    Get a list of all board sections from a board owned by the \&quot;operation user_account\&quot; - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. # noqa: E501

    :param board_id: Unique identifier of a board.
    :type board_id: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

    :rtype: BoardSectionsList200Response
    """
    return 'do some magic!'


def board_sections_list_pins(board_id, section_id, ad_account_id=None, bookmark=None, page_size=None):  # noqa: E501
    """List Pins on board section

    Get a list of the Pins on a board section of a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. # noqa: E501

    :param board_id: Unique identifier of a board.
    :type board_id: str
    :param section_id: Unique identifier of a board section.
    :type section_id: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

    :rtype: BoardsListPins200Response
    """
    return 'do some magic!'


def board_sections_update(board_id, section_id, body, ad_account_id=None):  # noqa: E501
    """Update board section

    Update a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. # noqa: E501

    :param board_id: Unique identifier of a board.
    :type board_id: str
    :param section_id: Unique identifier of a board section.
    :type section_id: str
    :param body: 
    :type body: dict | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: BoardSection
    """
    if connexion.request.is_json:
        body = BoardSectionUpdateWithRequiredBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def boards_create(body, ad_account_id=None):  # noqa: E501
    """Create board

    Create a board owned by the \&quot;operation user_account\&quot;. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account. # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: Board
    """
    if connexion.request.is_json:
        body = BoardCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def boards_delete(board_id, ad_account_id=None):  # noqa: E501
    """Delete board

    Delete a board owned by the \&quot;operation user_account\&quot;. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account. # noqa: E501

    :param board_id: 
    :type board_id: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: Board
    """
    return 'do some magic!'


def boards_get(board_id, ad_account_id=None):  # noqa: E501
    """Get board

    Get a board owned by the operation user_account - or a group board that has been shared with this account. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account. # noqa: E501

    :param board_id: 
    :type board_id: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: Board
    """
    return 'do some magic!'


def boards_list(ad_account_id=None, privacy=None, bookmark=None, page_size=None):  # noqa: E501
    """List boards

    Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. * If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param privacy: The privacy level of the board
    :type privacy: dict | bytes
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

    :rtype: BoardsList200Response
    """
    if connexion.request.is_json:
        privacy = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def boards_list_pins(board_id, creative_types=None, ad_account_id=None, pin_metrics=None, bookmark=None, page_size=None):  # noqa: E501
    """List Pins on board

    Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. # noqa: E501

    :param board_id: Unique identifier of a board.
    :type board_id: str
    :param creative_types: Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
    :type creative_types: list | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param pin_metrics: Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
    :type pin_metrics: bool
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

    :rtype: BoardsListPins200Response
    """
    if connexion.request.is_json:
        creative_types = [CreativeType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def boards_update(board_id, body, ad_account_id=None):  # noqa: E501
    """Update board

    Update a board owned by the \&quot;operating user_account\&quot;. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account. # noqa: E501

    :param board_id: 
    :type board_id: str
    :param body: 
    :type body: dict | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: BoardWithUpdatePrivacy
    """
    if connexion.request.is_json:
        body = BoardWithUpdatePrivacyUpdate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
