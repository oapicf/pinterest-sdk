# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, StrictBool, StrictStr, field_validator  # noqa: F401
from typing import List, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401
from openapi_server.models.keyword_update_body import KeywordUpdateBody  # noqa: F401
from openapi_server.models.keywords_get200_response import KeywordsGet200Response  # noqa: F401
from openapi_server.models.keywords_metrics_array_response import KeywordsMetricsArrayResponse  # noqa: F401
from openapi_server.models.keywords_request import KeywordsRequest  # noqa: F401
from openapi_server.models.keywords_response import KeywordsResponse  # noqa: F401
from openapi_server.models.match_type import MatchType  # noqa: F401
from openapi_server.models.trend_type import TrendType  # noqa: F401
from openapi_server.models.trending_keywords_response import TrendingKeywordsResponse  # noqa: F401
from openapi_server.models.trends_supported_region import TrendsSupportedRegion  # noqa: F401


def test_keywords_get(client: TestClient):
    """Test case for keywords_get

    Get keywords
    """
    params = [("campaign_id", 'campaign_id_example'),     ("ad_group_id", '123123123'),     ("ad_group_ids", ['ad_group_ids_example']),     ("match_types", [openapi_server.MatchType()]),     ("page_size", 25),     ("bookmark", 'bookmark_example')]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/keywords".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_keywords_create(client: TestClient):
    """Test case for keywords_create

    Create keywords
    """
    keywords_request = {"keywords":[{"match_type":"BROAD","bid":6,"value":"value"},{"match_type":"BROAD","bid":6,"value":"value"}],"parent_id":"383791336903426391"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/keywords".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=keywords_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_keywords_update(client: TestClient):
    """Test case for keywords_update

    Update keywords
    """
    keyword_update_body = {"keywords":[{"archived":0,"id":"2886364308355","bid":1},{"archived":0,"id":"2886364308355","bid":1}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/ad_accounts/{ad_account_id}/keywords".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=keyword_update_body,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_country_keywords_metrics_get(client: TestClient):
    """Test case for country_keywords_metrics_get

    Get country's keyword metrics
    """
    params = [("country_code", 'US'),     ("keywords", ['keywords_example'])]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/keywords/metrics".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_trending_keywords_list(client: TestClient):
    """Test case for trending_keywords_list

    List trending keywords
    """
    params = [("interests", ['[\"beauty\",\"womens_fashion\"]']),     ("genders", ['[\"female\",\"unknown\"]']),     ("ages", ['[\"35-44\",\"50-54\"]']),     ("include_keywords", ['[\"recipes\",\"dessert\"]']),     ("normalize_against_group", False),     ("limit", 50),     ("include_prediction", False),     ("include_demographics", False)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/trends/keywords/{region}/top/{trend_type}".format(region=openapi_server.TrendsSupportedRegion(), trend_type=openapi_server.TrendType()),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

