# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, field_validator  # noqa: F401
from typing import Any, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.integration_logs_invalid_log_response import IntegrationLogsInvalidLogResponse  # noqa: F401
from openapi_server.models.integration_logs_request_create import IntegrationLogsRequestCreate  # noqa: F401
from openapi_server.models.integration_logs_success_response import IntegrationLogsSuccessResponse  # noqa: F401
from openapi_server.models.integration_metadata import IntegrationMetadata  # noqa: F401
from openapi_server.models.integration_metadata_create import IntegrationMetadataCreate  # noqa: F401
from openapi_server.models.integration_metadata_update import IntegrationMetadataUpdate  # noqa: F401
from openapi_server.models.integration_record import IntegrationRecord  # noqa: F401
from openapi_server.models.integrations_get_list200_response import IntegrationsGetList200Response  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401


def test_integrations_get_list(client: TestClient):
    """Test case for integrations_get_list

    Get integration metadata list
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/integrations",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_integrations_commerce_post(client: TestClient):
    """Test case for integrations_commerce_post

    Create commerce integration
    """
    integration_metadata_create = openapi_server.IntegrationMetadataCreate()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/integrations/commerce",
    #    headers=headers,
    #    json=integration_metadata_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_integrations_commerce_get(client: TestClient):
    """Test case for integrations_commerce_get

    Get commerce integration
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/integrations/commerce/{external_business_id}".format(external_business_id='external_business_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_integrations_commerce_del(client: TestClient):
    """Test case for integrations_commerce_del

    Delete commerce integration
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/integrations/commerce/{external_business_id}".format(external_business_id='external_business_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_integrations_commerce_patch(client: TestClient):
    """Test case for integrations_commerce_patch

    Update commerce integration
    """
    integration_metadata_update = openapi_server.IntegrationMetadataUpdate()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/integrations/commerce/{external_business_id}".format(external_business_id='external_business_id_example'),
    #    headers=headers,
    #    json=integration_metadata_update,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_integrations_logs_post(client: TestClient):
    """Test case for integrations_logs_post

    Receives batched logs from integration applications.
    """
    integration_logs_request_create = openapi_server.IntegrationLogsRequestCreate()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/integrations/logs",
    #    headers=headers,
    #    json=integration_logs_request_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_integrations_get_by_id(client: TestClient):
    """Test case for integrations_get_by_id

    Get integration metadata
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/integrations/{id}".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

