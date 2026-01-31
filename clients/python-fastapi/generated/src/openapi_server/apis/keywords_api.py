# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.keywords_api_base import BaseKeywordsApi
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
from pydantic import Field, StrictBool, StrictStr, field_validator
from typing import List, Optional
from typing_extensions import Annotated
from openapi_server.models.error import Error
from openapi_server.models.keyword_update_body import KeywordUpdateBody
from openapi_server.models.keywords_get200_response import KeywordsGet200Response
from openapi_server.models.keywords_metrics_array_response import KeywordsMetricsArrayResponse
from openapi_server.models.keywords_request import KeywordsRequest
from openapi_server.models.keywords_response import KeywordsResponse
from openapi_server.models.match_type import MatchType
from openapi_server.models.trend_type import TrendType
from openapi_server.models.trending_keywords_response import TrendingKeywordsResponse
from openapi_server.models.trends_supported_region import TrendsSupportedRegion
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/ad_accounts/{ad_account_id}/keywords",
    responses={
        200: {"model": KeywordsGet200Response, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["keywords"],
    summary="Get keywords",
    response_model_by_alias=True,
)
async def keywords_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    campaign_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Campaign Id to use to filter the results.")] = Query(None, description="Campaign Id to use to filter the results.", alias="campaign_id", regex=r"^\d+$", max_length=18),
    ad_group_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Ad group Id.")] = Query(None, description="Ad group Id.", alias="ad_group_id", regex=r"^\d+$", max_length=18),
    ad_group_ids: Annotated[Optional[Annotated[List[Annotated[str, Field(strict=True, max_length=18)]], Field(min_length=1, max_length=250)]], Field(description="List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.")] = Query(None, description="List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.", alias="ad_group_ids"),
    match_types: Annotated[Optional[Annotated[List[MatchType], Field(min_length=1, max_length=5)]], Field(description="Keyword <a target=\"_blank\" href=\"/docs/api-features/targeting-overview/\">match type</a>")] = Query(None, description="Keyword &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/docs/api-features/targeting-overview/\&quot;&gt;match type&lt;/a&gt;", alias="match_types"),
    page_size: Annotated[Optional[Annotated[int, Field(strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. Default maximum of 250. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. Default maximum of 250. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> KeywordsGet200Response:
    """&lt;p&gt;Get a list of keywords based on the filters provided. If no filter is provided, it will default to the ad_account_id filter, which means it will only return keywords that specifically have parent_id set to the ad_account_id. Note: Keywords can have ad_account_ids, campaign_ids, and ad_group_ids set as their parent_ids. Keywords created through Ads Manager will have their parent_id set to an ad_group_id, not ad_account_id.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/keyword-targeting\&quot;&gt;Keyword targeting&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Notes:&lt;/b&gt;&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: square;\&quot;&gt; &lt;li&gt;Advertisers and campaigns can only be assigned keywords with excluding (&#39;_NEGATIVE&#39;).&lt;/li&gt; &lt;li&gt;All keyword match types are available for ad groups.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;For more information on match types, see &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/docs/api-features/targeting-overview/\&quot;&gt;match type enums&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Returns:&lt;/b&gt;&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: square;\&quot;&gt; &lt;li&gt;&lt;p&gt;A successful call returns an object containing an array of new keyword objects and an empty &amp;quot;errors&amp;quot; object array.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &amp;quot;errors&amp;quot; object array:&lt;/p&gt; &lt;pre class&#x3D;\&quot;last literal-block\&quot;&gt; { \&quot;keywords\&quot;: [], \&quot;errors\&quot;: [ { \&quot;data\&quot;: { \&quot;archived\&quot;: null, \&quot;match_type\&quot;: \&quot;EXACT\&quot;, \&quot;parent_type\&quot;: null, \&quot;value\&quot;: \&quot;foobar\&quot;, \&quot;parent_id\&quot;: null, \&quot;type\&quot;: \&quot;keyword\&quot;, \&quot;id\&quot;: null }, \&quot;error_messages\&quot;: [ \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot; ] } } &lt;/pre&gt;&lt;/li&gt; &lt;/ul&gt;"""
    if not BaseKeywordsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseKeywordsApi.subclasses[0]().keywords_get(ad_account_id, campaign_id, ad_group_id, ad_group_ids, match_types, page_size, bookmark)


@router.post(
    "/ad_accounts/{ad_account_id}/keywords",
    responses={
        200: {"model": KeywordsResponse, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["keywords"],
    summary="Create keywords",
    response_model_by_alias=True,
)
async def keywords_create(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    keywords_request: KeywordsRequest = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> KeywordsResponse:
    """&lt;p&gt;Create keywords for following entity types(advertiser, campaign, ad group or ad).&lt;/p&gt; &lt;p&gt;For more information, see &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/keyword-targeting\&quot;&gt;Keyword targeting&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Notes:&lt;/b&gt;&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: square;\&quot;&gt; &lt;li&gt;Advertisers and campaigns can only be assigned keywords with excluding (&#39;_NEGATIVE&#39;).&lt;/li&gt; &lt;li&gt;All keyword match types are available for ad groups.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;For more information on match types, see &lt;a  target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/docs/api-features/targeting-overview/\&quot;&gt;match type enums&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Returns:&lt;/b&gt;&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: square;\&quot;&gt; &lt;li&gt;&lt;p&gt;A successful call returns an object containing an array of new keyword objects and an empty &amp;quot;errors&amp;quot; object array.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &amp;quot;errors&amp;quot; object array:&lt;/p&gt; &lt;pre class&#x3D;\&quot;last literal-block\&quot;&gt; { \&quot;keywords\&quot;: [], \&quot;errors\&quot;: [ { \&quot;data\&quot;: { \&quot;archived\&quot;: null, \&quot;match_type\&quot;: \&quot;EXACT\&quot;, \&quot;parent_type\&quot;: null, \&quot;value\&quot;: \&quot;foobar\&quot;, \&quot;parent_id\&quot;: null, \&quot;type\&quot;: \&quot;keyword\&quot;, \&quot;id\&quot;: null }, \&quot;error_messages\&quot;: [ \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot; ] } } &lt;/pre&gt;&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;b&gt;Rate limit&lt;/b&gt;: &lt;a href&#x3D;\&quot;/docs/reference/rate-limits/\&quot;&gt;WRITE&lt;/a&gt;.&lt;/p&gt;"""
    if not BaseKeywordsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseKeywordsApi.subclasses[0]().keywords_create(ad_account_id, keywords_request)


@router.patch(
    "/ad_accounts/{ad_account_id}/keywords",
    responses={
        200: {"model": KeywordsResponse, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["keywords"],
    summary="Update keywords",
    response_model_by_alias=True,
)
async def keywords_update(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    keyword_update_body: KeywordUpdateBody = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> KeywordsResponse:
    """&lt;p&gt;Update one or more keywords&#39; bid and archived fields.&lt;/p&gt; &lt;p&gt;Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity&#39;s keywords list.&lt;/p&gt;"""
    if not BaseKeywordsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseKeywordsApi.subclasses[0]().keywords_update(ad_account_id, keyword_update_body)


@router.get(
    "/ad_accounts/{ad_account_id}/keywords/metrics",
    responses={
        200: {"model": KeywordsMetricsArrayResponse, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["keywords"],
    summary="Get country&#39;s keyword metrics",
    response_model_by_alias=True,
)
async def country_keywords_metrics_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    country_code: Annotated[StrictStr, Field(description="Two letter country code (ISO 3166-1 alpha-2)")] = Query(None, description="Two letter country code (ISO 3166-1 alpha-2)", alias="country_code"),
    keywords: Annotated[List[StrictStr], Field(min_length=1, max_length=2000, description="Comma-separated keywords")] = Query(None, description="Comma-separated keywords", alias="keywords"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> KeywordsMetricsArrayResponse:
    """See keyword metrics for a specified country, aggregated across all of Pinterest. (Definitions are available from the \&quot;Get delivery metrics definitions\&quot; &lt;a href&#x3D;\&quot;/docs/api/v5/#operation/delivery_metrics/get\&quot;&gt;API endpoint&lt;/a&gt;)."""
    if not BaseKeywordsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseKeywordsApi.subclasses[0]().country_keywords_metrics_get(ad_account_id, country_code, keywords)


@router.get(
    "/trends/keywords/{region}/top/{trend_type}",
    responses={
        200: {"model": TrendingKeywordsResponse, "description": "Success"},
        400: {"model": Error, "description": "Invalid trending keywords request parameters"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["keywords"],
    summary="List trending keywords",
    response_model_by_alias=True,
)
async def trending_keywords_list(
    region: Annotated[TrendsSupportedRegion, Field(description="The geographic region of interest. Only top trends within the specified region will be returned.<br /> The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`, corresponding to the following geographic areas: - `US` - United States - `CA` - Canada - `DE` - Germany - `FR` - France - `ES` - Spain - `IT` - Italy - `DE+AT+CH` - Germanic countries - `GB+IE` - Great Britain & Ireland - `IT+ES+PT+GR+MT` - Southern Europe - `PL+RO+HU+SK+CZ` - Eastern Europe - `SE+DK+FI+NO` - Nordic countries - `NL+BE+LU` - Benelux - `AR` - Argentina - `BR` - Brazil - `CO` - Colombia - `MX` - Mexico - `MX+AR+CO+CL` - Hispanic LatAm - `AU+NZ` - Australasia")] = Path(..., description="The geographic region of interest. Only top trends within the specified region will be returned.&lt;br /&gt; The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;, corresponding to the following geographic areas: - &#x60;US&#x60; - United States - &#x60;CA&#x60; - Canada - &#x60;DE&#x60; - Germany - &#x60;FR&#x60; - France - &#x60;ES&#x60; - Spain - &#x60;IT&#x60; - Italy - &#x60;DE+AT+CH&#x60; - Germanic countries - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland - &#x60;IT+ES+PT+GR+MT&#x60; - Southern Europe - &#x60;PL+RO+HU+SK+CZ&#x60; - Eastern Europe - &#x60;SE+DK+FI+NO&#x60; - Nordic countries - &#x60;NL+BE+LU&#x60; - Benelux - &#x60;AR&#x60; - Argentina - &#x60;BR&#x60; - Brazil - &#x60;CO&#x60; - Colombia - &#x60;MX&#x60; - Mexico - &#x60;MX+AR+CO+CL&#x60; - Hispanic LatAm - &#x60;AU+NZ&#x60; - Australasia"),
    trend_type: Annotated[TrendType, Field(description="The methodology used to rank how trendy a keyword is. - `growing` trends have high upward growth in search volume over the last quarter - `monthly` trends have high search volume in the last month - `yearly` trends have high search volume in the last year - `seasonal` trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual)")] = Path(..., description="The methodology used to rank how trendy a keyword is. - &#x60;growing&#x60; trends have high upward growth in search volume over the last quarter - &#x60;monthly&#x60; trends have high search volume in the last month - &#x60;yearly&#x60; trends have high search volume in the last year - &#x60;seasonal&#x60; trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual)"),
    interests: Annotated[Optional[List[StrictStr]], Field(description="If set, filters the results to trends associated with the specified interests.<br /> If unset, trends for all interests will be returned.<br /> The list of supported interests is: - `animals` - Animals - `architecture` - Architecture - `art` - Art - `beauty` - Beauty - `childrens_fashion` - Children's Fashion - `design` - Design - `diy_and_crafts` - DIY & Crafts - `education` - Education - `electronics` - Electronics - `entertainment` - Entertainment - `event_planning` - Event Planning - `finance` - Finance - `food_and_drinks` - Food & Drink - `gardening` - Gardening - `health` - Health - `home_decor` - Home Decor - `mens_fashion` - Men's Fashion - `parenting` - Parenting - `quotes` - Quotes - `sport` - Sports - `travel` - Travel - `vehicles` - Vehicles - `wedding` - Wedding - `womens_fashion` - Women's Fashion")] = Query(None, description="If set, filters the results to trends associated with the specified interests.&lt;br /&gt; If unset, trends for all interests will be returned.&lt;br /&gt; The list of supported interests is: - &#x60;animals&#x60; - Animals - &#x60;architecture&#x60; - Architecture - &#x60;art&#x60; - Art - &#x60;beauty&#x60; - Beauty - &#x60;childrens_fashion&#x60; - Children&#39;s Fashion - &#x60;design&#x60; - Design - &#x60;diy_and_crafts&#x60; - DIY &amp; Crafts - &#x60;education&#x60; - Education - &#x60;electronics&#x60; - Electronics - &#x60;entertainment&#x60; - Entertainment - &#x60;event_planning&#x60; - Event Planning - &#x60;finance&#x60; - Finance - &#x60;food_and_drinks&#x60; - Food &amp; Drink - &#x60;gardening&#x60; - Gardening - &#x60;health&#x60; - Health - &#x60;home_decor&#x60; - Home Decor - &#x60;mens_fashion&#x60; - Men&#39;s Fashion - &#x60;parenting&#x60; - Parenting - &#x60;quotes&#x60; - Quotes - &#x60;sport&#x60; - Sports - &#x60;travel&#x60; - Travel - &#x60;vehicles&#x60; - Vehicles - &#x60;wedding&#x60; - Wedding - &#x60;womens_fashion&#x60; - Women&#39;s Fashion", alias="interests"),
    genders: Annotated[Optional[List[StrictStr]], Field(description="If set, filters the results to trends among users who identify with the specified gender(s).<br /> If unset, trends among all genders will be returned.<br /> The `unknown` group includes users with unspecified or customized gender profile settings.")] = Query(None, description="If set, filters the results to trends among users who identify with the specified gender(s).&lt;br /&gt; If unset, trends among all genders will be returned.&lt;br /&gt; The &#x60;unknown&#x60; group includes users with unspecified or customized gender profile settings.", alias="genders"),
    ages: Annotated[Optional[List[StrictStr]], Field(description="If set, filters the results to trends among users in the specified age range(s).<br /> If unset, trends among all age groups will be returned.")] = Query(None, description="If set, filters the results to trends among users in the specified age range(s).&lt;br /&gt; If unset, trends among all age groups will be returned.", alias="ages"),
    include_keywords: Annotated[Optional[Annotated[List[Annotated[str, Field(min_length=1, strict=True, max_length=100)]], Field(min_length=1, max_length=50)]], Field(description="If set, filters the results to top trends which include at least one of the specified keywords.<br /> If unset, no keyword filtering logic is applied.")] = Query(None, description="If set, filters the results to top trends which include at least one of the specified keywords.&lt;br /&gt; If unset, no keyword filtering logic is applied.", alias="include_keywords"),
    normalize_against_group: Annotated[Optional[StrictBool], Field(description="Governs how the resulting time series data will be normalized to a [0-100] scale.<br /> By default (`false`), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword's time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.<br /> If set to `true`, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords.")] = Query(False, description="Governs how the resulting time series data will be normalized to a [0-100] scale.&lt;br /&gt; By default (&#x60;false&#x60;), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword&#39;s time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.&lt;br /&gt; If set to &#x60;true&#x60;, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords.", alias="normalize_against_group"),
    limit: Annotated[Optional[Annotated[int, Field(le=50, strict=True, ge=1)]], Field(description="The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a `limit` of 50 will return the top 50 trends.")] = Query(50, description="The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a &#x60;limit&#x60; of 50 will return the top 50 trends.", alias="limit", ge=1, le=50),
    include_prediction: Annotated[Optional[StrictBool], Field(description="<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a> Including predicted weekly search volume data for the next 90 days. By default (`false`), the response will not include predicted data.")] = Query(False, description="&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt; Including predicted weekly search volume data for the next 90 days. By default (&#x60;false&#x60;), the response will not include predicted data.", alias="include_prediction"),
    include_demographics: Annotated[Optional[StrictBool], Field(description="<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a> Including the age and gender distribution for each keyword. By default (`false`), the response will not include demographics data.")] = Query(False, description="&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt; Including the age and gender distribution for each keyword. By default (&#x60;false&#x60;), the response will not include demographics data.", alias="include_demographics"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["user_accounts:read"]
    ),
) -> TrendingKeywordsResponse:
    """&lt;p&gt;Get the top trending search keywords among the Pinterest user audience.&lt;/p&gt; &lt;p&gt;Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.&lt;/p&gt; &lt;p&gt;Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.&lt;/p&gt; &lt;p&gt;For an interactive way to explore this data, please visit &lt;a href&#x3D;\&quot;https://trends.pinterest.com\&quot;&gt;trends.pinterest.com&lt;/a&gt;. """
    if not BaseKeywordsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseKeywordsApi.subclasses[0]().trending_keywords_list(region, trend_type, interests, genders, ages, include_keywords, normalize_against_group, limit, include_prediction, include_demographics)
