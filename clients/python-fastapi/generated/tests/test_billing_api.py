# coding: utf-8

from fastapi.testclient import TestClient


from datetime import date  # noqa: F401
from pydantic import Field, field_validator  # noqa: F401
from typing import Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.ads_credit_redeem import AdsCreditRedeem  # noqa: F401
from openapi_server.models.ads_credit_redeem_create import AdsCreditRedeemCreate  # noqa: F401
from openapi_server.models.ads_credits_discounts_get200_response import AdsCreditsDiscountsGet200Response  # noqa: F401
from openapi_server.models.billing_invoice_document_type import BillingInvoiceDocumentType  # noqa: F401
from openapi_server.models.billing_invoice_download_response import BillingInvoiceDownloadResponse  # noqa: F401
from openapi_server.models.billing_invoice_sort_field import BillingInvoiceSortField  # noqa: F401
from openapi_server.models.billing_invoice_status import BillingInvoiceStatus  # noqa: F401
from openapi_server.models.billing_invoices_get200_response import BillingInvoicesGet200Response  # noqa: F401
from openapi_server.models.billing_profiles_get200_response import BillingProfilesGet200Response  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: F401
from openapi_server.models.ssio_account import SSIOAccount  # noqa: F401
from openapi_server.models.ssio_insertion_order import SSIOInsertionOrder  # noqa: F401
from openapi_server.models.ssio_insertion_order_create import SSIOInsertionOrderCreate  # noqa: F401
from openapi_server.models.ssio_insertion_order_status_response import SSIOInsertionOrderStatusResponse  # noqa: F401
from openapi_server.models.ssio_insertion_order_update import SSIOInsertionOrderUpdate  # noqa: F401
from openapi_server.models.ssio_insertion_orders_status_get_by_ad_account200_response import SsioInsertionOrdersStatusGetByAdAccount200Response  # noqa: F401
from openapi_server.models.ssio_order_lines_get_by_ad_account200_response import SsioOrderLinesGetByAdAccount200Response  # noqa: F401


def test_ads_credits_discounts_get(client: TestClient):
    """Test case for ads_credits_discounts_get

    Get ads credit discounts
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/ads_credit/discounts".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ads_credit_redeem(client: TestClient):
    """Test case for ads_credit_redeem

    Redeem ad credits
    """
    ads_credit_redeem_create = openapi_server.AdsCreditRedeemCreate()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/ads_credit/redeem".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=ads_credit_redeem_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_billing_invoice_download_get(client: TestClient):
    """Test case for billing_invoice_download_get

    Get download url for a billing invoice
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download".format(ad_account_id='ad_account_id_example', billing_invoice_id='billing_invoice_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_billing_invoices_get(client: TestClient):
    """Test case for billing_invoices_get

    Get billing invoices
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25),     ("order", openapi_server.PinterestLibPaginationOrder()),     ("sort", 'DUE_DATE'),     ("status", openapi_server.BillingInvoiceStatus()),     ("document_type", openapi_server.BillingInvoiceDocumentType()),     ("start_due_date", '2013-10-20'),     ("end_due_date", '2013-10-20')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/billing_invoices".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_billing_profiles_get(client: TestClient):
    """Test case for billing_profiles_get

    Get billing profiles
    """
    params = [("is_active", True),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/billing_profiles".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ssio_accounts_get(client: TestClient):
    """Test case for ssio_accounts_get

    Get Salesforce account details including bill-to information.
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/ssio/accounts".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ssio_insertion_order_create(client: TestClient):
    """Test case for ssio_insertion_order_create

    Create insertion order through SSIO.
    """
    ssio_insertion_order_create = openapi_server.SSIOInsertionOrderCreate()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/ssio/insertion_orders".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=ssio_insertion_order_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ssio_insertion_order_edit(client: TestClient):
    """Test case for ssio_insertion_order_edit

    Edit insertion order through SSIO.
    """
    ssio_insertion_order_update = openapi_server.SSIOInsertionOrderUpdate()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/ad_accounts/{ad_account_id}/ssio/insertion_orders".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=ssio_insertion_order_update,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ssio_insertion_orders_status_get_by_ad_account(client: TestClient):
    """Test case for ssio_insertion_orders_status_get_by_ad_account

    Get insertion order status by ad account id.
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/ssio/insertion_orders/status".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ssio_insertion_orders_status_get_by_pin_order_id(client: TestClient):
    """Test case for ssio_insertion_orders_status_get_by_pin_order_id

    Get insertion order status by pin order id.
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status".format(ad_account_id='ad_account_id_example', pin_order_id='pin_order_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ssio_order_lines_get_by_ad_account(client: TestClient):
    """Test case for ssio_order_lines_get_by_ad_account

    Get Salesforce order lines by ad account id.
    """
    params = [("pin_order_id", 'pin_order_id_example'),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/ssio/order_lines".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

