# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.label_create_request import LabelCreateRequest  # noqa: E501
from app.openapi_server.models.label_update_request import LabelUpdateRequest  # noqa: E501
from app.openapi_server.models.labeled_entities import LabeledEntities  # noqa: E501
from app.openapi_server.models.labeled_entities_create import LabeledEntitiesCreate  # noqa: E501
from app.openapi_server.models.labels_list200_response import LabelsList200Response  # noqa: E501
from app.openapi_server.models.labels_response import LabelsResponse  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.query_label_entity_statuses_items import QueryLabelEntityStatusesItems  # noqa: E501
from app.openapi_server.models.query_label_types_items import QueryLabelTypesItems  # noqa: E501
from openapi_server.test import BaseTestCase


class TestLabelsController(BaseTestCase):
    """LabelsController integration test stubs"""

    def test_labels_apply(self):
        """Test case for labels_apply

        Apply label to entity
        """
        body = {"entity_ids":["entity_ids","entity_ids"]}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/labels/{label_id}/apply'.format(ad_account_id='ad_account_id_example', label_id='label_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_labels_create(self):
        """Test case for labels_create

        Create labels
        """
        body = {"labels":[{"label_type":"BRAND","value":"value"},{"label_type":"BRAND","value":"value"}]}
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
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/labels'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_labels_remove(self):
        """Test case for labels_remove

        Remove label from entities
        """
        body = {"entity_ids":["entity_ids","entity_ids"]}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/labels/{label_id}/remove'.format(ad_account_id='ad_account_id_example', label_id='label_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_labels_update(self):
        """Test case for labels_update

        Update labels
        """
        body = {"labels":[{"id":"1106385754497","status":"ACTIVE","value":"value"},{"id":"1106385754497","status":"ACTIVE","value":"value"}]}
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
