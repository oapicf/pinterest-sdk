# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from datetime import date
from pydantic import Field, StrictBool, StrictStr, field_validator
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.ads_credit_redeem_request import AdsCreditRedeemRequest
from openapi_server.models.ads_credit_redeem_response import AdsCreditRedeemResponse
from openapi_server.models.ads_credits_discounts_get200_response import AdsCreditsDiscountsGet200Response
from openapi_server.models.billing_invoice_download_response import BillingInvoiceDownloadResponse
from openapi_server.models.billing_invoices_get200_response import BillingInvoicesGet200Response
from openapi_server.models.billing_profiles_get200_response import BillingProfilesGet200Response
from openapi_server.models.error import Error
from openapi_server.models.ssio_account_response import SSIOAccountResponse
from openapi_server.models.ssio_create_insertion_order_request import SSIOCreateInsertionOrderRequest
from openapi_server.models.ssio_create_insertion_order_response import SSIOCreateInsertionOrderResponse
from openapi_server.models.ssio_edit_insertion_order_request import SSIOEditInsertionOrderRequest
from openapi_server.models.ssio_edit_insertion_order_response import SSIOEditInsertionOrderResponse
from openapi_server.models.ssio_insertion_order_status_response import SSIOInsertionOrderStatusResponse
from openapi_server.models.ssio_insertion_orders_status_get_by_ad_account200_response import SsioInsertionOrdersStatusGetByAdAccount200Response
from openapi_server.models.ssio_order_lines_get_by_ad_account200_response import SsioOrderLinesGetByAdAccount200Response
from openapi_server.security_api import get_token_pinterest_oauth2

class BaseBillingApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseBillingApi.subclasses = BaseBillingApi.subclasses + (cls,)
    async def ads_credits_discounts_get(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")],
    ) -> AdsCreditsDiscountsGet200Response:
        """Returns the list of discounts applied to the account.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/using-beta-and-restricted-features/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;"""
        ...


    async def ads_credit_redeem(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        ads_credit_redeem_request: Annotated[AdsCreditRedeemRequest, Field(description="Redeem ad credits request.")],
    ) -> AdsCreditRedeemResponse:
        """Redeem ads credit on behalf of the ad account id and apply it towards billing.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/using-beta-and-restricted-features/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;"""
        ...


    async def billing_profiles_get(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        is_active: Annotated[StrictBool, Field(description="Return active billing profiles, if false return all billing profiles.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")],
    ) -> BillingProfilesGet200Response:
        """Get billing profiles in the advertiser account.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/using-beta-and-restricted-features/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;"""
        ...


    async def billing_invoices_get(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")],
        sort: Annotated[Optional[StrictStr], Field(description="Field of which to sort billing invoices")],
        order: Annotated[Optional[StrictStr], Field(description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")],
        status: Annotated[Optional[StrictStr], Field(description="Status of billing invoices to filter by")],
        document_type: Annotated[Optional[StrictStr], Field(description="Document type of billing invoices to filter by")],
        start_due_date: Annotated[Optional[date], Field(description="Starting point for due dates when searching for invoices. Format: YYYY-MM-DD")],
        end_due_date: Annotated[Optional[date], Field(description="Ending point for due dates when searching for invoices. Format: YYYY-MM-DD")],
    ) -> BillingInvoicesGet200Response:
        """Get billing invoices in the advertiser account."""
        ...


    async def billing_invoice_download_get(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        billing_invoice_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of a billing invoice.")],
    ) -> BillingInvoiceDownloadResponse:
        """Get download url for a billing invoice."""
        ...


    async def ssio_accounts_get(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
    ) -> SSIOAccountResponse:
        """Get Salesforce account details including bill-to information to be used in insertion orders process for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign."""
        ...


    async def ssio_insertion_order_create(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        ssio_create_insertion_order_request: Annotated[SSIOCreateInsertionOrderRequest, Field(description="Order line to create.")],
    ) -> SSIOCreateInsertionOrderResponse:
        """Create insertion order through SSIO for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign."""
        ...


    async def ssio_insertion_order_edit(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        ssio_edit_insertion_order_request: Annotated[SSIOEditInsertionOrderRequest, Field(description="Order line to create.")],
    ) -> SSIOEditInsertionOrderResponse:
        """Edit insertion order through SSIO for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign."""
        ...


    async def ssio_insertion_orders_status_get_by_ad_account(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")],
    ) -> SsioInsertionOrdersStatusGetByAdAccount200Response:
        """Get insertion order status for account id &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign."""
        ...


    async def ssio_insertion_orders_status_get_by_pin_order_id(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        pin_order_id: Annotated[StrictStr, Field(description="The pin order id associated with the ssio insertion order")],
    ) -> SSIOInsertionOrderStatusResponse:
        """Get insertion order status for pin order id &lt;code&gt;pin_order_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign."""
        ...


    async def ssio_order_lines_get_by_ad_account(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")],
        pin_order_id: Annotated[Optional[StrictStr], Field(description="The pin order id associated with the ssio insertino order")],
    ) -> SsioOrderLinesGetByAdAccount200Response:
        """Get Salesforce order lines for account id &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign."""
        ...
