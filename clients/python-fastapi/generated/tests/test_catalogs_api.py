# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, StrictStr, field_validator  # noqa: F401
from typing import Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.catalog import Catalog  # noqa: F401
from openapi_server.models.catalogs_available_filter_values import CatalogsAvailableFilterValues  # noqa: F401
from openapi_server.models.catalogs_create_request import CatalogsCreateRequest  # noqa: F401
from openapi_server.models.catalogs_list200_response import CatalogsList200Response  # noqa: F401
from openapi_server.models.catalogs_locale import CatalogsLocale  # noqa: F401
from openapi_server.models.country import Country  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401


def test_catalogs_list(client: TestClient):
    """Test case for catalogs_list

    List catalogs
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25),     ("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/catalogs",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_catalogs_create(client: TestClient):
    """Test case for catalogs_create

    Create catalog
    """
    catalogs_create_request = {"catalog_type":"RETAIL","name":"name"}
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/catalogs",
    #    headers=headers,
    #    json=catalogs_create_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_catalogs_available_filter_values(client: TestClient):
    """Test case for catalogs_available_filter_values

    List available filter values
    """
    params = [("catalog_id", 'catalog_id_example'),     ("feed_id", 'feed_id_example'),     ("country", openapi_server.Country()),     ("language", openapi_server.CatalogsLocale()),     ("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/catalogs/available_filter_values",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

