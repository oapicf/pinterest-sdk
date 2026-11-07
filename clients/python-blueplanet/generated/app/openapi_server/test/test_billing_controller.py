# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.ads_credit_redeem import AdsCreditRedeem  # noqa: E501
from app.openapi_server.models.ads_credit_redeem_create import AdsCreditRedeemCreate  # noqa: E501
from app.openapi_server.models.ads_credits_discounts_get200_response import AdsCreditsDiscountsGet200Response  # noqa: E501
from app.openapi_server.models.billing_invoice_document_type import BillingInvoiceDocumentType  # noqa: E501
from app.openapi_server.models.billing_invoice_download_response import BillingInvoiceDownloadResponse  # noqa: E501
from app.openapi_server.models.billing_invoice_sort_field import BillingInvoiceSortField  # noqa: E501
from app.openapi_server.models.billing_invoice_status import BillingInvoiceStatus  # noqa: E501
from app.openapi_server.models.billing_invoices_get200_response import BillingInvoicesGet200Response  # noqa: E501
from app.openapi_server.models.billing_profiles_get200_response import BillingProfilesGet200Response  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: E501
from app.openapi_server.models.ssio_account import SSIOAccount  # noqa: E501
from app.openapi_server.models.ssio_insertion_order import SSIOInsertionOrder  # noqa: E501
from app.openapi_server.models.ssio_insertion_order_create import SSIOInsertionOrderCreate  # noqa: E501
from app.openapi_server.models.ssio_insertion_order_status_response import SSIOInsertionOrderStatusResponse  # noqa: E501
from app.openapi_server.models.ssio_insertion_order_update import SSIOInsertionOrderUpdate  # noqa: E501
from app.openapi_server.models.ssio_insertion_orders_status_get_by_ad_account200_response import SsioInsertionOrdersStatusGetByAdAccount200Response  # noqa: E501
from app.openapi_server.models.ssio_order_lines_get_by_ad_account200_response import SsioOrderLinesGetByAdAccount200Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBillingController(BaseTestCase):
    """BillingController integration test stubs"""

    def test_ads_credit_redeem(self):
        """Test case for ads_credit_redeem

        Redeem ad credits
        """
        body = {"offerCodeHash":"138e9e0ff7e38cf511b880975eb574c09aa9d5e1657590ab0431040da68caa67","validateOnly":True}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/ads_credit/redeem'.format(ad_account_id='ad_account_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ads_credits_discounts_get(self):
        """Test case for ads_credits_discounts_get

        Get ads credit discounts
        """
        query_string = [('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/ads_credit/discounts'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_billing_invoice_download_get(self):
        """Test case for billing_invoice_download_get

        Get download url for a billing invoice
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download'.format(ad_account_id='ad_account_id_example', billing_invoice_id='billing_invoice_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_billing_invoices_get(self):
        """Test case for billing_invoices_get

        Get billing invoices
        """
        query_string = [('bookmark', 'bookmark_example'),
                        ('page_size', 25),
                        ('order', openapi_server.PinterestLibPaginationOrder()),
                        ('sort', 'DUE_DATE'),
                        ('status', openapi_server.BillingInvoiceStatus()),
                        ('document_type', openapi_server.BillingInvoiceDocumentType()),
                        ('start_due_date', '2013-10-20'),
                        ('end_due_date', '2013-10-20')]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/billing_invoices'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_billing_profiles_get(self):
        """Test case for billing_profiles_get

        Get billing profiles
        """
        query_string = [('is_active', True),
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/billing_profiles'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ssio_accounts_get(self):
        """Test case for ssio_accounts_get

        Get Salesforce account details including bill-to information.
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/ssio/accounts'.format(ad_account_id='ad_account_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ssio_insertion_order_create(self):
        """Test case for ssio_insertion_order_create

        Create insertion order through SSIO.
        """
        body = {"accepted_terms_id":"accepted_terms_id","accepted_terms_time":0,"agency_link":"agency_link","billing_contact_email":"billing_contact_email","billing_contact_firstname":"billing_contact_firstname","billing_contact_lastname":"billing_contact_lastname","billto_billing_address_id":"billto_billing_address_id","billto_business_address_id":"billto_business_address_id","billto_company_id":"billto_company_id","budget_amount":6.027456183070403,"currency_info":"UNK","end_date":"end_date","estimated_monthly_spend":1.4658129805029452,"media_contact_email":"media_contact_email","media_contact_firstname":"media_contact_firstname","media_contact_lastname":"media_contact_lastname","order_line_type":"","order_name":"order_name","pmp_id":"pmp_id","po_number":"po_number","start_date":"start_date","user_email":"user_email"}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders'.format(ad_account_id='ad_account_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ssio_insertion_order_edit(self):
        """Test case for ssio_insertion_order_edit

        Edit insertion order through SSIO.
        """
        body = {"ads_manager_order_line_id":"ads_manager_order_line_id","agency_link":"agency_link","billing_contact_email":"billing_contact_email","billing_contact_firstname":"billing_contact_firstname","billing_contact_lastname":"billing_contact_lastname","budget_amount":0.8008281904610115,"end_date":"end_date","media_contact_email":"media_contact_email","media_contact_firstname":"media_contact_firstname","media_contact_lastname":"media_contact_lastname","oracle_line_id":"oracle_line_id","po_number":"po_number","salesforce_order_id":"salesforce_order_id","salesforce_order_line_id":"salesforce_order_line_id","start_date":"start_date","user_email":"user_email"}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders'.format(ad_account_id='ad_account_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ssio_insertion_orders_status_get_by_ad_account(self):
        """Test case for ssio_insertion_orders_status_get_by_ad_account

        Get insertion order status by ad account id.
        """
        query_string = [('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders/status'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ssio_insertion_orders_status_get_by_pin_order_id(self):
        """Test case for ssio_insertion_orders_status_get_by_pin_order_id

        Get insertion order status by pin order id.
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status'.format(ad_account_id='ad_account_id_example', pin_order_id='pin_order_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ssio_order_lines_get_by_ad_account(self):
        """Test case for ssio_order_lines_get_by_ad_account

        Get Salesforce order lines by ad account id.
        """
        query_string = [('pin_order_id', 'pin_order_id_example'),
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/ssio/order_lines'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
