# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, field_validator
from typing import Any, Dict
from typing_extensions import Annotated
from openapi_server.models.conversion_msot_events_create import ConversionMSOTEventsCreate
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.security_api import get_token_pinterest_oauth2

class BaseMsotEventsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseMsotEventsApi.subclasses = BaseMsotEventsApi.subclasses + (cls,)
    async def msot_events_create(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        conversion_msot_events_create: ConversionMSOTEventsCreate,
    ) -> None:
        """**This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their &#x60;ad_account_id&#x60;. The request body should be a JSON object.  - These events will not be used in Reporting."""
        ...
