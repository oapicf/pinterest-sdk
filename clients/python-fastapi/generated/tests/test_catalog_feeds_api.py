# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, field_validator  # noqa: F401
from typing import Any, List, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.catalogs_feed import CatalogsFeed  # noqa: F401
from openapi_server.models.catalogs_feed_create_request_schema import CatalogsFeedCreateRequestSchema  # noqa: F401
from openapi_server.models.catalogs_feed_ingestion import CatalogsFeedIngestion  # noqa: F401
from openapi_server.models.catalogs_feed_update_request_schema import CatalogsFeedUpdateRequestSchema  # noqa: F401
from openapi_server.models.catalogs_item_validation_issue import CatalogsItemValidationIssue  # noqa: F401
from openapi_server.models.feed_processing_results_list200_response import FeedProcessingResultsList200Response  # noqa: F401
from openapi_server.models.feeds_list200_response import FeedsList200Response  # noqa: F401
from openapi_server.models.items_issues_list200_response import ItemsIssuesList200Response  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401


def test_feeds_list(client: TestClient):
    """Test case for feeds_list

    List feeds
    """
    params = [("catalog_id", 'catalog_id_example'),     ("ad_account_id", 'ad_account_id_example'),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/catalogs/feeds",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_feeds_create(client: TestClient):
    """Test case for feeds_create

    Create feed
    """
    catalogs_feed_create_request_schema = openapi_server.CatalogsFeedCreateRequestSchema()
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/catalogs/feeds",
    #    headers=headers,
    #    json=catalogs_feed_create_request_schema,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_feeds_get(client: TestClient):
    """Test case for feeds_get

    Get feed
    """
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/catalogs/feeds/{feed_id}".format(feed_id='feed_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_feeds_delete(client: TestClient):
    """Test case for feeds_delete

    Delete feed
    """
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/catalogs/feeds/{feed_id}".format(feed_id='feed_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_feeds_update(client: TestClient):
    """Test case for feeds_update

    Update feed
    """
    catalogs_feed_update_request_schema = openapi_server.CatalogsFeedUpdateRequestSchema()
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/catalogs/feeds/{feed_id}".format(feed_id='feed_id_example'),
    #    headers=headers,
    #    json=catalogs_feed_update_request_schema,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_feeds_ingest(client: TestClient):
    """Test case for feeds_ingest

    Ingest feed items
    """
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/catalogs/feeds/{feed_id}/ingest".format(feed_id='feed_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_feed_processing_results_list(client: TestClient):
    """Test case for feed_processing_results_list

    List feed processing results
    """
    params = [("ad_account_id", 'ad_account_id_example'),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/catalogs/feeds/{feed_id}/processing_results".format(feed_id='feed_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_items_issues_list(client: TestClient):
    """Test case for items_issues_list

    List item issues
    """
    params = [("item_numbers", [56]),     ("item_validation_issue", openapi_server.CatalogsItemValidationIssue()),     ("ad_account_id", 'ad_account_id_example'),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/catalogs/processing_results/{processing_result_id}/item_issues".format(processing_result_id='processing_result_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

