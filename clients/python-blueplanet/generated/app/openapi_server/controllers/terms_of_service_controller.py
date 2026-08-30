import connexion

from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.terms_of_service import TermsOfService  # noqa: E501
from openapi_server import util


def terms_of_service_get(ad_account_id, include_html=None, tos_type=None):  # noqa: E501
    """Get terms of service

    Get the text of the terms of service and see whether the advertiser has accepted the terms of service. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param include_html: Return HTML in TOS text.
    :type include_html: bool
    :param tos_type: Request type.
    :type tos_type: str

    :rtype: TermsOfService
    """
    return 'do some magic!'
