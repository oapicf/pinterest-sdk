import connexion

from app.openapi_server.models.notification_post_request import NotificationPostRequest  # noqa: E501
from app.openapi_server.models.notification_response import NotificationResponse  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from openapi_server import util


def notification_post(body):  # noqa: E501
    """Receive notifications from external partners.

    Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests&#39; systems. This API is gated and you need to request access to this feature. # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: NotificationResponse
    """
    if connexion.request.is_json:
        body = NotificationPostRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
