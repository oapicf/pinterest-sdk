# coding: utf-8

from fastapi.testclient import TestClient


from datetime import date  # noqa: F401
from pydantic import Field, StrictBool, StrictStr, field_validator  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.creative_type import CreativeType  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401
from openapi_server.models.pin import Pin  # noqa: F401
from openapi_server.models.pin_analytics_metrics_response import PinAnalyticsMetricsResponse  # noqa: F401
from openapi_server.models.pin_create import PinCreate  # noqa: F401
from openapi_server.models.pin_update import PinUpdate  # noqa: F401
from openapi_server.models.pins_list200_response import PinsList200Response  # noqa: F401
from openapi_server.models.pins_save_request import PinsSaveRequest  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401


def test_pins_list(client: TestClient):
    """Test case for pins_list

    List Pins
    """
    params = [("pin_filter", 'pin_filter_example'),     ("pin_metrics", False),     ("include_protected_pins", False),     ("pin_type", 'pin_type_example'),     ("creative_types", [openapi_server.CreativeType()]),     ("ad_account_id", 'ad_account_id_example'),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/pins",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_pins_create(client: TestClient):
    """Test case for pins_create

    Create Pin
    """
    pin_create = {"dominant_color":"dominant_color","media_source":{"content_type":"image/jpeg","data":"data","source_type":"image_base64","is_standard":1},"alt_text":"alt_text","board_id":"board_id","parent_pin_id":"parent_pin_id","link":"link","description":"description","title":"title","sponsor_id":"sponsor_id","board_section_id":"board_section_id"}
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/pins",
    #    headers=headers,
    #    json=pin_create,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_pins_get(client: TestClient):
    """Test case for pins_get

    Get Pin
    """
    params = [("ad_account_id", 'ad_account_id_example'),     ("pin_metrics", False)]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/pins/{pin_id}".format(pin_id='pin_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_pins_delete(client: TestClient):
    """Test case for pins_delete

    Delete Pin
    """
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/pins/{pin_id}".format(pin_id='pin_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_pins_update(client: TestClient):
    """Test case for pins_update

    Update Pin
    """
    pin_update = {"alt_text":"alt_text","board_id":"board_id","link":"link","description":"description","title":"title","board_section_id":"board_section_id","carousel_slots":[{"link":"link","description":"description","title":"title"},{"link":"link","description":"description","title":"title"}]}
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/pins/{pin_id}".format(pin_id='pin_id_example'),
    #    headers=headers,
    #    json=pin_update,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_pins_analytics(client: TestClient):
    """Test case for pins_analytics

    Get Pin analytics
    """
    params = [("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("app_types", ALL),     ("metric_types", ['metric_types_example']),     ("split_field", NO_SPLIT),     ("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/pins/{pin_id}/analytics".format(pin_id='pin_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_multi_pins_analytics(client: TestClient):
    """Test case for multi_pins_analytics

    Get multiple Pin analytics
    """
    params = [("pin_ids", ['pin_ids_example']),     ("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("app_types", ALL),     ("metric_types", ['metric_types_example']),     ("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/pins/analytics",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_pins_save(client: TestClient):
    """Test case for pins_save

    Save Pin
    """
    pins_save_request = openapi_server.PinsSaveRequest()
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/pins/{pin_id}/save".format(pin_id='pin_id_example'),
    #    headers=headers,
    #    json=pins_save_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

