# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, field_validator
from typing import List, Optional
from typing_extensions import Annotated
from openapi_server.models.event_quality_score import EventQualityScore
from openapi_server.models.ingestion_source_options import IngestionSourceOptions
from openapi_server.models.lookback_period_options import LookbackPeriodOptions
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.source_platform_options import SourcePlatformOptions
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

class BaseConversionEqsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseConversionEqsApi.subclasses = BaseConversionEqsApi.subclasses + (cls,)
    async def conversion_eqs_list(
        self,
        lookback_period: Annotated[LookbackPeriodOptions, Field(description="Lookback window (number of days).")],
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        source_platform: Annotated[Optional[SourcePlatformOptions], Field(description="Source platform of event.")],
        ingestion_source: Annotated[Optional[IngestionSourceOptions], Field(description="Ingestion source of event.")],
    ) -> List[EventQualityScore]:
        """Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user."""
        ...
