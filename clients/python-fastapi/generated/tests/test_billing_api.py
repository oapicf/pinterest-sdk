# coding: utf-8

from fastapi.testclient import TestClient


from datetime import date  # noqa: F401
from pydantic import Field, StrictBool, StrictStr, field_validator  # noqa: F401
from typing import Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.ads_credit_redeem_request import AdsCreditRedeemRequest  # noqa: F401
from openapi_server.models.ads_credit_redeem_response import AdsCreditRedeemResponse  # noqa: F401
from openapi_server.models.ads_credits_discounts_get200_response import AdsCreditsDiscountsGet200Response  # noqa: F401
from openapi_server.models.billing_invoice_download_response import BillingInvoiceDownloadResponse  # noqa: F401
from openapi_server.models.billing_invoices_get200_response import BillingInvoicesGet200Response  # noqa: F401
from openapi_server.models.billing_profiles_get200_response import BillingProfilesGet200Response  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401
from openapi_server.models.ssio_account_response import SSIOAccountResponse  # noqa: F401
from openapi_server.models.ssio_create_insertion_order_request import SSIOCreateInsertionOrderRequest  # noqa: F401
from openapi_server.models.ssio_create_insertion_order_response import SSIOCreateInsertionOrderResponse  # noqa: F401
from openapi_server.models.ssio_edit_insertion_order_request import SSIOEditInsertionOrderRequest  # noqa: F401
from openapi_server.models.ssio_edit_insertion_order_response import SSIOEditInsertionOrderResponse  # noqa: F401
from openapi_server.models.ssio_insertion_order_status_response import SSIOInsertionOrderStatusResponse  # noqa: F401
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
    ads_credit_redeem_request = {"validate_only":1,"offer_code_hash":"138e9e0ff7e38cf511b880975eb574c09aa9d5e1657590ab0431040da68caa67"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/ads_credit/redeem".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=ads_credit_redeem_request,
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


def test_billing_invoices_get(client: TestClient):
    """Test case for billing_invoices_get

    Get billing invoices
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25),     ("sort", DUE_DATE),     ("order", 'ASCENDING'),     ("status", 'OPEN'),     ("document_type", 'INVOICE'),     ("start_due_date", 'Sun Jan 01 00:00:00 UTC 2023'),     ("end_due_date", 'Mon Jan 01 00:00:00 UTC 2024')]
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
    ssio_create_insertion_order_request = {"end_date":"2020-12-20","billto_company_id":"billto_company_id","billing_contact_firstname":"billing_contact_firstname","user_email":"test@example","order_line_type":"BUDGET","currency_info":"UNK","billing_contact_email":"test@example","estimated_monthly_spend":6.027456183070403,"media_contact_email":"test@example","billing_contact_lastname":"billing_contact_lastname","order_name":"order_name","agency_link":"agency_link","po_number":"po_number","pmp_id":"pmp_id","accepted_terms_id":"accepted_terms_id","accepted_terms_time":0,"media_contact_lastname":"media_contact_lastname","budget_amount":5000000,"media_contact_firstname":"media_contact_firstname","start_date":"2020-12-20","billto_billing_address_id":"billto_billing_address_id","billto_business_address_id":"billto_business_address_id"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/ssio/insertion_orders".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=ssio_create_insertion_order_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ssio_insertion_order_edit(client: TestClient):
    """Test case for ssio_insertion_order_edit

    Edit insertion order through SSIO.
    """
    ssio_edit_insertion_order_request = {"end_date":"2020-12-20","salesforce_order_line_id":"salesforce_order_line_id","billing_contact_firstname":"billing_contact_firstname","user_email":"test@example","ads_manager_order_line_id":"ads_manager_order_line_id","billing_contact_email":"test@example","media_contact_email":"test@example","billing_contact_lastname":"billing_contact_lastname","salesforce_order_id":"salesforce_order_id","agency_link":"agency_link","po_number":"po_number","media_contact_lastname":"media_contact_lastname","budget_amount":5000000,"media_contact_firstname":"media_contact_firstname","start_date":"2020-12-20","oracle_line_id":"oracle_line_id"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/ad_accounts/{ad_account_id}/ssio/insertion_orders".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=ssio_edit_insertion_order_request,
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
    #    "/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status".format(ad_account_id='ad_account_id_example', pin_order_id='0Q01N0000015hekSVDFDC'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ssio_order_lines_get_by_ad_account(client: TestClient):
    """Test case for ssio_order_lines_get_by_ad_account

    Get Salesforce order lines by ad account id.
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25),     ("pin_order_id", '0Q01N0000015hekSVDFDC')]
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

