# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.lead_form_array_response import LeadFormArrayResponse  # noqa: E501
from app.openapi_server.models.lead_form_create_request import LeadFormCreateRequest  # noqa: E501
from app.openapi_server.models.lead_form_response import LeadFormResponse  # noqa: E501
from app.openapi_server.models.lead_form_test_request import LeadFormTestRequest  # noqa: E501
from app.openapi_server.models.lead_form_test_response import LeadFormTestResponse  # noqa: E501
from app.openapi_server.models.lead_form_update_request import LeadFormUpdateRequest  # noqa: E501
from app.openapi_server.models.lead_forms_list200_response import LeadFormsList200Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestLeadFormsController(BaseTestCase):
    """LeadFormsController integration test stubs"""

    def test_lead_form_get(self):
        """Test case for lead_form_get

        Get lead form by id
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}'.format(ad_account_id='ad_account_id_example', lead_form_id='1234567890123'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_lead_form_test_create(self):
        """Test case for lead_form_test_create

        Create lead form test data
        """
        body = {"answers":["John","Doe","abc@email.com","987654321"]}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test'.format(ad_account_id='ad_account_id_example', lead_form_id='1234567890123'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_lead_forms_create(self):
        """Test case for lead_forms_create

        Create lead forms
        """
        body = {"completion_message":"Thank you for submitting. We will contact you soon.","disclosure_language":"By entering your personal information, you agree that your data will be collected and used.","name":"Lead Form 3/14/2023","questions":[{"question_type":"CUSTOM","custom_question_field_type":"CHECKBOX","custom_question_label":"What is your favorite animal?","custom_question_options":["Dog","Cat","Bird","Turtle"]}],"policy_links":[{"label":"Copyright","link":"https://policy.pinterest.com/en/copyright"}],"has_accepted_terms":False,"privacy_policy_link":"https://www.advertisername.com/privacy-policy","status":"DRAFT"}
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
        query_string = [('page_size', 25),
                        ('order', 'ASCENDING'),
                        ('bookmark', 'bookmark_example')]
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
        body = {"completion_message":"Thank you for submitting. We will contact you soon.","disclosure_language":"By entering your personal information, you agree that your data will be collected and used.","name":"Lead Form 3/14/2023","questions":[{"question_type":"CUSTOM","custom_question_field_type":"CHECKBOX","custom_question_label":"What is your favorite animal?","custom_question_options":["Dog","Cat","Bird","Turtle"]}],"policy_links":[{"label":"Copyright","link":"https://policy.pinterest.com/en/copyright"}],"has_accepted_terms":False,"id":"7765300871171","privacy_policy_link":"https://www.advertisername.com/privacy-policy","status":"DRAFT"}
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
