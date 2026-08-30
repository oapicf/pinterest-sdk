# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.campaigns_api_base import BaseCampaignsApi
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
from pydantic import Field, StrictBool, StrictFloat, StrictInt, StrictStr, field_validator
from typing import List, Optional, Union
from typing_extensions import Annotated
from openapi_server.models.ad_pin_analytics import AdPinAnalytics
from openapi_server.models.ads_analytics_campaign_targeting_type import AdsAnalyticsCampaignTargetingType
from openapi_server.models.campaign import Campaign
from openapi_server.models.campaign_batch_update_item import CampaignBatchUpdateItem
from openapi_server.models.campaign_batch_write_response_model import CampaignBatchWriteResponseModel
from openapi_server.models.campaign_create_item import CampaignCreateItem
from openapi_server.models.campaign_delivery_estimates_campaign import CampaignDeliveryEstimatesCampaign
from openapi_server.models.campaign_delivery_estimates_response import CampaignDeliveryEstimatesResponse
from openapi_server.models.campaigns_analytics_metrics import CampaignsAnalyticsMetrics
from openapi_server.models.campaigns_list200_response import CampaignsList200Response
from openapi_server.models.conversion_report_attribution_type import ConversionReportAttributionType
from openapi_server.models.entity_status import EntityStatus
from openapi_server.models.granularity import Granularity
from openapi_server.models.metrics_response import MetricsResponse
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder
from openapi_server.models.reporting_column_sync import ReportingColumnSync
from openapi_server.models.reporting_time_zone import ReportingTimeZone
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/ad_accounts/{ad_account_id}/campaigns",
    responses={
        200: {"model": CampaignsList200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["campaigns"],
    summary="List campaigns",
    response_model_by_alias=True,
)
async def campaigns_list(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    order: Annotated[Optional[PinterestLibPaginationOrder], Field(description="The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.")] = Query(None, description="The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.", alias="order"),
    campaign_ids: Annotated[Optional[Annotated[List[Annotated[str, Field(strict=True, max_length=18)]], Field(min_length=1, max_length=250)]], Field(description="List of Campaign Ids to use to filter the results.")] = Query(None, description="List of Campaign Ids to use to filter the results.", alias="campaign_ids"),
    entity_statuses: Annotated[Optional[List[EntityStatus]], Field(description="Entity status")] = Query(["ACTIVE","PAUSED"], description="Entity status", alias="entity_statuses"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> CampaignsList200Response:
    """Get a list of the campaigns in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager."""
    if not BaseCampaignsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCampaignsApi.subclasses[0]().campaigns_list(ad_account_id, bookmark, page_size, order, campaign_ids, entity_statuses)


@router.post(
    "/ad_accounts/{ad_account_id}/campaigns",
    responses={
        200: {"model": CampaignBatchWriteResponseModel, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["campaigns"],
    summary="Create campaigns",
    response_model_by_alias=True,
)
async def campaigns_create(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    campaign_create_item: Annotated[List[CampaignCreateItem], Field(min_length=1, max_length=30)] = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> CampaignBatchWriteResponseModel:
    """Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.  For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).  **Note:** - The values for &#x60;lifetime_spend_cap&#x60; and &#x60;daily_spend_cap&#x60; are microcurrency amounts based on the currency field set in the advertiser&#39;s profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000"""
    if not BaseCampaignsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCampaignsApi.subclasses[0]().campaigns_create(ad_account_id, campaign_create_item)


@router.patch(
    "/ad_accounts/{ad_account_id}/campaigns",
    responses={
        200: {"model": CampaignBatchWriteResponseModel, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["campaigns"],
    summary="Update campaigns",
    response_model_by_alias=True,
)
async def campaigns_update(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    campaign_batch_update_item: Annotated[List[CampaignBatchUpdateItem], Field(min_length=1, max_length=30)] = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> CampaignBatchWriteResponseModel:
    """Update multiple ad campaigns based on campaign_ids.  **Note:** - The values for &#x60;lifetime_spend_cap&#x60; and &#x60;daily_spend_cap&#x60; are microcurrency amounts based on the currency field set in the advertiser&#39;s profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000"""
    if not BaseCampaignsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCampaignsApi.subclasses[0]().campaigns_update(ad_account_id, campaign_batch_update_item)


@router.get(
    "/ad_accounts/{ad_account_id}/campaigns/analytics",
    responses={
        200: {"model": List[CampaignsAnalyticsMetrics], "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["campaigns"],
    summary="Get campaign analytics",
    response_model_by_alias=True,
)
async def campaigns_analytics(
    start_date: Annotated[date, Field(description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")] = Query(None, description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", alias="start_date"),
    end_date: Annotated[date, Field(description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")] = Query(None, description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", alias="end_date"),
    campaign_ids: Annotated[List[Annotated[str, Field(strict=True, max_length=18)]], Field(min_length=1, max_length=250, description="List of Campaign Ids to use to filter the results.")] = Query(None, description="List of Campaign Ids to use to filter the results.", alias="campaign_ids"),
    columns: Annotated[List[ReportingColumnSync], Field(description="Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.")] = Query(None, description="Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.", alias="columns"),
    granularity: Annotated[Granularity, Field(description="  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly")] = Query(None, description="  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", alias="granularity"),
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    click_window_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")] = Query(30, description="Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.", alias="click_window_days"),
    engagement_window_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.")] = Query(30, description="Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.", alias="engagement_window_days"),
    view_window_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.")] = Query(1, description="Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.", alias="view_window_days"),
    conversion_report_time: Annotated[Optional[StrictStr], Field(description="The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")] = Query('TIME_OF_AD_ACTION', description="The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", alias="conversion_report_time"),
    aggregate_report_rows: Annotated[Optional[StrictBool], Field(description="Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.")] = Query(False, description="Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.", alias="aggregate_report_rows"),
    reporting_timezone: Annotated[Optional[ReportingTimeZone], Field(description="Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.")] = Query(None, description="Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", alias="reporting_timezone"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> List[CampaignsAnalyticsMetrics]:
    """Get analytics for the specified campaigns in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days."""
    if not BaseCampaignsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCampaignsApi.subclasses[0]().campaigns_analytics(start_date, end_date, campaign_ids, columns, granularity, ad_account_id, click_window_days, engagement_window_days, view_window_days, conversion_report_time, aggregate_report_rows, reporting_timezone)


@router.post(
    "/ad_accounts/{ad_account_id}/campaigns/delivery_estimates",
    responses={
        200: {"model": CampaignDeliveryEstimatesResponse, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        503: {"model": PinterestLibError, "description": "The service is temporarily unavailable."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["campaigns"],
    summary="Get campaign delivery estimates",
    response_model_by_alias=True,
)
async def get_campaign_delivery_estimates(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    campaign_delivery_estimates_campaign: Annotated[List[CampaignDeliveryEstimatesCampaign], Field(min_length=1, max_length=1)] = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> CampaignDeliveryEstimatesResponse:
    """Get delivery estimates for an ads campaign  **This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**"""
    if not BaseCampaignsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCampaignsApi.subclasses[0]().get_campaign_delivery_estimates(ad_account_id, campaign_delivery_estimates_campaign)


@router.get(
    "/ad_accounts/{ad_account_id}/campaigns/targeting_analytics",
    responses={
        200: {"model": MetricsResponse, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["campaigns"],
    summary="Get targeting analytics for campaigns",
    response_model_by_alias=True,
)
async def campaign_targeting_analytics_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    campaign_ids: Annotated[List[Annotated[str, Field(strict=True, max_length=18)]], Field(min_length=1, max_length=250, description="List of Campaign Ids to use to filter the results.")] = Query(None, description="List of Campaign Ids to use to filter the results.", alias="campaign_ids"),
    start_date: Annotated[date, Field(description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")] = Query(None, description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", alias="start_date"),
    end_date: Annotated[date, Field(description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")] = Query(None, description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", alias="end_date"),
    targeting_types: Annotated[List[AdsAnalyticsCampaignTargetingType], Field(min_length=1, max_length=14, description="Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.")] = Query(None, description="Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users.", alias="targeting_types"),
    columns: Annotated[List[ReportingColumnSync], Field(description="Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.")] = Query(None, description="Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.", alias="columns"),
    granularity: Annotated[Granularity, Field(description="  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly")] = Query(None, description="  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", alias="granularity"),
    click_window_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")] = Query(30, description="Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.", alias="click_window_days"),
    engagement_window_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.")] = Query(30, description="Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.", alias="engagement_window_days"),
    view_window_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.")] = Query(1, description="Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.", alias="view_window_days"),
    conversion_report_time: Annotated[Optional[StrictStr], Field(description="The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")] = Query('TIME_OF_AD_ACTION', description="The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", alias="conversion_report_time"),
    attribution_types: Annotated[Optional[Annotated[List[ConversionReportAttributionType], Field(max_length=2)]], Field(description="List of types of attribution for the conversion report")] = Query(None, description="List of types of attribution for the conversion report", alias="attribution_types"),
    reporting_timezone: Annotated[Optional[ReportingTimeZone], Field(description="Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.")] = Query(None, description="Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", alias="reporting_timezone"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> MetricsResponse:
    """Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days."""
    if not BaseCampaignsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCampaignsApi.subclasses[0]().campaign_targeting_analytics_get(ad_account_id, campaign_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types, reporting_timezone)


@router.get(
    "/ad_accounts/{ad_account_id}/campaigns/{campaign_id}",
    responses={
        200: {"model": Campaign, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["campaigns"],
    summary="Get campaign",
    response_model_by_alias=True,
)
async def campaigns_get(
    campaign_id: Annotated[str, Field(strict=True, max_length=18, description="Campaign ID, must be associated with the ad account ID provided in the path.")] = Path(..., description="Campaign ID, must be associated with the ad account ID provided in the path.", regex=r"^\d+$", max_length=18),
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> Campaign:
    """Get a specific campaign given the campaign ID."""
    if not BaseCampaignsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCampaignsApi.subclasses[0]().campaigns_get(campaign_id, ad_account_id)


@router.get(
    "/ad_accounts/{ad_account_id}/pins/analytics",
    responses={
        200: {"model": List[AdPinAnalytics], "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["campaigns"],
    summary="Get pins analytics",
    response_model_by_alias=True,
)
async def ad_pins_analytics(
    campaign_id: Annotated[str, Field(strict=True, max_length=18, description="Campaign Id to use to filter the results.")] = Query(None, description="Campaign Id to use to filter the results.", alias="campaign_id", regex=r"^\d+$", max_length=18),
    pin_ids: Annotated[List[Annotated[str, Field(strict=True)]], Field(min_length=1, max_length=100, description="List of Pin IDs.")] = Query(None, description="List of Pin IDs.", alias="pin_ids"),
    start_date: Annotated[date, Field(description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")] = Query(None, description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", alias="start_date"),
    end_date: Annotated[date, Field(description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")] = Query(None, description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", alias="end_date"),
    columns: Annotated[List[ReportingColumnSync], Field(description="Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.")] = Query(None, description="Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.", alias="columns"),
    granularity: Annotated[Granularity, Field(description="  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly")] = Query(None, description="  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", alias="granularity"),
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    click_window_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")] = Query(30, description="Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.", alias="click_window_days"),
    engagement_window_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.")] = Query(30, description="Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.", alias="engagement_window_days"),
    view_window_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.")] = Query(1, description="Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.", alias="view_window_days"),
    conversion_report_time: Annotated[Optional[StrictStr], Field(description="The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")] = Query('TIME_OF_AD_ACTION', description="The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", alias="conversion_report_time"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> List[AdPinAnalytics]:
    """Get analytics for the pins given a campaign and pins in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics."""
    if not BaseCampaignsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCampaignsApi.subclasses[0]().ad_pins_analytics(campaign_id, pin_ids, start_date, end_date, columns, granularity, ad_account_id, click_window_days, engagement_window_days, view_window_days, conversion_report_time)
