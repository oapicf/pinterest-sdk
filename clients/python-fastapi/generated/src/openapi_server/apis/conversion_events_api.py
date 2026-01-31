# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.conversion_events_api_base import BaseConversionEventsApi
import openapi_server.impl

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    HTTPException,
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
from pydantic import Field, StrictBool, field_validator
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.conversion_api_response import ConversionApiResponse
from openapi_server.models.conversion_events import ConversionEvents
from openapi_server.models.detailed_error import DetailedError
from openapi_server.models.error import Error
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_conversion_token

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/ad_accounts/{ad_account_id}/events",
    responses={
        200: {"model": ConversionApiResponse, "description": "Success"},
        400: {"model": Error, "description": "The request was invalid."},
        401: {"model": Error, "description": "Not authorized to send conversion events"},
        403: {"model": Error, "description": "Unauthorized access."},
        422: {"model": DetailedError, "description": "Not all events were successfully processed."},
        429: {"model": Error, "description": "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window."},
        503: {"model": Error, "description": "The endpoint has been ramped down and is currently not accepting any traffic."},
        "default": {"model": Error, "description": "Unexpected errors"},
    },
    tags=["conversion_events"],
    summary="Send conversions",
    response_model_by_alias=True,
)
async def events_create(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    conversion_events: Annotated[ConversionEvents, Field(description="Conversion events.")] = Body(None, description="Conversion events."),
    test: Annotated[Optional[StrictBool], Field(description="Include query param ?test=true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request.")] = Query(None, description="Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request.", alias="test"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
    token_conversion_token: TokenModel = Security(
        get_token_conversion_token
    ),
) -> ConversionApiResponse:
    """The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their &lt;code&gt;ad_account_id&lt;/code&gt;. The request body should be a JSON object. - This endpoint requires an &lt;code&gt;access_token&lt;/code&gt; be generated through Ads Manager. Review the &lt;a href&#x3D;\&quot;/docs/api-features/conversion-overview/\&quot;&gt;Conversions Guide&lt;/a&gt; for more details. (Note that the authorization header required is &lt;code&gt;Authorization: Bearer &amp;lt;access_token&amp;gt;&lt;/code&gt;). - The token&#39;s &lt;code&gt;user_account&lt;/code&gt; must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)"""
    if not BaseConversionEventsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseConversionEventsApi.subclasses[0]().events_create(ad_account_id, conversion_events, test)
