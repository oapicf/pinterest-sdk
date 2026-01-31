# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.ad_accounts_api_base import BaseAdAccountsApi
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
from datetime import date
from pydantic import Field, StrictBool, StrictInt, StrictStr, field_validator
from typing import List, Optional
from typing_extensions import Annotated
from openapi_server.models.ad_account import AdAccount
from openapi_server.models.ad_account_analytics_response_inner import AdAccountAnalyticsResponseInner
from openapi_server.models.ad_account_create import AdAccountCreate
from openapi_server.models.ad_accounts_list200_response import AdAccountsList200Response
from openapi_server.models.ads_analytics_create_async_request import AdsAnalyticsCreateAsyncRequest
from openapi_server.models.ads_analytics_create_async_response import AdsAnalyticsCreateAsyncResponse
from openapi_server.models.ads_analytics_get_async_response import AdsAnalyticsGetAsyncResponse
from openapi_server.models.ads_analytics_targeting_type import AdsAnalyticsTargetingType
from openapi_server.models.conversion_product_report_request import ConversionProductReportRequest
from openapi_server.models.conversion_report_attribution_type import ConversionReportAttributionType
from openapi_server.models.create_mmm_report_request import CreateMMMReportRequest
from openapi_server.models.create_mmm_report_response import CreateMMMReportResponse
from openapi_server.models.error import Error
from openapi_server.models.get_mmm_report_response import GetMMMReportResponse
from openapi_server.models.granularity import Granularity
from openapi_server.models.metrics_response import MetricsResponse
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.reporting_time_zone import ReportingTimeZone
from openapi_server.models.template_based_report import TemplateBasedReport
from openapi_server.models.templates_list200_response import TemplatesList200Response
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/ad_accounts",
    responses={
        200: {"model": AdAccountsList200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["ad_accounts"],
    summary="List ad accounts",
    response_model_by_alias=True,
)
async def ad_accounts_list(
    include_shared_accounts: Annotated[Optional[StrictBool], Field(description="Include shared ad accounts")] = Query(True, description="Include shared ad accounts", alias="include_shared_accounts"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> AdAccountsList200Response:
    """Get a list of the ad_accounts that the \&quot;operation user_account\&quot; has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts)."""
    if not BaseAdAccountsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdAccountsApi.subclasses[0]().ad_accounts_list(include_shared_accounts, bookmark, page_size)


@router.post(
    "/ad_accounts",
    responses={
        200: {"model": AdAccount, "description": "The request has succeeded."},
        201: {"model": AdAccount, "description": "Resource create operation completed successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["ad_accounts"],
    summary="Create ad account",
    response_model_by_alias=True,
)
async def ad_accounts_create(
    ad_account_create: AdAccountCreate = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> AdAccount:
    """Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account)."""
    if not BaseAdAccountsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdAccountsApi.subclasses[0]().ad_accounts_create(ad_account_create)


@router.get(
    "/ad_accounts/{ad_account_id}",
    responses={
        200: {"model": AdAccount, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["ad_accounts"],
    summary="Get ad account",
    response_model_by_alias=True,
)
async def ad_accounts_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18)] = Path(..., description="", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> AdAccount:
    """Get an ad account"""
    if not BaseAdAccountsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdAccountsApi.subclasses[0]().ad_accounts_get(ad_account_id)


@router.get(
    "/ad_accounts/{ad_account_id}/analytics",
    responses={
        200: {"model": List[AdAccountAnalyticsResponseInner], "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account analytics parameters."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["ad_accounts"],
    summary="Get ad account analytics",
    response_model_by_alias=True,
)
async def ad_account_analytics(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    start_date: Annotated[date, Field(description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")] = Query(None, description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", alias="start_date"),
    end_date: Annotated[date, Field(description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")] = Query(None, description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", alias="end_date"),
    columns: Annotated[List[StrictStr], Field(description="Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned")] = Query(None, description="Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned", alias="columns"),
    granularity: Annotated[Granularity, Field(description="TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly")] = Query(None, description="TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly", alias="granularity"),
    click_window_days: Annotated[Optional[StrictInt], Field(description="Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")] = Query(30, description="Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.", alias="click_window_days"),
    engagement_window_days: Annotated[Optional[StrictInt], Field(description="Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.<br> <strong>Note:</strong> This parameter no longer returns new data. However, you can still access historic data through <strong>Sept 30, 2027</strong>.")] = Query(30, description="Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.&lt;br&gt; &lt;strong&gt;Note:&lt;/strong&gt; This parameter no longer returns new data. However, you can still access historic data through &lt;strong&gt;Sept 30, 2027&lt;/strong&gt;.", alias="engagement_window_days"),
    view_window_days: Annotated[Optional[StrictInt], Field(description="Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.")] = Query(1, description="Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.", alias="view_window_days"),
    conversion_report_time: Annotated[Optional[StrictStr], Field(description="The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")] = Query(TIME_OF_AD_ACTION, description="The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", alias="conversion_report_time"),
    reporting_timezone: Annotated[Optional[ReportingTimeZone], Field(description="Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.")] = Query(None, description="Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", alias="reporting_timezone"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> List[AdAccountAnalyticsResponseInner]:
    """Get analytics for the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time."""
    if not BaseAdAccountsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdAccountsApi.subclasses[0]().ad_account_analytics(ad_account_id, start_date, end_date, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, reporting_timezone)


@router.get(
    "/ad_accounts/{ad_account_id}/mmm_reports",
    responses={
        200: {"model": GetMMMReportResponse, "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account ads analytics parameters."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["ad_accounts"],
    summary="Get advertiser Marketing Mix Modeling (MMM) report.",
    response_model_by_alias=True,
)
async def analytics_get_mmm_report(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    token: Annotated[StrictStr, Field(description="Token returned from the post request creation call")] = Query(None, description="Token returned from the post request creation call", alias="token"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> GetMMMReportResponse:
    """Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the create mmm report endpoint."""
    if not BaseAdAccountsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdAccountsApi.subclasses[0]().analytics_get_mmm_report(ad_account_id, token)


@router.post(
    "/ad_accounts/{ad_account_id}/mmm_reports",
    responses={
        200: {"model": CreateMMMReportResponse, "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account ads analytics mmm parameters"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["ad_accounts"],
    summary="Create a request for a Marketing Mix Modeling (MMM) report",
    response_model_by_alias=True,
)
async def analytics_create_mmm_report(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    create_mmm_report_request: CreateMMMReportRequest = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> CreateMMMReportResponse:
    """This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it&#39;s in beta release."""
    if not BaseAdAccountsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdAccountsApi.subclasses[0]().analytics_create_mmm_report(ad_account_id, create_mmm_report_request)


@router.get(
    "/ad_accounts/{ad_account_id}/reports",
    responses={
        200: {"model": AdsAnalyticsGetAsyncResponse, "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account ads analytics parameters."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["ad_accounts"],
    summary="Get the account analytics report created by the async call",
    response_model_by_alias=True,
)
async def analytics_get_report(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    token: Annotated[StrictStr, Field(description="Token returned from the post request creation call")] = Query(None, description="Token returned from the post request creation call", alias="token"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> AdsAnalyticsGetAsyncResponse:
    """This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager."""
    if not BaseAdAccountsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdAccountsApi.subclasses[0]().analytics_get_report(ad_account_id, token)


@router.post(
    "/ad_accounts/{ad_account_id}/reports",
    responses={
        200: {"model": AdsAnalyticsCreateAsyncResponse, "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account ads analytics parameters."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["ad_accounts"],
    summary="Create async request for an account analytics report",
    response_model_by_alias=True,
)
async def analytics_create_report(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    ads_analytics_create_async_request: AdsAnalyticsCreateAsyncRequest = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> AdsAnalyticsCreateAsyncResponse:
    """This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days. - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either."""
    if not BaseAdAccountsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdAccountsApi.subclasses[0]().analytics_create_report(ad_account_id, ads_analytics_create_async_request)


@router.get(
    "/ad_accounts/{ad_account_id}/reports/brand_category_sku",
    responses={
        200: {"model": AdsAnalyticsGetAsyncResponse, "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account ads analytics parameters."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["ad_accounts"],
    summary="Get advertiser brand, category, SKU report",
    response_model_by_alias=True,
)
async def analytics_get_conversion_product_report(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    token: Annotated[StrictStr, Field(description="Token returned from the post request creation call")] = Query(None, description="Token returned from the post request creation call", alias="token"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> AdsAnalyticsGetAsyncResponse:
    """&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint."""
    if not BaseAdAccountsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdAccountsApi.subclasses[0]().analytics_get_conversion_product_report(ad_account_id, token)


@router.post(
    "/ad_accounts/{ad_account_id}/reports/brand_category_sku",
    responses={
        200: {"model": AdsAnalyticsCreateAsyncResponse, "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account ads analytics brand, category, SKU parameters"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["ad_accounts"],
    summary="Create a request for a brand, category, SKU report",
    response_model_by_alias=True,
)
async def analytics_create_conversion_product_report(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    conversion_product_report_request: ConversionProductReportRequest = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> AdsAnalyticsCreateAsyncResponse:
    """&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready."""
    if not BaseAdAccountsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdAccountsApi.subclasses[0]().analytics_create_conversion_product_report(ad_account_id, conversion_product_report_request)


@router.delete(
    "/ad_accounts/{ad_account_id}/sandbox",
    responses={
        200: {"model": str, "description": "OK"},
        400: {"model": Error, "description": "Invalid ad account id."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["ad_accounts"],
    summary="Delete ads data for ad account in API Sandbox",
    response_model_by_alias=True,
)
async def sandbox_delete(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> str:
    """Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information."""
    if not BaseAdAccountsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdAccountsApi.subclasses[0]().sandbox_delete(ad_account_id)


@router.get(
    "/ad_accounts/{ad_account_id}/targeting_analytics",
    responses={
        200: {"model": MetricsResponse, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["ad_accounts"],
    summary="Get targeting analytics for an ad account",
    response_model_by_alias=True,
)
async def ad_account_targeting_analytics_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    start_date: Annotated[date, Field(description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")] = Query(None, description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", alias="start_date"),
    end_date: Annotated[date, Field(description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")] = Query(None, description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", alias="end_date"),
    targeting_types: Annotated[List[AdsAnalyticsTargetingType], Field(min_length=1, max_length=15, description="Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.")] = Query(None, description="Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users.", alias="targeting_types"),
    columns: Annotated[List[StrictStr], Field(description="Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned")] = Query(None, description="Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned", alias="columns"),
    granularity: Annotated[Granularity, Field(description="TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly")] = Query(None, description="TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly", alias="granularity"),
    click_window_days: Annotated[Optional[StrictInt], Field(description="Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")] = Query(30, description="Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.", alias="click_window_days"),
    engagement_window_days: Annotated[Optional[StrictInt], Field(description="Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.<br> <strong>Note:</strong> This parameter no longer returns new data. However, you can still access historic data through <strong>Sept 30, 2027</strong>.")] = Query(30, description="Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.&lt;br&gt; &lt;strong&gt;Note:&lt;/strong&gt; This parameter no longer returns new data. However, you can still access historic data through &lt;strong&gt;Sept 30, 2027&lt;/strong&gt;.", alias="engagement_window_days"),
    view_window_days: Annotated[Optional[StrictInt], Field(description="Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.")] = Query(1, description="Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.", alias="view_window_days"),
    conversion_report_time: Annotated[Optional[StrictStr], Field(description="The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")] = Query(TIME_OF_AD_ACTION, description="The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", alias="conversion_report_time"),
    attribution_types: Annotated[Optional[Annotated[List[ConversionReportAttributionType], Field(max_length=2)]], Field(description="List of types of attribution for the conversion report")] = Query(None, description="List of types of attribution for the conversion report", alias="attribution_types"),
    reporting_timezone: Annotated[Optional[ReportingTimeZone], Field(description="Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.")] = Query(None, description="Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", alias="reporting_timezone"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> MetricsResponse:
    """Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt; - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days."""
    if not BaseAdAccountsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdAccountsApi.subclasses[0]().ad_account_targeting_analytics_get(ad_account_id, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types, reporting_timezone)


@router.get(
    "/ad_accounts/{ad_account_id}/templates",
    responses={
        200: {"model": TemplatesList200Response, "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account template parameters."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["ad_accounts"],
    summary="List templates",
    response_model_by_alias=True,
)
async def templates_list(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    order: Annotated[Optional[StrictStr], Field(description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")] = Query(None, description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", alias="order"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> TemplatesList200Response:
    """Gets all Templates associated with an ad account ID."""
    if not BaseAdAccountsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdAccountsApi.subclasses[0]().templates_list(ad_account_id, page_size, order, bookmark)


@router.post(
    "/ad_accounts/{ad_account_id}/templates/{template_id}/reports",
    responses={
        200: {"model": TemplateBasedReport, "description": "The request has succeeded."},
        201: {"model": TemplateBasedReport, "description": "Resource create operation completed successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["ad_accounts"],
    summary="Create async request for an analytics report using a template",
    response_model_by_alias=True,
)
async def analytics_create_template_report(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18)] = Path(..., description="", regex=r"^\d+$", max_length=18),
    template_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of a template.")] = Path(..., description="Unique identifier of a template.", max_length=18),
    start_date: Annotated[Optional[date], Field(description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today.")] = Query(None, description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today.", alias="start_date"),
    end_date: Annotated[Optional[date], Field(description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date.")] = Query(None, description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date.", alias="end_date"),
    granularity: Annotated[Optional[Granularity], Field(description="   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEKLY - metrics are broken down weekly.    MONTHLY - metrics are broken down monthly")] = Query(None, description="   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEKLY - metrics are broken down weekly.    MONTHLY - metrics are broken down monthly", alias="granularity"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> TemplateBasedReport:
    """   This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready."""
    if not BaseAdAccountsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdAccountsApi.subclasses[0]().analytics_create_template_report(ad_account_id, template_id, start_date, end_date, granularity)
