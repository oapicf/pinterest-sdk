# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

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
from openapi_server.models.trends_editorial import TrendsEditorial
from openapi_server.models.vertical_product_category import VerticalProductCategory
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

class BaseTrendsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseTrendsApi.subclasses = BaseTrendsApi.subclasses + (cls,)
    async def trends_editorial_articles_list(
        self,
        region: Annotated[ProductCategoryRegion, Field(description="     The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada")],
    ) -> List[TrendsEditorial]:
        """  Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English."""
        ...


    async def trends_product_categories_details_list(
        self,
        product_categories: Annotated[List[ProductCategoryEnum], Field(min_length=1, max_length=20, description="List of product categories")],
        region: Annotated[ProductCategoryRegion, Field(description="     The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada")],
        lookback_window: Annotated[Optional[ProductCategoryDetailLookbackWindow], Field(description="  Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - `90` - Last 90 days (3 months)   - `180` - Last 180 days (6 months)   - `365` - Last 365 days (1 year)   - `730` - Last 730 days (2 years)")],
        engagement_type: Annotated[Optional[ProductCategoriesEngagementType], Field(description="    Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves")],
    ) -> List[ProductCategoryDetails]:
        """  Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories"""
        ...


    async def trends_product_categories_trending_list(
        self,
        region: Annotated[ProductCategoryRegion, Field(description="     The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada")],
        verticals: Annotated[Optional[List[VerticalProductCategory]], Field(description="List of verticals to filter by")],
        ages: Annotated[Optional[List[AgeTrendsBucket]], Field(description="Age to filter by. If not provided, the results will be filtered by all ages.")],
        genders: Annotated[Optional[List[GenderBucket]], Field(description="Gender to filter by, If not provided, the results will be filtered by all genders.")],
        engagement_type: Annotated[Optional[ProductCategoriesEngagementType], Field(description="    Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves")],
    ) -> List[TrendingProductCategory]:
        """  Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender."""
        ...


    async def trends_featured_topics_list(
        self,
        region: Annotated[ProductCategoryRegion, Field(description="     The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada")],
        interest: Annotated[Optional[InterestsEnum], Field(description="Interest to filter by")],
    ) -> List[FeaturedTrend]:
        """  Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI."""
        ...
