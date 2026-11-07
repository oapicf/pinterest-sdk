# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, field_validator  # noqa: F401
from typing import Any, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: F401
from openapi_server.models.targeting_template import TargetingTemplate  # noqa: F401
from openapi_server.models.targeting_template_create import TargetingTemplateCreate  # noqa: F401
from openapi_server.models.targeting_template_list200_response import TargetingTemplateList200Response  # noqa: F401
from openapi_server.models.targeting_template_update_request_read_or_update import TargetingTemplateUpdateRequestReadOrUpdate  # noqa: F401


def test_targeting_template_list(client: TestClient):
    """Test case for targeting_template_list

    List targeting templates
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25),     ("order", openapi_server.PinterestLibPaginationOrder()),     ("include_sizing", False),     ("search_query", 'search_query_example')]
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
    targeting_template_create = openapi_server.TargetingTemplateCreate()

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
    targeting_template_update_request_read_or_update = openapi_server.TargetingTemplateUpdateRequestReadOrUpdate()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/ad_accounts/{ad_account_id}/targeting_templates".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=targeting_template_update_request_read_or_update,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

