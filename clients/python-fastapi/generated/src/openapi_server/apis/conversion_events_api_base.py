# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictBool, field_validator
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.conversion_api_response import ConversionApiResponse
from openapi_server.models.conversion_events import ConversionEvents
from openapi_server.models.detailed_error import DetailedError
from openapi_server.models.error import Error
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_conversion_token

class BaseConversionEventsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseConversionEventsApi.subclasses = BaseConversionEventsApi.subclasses + (cls,)
    async def events_create(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        conversion_events: Annotated[ConversionEvents, Field(description="Conversion events.")],
        test: Annotated[Optional[StrictBool], Field(description="Include query param ?test=true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request.")],
    ) -> ConversionApiResponse:
        """The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their &lt;code&gt;ad_account_id&lt;/code&gt;. The request body should be a JSON object. - This endpoint requires an &lt;code&gt;access_token&lt;/code&gt; be generated through Ads Manager. Review the &lt;a href&#x3D;\&quot;/docs/api-features/conversion-overview/\&quot;&gt;Conversions Guide&lt;/a&gt; for more details. (Note that the authorization header required is &lt;code&gt;Authorization: Bearer &amp;lt;access_token&amp;gt;&lt;/code&gt;). - The token&#39;s &lt;code&gt;user_account&lt;/code&gt; must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)"""
        ...
