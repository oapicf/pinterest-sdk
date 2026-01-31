# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field
from typing_extensions import Annotated
from openapi_server.models.error import Error
from openapi_server.models.notification_post_request import NotificationPostRequest
from openapi_server.models.notification_response import NotificationResponse
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

class BaseNotificationApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseNotificationApi.subclasses = BaseNotificationApi.subclasses + (cls,)
    async def notification_post(
        self,
        notification_post_request: Annotated[NotificationPostRequest, Field(description="notification event.")],
    ) -> NotificationResponse:
        """Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests&#39; systems. This API is gated and you need to request access to this feature."""
        ...
