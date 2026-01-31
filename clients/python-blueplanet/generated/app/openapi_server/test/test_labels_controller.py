# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.label_create_request import LabelCreateRequest  # noqa: E501
from app.openapi_server.models.label_update_request import LabelUpdateRequest  # noqa: E501
from app.openapi_server.models.labels_list200_response import LabelsList200Response  # noqa: E501
from app.openapi_server.models.labels_response import LabelsResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestLabelsController(BaseTestCase):
    """LabelsController integration test stubs"""

    def test_labels_create(self):
        """Test case for labels_create

        Create labels
        """
        body = {"parent_id":"626753052072","labels":[{"label_type":"BRAND","value":"value"},{"label_type":"BRAND","value":"value"}]}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/labels'.format(ad_account_id='ad_account_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_labels_list(self):
        """Test case for labels_list

        List labels
        """
        query_string = [('campaign_ids', ['campaign_ids_example']),
                        ('label_ids', ['label_ids_example']),
                        ('entity_statuses', ["ACTIVE"]),
                        ('label_types', ["BRAND","CUSTOM"]),
                        ('page_size', 25),
                        ('bookmark', 'bookmark_example')]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/labels'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_labels_update(self):
        """Test case for labels_update

        Update labels
        """
        body = {"labels":[{"id":"1106385754497","value":"value","status":"ACTIVE"},{"id":"1106385754497","value":"value","status":"ACTIVE"}]}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/labels'.format(ad_account_id='ad_account_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
