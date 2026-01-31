# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, field_validator  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401
from openapi_server.models.leads_export_create_request import LeadsExportCreateRequest  # noqa: F401
from openapi_server.models.leads_export_create_response import LeadsExportCreateResponse  # noqa: F401
from openapi_server.models.leads_export_response_data import LeadsExportResponseData  # noqa: F401


def test_leads_export_create(client: TestClient):
    """Test case for leads_export_create

    Create a request to export leads collected from a lead ad
    """
    leads_export_create_request = {"end_date":"2020-12-20","ad_id":"687201361754","start_date":"2020-12-20"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/leads_export".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=leads_export_create_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_leads_export_get(client: TestClient):
    """Test case for leads_export_get

    Get the lead export from the lead export create call
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/leads_export/{leads_export_id}".format(ad_account_id='ad_account_id_example', leads_export_id='123755885175'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

