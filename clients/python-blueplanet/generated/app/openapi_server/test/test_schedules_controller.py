# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: E501
from app.openapi_server.models.schedule import Schedule  # noqa: E501
from app.openapi_server.models.schedule_batch_update import ScheduleBatchUpdate  # noqa: E501
from app.openapi_server.models.schedule_create import ScheduleCreate  # noqa: E501
from app.openapi_server.models.schedule_status import ScheduleStatus  # noqa: E501
from app.openapi_server.models.schedule_type import ScheduleType  # noqa: E501
from app.openapi_server.models.schedules_create200_response_inner import SchedulesCreate200ResponseInner  # noqa: E501
from app.openapi_server.models.schedules_list200_response import SchedulesList200Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestSchedulesController(BaseTestCase):
    """SchedulesController integration test stubs"""

    def test_schedules_create(self):
        """Test case for schedules_create

        Create schedules
        """
        body = {"delta_value":"Schedule_delta_value","end_timestamp":0,"entity_id":"","entity_type":"","name":"name","schedule_action":"","schedule_status":"","schedule_type":"","start_timestamp":6}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/schedules'.format(ad_account_id='ad_account_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_schedules_list(self):
        """Test case for schedules_list

        Get Schedules
        """
        query_string = [('bookmark', 'bookmark_example'),
                        ('page_size', 25),
                        ('order', openapi_server.PinterestLibPaginationOrder()),
                        ('schedule_statuses', [openapi_server.ScheduleStatus()]),
                        ('schedule_type', openapi_server.ScheduleType()),
                        ('entity_ids', ['entity_ids_example'])]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/schedules'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_schedules_update(self):
        """Test case for schedules_update

        Update schedules
        """
        body = {"delta_value":"Schedule_delta_value","end_timestamp":0,"entity_id":"","entity_type":"","id":"id","name":"name","schedule_action":"","schedule_id":"schedule_id","schedule_status":"","schedule_type":"","start_timestamp":6}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/schedules'.format(ad_account_id='ad_account_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
