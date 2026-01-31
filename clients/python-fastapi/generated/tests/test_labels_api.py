# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, StrictStr, field_validator  # noqa: F401
from typing import List, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401
from openapi_server.models.label_create_request import LabelCreateRequest  # noqa: F401
from openapi_server.models.label_update_request import LabelUpdateRequest  # noqa: F401
from openapi_server.models.labels_list200_response import LabelsList200Response  # noqa: F401
from openapi_server.models.labels_response import LabelsResponse  # noqa: F401


def test_labels_list(client: TestClient):
    """Test case for labels_list

    List labels
    """
    params = [("campaign_ids", ['campaign_ids_example']),     ("label_ids", ['label_ids_example']),     ("entity_statuses", ["ACTIVE"]),     ("label_types", ["BRAND","CUSTOM"]),     ("page_size", 25),     ("bookmark", 'bookmark_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/labels".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_labels_create(client: TestClient):
    """Test case for labels_create

    Create labels
    """
    label_create_request = {"parent_id":"626753052072","labels":[{"label_type":"BRAND","value":"value"},{"label_type":"BRAND","value":"value"}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/labels".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=label_create_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_labels_update(client: TestClient):
    """Test case for labels_update

    Update labels
    """
    label_update_request = {"labels":[{"id":"1106385754497","value":"value","status":"ACTIVE"},{"id":"1106385754497","value":"value","status":"ACTIVE"}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/ad_accounts/{ad_account_id}/labels".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=label_update_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

