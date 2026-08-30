# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictBool, StrictInt, StrictStr, field_validator
from typing import Any, List, Optional
from typing_extensions import Annotated
from openapi_server.models.catalogs_list_products_by_filter_request import CatalogsListProductsByFilterRequest
from openapi_server.models.catalogs_product_group_pins_list200_response import CatalogsProductGroupPinsList200Response
from openapi_server.models.catalogs_product_group_product_counts_vertical import CatalogsProductGroupProductCountsVertical
from openapi_server.models.catalogs_product_groups_create_many_request_items import CatalogsProductGroupsCreateManyRequestItems
from openapi_server.models.catalogs_product_groups_create_request_schema import CatalogsProductGroupsCreateRequestSchema
from openapi_server.models.catalogs_product_groups_list200_response import CatalogsProductGroupsList200Response
from openapi_server.models.catalogs_product_groups_update_request_schema import CatalogsProductGroupsUpdateRequestSchema
from openapi_server.models.catalogs_vertical_product_group import CatalogsVerticalProductGroup
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

class BaseCatalogProductGroupsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseCatalogProductGroupsApi.subclasses = BaseCatalogProductGroupsApi.subclasses + (cls,)
    async def catalogs_product_groups_list(
        self,
        id: Annotated[Optional[Annotated[List[StrictInt], Field(min_length=1, max_length=1000)]], Field(description="Comma-separated list of product group ids")],
        feed_id: Annotated[Optional[Annotated[str, Field(strict=True)]], Field(description="Filter entities for a given feed_id. If not given, all feeds are considered.")],
        catalog_id: Annotated[Optional[Annotated[str, Field(strict=True)]], Field(description="Filter entities for a given catalog_id. If not given, all catalogs are considered.")],
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
    ) -> CatalogsProductGroupsList200Response:
        """Get a list of product groups for a given Catalogs Feed Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)"""
        ...


    async def catalogs_product_groups_create(
        self,
        catalogs_product_groups_create_request_schema: CatalogsProductGroupsCreateRequestSchema,
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> CatalogsVerticalProductGroup:
        """Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \&quot;Catalog-based product groups\&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \&quot;retail feed-based\&quot; option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager."""
        ...


    async def catalogs_product_groups_create_many(
        self,
        catalogs_product_groups_create_many_request_items: Annotated[List[CatalogsProductGroupsCreateManyRequestItems], Field(min_length=1, max_length=1000)],
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> List[str]:
        """Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager."""
        ...


    async def catalogs_product_groups_delete_many(
        self,
        id: Annotated[List[StrictInt], Field(min_length=1, max_length=1000, description="Comma-separated list of product group ids")],
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> None:
        """Delete product groups owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)"""
        ...


    async def catalogs_product_groups_get(
        self,
        product_group_id: Annotated[str, Field(strict=True, description="Unique identifier of a product group")],
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> CatalogsVerticalProductGroup:
        """Get a single product group for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)"""
        ...


    async def catalogs_product_groups_delete(
        self,
        product_group_id: Annotated[str, Field(strict=True, description="Unique identifier of a product group")],
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> CatalogsVerticalProductGroup:
        """Delete a product group owned by the \&quot;operation user_account\&quot; from being in use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)"""
        ...


    async def catalogs_product_groups_update(
        self,
        product_group_id: Annotated[str, Field(strict=True, description="Unique identifier of a product group")],
        catalogs_product_groups_update_request_schema: CatalogsProductGroupsUpdateRequestSchema,
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> CatalogsVerticalProductGroup:
        """Update product group owned by the \&quot;operation user_account\&quot; to use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \&quot;Catalog-based product groups\&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \&quot;retail feed-based\&quot; option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager."""
        ...


    async def catalogs_product_groups_product_counts_get(
        self,
        product_group_id: Annotated[str, Field(strict=True, description="Unique identifier of a product group")],
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> CatalogsProductGroupProductCountsVertical:
        """Get a product counts for a given Catalogs Product Group owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)"""
        ...


    async def catalogs_product_group_pins_list(
        self,
        product_group_id: Annotated[str, Field(strict=True, description="Unique identifier of a product group")],
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
        pin_metrics: Annotated[Optional[StrictBool], Field(description="Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
    ) -> CatalogsProductGroupPinsList200Response:
        """Get a list of product pins for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)"""
        ...


    async def products_by_product_group_filter_list(
        self,
        catalogs_list_products_by_filter_request: CatalogsListProductsByFilterRequest,
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
        pin_metrics: Annotated[Optional[StrictBool], Field(description="Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.")],
    ) -> CatalogsProductGroupPinsList200Response:
        """List products Pins owned by the \&quot;operation user_account\&quot; that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  [Learn more](/docs/api-features/shopping-overview/)"""
        ...
