# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.billing_api_base import BaseBillingApi
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

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/ad_accounts/{ad_account_id}/ads_credit/discounts",
    responses={
        200: {"model": AdsCreditsDiscountsGet200Response, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error."},
    },
    tags=["billing"],
    summary="Get ads credit discounts",
    response_model_by_alias=True,
)
async def ads_credits_discounts_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read", "billing:read"]
    ),
) -> AdsCreditsDiscountsGet200Response:
    """Returns the list of discounts applied to the account.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/using-beta-and-restricted-features/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;"""
    if not BaseBillingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBillingApi.subclasses[0]().ads_credits_discounts_get(ad_account_id, bookmark, page_size)


@router.post(
    "/ad_accounts/{ad_account_id}/ads_credit/redeem",
    responses={
        200: {"model": AdsCreditRedeemResponse, "description": "Successfully redeemed ad credits."},
        400: {"model": Error, "description": "Error thrown when unable to redeem offer code."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["billing"],
    summary="Redeem ad credits",
    response_model_by_alias=True,
)
async def ads_credit_redeem(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    ads_credit_redeem_request: Annotated[AdsCreditRedeemRequest, Field(description="Redeem ad credits request.")] = Body(None, description="Redeem ad credits request."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write", "billing:write"]
    ),
) -> AdsCreditRedeemResponse:
    """Redeem ads credit on behalf of the ad account id and apply it towards billing.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/using-beta-and-restricted-features/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;"""
    if not BaseBillingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBillingApi.subclasses[0]().ads_credit_redeem(ad_account_id, ads_credit_redeem_request)


@router.get(
    "/ad_accounts/{ad_account_id}/billing_profiles",
    responses={
        200: {"model": BillingProfilesGet200Response, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error."},
    },
    tags=["billing"],
    summary="Get billing profiles",
    response_model_by_alias=True,
)
async def billing_profiles_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    is_active: Annotated[StrictBool, Field(description="Return active billing profiles, if false return all billing profiles.")] = Query(None, description="Return active billing profiles, if false return all billing profiles.", alias="is_active"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read", "billing:read"]
    ),
) -> BillingProfilesGet200Response:
    """Get billing profiles in the advertiser account.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/using-beta-and-restricted-features/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;"""
    if not BaseBillingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBillingApi.subclasses[0]().billing_profiles_get(ad_account_id, is_active, bookmark, page_size)


@router.get(
    "/ad_accounts/{ad_account_id}/billing_invoices",
    responses={
        200: {"model": BillingInvoicesGet200Response, "description": "Success"},
        400: {"model": Error, "description": "Invalid request parameter."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["billing"],
    summary="Get billing invoices",
    response_model_by_alias=True,
)
async def billing_invoices_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    sort: Annotated[Optional[StrictStr], Field(description="Field of which to sort billing invoices")] = Query(DUE_DATE, description="Field of which to sort billing invoices", alias="sort"),
    order: Annotated[Optional[StrictStr], Field(description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")] = Query(None, description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", alias="order"),
    status: Annotated[Optional[StrictStr], Field(description="Status of billing invoices to filter by")] = Query(None, description="Status of billing invoices to filter by", alias="status"),
    document_type: Annotated[Optional[StrictStr], Field(description="Document type of billing invoices to filter by")] = Query(None, description="Document type of billing invoices to filter by", alias="document_type"),
    start_due_date: Annotated[Optional[date], Field(description="Starting point for due dates when searching for invoices. Format: YYYY-MM-DD")] = Query(None, description="Starting point for due dates when searching for invoices. Format: YYYY-MM-DD", alias="start_due_date", regex=r"^(\d{4})-(\d{2})-(\d{2})$"),
    end_due_date: Annotated[Optional[date], Field(description="Ending point for due dates when searching for invoices. Format: YYYY-MM-DD")] = Query(None, description="Ending point for due dates when searching for invoices. Format: YYYY-MM-DD", alias="end_due_date", regex=r"^(\d{4})-(\d{2})-(\d{2})$"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read", "billing:read"]
    ),
) -> BillingInvoicesGet200Response:
    """Get billing invoices in the advertiser account."""
    if not BaseBillingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBillingApi.subclasses[0]().billing_invoices_get(ad_account_id, bookmark, page_size, sort, order, status, document_type, start_due_date, end_due_date)


@router.get(
    "/ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download",
    responses={
        200: {"model": BillingInvoiceDownloadResponse, "description": "Successfully fetched Billing invoice information for a given ad account"},
        400: {"model": Error, "description": "Invalid request parameter."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["billing"],
    summary="Get download url for a billing invoice",
    response_model_by_alias=True,
)
async def billing_invoice_download_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    billing_invoice_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of a billing invoice.")] = Path(..., description="Unique identifier of a billing invoice.", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read", "billing:read"]
    ),
) -> BillingInvoiceDownloadResponse:
    """Get download url for a billing invoice."""
    if not BaseBillingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBillingApi.subclasses[0]().billing_invoice_download_get(ad_account_id, billing_invoice_id)


@router.get(
    "/ad_accounts/{ad_account_id}/ssio/accounts",
    responses={
        200: {"model": SSIOAccountResponse, "description": "Success"},
        400: {"model": Error, "description": "Invalid request parameter."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["billing"],
    summary="Get Salesforce account details including bill-to information.",
    response_model_by_alias=True,
)
async def ssio_accounts_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> SSIOAccountResponse:
    """Get Salesforce account details including bill-to information to be used in insertion orders process for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign."""
    if not BaseBillingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBillingApi.subclasses[0]().ssio_accounts_get(ad_account_id)


@router.post(
    "/ad_accounts/{ad_account_id}/ssio/insertion_orders",
    responses={
        200: {"model": SSIOCreateInsertionOrderResponse, "description": "Success"},
        400: {"model": Error, "description": "Invalid request."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["billing"],
    summary="Create insertion order through SSIO.",
    response_model_by_alias=True,
)
async def ssio_insertion_order_create(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    ssio_create_insertion_order_request: Annotated[SSIOCreateInsertionOrderRequest, Field(description="Order line to create.")] = Body(None, description="Order line to create."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> SSIOCreateInsertionOrderResponse:
    """Create insertion order through SSIO for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign."""
    if not BaseBillingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBillingApi.subclasses[0]().ssio_insertion_order_create(ad_account_id, ssio_create_insertion_order_request)


@router.patch(
    "/ad_accounts/{ad_account_id}/ssio/insertion_orders",
    responses={
        200: {"model": SSIOEditInsertionOrderResponse, "description": "Success"},
        400: {"model": Error, "description": "Invalid request."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["billing"],
    summary="Edit insertion order through SSIO.",
    response_model_by_alias=True,
)
async def ssio_insertion_order_edit(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    ssio_edit_insertion_order_request: Annotated[SSIOEditInsertionOrderRequest, Field(description="Order line to create.")] = Body(None, description="Order line to create."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> SSIOEditInsertionOrderResponse:
    """Edit insertion order through SSIO for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign."""
    if not BaseBillingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBillingApi.subclasses[0]().ssio_insertion_order_edit(ad_account_id, ssio_edit_insertion_order_request)


@router.get(
    "/ad_accounts/{ad_account_id}/ssio/insertion_orders/status",
    responses={
        200: {"model": SsioInsertionOrdersStatusGetByAdAccount200Response, "description": "Success"},
        400: {"model": Error, "description": "Invalid request parameter."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["billing"],
    summary="Get insertion order status by ad account id.",
    response_model_by_alias=True,
)
async def ssio_insertion_orders_status_get_by_ad_account(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> SsioInsertionOrdersStatusGetByAdAccount200Response:
    """Get insertion order status for account id &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign."""
    if not BaseBillingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBillingApi.subclasses[0]().ssio_insertion_orders_status_get_by_ad_account(ad_account_id, bookmark, page_size)


@router.get(
    "/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status",
    responses={
        200: {"model": SSIOInsertionOrderStatusResponse, "description": "Success"},
        400: {"model": Error, "description": "Invalid request parameter."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["billing"],
    summary="Get insertion order status by pin order id.",
    response_model_by_alias=True,
)
async def ssio_insertion_orders_status_get_by_pin_order_id(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    pin_order_id: Annotated[StrictStr, Field(description="The pin order id associated with the ssio insertion order")] = Path(..., description="The pin order id associated with the ssio insertion order"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> SSIOInsertionOrderStatusResponse:
    """Get insertion order status for pin order id &lt;code&gt;pin_order_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign."""
    if not BaseBillingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBillingApi.subclasses[0]().ssio_insertion_orders_status_get_by_pin_order_id(ad_account_id, pin_order_id)


@router.get(
    "/ad_accounts/{ad_account_id}/ssio/order_lines",
    responses={
        200: {"model": SsioOrderLinesGetByAdAccount200Response, "description": "Success"},
        400: {"model": Error, "description": "Invalid request parameter."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["billing"],
    summary="Get Salesforce order lines by ad account id.",
    response_model_by_alias=True,
)
async def ssio_order_lines_get_by_ad_account(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    pin_order_id: Annotated[Optional[StrictStr], Field(description="The pin order id associated with the ssio insertino order")] = Query(None, description="The pin order id associated with the ssio insertino order", alias="pin_order_id"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> SsioOrderLinesGetByAdAccount200Response:
    """Get Salesforce order lines for account id &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign."""
    if not BaseBillingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBillingApi.subclasses[0]().ssio_order_lines_get_by_ad_account(ad_account_id, bookmark, page_size, pin_order_id)
