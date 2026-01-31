# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, StrictBool, StrictStr, field_validator  # noqa: F401
from typing import Dict, List, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.conversion_event_response import ConversionEventResponse  # noqa: F401
from openapi_server.models.conversion_tag import ConversionTag  # noqa: F401
from openapi_server.models.conversion_tag_create import ConversionTagCreate  # noqa: F401
from openapi_server.models.conversion_tags_list200_response import ConversionTagsList200Response  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401
from openapi_server.models.page_visit_conversion_tags_get200_response import PageVisitConversionTagsGet200Response  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401


def test_conversion_tags_list(client: TestClient):
    """Test case for conversion_tags_list

    List conversion tags
    """
    params = [("filter_deleted", False)]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/conversion_tags".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_conversion_tags_create(client: TestClient):
    """Test case for conversion_tags_create

    Create conversion tag
    """
    conversion_tag_create = {"aem_fnln_enabled":0,"aem_external_id_enabled":0,"aem_db_enabled":0,"aem_enabled":0,"name":"ACME Checkout Test Tag","md_frequency":0.6,"aem_ph_enabled":0,"aem_ge_enabled":0,"aem_loc_enabled":0}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/conversion_tags".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=conversion_tag_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ocpm_eligible_conversion_tags_get(client: TestClient):
    """Test case for ocpm_eligible_conversion_tags_get

    Get Ocpm eligible conversion tags
    """

    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_page_visit_conversion_tags_get(client: TestClient):
    """Test case for page_visit_conversion_tags_get

    Get page visit conversion tags
    """
    params = [("page_size", 25),     ("order", 'ASCENDING'),     ("bookmark", 'bookmark_example')]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/conversion_tags/page_visit".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_conversion_tags_get(client: TestClient):
    """Test case for conversion_tags_get

    Get conversion tag
    """

    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}".format(ad_account_id='ad_account_id_example', conversion_tag_id='2617998078212'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

