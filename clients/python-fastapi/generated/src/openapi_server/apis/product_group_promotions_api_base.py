# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from datetime import date
from pydantic import Field, StrictFloat, StrictInt, StrictStr, field_validator
from typing import List, Optional, Union
from typing_extensions import Annotated
from openapi_server.models.entity_status import EntityStatus
from openapi_server.models.granularity import Granularity
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder
from openapi_server.models.product_group_analytics_items import ProductGroupAnalyticsItems
from openapi_server.models.product_group_promotion import ProductGroupPromotion
from openapi_server.models.product_group_promotions import ProductGroupPromotions
from openapi_server.models.product_group_promotions_create import ProductGroupPromotionsCreate
from openapi_server.models.product_group_promotions_list200_response import ProductGroupPromotionsList200Response
from openapi_server.models.product_group_promotions_update_with_required_body import ProductGroupPromotionsUpdateWithRequiredBody
from openapi_server.models.reporting_column_sync import ReportingColumnSync
from openapi_server.models.reporting_time_zone import ReportingTimeZone
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

class BaseProductGroupPromotionsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseProductGroupPromotionsApi.subclasses = BaseProductGroupPromotionsApi.subclasses + (cls,)
    async def product_group_promotions_list(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
        order: Annotated[Optional[PinterestLibPaginationOrder], Field(description="The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.")],
        product_group_promotion_ids: Annotated[Optional[Annotated[List[Annotated[str, Field(strict=True)]], Field(min_length=1, max_length=250)]], Field(description="List of Product group promotion Ids.")],
        entity_statuses: Annotated[Optional[List[EntityStatus]], Field(description="Entity status")],
        ad_group_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Ad group Id.")],
    ) -> ProductGroupPromotionsList200Response:
        """List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  **Note:** ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error."""
        ...


    async def product_group_promotions_create(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        product_group_promotions_create: ProductGroupPromotionsCreate,
    ) -> ProductGroupPromotions:
        """Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a &#39;product group promotion.&#39;)"""
        ...


    async def product_group_promotions_update(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        product_group_promotions_update_with_required_body: ProductGroupPromotionsUpdateWithRequiredBody,
    ) -> ProductGroupPromotions:
        """Update multiple existing Product Group Promotions (by product_group_id)"""
        ...


    async def product_group_promotions_get(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        product_group_promotion_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of a product group promotion")],
    ) -> ProductGroupPromotion:
        """Get a product group promotion by id"""
        ...


    async def product_groups_analytics(
        self,
        start_date: Annotated[date, Field(description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")],
        end_date: Annotated[date, Field(description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")],
        product_group_ids: Annotated[List[Annotated[str, Field(strict=True)]], Field(min_length=1, max_length=250, description="List of Product group Ids to use to filter the results.")],
        columns: Annotated[List[ReportingColumnSync], Field(description="Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.")],
        granularity: Annotated[Granularity, Field(description="  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly")],
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        click_window_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")],
        engagement_window_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.")],
        view_window_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.")],
        conversion_report_time: Annotated[Optional[StrictStr], Field(description="The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")],
        reporting_timezone: Annotated[Optional[ReportingTimeZone], Field(description="Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.")],
    ) -> List[ProductGroupAnalyticsItems]:
        """Get analytics for the specified product groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days."""
        ...
