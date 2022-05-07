# coding: utf-8

from typing import Dict, List  # noqa: F401

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
from openapi_server.models.ads_analytics_create_async_request import AdsAnalyticsCreateAsyncRequest
from openapi_server.models.ads_analytics_create_async_response import AdsAnalyticsCreateAsyncResponse
from openapi_server.models.ads_analytics_get_async_response import AdsAnalyticsGetAsyncResponse
from openapi_server.models.error import Error
from openapi_server.models.granularity import Granularity
from openapi_server.models.paginated import Paginated
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()


@router.get(
    "/ad_accounts/{ad_account_id}/analytics",
    responses={
        200: {"model": List[Dict[str, object]], "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account analytics parameters."},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["ad_accounts"],
    summary="Get ad account analytics",
)
async def ad_account_analytics(
    ad_account_id: str = Path(None, description="Unique identifier of an ad account.", regex=r"^\d+$"),
    start_date: str = Query(None, description="Metric report start date (UTC). Format: YYYY-MM-DD"),
    end_date: str = Query(None, description="Metric report end date (UTC). Format: YYYY-MM-DD"),
    columns: List[str] = Query(None, description="Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned"),
    granularity:  = Query(None, description="Granularity"),
    click_window_days: int = Query(30, description="Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days."),
    engagement_window_days: int = Query(30, description="Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days."),
    view_window_days: int = Query(1, description="Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day."),
    conversion_report_time: str = Query(&#39;TIME_OF_AD_ACTION&#39;, description="The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> List[Dict[str, object]]:
    """Get analytics for the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager."""
    ...


@router.get(
    "/ad_accounts",
    responses={
        200: {"model": Paginated, "description": "response"},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["ad_accounts"],
    summary="List ad accounts",
)
async def ad_accounts_list(
    bookmark: str = Query(None, description="Cursor used to fetch the next page of items"),
    page_size: int = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.", ge=1, le=100),
    include_shared_accounts: bool = Query(True, description="Include shared ad accounts"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> Paginated:
    """Get a list of the ad_accounts that the \&quot;operation user_account\&quot; has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;."""
    ...


@router.get(
    "/ad_accounts/{ad_account_id}/ad_groups/analytics",
    responses={
        200: {"model": List[Dict[str, object]], "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account group analytics parameters."},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["ad_accounts"],
    summary="Get ad group analytics",
)
async def ad_groups_analytics(
    ad_account_id: str = Path(None, description="Unique identifier of an ad account.", regex=r"^\d+$"),
    start_date: str = Query(None, description="Metric report start date (UTC). Format: YYYY-MM-DD"),
    end_date: str = Query(None, description="Metric report end date (UTC). Format: YYYY-MM-DD"),
    ad_group_ids: List[str] = Query(None, description="List of Ad group Ids to use to filter the results."),
    columns: List[str] = Query(None, description="Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned"),
    granularity:  = Query(None, description="Granularity"),
    click_window_days: int = Query(30, description="Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days."),
    engagement_window_days: int = Query(30, description="Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days."),
    view_window_days: int = Query(1, description="Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day."),
    conversion_report_time: str = Query(&#39;TIME_OF_AD_ACTION&#39;, description="The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> List[Dict[str, object]]:
    """Get analytics for the specified ad groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager."""
    ...


@router.get(
    "/ad_accounts/{ad_account_id}/ad_groups",
    responses={
        200: {"model": Paginated, "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account group parameters."},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["ad_accounts"],
    summary="List ad groups",
)
async def ad_groups_list(
    ad_account_id: str = Path(None, description="Unique identifier of an ad account.", regex=r"^\d+$"),
    campaign_ids: List[str] = Query(None, description="List of Campaign Ids to use to filter the results."),
    ad_group_ids: List[str] = Query(None, description="List of Ad group Ids to use to filter the results."),
    entity_statuses: List[str] = Query(None, description="Entity status"),
    page_size: int = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.", ge=1, le=100),
    order: str = Query(None, description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items."),
    bookmark: str = Query(None, description="Cursor used to fetch the next page of items"),
    translate_interests_to_names: bool = Query(False, description="Return interests as text names (if value is true) rather than topic IDs."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> Paginated:
    """Get a list of the ad groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager."""
    ...


@router.get(
    "/ad_accounts/{ad_account_id}/ads/analytics",
    responses={
        200: {"model": List[Dict[str, object]], "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account ads analytics parameters."},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["ad_accounts"],
    summary="Get ad analytics",
)
async def ads_analytics(
    ad_account_id: str = Path(None, description="Unique identifier of an ad account.", regex=r"^\d+$"),
    start_date: str = Query(None, description="Metric report start date (UTC). Format: YYYY-MM-DD"),
    end_date: str = Query(None, description="Metric report end date (UTC). Format: YYYY-MM-DD"),
    ad_ids: List[str] = Query(None, description="List of Ad Ids to use to filter the results."),
    columns: List[str] = Query(None, description="Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned"),
    granularity:  = Query(None, description="Granularity"),
    click_window_days: int = Query(30, description="Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days."),
    engagement_window_days: int = Query(30, description="Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days."),
    view_window_days: int = Query(1, description="Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day."),
    conversion_report_time: str = Query(&#39;TIME_OF_AD_ACTION&#39;, description="The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> List[Dict[str, object]]:
    """Get analytics for the specified ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager."""
    ...


@router.get(
    "/ad_accounts/{ad_account_id}/ads",
    responses={
        200: {"model": Paginated, "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account ads parameters."},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["ad_accounts"],
    summary="List ads",
)
async def ads_list(
    ad_account_id: str = Path(None, description="Unique identifier of an ad account.", regex=r"^\d+$"),
    campaign_ids: List[str] = Query(None, description="List of Campaign Ids to use to filter the results."),
    ad_group_ids: List[str] = Query(None, description="List of Ad group Ids to use to filter the results."),
    ad_ids: List[str] = Query(None, description="List of Ad Ids to use to filter the results."),
    entity_statuses: List[str] = Query(None, description="Entity status"),
    page_size: int = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.", ge=1, le=100),
    order: str = Query(None, description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items."),
    bookmark: str = Query(None, description="Cursor used to fetch the next page of items"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> Paginated:
    """Get a list of the ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager."""
    ...


@router.post(
    "/ad_accounts/{ad_account_id}/reports",
    responses={
        200: {"model": AdsAnalyticsCreateAsyncResponse, "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account ads analytics parameters."},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["ad_accounts"],
    summary="Create async request for an account analytics report",
)
async def analytics_create_report(
    ad_account_id: str = Path(None, description="Unique identifier of an ad account.", regex=r"^\d+$"),
    ads_analytics_create_async_request: AdsAnalyticsCreateAsyncRequest = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> AdsAnalyticsCreateAsyncResponse:
    """This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager."""
    ...


@router.get(
    "/ad_accounts/{ad_account_id}/reports",
    responses={
        200: {"model": AdsAnalyticsGetAsyncResponse, "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account ads analytics parameters."},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["ad_accounts"],
    summary="Get the account analytics report created by the async call",
)
async def analytics_get_report(
    ad_account_id: str = Path(None, description="Unique identifier of an ad account.", regex=r"^\d+$"),
    token: str = Query(None, description="Token returned from the post request creation call"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> AdsAnalyticsGetAsyncResponse:
    """This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it&#39;s valid for an hour. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager."""
    ...


@router.get(
    "/ad_accounts/{ad_account_id}/campaigns/analytics",
    responses={
        200: {"model": List[Dict[str, object]], "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account campaign analytics parameters."},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["ad_accounts"],
    summary="Get campaign analytics",
)
async def campaigns_analytics(
    ad_account_id: str = Path(None, description="Unique identifier of an ad account.", regex=r"^\d+$"),
    start_date: str = Query(None, description="Metric report start date (UTC). Format: YYYY-MM-DD"),
    end_date: str = Query(None, description="Metric report end date (UTC). Format: YYYY-MM-DD"),
    campaign_ids: List[str] = Query(None, description="List of Campaign Ids to use to filter the results."),
    columns: List[str] = Query(None, description="Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned"),
    granularity:  = Query(None, description="Granularity"),
    click_window_days: int = Query(30, description="Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days."),
    engagement_window_days: int = Query(30, description="Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days."),
    view_window_days: int = Query(1, description="Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day."),
    conversion_report_time: str = Query(&#39;TIME_OF_AD_ACTION&#39;, description="The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> List[Dict[str, object]]:
    """Get analytics for the specified campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager."""
    ...


@router.get(
    "/ad_accounts/{ad_account_id}/campaigns",
    responses={
        200: {"model": Paginated, "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account campaign parameters."},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["ad_accounts"],
    summary="List campaigns",
)
async def campaigns_list(
    ad_account_id: str = Path(None, description="Unique identifier of an ad account.", regex=r"^\d+$"),
    campaign_ids: List[str] = Query(None, description="List of Campaign Ids to use to filter the results."),
    entity_statuses: List[str] = Query(None, description="Entity status"),
    page_size: int = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.", ge=1, le=100),
    order: str = Query(None, description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items."),
    bookmark: str = Query(None, description="Cursor used to fetch the next page of items"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> Paginated:
    """Get a list of the campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager."""
    ...


@router.get(
    "/ad_accounts/{ad_account_id}/product_groups/analytics",
    responses={
        200: {"model": List[Dict[str, object]], "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account ads analytics parameters."},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["ad_accounts"],
    summary="Get product group analytics",
)
async def product_groups_analytics(
    ad_account_id: str = Path(None, description="Unique identifier of an ad account.", regex=r"^\d+$"),
    start_date: str = Query(None, description="Metric report start date (UTC). Format: YYYY-MM-DD"),
    end_date: str = Query(None, description="Metric report end date (UTC). Format: YYYY-MM-DD"),
    product_group_ids: List[str] = Query(None, description="List of Product group Ids to use to filter the results."),
    columns: List[str] = Query(None, description="Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned"),
    granularity:  = Query(None, description="Granularity"),
    click_window_days: int = Query(30, description="Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days."),
    engagement_window_days: int = Query(30, description="Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days."),
    view_window_days: int = Query(1, description="Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day."),
    conversion_report_time: str = Query(&#39;TIME_OF_AD_ACTION&#39;, description="The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> List[Dict[str, object]]:
    """Get analytics for the specified product groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager."""
    ...
