# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, StrictStr, field_validator  # noqa: F401
from typing import Any, List, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401
from openapi_server.models.promotion_create_request import PromotionCreateRequest  # noqa: F401
from openapi_server.models.promotion_response import PromotionResponse  # noqa: F401
from openapi_server.models.promotion_update_request import PromotionUpdateRequest  # noqa: F401
from openapi_server.models.promotions_list200_response import PromotionsList200Response  # noqa: F401
from openapi_server.models.promotions_response import PromotionsResponse  # noqa: F401


def test_promotions_list(client: TestClient):
    """Test case for promotions_list

    Get promotions
    """
    params = [("page_size", 25),     ("order", 'ASCENDING'),     ("bookmark", 'bookmark_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/promotions".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_promotions_create(client: TestClient):
    """Test case for promotions_create

    Create promotions
    """
    promotion_create_request = [{"promotion_type":"VARIABLE","start_time":1677003860,"promotion_custom_id":"freeshipping_2025","discount_status":"ACTIVE","platform_type":"DEFAULT","promotion_title":"Black Friday 10% off","promotion_code":"blackfriday10","end_time":1678003860,"external_id":"abc","template_values":[{"amount":100,"custom_text":"My promotion","percent":10,"currency_code":"UNK"},{"amount":100,"custom_text":"My promotion","percent":10,"currency_code":"UNK"}]}]

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/promotions".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=promotion_create_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_promotions_update(client: TestClient):
    """Test case for promotions_update

    Update promotions
    """
    promotion_update_request = [{"promotion_type":"VARIABLE","start_time":1677003860,"promotion_custom_id":"freeshipping_2025","discount_status":"ACTIVE","platform_type":"DEFAULT","promotion_title":"Black Friday 10% off","promotion_code":"blackfriday10","end_time":1678003860,"external_id":"abc","template_values":[{"amount":100,"custom_text":"My promotion","percent":10,"currency_code":"UNK"},{"amount":100,"custom_text":"My promotion","percent":10,"currency_code":"UNK"}],"id":"7834020347906","status":"ACTIVE"}]

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/ad_accounts/{ad_account_id}/promotions".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=promotion_update_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_promotions_get(client: TestClient):
    """Test case for promotions_get

    Get promotion by id
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/promotions/{promotion_id}".format(ad_account_id='ad_account_id_example', promotion_id='promotion_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_promotions_delete(client: TestClient):
    """Test case for promotions_delete

    Delete promotion by id
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/ad_accounts/{ad_account_id}/promotions/{promotion_id}".format(ad_account_id='ad_account_id_example', promotion_id='promotion_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

