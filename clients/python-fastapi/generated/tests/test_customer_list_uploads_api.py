# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, field_validator  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.customer_list_upload_create_request import CustomerListUploadCreateRequest  # noqa: F401
from openapi_server.models.customer_list_upload_create_response import CustomerListUploadCreateResponse  # noqa: F401
from openapi_server.models.customer_list_upload_response import CustomerListUploadResponse  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401


def test_customer_list_uploads_create(client: TestClient):
    """Test case for customer_list_uploads_create

    Create customer list upload
    """
    customer_list_upload_create_request = {"total_parts":2,"operation":"operation"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads".format(ad_account_id='ad_account_id_example', customer_list_id='customer_list_id_example'),
    #    headers=headers,
    #    json=customer_list_upload_create_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_customer_list_uploads_get(client: TestClient):
    """Test case for customer_list_uploads_get

    Get customer list upload
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}".format(ad_account_id='ad_account_id_example', customer_list_id='customer_list_id_example', customer_list_upload_id='customer_list_upload_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_customer_list_uploads_run(client: TestClient):
    """Test case for customer_list_uploads_run

    Run customer list upload
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run".format(ad_account_id='ad_account_id_example', customer_list_id='customer_list_id_example', customer_list_upload_id='customer_list_upload_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

