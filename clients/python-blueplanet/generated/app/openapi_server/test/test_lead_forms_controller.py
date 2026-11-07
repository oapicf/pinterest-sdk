# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.lead_form import LeadForm  # noqa: E501
from app.openapi_server.models.lead_form_batch_update import LeadFormBatchUpdate  # noqa: E501
from app.openapi_server.models.lead_form_create import LeadFormCreate  # noqa: E501
from app.openapi_server.models.lead_form_test import LeadFormTest  # noqa: E501
from app.openapi_server.models.lead_form_test_create import LeadFormTestCreate  # noqa: E501
from app.openapi_server.models.lead_forms_create200_response import LeadFormsCreate200Response  # noqa: E501
from app.openapi_server.models.lead_forms_list200_response import LeadFormsList200Response  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: E501
from openapi_server.test import BaseTestCase


class TestLeadFormsController(BaseTestCase):
    """LeadFormsController integration test stubs"""

    def test_lead_form_get(self):
        """Test case for lead_form_get

        Get lead form by id
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}'.format(lead_form_id='lead_form_id_example', ad_account_id='ad_account_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_lead_form_test_create(self):
        """Test case for lead_form_test_create

        Create lead form test data
        """
        body = {"answers":["John","Doe","abc@email.com","987654321"]}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test'.format(ad_account_id='ad_account_id_example', lead_form_id='lead_form_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_lead_forms_create(self):
        """Test case for lead_forms_create

        Create lead forms
        """
        body = {"completion_message":"Thank you for submitting. We will contact you soon.","disclosure_language":"By entering your personal information, you agree that your data will be collected and used.","has_accepted_terms":False,"name":"Lead Form 3/14/2023","policy_links":[{"label":"Copyright","link":"https://policy.pinterest.com/en/copyright"}],"privacy_policy_link":"https://www.advertisername.com/privacy-policy","questions":[{"question_type":"CUSTOM","custom_question_field_type":"CHECKBOX","custom_question_label":"What is your favorite animal?","custom_question_options":["Dog","Cat","Bird","Turtle"]}],"status":"DRAFT"}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/lead_forms'.format(ad_account_id='ad_account_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_lead_forms_list(self):
        """Test case for lead_forms_list

        List lead forms
        """
        query_string = [('bookmark', 'bookmark_example'),
                        ('page_size', 25),
                        ('order', openapi_server.PinterestLibPaginationOrder())]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/lead_forms'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_lead_forms_update(self):
        """Test case for lead_forms_update

        Update lead forms
        """
        body = {"completion_message":"Thank you for submitting. We will contact you soon.","disclosure_language":"By entering your personal information, you agree that your data will be collected and used.","has_accepted_terms":False,"id":"id","name":"Lead Form 3/14/2023","policy_links":[{"label":"Copyright","link":"https://policy.pinterest.com/en/copyright"}],"privacy_policy_link":"https://www.advertisername.com/privacy-policy","questions":[{"question_type":"CUSTOM","custom_question_field_type":"CHECKBOX","custom_question_label":"What is your favorite animal?","custom_question_options":["Dog","Cat","Bird","Turtle"]}],"status":"DRAFT"}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/lead_forms'.format(ad_account_id='ad_account_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
