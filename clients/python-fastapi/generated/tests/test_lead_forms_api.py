# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, StrictStr, field_validator  # noqa: F401
from typing import List, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401
from openapi_server.models.lead_form_array_response import LeadFormArrayResponse  # noqa: F401
from openapi_server.models.lead_form_create_request import LeadFormCreateRequest  # noqa: F401
from openapi_server.models.lead_form_response import LeadFormResponse  # noqa: F401
from openapi_server.models.lead_form_test_request import LeadFormTestRequest  # noqa: F401
from openapi_server.models.lead_form_test_response import LeadFormTestResponse  # noqa: F401
from openapi_server.models.lead_form_update_request import LeadFormUpdateRequest  # noqa: F401
from openapi_server.models.lead_forms_list200_response import LeadFormsList200Response  # noqa: F401


def test_lead_forms_list(client: TestClient):
    """Test case for lead_forms_list

    List lead forms
    """
    params = [("page_size", 25),     ("order", 'ASCENDING'),     ("bookmark", 'bookmark_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/lead_forms".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_lead_forms_create(client: TestClient):
    """Test case for lead_forms_create

    Create lead forms
    """
    lead_form_create_request = [{"completion_message":"Thank you for submitting. We will contact you soon.","disclosure_language":"By entering your personal information, you agree that your data will be collected and used.","name":"Lead Form 3/14/2023","questions":[{"question_type":"CUSTOM","custom_question_field_type":"CHECKBOX","custom_question_label":"What is your favorite animal?","custom_question_options":["Dog","Cat","Bird","Turtle"]}],"policy_links":[{"label":"Copyright","link":"https://policy.pinterest.com/en/copyright"}],"has_accepted_terms":0,"privacy_policy_link":"https://www.advertisername.com/privacy-policy","status":"DRAFT"}]

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/lead_forms".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=lead_form_create_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_lead_forms_update(client: TestClient):
    """Test case for lead_forms_update

    Update lead forms
    """
    lead_form_update_request = [{"completion_message":"Thank you for submitting. We will contact you soon.","disclosure_language":"By entering your personal information, you agree that your data will be collected and used.","name":"Lead Form 3/14/2023","questions":[{"question_type":"CUSTOM","custom_question_field_type":"CHECKBOX","custom_question_label":"What is your favorite animal?","custom_question_options":["Dog","Cat","Bird","Turtle"]}],"policy_links":[{"label":"Copyright","link":"https://policy.pinterest.com/en/copyright"}],"has_accepted_terms":0,"id":"7765300871171","privacy_policy_link":"https://www.advertisername.com/privacy-policy","status":"DRAFT"}]

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/ad_accounts/{ad_account_id}/lead_forms".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=lead_form_update_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_lead_form_get(client: TestClient):
    """Test case for lead_form_get

    Get lead form by id
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}".format(ad_account_id='ad_account_id_example', lead_form_id='1234567890123'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_lead_form_test_create(client: TestClient):
    """Test case for lead_form_test_create

    Create lead form test data
    """
    lead_form_test_request = {"answers":["John","Doe","abc@email.com","987654321"]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test".format(ad_account_id='ad_account_id_example', lead_form_id='1234567890123'),
    #    headers=headers,
    #    json=lead_form_test_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

