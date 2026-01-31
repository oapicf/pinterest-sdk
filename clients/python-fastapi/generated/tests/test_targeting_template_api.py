# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, StrictBool, StrictStr, field_validator  # noqa: F401
from typing import Any, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401
from openapi_server.models.targeting_template_create import TargetingTemplateCreate  # noqa: F401
from openapi_server.models.targeting_template_get_response_data import TargetingTemplateGetResponseData  # noqa: F401
from openapi_server.models.targeting_template_list200_response import TargetingTemplateList200Response  # noqa: F401
from openapi_server.models.targeting_template_update_request import TargetingTemplateUpdateRequest  # noqa: F401


def test_targeting_template_list(client: TestClient):
    """Test case for targeting_template_list

    List targeting templates
    """
    params = [("order", 'ASCENDING'),     ("include_sizing", False),     ("search_query", 'gaming'),     ("page_size", 25),     ("bookmark", 'bookmark_example')]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/targeting_templates".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_targeting_template_create(client: TestClient):
    """Test case for targeting_template_create

    Create targeting templates
    """
    targeting_template_create = {"targeting_attributes":{"location":["LOCATION","LOCATION"],"maximum_age":"65+","age_bucket":["35-44","50-54"],"audience_include":["AUDIENCE_INCLUDE","AUDIENCE_INCLUDE"],"shopping_retargeting":[{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]},{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]}],"targeting_strategy":["CHOOSE_YOUR_OWN","CHOOSE_YOUR_OWN"],"interest":["INTEREST","INTEREST"],"geo":["GEO","GEO"],"minimum_age":"18","locale":["LOCALE","LOCALE"],"gender":["unknown","unknown"],"apptype":["ipad","iphone"],"audience_exclude":["AUDIENCE_EXCLUDE","AUDIENCE_EXCLUDE"]},"keywords":[{"value":"cats","match_type":"EXACT_NEGATIVE"}],"name":"Gaming","auto_targeting_enabled":1,"placement_group":"ALL","tracking_urls":{"impression":["URL1","URL2"],"click":["URL1","URL2"],"engagement":["URL1","URL2"],"buyable_button":["URL1","URL2"],"audience_verification":["URL1","URL2"]}}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/targeting_templates".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=targeting_template_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_targeting_template_update(client: TestClient):
    """Test case for targeting_template_update

    Update targeting templates
    """
    targeting_template_update_request = {"targeting_attributes":{"location":["LOCATION","LOCATION"],"maximum_age":"65+","age_bucket":["35-44","50-54"],"audience_include":["AUDIENCE_INCLUDE","AUDIENCE_INCLUDE"],"shopping_retargeting":[{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]},{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]}],"targeting_strategy":["CHOOSE_YOUR_OWN","CHOOSE_YOUR_OWN"],"interest":["INTEREST","INTEREST"],"geo":["GEO","GEO"],"minimum_age":"18","locale":["LOCALE","LOCALE"],"gender":["unknown","unknown"],"apptype":["ipad","iphone"],"audience_exclude":["AUDIENCE_EXCLUDE","AUDIENCE_EXCLUDE"]},"operation_type":"REMOVE","id":"643"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/ad_accounts/{ad_account_id}/targeting_templates".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=targeting_template_update_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

