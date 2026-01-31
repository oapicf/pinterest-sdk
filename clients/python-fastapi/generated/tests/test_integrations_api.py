# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, StrictStr  # noqa: F401
from typing import Any, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401
from openapi_server.models.integration_logs_request import IntegrationLogsRequest  # noqa: F401
from openapi_server.models.integration_logs_success_response import IntegrationLogsSuccessResponse  # noqa: F401
from openapi_server.models.integration_metadata import IntegrationMetadata  # noqa: F401
from openapi_server.models.integration_record import IntegrationRecord  # noqa: F401
from openapi_server.models.integration_request import IntegrationRequest  # noqa: F401
from openapi_server.models.integration_request_patch import IntegrationRequestPatch  # noqa: F401
from openapi_server.models.integrations_get_list200_response import IntegrationsGetList200Response  # noqa: F401
from openapi_server.models.integrations_logs_post400_response import IntegrationsLogsPost400Response  # noqa: F401


def test_integrations_commerce_post(client: TestClient):
    """Test case for integrations_commerce_post

    Create commerce integration
    """
    integration_request = {"connected_advertiser_id":"connected_advertiser_id","partner_primary_email":"partner_primary_email","connected_tag_id":"connected_tag_id","partner_metadata":"partner_metadata","partner_access_token":"partner_access_token","partner_refresh_token_expiry":6,"external_business_id":"external_business_id","connected_lba_id":"connected_lba_id","additional_id_1":"additional_id_1","partner_refresh_token":"partner_refresh_token","connected_merchant_id":"connected_merchant_id","scopes":"scopes","partner_access_token_expiry":0}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/integrations/commerce",
    #    headers=headers,
    #    json=integration_request,
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
    integration_request_patch = {"connected_advertiser_id":"connected_advertiser_id","connected_lba_id":"connected_lba_id","partner_primary_email":"partner_primary_email","connected_tag_id":"connected_tag_id","additional_id_1":"additional_id_1","partner_refresh_token":"partner_refresh_token","connected_merchant_id":"connected_merchant_id","partner_metadata":"partner_metadata","scopes":"scopes","partner_access_token":"partner_access_token","partner_access_token_expiry":0.8008281904610115,"partner_refresh_token_expiry":6.027456183070403}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/integrations/commerce/{external_business_id}".format(external_business_id='external_business_id_example'),
    #    headers=headers,
    #    json=integration_request_patch,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_integrations_logs_post(client: TestClient):
    """Test case for integrations_logs_post

    Receives batched logs from integration applications.
    """
    integration_logs_request = {"logs":[{"app_version_number":"app_version_number","client_timestamp":0,"request":{"path":"path","response_headers":{"key":"response_headers"},"method":"GET","host":"host","request_headers":{"key":"request_headers"},"response_status_code":5},"log_level":"INFO","merchant_id":"merchant_id","error":{"number":5,"file_name":"file_name","line_number":1,"name":"name","cause":"cause","column_number":6,"stack_trace":"stack_trace","message":"message","message_detail":"message_detail"},"message":"message","platform_version_number":"platform_version_number","advertiser_id":"advertiser_id","external_business_id":"external_business_id","event_type":"APP","tag_id":"tag_id","feed_profile_id":"feed_profile_id"},{"app_version_number":"app_version_number","client_timestamp":0,"request":{"path":"path","response_headers":{"key":"response_headers"},"method":"GET","host":"host","request_headers":{"key":"request_headers"},"response_status_code":5},"log_level":"INFO","merchant_id":"merchant_id","error":{"number":5,"file_name":"file_name","line_number":1,"name":"name","cause":"cause","column_number":6,"stack_trace":"stack_trace","message":"message","message_detail":"message_detail"},"message":"message","platform_version_number":"platform_version_number","advertiser_id":"advertiser_id","external_business_id":"external_business_id","event_type":"APP","tag_id":"tag_id","feed_profile_id":"feed_profile_id"},{"app_version_number":"app_version_number","client_timestamp":0,"request":{"path":"path","response_headers":{"key":"response_headers"},"method":"GET","host":"host","request_headers":{"key":"request_headers"},"response_status_code":5},"log_level":"INFO","merchant_id":"merchant_id","error":{"number":5,"file_name":"file_name","line_number":1,"name":"name","cause":"cause","column_number":6,"stack_trace":"stack_trace","message":"message","message_detail":"message_detail"},"message":"message","platform_version_number":"platform_version_number","advertiser_id":"advertiser_id","external_business_id":"external_business_id","event_type":"APP","tag_id":"tag_id","feed_profile_id":"feed_profile_id"},{"app_version_number":"app_version_number","client_timestamp":0,"request":{"path":"path","response_headers":{"key":"response_headers"},"method":"GET","host":"host","request_headers":{"key":"request_headers"},"response_status_code":5},"log_level":"INFO","merchant_id":"merchant_id","error":{"number":5,"file_name":"file_name","line_number":1,"name":"name","cause":"cause","column_number":6,"stack_trace":"stack_trace","message":"message","message_detail":"message_detail"},"message":"message","platform_version_number":"platform_version_number","advertiser_id":"advertiser_id","external_business_id":"external_business_id","event_type":"APP","tag_id":"tag_id","feed_profile_id":"feed_profile_id"},{"app_version_number":"app_version_number","client_timestamp":0,"request":{"path":"path","response_headers":{"key":"response_headers"},"method":"GET","host":"host","request_headers":{"key":"request_headers"},"response_status_code":5},"log_level":"INFO","merchant_id":"merchant_id","error":{"number":5,"file_name":"file_name","line_number":1,"name":"name","cause":"cause","column_number":6,"stack_trace":"stack_trace","message":"message","message_detail":"message_detail"},"message":"message","platform_version_number":"platform_version_number","advertiser_id":"advertiser_id","external_business_id":"external_business_id","event_type":"APP","tag_id":"tag_id","feed_profile_id":"feed_profile_id"}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/integrations/logs",
    #    headers=headers,
    #    json=integration_logs_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


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

