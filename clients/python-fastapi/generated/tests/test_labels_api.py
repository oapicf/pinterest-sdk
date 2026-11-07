# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, field_validator  # noqa: F401
from typing import List, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.label_create_request import LabelCreateRequest  # noqa: F401
from openapi_server.models.label_update_request import LabelUpdateRequest  # noqa: F401
from openapi_server.models.labeled_entities import LabeledEntities  # noqa: F401
from openapi_server.models.labeled_entities_create import LabeledEntitiesCreate  # noqa: F401
from openapi_server.models.labels_list200_response import LabelsList200Response  # noqa: F401
from openapi_server.models.labels_response import LabelsResponse  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401
from openapi_server.models.query_label_entity_statuses_items import QueryLabelEntityStatusesItems  # noqa: F401
from openapi_server.models.query_label_types_items import QueryLabelTypesItems  # noqa: F401


def test_labels_list(client: TestClient):
    """Test case for labels_list

    List labels
    """
    params = [("campaign_ids", ['campaign_ids_example']),     ("label_ids", ['label_ids_example']),     ("entity_statuses", ["ACTIVE"]),     ("label_types", ["BRAND","CUSTOM"]),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
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
    label_create_request = openapi_server.LabelCreateRequest()

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
    label_update_request = openapi_server.LabelUpdateRequest()

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


def test_labels_apply(client: TestClient):
    """Test case for labels_apply

    Apply label to entity
    """
    labeled_entities_create = openapi_server.LabeledEntitiesCreate()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/labels/{label_id}/apply".format(ad_account_id='ad_account_id_example', label_id='label_id_example'),
    #    headers=headers,
    #    json=labeled_entities_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_labels_remove(client: TestClient):
    """Test case for labels_remove

    Remove label from entities
    """
    labeled_entities_create = openapi_server.LabeledEntitiesCreate()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/labels/{label_id}/remove".format(ad_account_id='ad_account_id_example', label_id='label_id_example'),
    #    headers=headers,
    #    json=labeled_entities_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

