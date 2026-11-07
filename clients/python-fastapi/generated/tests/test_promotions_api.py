# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, field_validator  # noqa: F401
from typing import Any, List, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: F401
from openapi_server.models.promotion import Promotion  # noqa: F401
from openapi_server.models.promotion_batch_update import PromotionBatchUpdate  # noqa: F401
from openapi_server.models.promotion_create import PromotionCreate  # noqa: F401
from openapi_server.models.promotions_list200_response import PromotionsList200Response  # noqa: F401
from openapi_server.models.promotions_response import PromotionsResponse  # noqa: F401


def test_promotions_list(client: TestClient):
    """Test case for promotions_list

    Get promotions
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25),     ("order", openapi_server.PinterestLibPaginationOrder())]
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
    promotion_create = [[openapi_server.PromotionCreate()]]

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/promotions".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=promotion_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_promotions_update(client: TestClient):
    """Test case for promotions_update

    Update promotions
    """
    promotion_batch_update = [[openapi_server.PromotionBatchUpdate()]]

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/ad_accounts/{ad_account_id}/promotions".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=promotion_batch_update,
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
    #    "/ad_accounts/{ad_account_id}/promotions/{promotion_id}".format(promotion_id='promotion_id_example', ad_account_id='ad_account_id_example'),
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
    #    "/ad_accounts/{ad_account_id}/promotions/{promotion_id}".format(promotion_id='promotion_id_example', ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

