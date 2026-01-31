# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, field_validator
from typing_extensions import Annotated
from openapi_server.models.advertiser_defined_events_response import AdvertiserDefinedEventsResponse
from openapi_server.models.error import Error
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

class BaseConversionsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseConversionsApi.subclasses = BaseConversionsApi.subclasses + (cls,)
    async def advertiser_defined_events_get(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
    ) -> AdvertiserDefinedEventsResponse:
        """&lt;p&gt;Get advertiser defined events for the given ad account.&lt;/p&gt;"""
        ...
