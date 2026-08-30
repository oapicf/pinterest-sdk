# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.ad_groups_api_base import BaseAdGroupsApi
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
from openapi_server.models.ad_group import AdGroup
from openapi_server.models.ad_group_audience_sizing import AdGroupAudienceSizing
from openapi_server.models.ad_group_audience_sizing_create import AdGroupAudienceSizingCreate
from openapi_server.models.ad_group_create_create import AdGroupCreateCreate
from openapi_server.models.ad_group_update_batch_update import AdGroupUpdateBatchUpdate
from openapi_server.models.ad_groups_analytics_metrics import AdGroupsAnalyticsMetrics
from openapi_server.models.ad_groups_create200_response import AdGroupsCreate200Response
from openapi_server.models.ad_groups_list200_response import AdGroupsList200Response
from openapi_server.models.ads_analytics_ad_group_targeting_type import AdsAnalyticsAdGroupTargetingType
from openapi_server.models.bid_floor import BidFloor
from openapi_server.models.bid_floor_create import BidFloorCreate
from openapi_server.models.conversion_report_attribution_type import ConversionReportAttributionType
from openapi_server.models.dynamic_titles_download_csv import DynamicTitlesDownloadCSV
from openapi_server.models.dynamic_titles_get_status import DynamicTitlesGetStatus
from openapi_server.models.dynamic_titles_process_csv import DynamicTitlesProcessCSV
from openapi_server.models.dynamic_titles_process_csv_create import DynamicTitlesProcessCSVCreate
from openapi_server.models.dynamic_titles_upload_url import DynamicTitlesUploadURL
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
    "/ad_accounts/{ad_account_id}/ad_groups",
    responses={
        200: {"model": AdGroupsList200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["ad_groups"],
    summary="List ad groups",
    response_model_by_alias=True,
)
async def ad_groups_list(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    order: Annotated[Optional[PinterestLibPaginationOrder], Field(description="The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.")] = Query(None, description="The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.", alias="order"),
    campaign_ids: Annotated[Optional[Annotated[List[Annotated[str, Field(strict=True, max_length=18)]], Field(min_length=1, max_length=250)]], Field(description="List of Campaign Ids to use to filter the results.")] = Query(None, description="List of Campaign Ids to use to filter the results.", alias="campaign_ids"),
    ad_group_ids: Annotated[Optional[Annotated[List[Annotated[str, Field(strict=True)]], Field(min_length=1, max_length=250)]], Field(description="List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.")] = Query(None, description="List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.", alias="ad_group_ids"),
    entity_statuses: Annotated[Optional[List[EntityStatus]], Field(description="Entity status")] = Query(["ACTIVE","PAUSED"], description="Entity status", alias="entity_statuses"),
    translate_interests_to_names: Annotated[Optional[StrictBool], Field(description="Return interests as text names (if value is true) rather than topic IDs.")] = Query(False, description="Return interests as text names (if value is true) rather than topic IDs.", alias="translate_interests_to_names"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> AdGroupsList200Response:
    """List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both."""
    if not BaseAdGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdGroupsApi.subclasses[0]().ad_groups_list(ad_account_id, bookmark, page_size, order, campaign_ids, ad_group_ids, entity_statuses, translate_interests_to_names)


@router.post(
    "/ad_accounts/{ad_account_id}/ad_groups",
    responses={
        200: {"model": AdGroupsCreate200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["ad_groups"],
    summary="Create ad groups",
    response_model_by_alias=True,
)
async def ad_groups_create(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    ad_group_create_create: Annotated[List[AdGroupCreateCreate], Field(min_length=1, max_length=30)] = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> AdGroupsCreate200Response:
    """Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - &#x60;bid_in_micro_currency&#x60; and &#x60;budget_in_micro_currency&#x60; should be expressed in microcurrency amounts based on the currency field set in the advertiser&#39;s profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency: - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set &#x60;start_time&#x60; and &#x60;end_time&#x60; at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: &#x60;TRAFFIC&#x60;, &#x60;AWARENESS&#x60;, &#x60;WEB_CONVERSIONS&#x60;, and &#x60;CATALOG_SALES&#x60;. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule."""
    if not BaseAdGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdGroupsApi.subclasses[0]().ad_groups_create(ad_account_id, ad_group_create_create)


@router.patch(
    "/ad_accounts/{ad_account_id}/ad_groups",
    responses={
        200: {"model": AdGroupsCreate200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["ad_groups"],
    summary="Update ad groups",
    response_model_by_alias=True,
)
async def ad_groups_update(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    ad_group_update_batch_update: Annotated[List[AdGroupUpdateBatchUpdate], Field(min_length=1, max_length=30)] = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> AdGroupsCreate200Response:
    """Update multiple existing ad groups."""
    if not BaseAdGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdGroupsApi.subclasses[0]().ad_groups_update(ad_account_id, ad_group_update_batch_update)


@router.get(
    "/ad_accounts/{ad_account_id}/ad_groups/analytics",
    responses={
        200: {"model": List[AdGroupsAnalyticsMetrics], "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["ad_groups"],
    summary="Get ad group analytics",
    response_model_by_alias=True,
)
async def ad_groups_analytics(
    start_date: Annotated[date, Field(description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")] = Query(None, description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", alias="start_date"),
    end_date: Annotated[date, Field(description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")] = Query(None, description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", alias="end_date"),
    ad_group_ids: Annotated[List[Annotated[str, Field(strict=True, max_length=18)]], Field(min_length=1, max_length=250, description="List of Ad group Ids to use to filter the results.")] = Query(None, description="List of Ad group Ids to use to filter the results.", alias="ad_group_ids"),
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
) -> List[AdGroupsAnalyticsMetrics]:
    """Get analytics for the specified ad groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days."""
    if not BaseAdGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdGroupsApi.subclasses[0]().ad_groups_analytics(start_date, end_date, ad_group_ids, columns, granularity, ad_account_id, click_window_days, engagement_window_days, view_window_days, conversion_report_time, aggregate_report_rows, reporting_timezone)


@router.post(
    "/ad_accounts/{ad_account_id}/ad_groups/audience_sizing",
    responses={
        200: {"model": AdGroupAudienceSizing, "description": "The request has succeeded."},
        201: {"model": AdGroupAudienceSizing, "description": "Resource create operation completed successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["ad_groups"],
    summary="Get audience sizing",
    response_model_by_alias=True,
)
async def ad_groups_audience_sizing(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    ad_group_audience_sizing_create: AdGroupAudienceSizingCreate = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> AdGroupAudienceSizing:
    """Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments."""
    if not BaseAdGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdGroupsApi.subclasses[0]().ad_groups_audience_sizing(ad_account_id, ad_group_audience_sizing_create)


@router.get(
    "/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics",
    responses={
        200: {"model": MetricsResponse, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["ad_groups"],
    summary="Get targeting analytics for ad groups",
    response_model_by_alias=True,
)
async def ad_groups_targeting_analytics_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    ad_group_ids: Annotated[List[Annotated[str, Field(strict=True, max_length=18)]], Field(min_length=1, max_length=250, description="List of Ad group Ids to use to filter the results.")] = Query(None, description="List of Ad group Ids to use to filter the results.", alias="ad_group_ids"),
    start_date: Annotated[date, Field(description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")] = Query(None, description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", alias="start_date"),
    end_date: Annotated[date, Field(description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")] = Query(None, description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", alias="end_date"),
    targeting_types: Annotated[List[AdsAnalyticsAdGroupTargetingType], Field(min_length=1, max_length=14, description="Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\", \"CREATIVE_ENHANCEMENTS\"] are in BETA and not yet available to all users.")] = Query(None, description="Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;, \&quot;CREATIVE_ENHANCEMENTS\&quot;] are in BETA and not yet available to all users.", alias="targeting_types"),
    columns: Annotated[List[ReportingColumnSync], Field(description="Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.")] = Query(None, description="Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.", alias="columns"),
    granularity: Annotated[Granularity, Field(description="  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly")] = Query(None, description="  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", alias="granularity"),
    click_window_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")] = Query(30, description="Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.", alias="click_window_days"),
    engagement_window_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.")] = Query(30, description="Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.", alias="engagement_window_days"),
    view_window_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.")] = Query(1, description="Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.", alias="view_window_days"),
    conversion_report_time: Annotated[Optional[StrictStr], Field(description="The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")] = Query('TIME_OF_AD_ACTION', description="The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", alias="conversion_report_time"),
    attribution_types: Annotated[Optional[Annotated[List[ConversionReportAttributionType], Field(max_length=2)]], Field(description="List of types of attribution for the conversion report")] = Query(None, description="List of types of attribution for the conversion report", alias="attribution_types"),
    reporting_timezone: Annotated[Optional[ReportingTimeZone], Field(description="Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.")] = Query(None, description="Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", alias="reporting_timezone"),
    sort_columns: Annotated[Optional[Annotated[List[StrictStr], Field(min_length=1, max_length=2)]], Field(description="Sort Columns.")] = Query(None, description="Sort Columns.", alias="sort_columns"),
    sort_ascending: Annotated[Optional[StrictBool], Field(description="Sort ascending.")] = Query(None, description="Sort ascending.", alias="sort_ascending"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> MetricsResponse:
    """Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days."""
    if not BaseAdGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdGroupsApi.subclasses[0]().ad_groups_targeting_analytics_get(ad_account_id, ad_group_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types, reporting_timezone, sort_columns, sort_ascending)


@router.get(
    "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}",
    responses={
        200: {"model": AdGroup, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["ad_groups"],
    summary="Get ad group",
    response_model_by_alias=True,
)
async def ad_groups_get(
    ad_group_id: Annotated[str, Field(strict=True, max_length=18, description="Ad group ID.")] = Path(..., description="Ad group ID.", regex=r"^\d+$", max_length=18),
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> AdGroup:
    """Get a specific ad group given the ad group ID."""
    if not BaseAdGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdGroupsApi.subclasses[0]().ad_groups_get(ad_group_id, ad_account_id)


@router.post(
    "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles",
    responses={
        200: {"model": DynamicTitlesProcessCSV, "description": "The request has succeeded."},
        201: {"model": DynamicTitlesProcessCSV, "description": "Resource create operation completed successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["ad_groups"],
    summary="Process dynamic titles CSV",
    response_model_by_alias=True,
)
async def ad_groups_dynamic_titles_process_csv(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    ad_group_id: Annotated[str, Field(strict=True, max_length=18, description="Ad group ID.")] = Path(..., description="Ad group ID.", regex=r"^\d+$", max_length=18),
    dynamic_titles_process_csv_create: DynamicTitlesProcessCSVCreate = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> DynamicTitlesProcessCSV:
    """Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid."""
    if not BaseAdGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdGroupsApi.subclasses[0]().ad_groups_dynamic_titles_process_csv(ad_account_id, ad_group_id, dynamic_titles_process_csv_create)


@router.get(
    "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv",
    responses={
        200: {"model": DynamicTitlesDownloadCSV, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["ad_groups"],
    summary="Get dynamic titles CSV download URL",
    response_model_by_alias=True,
)
async def ad_groups_dynamic_titles_download_csv(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    ad_group_id: Annotated[str, Field(strict=True, max_length=18, description="Ad group ID.")] = Path(..., description="Ad group ID.", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> DynamicTitlesDownloadCSV:
    """Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet."""
    if not BaseAdGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdGroupsApi.subclasses[0]().ad_groups_dynamic_titles_download_csv(ad_account_id, ad_group_id)


@router.get(
    "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status",
    responses={
        200: {"model": DynamicTitlesGetStatus, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["ad_groups"],
    summary="Get dynamic titles status",
    response_model_by_alias=True,
)
async def ad_groups_dynamic_titles_get_status(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    ad_group_id: Annotated[str, Field(strict=True, max_length=18, description="Ad group ID.")] = Path(..., description="Ad group ID.", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> DynamicTitlesGetStatus:
    """Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles."""
    if not BaseAdGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdGroupsApi.subclasses[0]().ad_groups_dynamic_titles_get_status(ad_account_id, ad_group_id)


@router.get(
    "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads",
    responses={
        200: {"model": DynamicTitlesUploadURL, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["ad_groups"],
    summary="Get dynamic titles upload URL",
    response_model_by_alias=True,
)
async def ad_groups_dynamic_titles_get_upload_url(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    ad_group_id: Annotated[str, Field(strict=True, max_length=18, description="Ad group ID.")] = Path(..., description="Ad group ID.", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> DynamicTitlesUploadURL:
    """Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission."""
    if not BaseAdGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdGroupsApi.subclasses[0]().ad_groups_dynamic_titles_get_upload_url(ad_account_id, ad_group_id)


@router.post(
    "/ad_accounts/{ad_account_id}/bid_floor",
    responses={
        200: {"model": BidFloor, "description": "The request has succeeded."},
        201: {"model": BidFloor, "description": "Resource create operation completed successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["ad_groups"],
    summary="Get bid floors",
    response_model_by_alias=True,
)
async def ad_groups_bid_floor_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    bid_floor_create: BidFloorCreate = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> BidFloor:
    """List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  * $1 &#x3D; 1,000,000 microdollars * 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid)."""
    if not BaseAdGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdGroupsApi.subclasses[0]().ad_groups_bid_floor_get(ad_account_id, bid_floor_create)


@router.get(
    "/ad_accounts/{ad_account_id}/promotion_applied_entities",
    responses={
        200: {"model": AdGroupsList200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["ad_groups"],
    summary="List of ad groups using promotions IDs.",
    response_model_by_alias=True,
)
async def get_ad_groups_by_promotion_ids_list(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    promotion_ids: Annotated[List[StrictStr], Field(min_length=1, max_length=50, description="List of Promotion IDs to use to filter the results.")] = Query(None, description="List of Promotion IDs to use to filter the results.", alias="promotion_ids"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    order: Annotated[Optional[PinterestLibPaginationOrder], Field(description="The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.")] = Query(None, description="The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.", alias="order"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> AdGroupsList200Response:
    """  Get a list of ad groups that are associated with those promotion ids"""
    if not BaseAdGroupsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAdGroupsApi.subclasses[0]().get_ad_groups_by_promotion_ids_list(ad_account_id, promotion_ids, bookmark, page_size, order)
