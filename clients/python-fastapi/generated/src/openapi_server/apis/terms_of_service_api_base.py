# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictBool, StrictStr, field_validator
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.terms_of_service import TermsOfService
from openapi_server.security_api import get_token_pinterest_oauth2

class BaseTermsOfServiceApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseTermsOfServiceApi.subclasses = BaseTermsOfServiceApi.subclasses + (cls,)
    async def terms_of_service_get(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        include_html: Annotated[Optional[StrictBool], Field(description="Return HTML in TOS text.")],
        tos_type: Annotated[Optional[StrictStr], Field(description="Request type.")],
    ) -> TermsOfService:
        """Get the text of the terms of service and see whether the advertiser has accepted the terms of service."""
        ...
