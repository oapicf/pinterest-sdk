# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, field_validator
from typing import Any
from typing_extensions import Annotated
from openapi_server.models.conversion_msot_events import ConversionMSOTEvents
from openapi_server.models.error import Error
from openapi_server.security_api import get_token_pinterest_oauth2

class BaseMsotEventsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseMsotEventsApi.subclasses = BaseMsotEventsApi.subclasses + (cls,)
    async def msot_events_create(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        conversion_msot_events: Annotated[ConversionMSOTEvents, Field(description="Attributed MSOT conversion events")],
    ) -> None:
        """&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt; &lt;br&gt; &lt;p&gt;Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their &lt;code&gt;ad_account_id&lt;/code&gt;. The request body should be a JSON object.&lt;/p&gt; - These events will NOT be used in Reporting."""
        ...
