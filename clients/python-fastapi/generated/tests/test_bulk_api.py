# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, field_validator  # noqa: F401
from typing import Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.bulk_download import BulkDownload  # noqa: F401
from openapi_server.models.bulk_download_create import BulkDownloadCreate  # noqa: F401
from openapi_server.models.bulk_job_data import BulkJobData  # noqa: F401
from openapi_server.models.bulk_upsert_request import BulkUpsertRequest  # noqa: F401
from openapi_server.models.bulk_upsert_response import BulkUpsertResponse  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401


def test_bulk_download_create(client: TestClient):
    """Test case for bulk_download_create

    Get advertiser entities in bulk
    """
    bulk_download_create = openapi_server.BulkDownloadCreate()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/bulk/download".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=bulk_download_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_bulk_upsert_create(client: TestClient):
    """Test case for bulk_upsert_create

    Create/update ad entities in bulk
    """
    bulk_upsert_request = openapi_server.BulkUpsertRequest()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/bulk/upsert".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=bulk_upsert_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_bulk_request_get(client: TestClient):
    """Test case for bulk_request_get

    Download advertiser entities in bulk
    """
    params = [("include_details", False)]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}".format(ad_account_id='ad_account_id_example', bulk_request_id='bulk_request_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

