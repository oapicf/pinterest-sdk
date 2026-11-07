# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, field_validator  # noqa: F401
from typing import List, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.lead_form import LeadForm  # noqa: F401
from openapi_server.models.lead_form_batch_update import LeadFormBatchUpdate  # noqa: F401
from openapi_server.models.lead_form_create import LeadFormCreate  # noqa: F401
from openapi_server.models.lead_form_test import LeadFormTest  # noqa: F401
from openapi_server.models.lead_form_test_create import LeadFormTestCreate  # noqa: F401
from openapi_server.models.lead_forms_create200_response import LeadFormsCreate200Response  # noqa: F401
from openapi_server.models.lead_forms_list200_response import LeadFormsList200Response  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: F401


def test_lead_forms_list(client: TestClient):
    """Test case for lead_forms_list

    List lead forms
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25),     ("order", openapi_server.PinterestLibPaginationOrder())]
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
    lead_form_create = [[openapi_server.LeadFormCreate()]]

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/lead_forms".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=lead_form_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_lead_forms_update(client: TestClient):
    """Test case for lead_forms_update

    Update lead forms
    """
    lead_form_batch_update = [[openapi_server.LeadFormBatchUpdate()]]

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/ad_accounts/{ad_account_id}/lead_forms".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=lead_form_batch_update,
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
    #    "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}".format(lead_form_id='lead_form_id_example', ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_lead_form_test_create(client: TestClient):
    """Test case for lead_form_test_create

    Create lead form test data
    """
    lead_form_test_create = openapi_server.LeadFormTestCreate()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test".format(ad_account_id='ad_account_id_example', lead_form_id='lead_form_id_example'),
    #    headers=headers,
    #    json=lead_form_test_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

