# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictStr, field_validator
from typing import List
from typing_extensions import Annotated
from openapi_server.models.advertiser_defined_events_create200_response import AdvertiserDefinedEventsCreate200Response
from openapi_server.models.advertiser_defined_events_create_request import AdvertiserDefinedEventsCreateRequest
from openapi_server.models.advertiser_defined_events_get200_response import AdvertiserDefinedEventsGet200Response
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

class BaseConversionsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseConversionsApi.subclasses = BaseConversionsApi.subclasses + (cls,)
    async def advertiser_defined_events_get(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
    ) -> AdvertiserDefinedEventsGet200Response:
        """Get advertiser defined events for the given ad account."""
        ...


    async def advertiser_defined_events_create(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        advertiser_defined_events_create_request: AdvertiserDefinedEventsCreateRequest,
    ) -> AdvertiserDefinedEventsCreate200Response:
        """Map advertiser defined events to standard events for the given ad account."""
        ...


    async def advertiser_defined_events_delete(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        event_names: Annotated[List[StrictStr], Field(description="List of event names to delete")],
    ) -> AdvertiserDefinedEventsCreate200Response:
        """Untrack advertiser defined events for the given ad account."""
        ...


    async def advertiser_defined_events_update(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        advertiser_defined_events_create_request: AdvertiserDefinedEventsCreateRequest,
    ) -> AdvertiserDefinedEventsCreate200Response:
        """Update advertiser defined event names or mappings for the given ad account."""
        ...
