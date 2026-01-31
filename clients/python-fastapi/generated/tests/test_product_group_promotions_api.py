# coding: utf-8

from fastapi.testclient import TestClient


from datetime import date  # noqa: F401
from pydantic import Field, StrictInt, StrictStr, field_validator  # noqa: F401
from typing import List, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401
from openapi_server.models.granularity import Granularity  # noqa: F401
from openapi_server.models.product_group_analytics_response_inner import ProductGroupAnalyticsResponseInner  # noqa: F401
from openapi_server.models.product_group_promotion import ProductGroupPromotion  # noqa: F401
from openapi_server.models.product_group_promotion_create_request import ProductGroupPromotionCreateRequest  # noqa: F401
from openapi_server.models.product_group_promotion_response import ProductGroupPromotionResponse  # noqa: F401
from openapi_server.models.product_group_promotion_update_request import ProductGroupPromotionUpdateRequest  # noqa: F401
from openapi_server.models.product_group_promotions_list200_response import ProductGroupPromotionsList200Response  # noqa: F401
from openapi_server.models.reporting_time_zone import ReportingTimeZone  # noqa: F401


def test_product_group_promotions_list(client: TestClient):
    """Test case for product_group_promotions_list

    Get product group promotions
    """
    params = [("product_group_promotion_ids", ['product_group_promotion_ids_example']),     ("entity_statuses", ["ACTIVE","PAUSED"]),     ("ad_group_id", '123123123'),     ("page_size", 25),     ("order", 'ASCENDING'),     ("bookmark", 'bookmark_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/product_group_promotions".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_product_group_promotions_create(client: TestClient):
    """Test case for product_group_promotions_create

    Create product group promotions
    """
    product_group_promotion_create_request = {"product_group_promotion":[{"slideshow_collections_description":"Description","creative_type":"REGULAR","collections_hero_pin_id":"123123","catalog_product_group_name":"catalogProductGroupName","collections_hero_destination_url":"http://www.pinterest.com","tracking_url":"https://www.pinterest.com","slideshow_collections_title":"Title","is_mdl":1,"status":"ACTIVE"},{"slideshow_collections_description":"Description","creative_type":"REGULAR","collections_hero_pin_id":"123123","catalog_product_group_name":"catalogProductGroupName","collections_hero_destination_url":"http://www.pinterest.com","tracking_url":"https://www.pinterest.com","slideshow_collections_title":"Title","is_mdl":1,"status":"ACTIVE"}],"ad_group_id":"2680059592705"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/product_group_promotions".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=product_group_promotion_create_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_product_group_promotions_update(client: TestClient):
    """Test case for product_group_promotions_update

    Update product group promotions
    """
    product_group_promotion_update_request = {"product_group_promotion":[{"catalog_product_group_id":"1234123","slideshow_collections_description":"Description","creative_type":"REGULAR","collections_hero_pin_id":"123123","catalog_product_group_name":"ProductGroupName","collections_hero_destination_url":"http://www.pinterest.com","tracking_url":"https://www.pinterest.com","slideshow_collections_title":"Title","status":"ACTIVE","id":"2680059592705"},{"catalog_product_group_id":"1231231","slideshow_collections_description":"Other description","creative_type":"REGULAR","collections_hero_pin_id":"123124","catalog_product_group_name":"ProductGroupName","collections_hero_destination_url":"http://www.pinterest.com","tracking_url":"https://www.pinterest.com","slideshow_collections_title":"Title","status":"ACTIVE","id":"2680059592706"}],"ad_group_id":"26823439592705"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/ad_accounts/{ad_account_id}/product_group_promotions".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=product_group_promotion_update_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_product_group_promotions_get(client: TestClient):
    """Test case for product_group_promotions_get

    Get a product group promotion by id
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}".format(ad_account_id='ad_account_id_example', product_group_promotion_id='product_group_promotion_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_product_groups_analytics(client: TestClient):
    """Test case for product_groups_analytics

    Get product group analytics
    """
    params = [("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("product_group_ids", ['product_group_ids_example']),     ("columns", ['columns_example']),     ("granularity", openapi_server.Granularity()),     ("click_window_days", 30),     ("engagement_window_days", 30),     ("view_window_days", 1),     ("conversion_report_time", TIME_OF_AD_ACTION),     ("reporting_timezone", openapi_server.ReportingTimeZone())]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/product_groups/analytics".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

