# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from datetime import date
from pydantic import Field, StrictBool, StrictStr, field_validator
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.ads_credit_redeem import AdsCreditRedeem
from openapi_server.models.ads_credit_redeem_create import AdsCreditRedeemCreate
from openapi_server.models.ads_credits_discounts_get200_response import AdsCreditsDiscountsGet200Response
from openapi_server.models.billing_invoice_document_type import BillingInvoiceDocumentType
from openapi_server.models.billing_invoice_download_response import BillingInvoiceDownloadResponse
from openapi_server.models.billing_invoice_sort_field import BillingInvoiceSortField
from openapi_server.models.billing_invoice_status import BillingInvoiceStatus
from openapi_server.models.billing_invoices_get200_response import BillingInvoicesGet200Response
from openapi_server.models.billing_profiles_get200_response import BillingProfilesGet200Response
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder
from openapi_server.models.ssio_account import SSIOAccount
from openapi_server.models.ssio_insertion_order import SSIOInsertionOrder
from openapi_server.models.ssio_insertion_order_create import SSIOInsertionOrderCreate
from openapi_server.models.ssio_insertion_order_status_response import SSIOInsertionOrderStatusResponse
from openapi_server.models.ssio_insertion_order_update import SSIOInsertionOrderUpdate
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
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
    ) -> AdsCreditsDiscountsGet200Response:
        """Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**"""
        ...


    async def ads_credit_redeem(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        ads_credit_redeem_create: AdsCreditRedeemCreate,
    ) -> AdsCreditRedeem:
        """Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**"""
        ...


    async def billing_invoice_download_get(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        billing_invoice_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of a billing invoice.")],
    ) -> BillingInvoiceDownloadResponse:
        """Get download url for a billing invoice."""
        ...


    async def billing_invoices_get(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
        order: Annotated[Optional[PinterestLibPaginationOrder], Field(description="The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.")],
        sort: Annotated[Optional[BillingInvoiceSortField], Field(description="Field of which to sort billing invoices")],
        status: Annotated[Optional[BillingInvoiceStatus], Field(description="Status of billing invoices to filter by")],
        document_type: Annotated[Optional[BillingInvoiceDocumentType], Field(description="Document type of billing invoices to filter by")],
        start_due_date: Annotated[Optional[date], Field(description="Starting point for due dates when searching for invoices. Format: YYYY-MM-DD")],
        end_due_date: Annotated[Optional[date], Field(description="Ending point for due dates when searching for invoices. Format: YYYY-MM-DD")],
    ) -> BillingInvoicesGet200Response:
        """Get billing invoices in the advertiser account."""
        ...


    async def billing_profiles_get(
        self,
        is_active: Annotated[StrictBool, Field(description="Return active billing profiles, if false return all billing profiles.")],
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
    ) -> BillingProfilesGet200Response:
        """Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**"""
        ...


    async def ssio_accounts_get(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
    ) -> SSIOAccount:
        """  Get Salesforce account details including bill-to information to be used in insertion orders process for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign."""
        ...


    async def ssio_insertion_order_create(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        ssio_insertion_order_create: SSIOInsertionOrderCreate,
    ) -> SSIOInsertionOrder:
        """  Create insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign."""
        ...


    async def ssio_insertion_order_edit(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        ssio_insertion_order_update: SSIOInsertionOrderUpdate,
    ) -> SSIOInsertionOrder:
        """  Edit insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign."""
        ...


    async def ssio_insertion_orders_status_get_by_ad_account(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
    ) -> SsioInsertionOrdersStatusGetByAdAccount200Response:
        """  Get insertion order status for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign."""
        ...


    async def ssio_insertion_orders_status_get_by_pin_order_id(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        pin_order_id: Annotated[StrictStr, Field(description="The pin order id associated with the ssio insertion order")],
    ) -> SSIOInsertionOrderStatusResponse:
        """  Get insertion order status for &#x60;pin_order_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign."""
        ...


    async def ssio_order_lines_get_by_ad_account(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        pin_order_id: Annotated[Optional[StrictStr], Field(description="The pin order id associated with the SSIO insertion order")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
    ) -> SsioOrderLinesGetByAdAccount200Response:
        """  Get Salesforce order lines for account id &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign."""
        ...
