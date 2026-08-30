# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, StrictStr, field_validator  # noqa: F401
from typing import List, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: F401
from openapi_server.models.schedule import Schedule  # noqa: F401
from openapi_server.models.schedule_batch_update import ScheduleBatchUpdate  # noqa: F401
from openapi_server.models.schedule_create import ScheduleCreate  # noqa: F401
from openapi_server.models.schedule_status import ScheduleStatus  # noqa: F401
from openapi_server.models.schedule_type import ScheduleType  # noqa: F401
from openapi_server.models.schedules_create200_response_inner import SchedulesCreate200ResponseInner  # noqa: F401
from openapi_server.models.schedules_list200_response import SchedulesList200Response  # noqa: F401


def test_schedules_list(client: TestClient):
    """Test case for schedules_list

    Get Schedules
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25),     ("order", openapi_server.PinterestLibPaginationOrder()),     ("schedule_statuses", [openapi_server.ScheduleStatus()]),     ("schedule_type", openapi_server.ScheduleType()),     ("entity_ids", ['entity_ids_example'])]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/schedules".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_schedules_create(client: TestClient):
    """Test case for schedules_create

    Create schedules
    """
    schedule_create = [[openapi_server.ScheduleCreate()]]

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/schedules".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=schedule_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_schedules_update(client: TestClient):
    """Test case for schedules_update

    Update schedules
    """
    schedule_batch_update = [[openapi_server.ScheduleBatchUpdate()]]

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/ad_accounts/{ad_account_id}/schedules".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=schedule_batch_update,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

