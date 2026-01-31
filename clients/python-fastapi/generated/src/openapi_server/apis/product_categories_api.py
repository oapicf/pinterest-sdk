# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.product_categories_api_base import BaseProductCategoriesApi
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
from pydantic import Field
from typing import List, Optional
from typing_extensions import Annotated
from openapi_server.models.age_trends_bucket import AgeTrendsBucket
from openapi_server.models.featured_trend import FeaturedTrend
from openapi_server.models.gender_bucket import GenderBucket
from openapi_server.models.interests_enum import InterestsEnum
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.product_categories_engagement_type import ProductCategoriesEngagementType
from openapi_server.models.product_category_detail_lookback_window import ProductCategoryDetailLookbackWindow
from openapi_server.models.product_category_details import ProductCategoryDetails
from openapi_server.models.product_category_enum import ProductCategoryEnum
from openapi_server.models.product_category_region import ProductCategoryRegion
from openapi_server.models.trending_product_category import TrendingProductCategory
from openapi_server.models.vertical_product_category import VerticalProductCategory
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/trends/topics/featured",
    responses={
        200: {"model": List[FeaturedTrend], "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["product_categories"],
    summary="Get featured topics",
    response_model_by_alias=True,
)
async def trends_featured_topics_list(
    region: Annotated[ProductCategoryRegion, Field(description="      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada")] = Query(None, description="      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada", alias="region"),
    interest: Annotated[Optional[InterestsEnum], Field(description="Interest to filter by")] = Query(None, description="Interest to filter by", alias="interest"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["user_accounts:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["user_accounts:read"]
    ),
) -> List[FeaturedTrend]:
    """  Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI."""
    if not BaseProductCategoriesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseProductCategoriesApi.subclasses[0]().trends_featured_topics_list(region, interest)


@router.get(
    "/trends/product_categories/details",
    responses={
        200: {"model": List[ProductCategoryDetails], "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["product_categories"],
    summary="Get product category details",
    response_model_by_alias=True,
)
async def trends_product_categories_details_list(
    product_categories: Annotated[List[ProductCategoryEnum], Field(min_length=1, max_length=20, description="List of product categories")] = Query(None, description="List of product categories", alias="product_categories"),
    region: Annotated[ProductCategoryRegion, Field(description="      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada")] = Query(None, description="      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada", alias="region"),
    lookback_window: Annotated[Optional[ProductCategoryDetailLookbackWindow], Field(description="   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - `90` - Last 90 days (3 months)   - `180` - Last 180 days (6 months)   - `365` - Last 365 days (1 year)   - `730` - Last 730 days (2 years)")] = Query(None, description="   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years)", alias="lookback_window"),
    engagement_type: Annotated[Optional[ProductCategoriesEngagementType], Field(description="     Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves")] = Query(None, description="     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves", alias="engagement_type"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["user_accounts:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["user_accounts:read"]
    ),
) -> List[ProductCategoryDetails]:
    """  Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories"""
    if not BaseProductCategoriesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseProductCategoriesApi.subclasses[0]().trends_product_categories_details_list(product_categories, region, lookback_window, engagement_type)


@router.get(
    "/trends/product_categories/trending",
    responses={
        200: {"model": List[TrendingProductCategory], "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["product_categories"],
    summary="Get a list of growing Shopping Product Categories",
    response_model_by_alias=True,
)
async def trends_product_categories_trending_list(
    region: Annotated[ProductCategoryRegion, Field(description="      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada")] = Query(None, description="      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada", alias="region"),
    verticals: Annotated[Optional[List[VerticalProductCategory]], Field(description="List of verticals to filter by")] = Query(None, description="List of verticals to filter by", alias="verticals"),
    ages: Annotated[Optional[List[AgeTrendsBucket]], Field(description="Age to filter by. If not provided, the results will be filtered by all ages.")] = Query(None, description="Age to filter by. If not provided, the results will be filtered by all ages.", alias="ages"),
    genders: Annotated[Optional[List[GenderBucket]], Field(description="Gender to filter by, If not provided, the results will be filtered by all genders.")] = Query(None, description="Gender to filter by, If not provided, the results will be filtered by all genders.", alias="genders"),
    engagement_type: Annotated[Optional[ProductCategoriesEngagementType], Field(description="     Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves")] = Query(None, description="     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves", alias="engagement_type"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["user_accounts:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["user_accounts:read"]
    ),
) -> List[TrendingProductCategory]:
    """  Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender."""
    if not BaseProductCategoriesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseProductCategoriesApi.subclasses[0]().trends_product_categories_trending_list(region, verticals, ages, genders, engagement_type)
