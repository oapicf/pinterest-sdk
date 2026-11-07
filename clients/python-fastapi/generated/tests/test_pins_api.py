# coding: utf-8

from fastapi.testclient import TestClient


from datetime import date  # noqa: F401
from pydantic import Field, field_validator  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.creative_type import CreativeType  # noqa: F401
from openapi_server.models.multi_pins_analytics_metric_types_item import MultiPinsAnalyticsMetricTypesItem  # noqa: F401
from openapi_server.models.pin import Pin  # noqa: F401
from openapi_server.models.pin_analytics_metrics_response import PinAnalyticsMetricsResponse  # noqa: F401
from openapi_server.models.pin_create import PinCreate  # noqa: F401
from openapi_server.models.pin_filter import PinFilter  # noqa: F401
from openapi_server.models.pin_type import PinType  # noqa: F401
from openapi_server.models.pin_update import PinUpdate  # noqa: F401
from openapi_server.models.pins_list200_response import PinsList200Response  # noqa: F401
from openapi_server.models.pins_save_request_create import PinsSaveRequestCreate  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401
from openapi_server.models.querypinanalyticsmetrictypes_items import QuerypinanalyticsmetrictypesItems  # noqa: F401


def test_pins_list(client: TestClient):
    """Test case for pins_list

    List Pins
    """
    params = [("pin_filter", openapi_server.PinFilter()),     ("pin_metrics", False),     ("include_protected_pins", False),     ("pin_type", openapi_server.PinType()),     ("creative_types", [openapi_server.CreativeType()]),     ("ad_account_id", 'ad_account_id_example'),     ("domain", 'domain_example'),     ("domains", ['domains_example']),     ("include_product_tag_obj", True),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
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
    pin_create = openapi_server.PinCreate()
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


def test_multi_pins_analytics(client: TestClient):
    """Test case for multi_pins_analytics

    Get multiple Pin analytics
    """
    params = [("pin_ids", ['pin_ids_example']),     ("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("app_types", 'ALL'),     ("metric_types", [openapi_server.MultiPinsAnalyticsMetricTypesItem()]),     ("ad_account_id", 'ad_account_id_example')]
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
    pin_update = openapi_server.PinUpdate()
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
    params = [("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("app_types", 'ALL'),     ("metric_types", [openapi_server.QuerypinanalyticsmetrictypesItems()]),     ("split_field", 'NO_SPLIT'),     ("ad_account_id", 'ad_account_id_example')]
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


def test_pins_save(client: TestClient):
    """Test case for pins_save

    Save Pin
    """
    pins_save_request_create = openapi_server.PinsSaveRequestCreate()
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/pins/{pin_id}/save".format(pin_id='pin_id_example'),
    #    headers=headers,
    #    json=pins_save_request_create,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

