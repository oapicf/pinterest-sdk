# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, field_validator  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.leads_export_response_data import LeadsExportResponseData  # noqa: F401
from openapi_server.models.leads_exports import LeadsExports  # noqa: F401
from openapi_server.models.leads_exports_create import LeadsExportsCreate  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401


def test_leads_export_create(client: TestClient):
    """Test case for leads_export_create

    Create a request to export leads collected from a lead ad
    """
    leads_exports_create = openapi_server.LeadsExportsCreate()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/leads_export".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=leads_exports_create,
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
    #    "/ad_accounts/{ad_account_id}/leads_export/{leads_export_id}".format(ad_account_id='ad_account_id_example', leads_export_id='leads_export_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

