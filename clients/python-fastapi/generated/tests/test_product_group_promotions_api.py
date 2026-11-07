# coding: utf-8

from fastapi.testclient import TestClient


from datetime import date  # noqa: F401
from pydantic import Field, field_validator  # noqa: F401
from typing import List, Optional, Union  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.entity_status import EntityStatus  # noqa: F401
from openapi_server.models.granularity import Granularity  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: F401
from openapi_server.models.product_group_analytics_items import ProductGroupAnalyticsItems  # noqa: F401
from openapi_server.models.product_group_promotion import ProductGroupPromotion  # noqa: F401
from openapi_server.models.product_group_promotions import ProductGroupPromotions  # noqa: F401
from openapi_server.models.product_group_promotions_create import ProductGroupPromotionsCreate  # noqa: F401
from openapi_server.models.product_group_promotions_list200_response import ProductGroupPromotionsList200Response  # noqa: F401
from openapi_server.models.product_group_promotions_update_with_required_body import ProductGroupPromotionsUpdateWithRequiredBody  # noqa: F401
from openapi_server.models.reporting_column_sync import ReportingColumnSync  # noqa: F401
from openapi_server.models.reporting_time_zone import ReportingTimeZone  # noqa: F401


def test_product_group_promotions_list(client: TestClient):
    """Test case for product_group_promotions_list

    Get product group promotions
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25),     ("order", openapi_server.PinterestLibPaginationOrder()),     ("product_group_promotion_ids", ['product_group_promotion_ids_example']),     ("entity_statuses", ["ACTIVE","PAUSED"]),     ("ad_group_id", 'ad_group_id_example')]
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
    product_group_promotions_create = openapi_server.ProductGroupPromotionsCreate()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/product_group_promotions".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=product_group_promotions_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_product_group_promotions_update(client: TestClient):
    """Test case for product_group_promotions_update

    Update product group promotions
    """
    product_group_promotions_update_with_required_body = openapi_server.ProductGroupPromotionsUpdateWithRequiredBody()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/ad_accounts/{ad_account_id}/product_group_promotions".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=product_group_promotions_update_with_required_body,
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
    params = [("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("product_group_ids", ['product_group_ids_example']),     ("columns", [openapi_server.ReportingColumnSync()]),     ("granularity", openapi_server.Granularity()),     ("click_window_days", 30),     ("engagement_window_days", 30),     ("view_window_days", 1),     ("conversion_report_time", 'TIME_OF_AD_ACTION'),     ("reporting_timezone", openapi_server.ReportingTimeZone())]
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

