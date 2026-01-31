# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.keyword_update_body import KeywordUpdateBody  # noqa: E501
from app.openapi_server.models.keywords_get200_response import KeywordsGet200Response  # noqa: E501
from app.openapi_server.models.keywords_metrics_array_response import KeywordsMetricsArrayResponse  # noqa: E501
from app.openapi_server.models.keywords_request import KeywordsRequest  # noqa: E501
from app.openapi_server.models.keywords_response import KeywordsResponse  # noqa: E501
from app.openapi_server.models.match_type import MatchType  # noqa: E501
from app.openapi_server.models.trend_type import TrendType  # noqa: E501
from app.openapi_server.models.trending_keywords_response import TrendingKeywordsResponse  # noqa: E501
from app.openapi_server.models.trends_supported_region import TrendsSupportedRegion  # noqa: E501
from openapi_server.test import BaseTestCase


class TestKeywordsController(BaseTestCase):
    """KeywordsController integration test stubs"""

    def test_country_keywords_metrics_get(self):
        """Test case for country_keywords_metrics_get

        Get country's keyword metrics
        """
        query_string = [('country_code', 'US'),
                        ('keywords', ['keywords_example'])]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/keywords/metrics'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_keywords_create(self):
        """Test case for keywords_create

        Create keywords
        """
        body = {"keywords":[{"match_type":"BROAD","bid":6,"value":"value"},{"match_type":"BROAD","bid":6,"value":"value"}],"parent_id":"383791336903426391"}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/keywords'.format(ad_account_id='ad_account_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_keywords_get(self):
        """Test case for keywords_get

        Get keywords
        """
        query_string = [('campaign_id', 'campaign_id_example'),
                        ('ad_group_id', '123123123'),
                        ('ad_group_ids', ['ad_group_ids_example']),
                        ('match_types', [openapi_server.MatchType()]),
                        ('page_size', 25),
                        ('bookmark', 'bookmark_example')]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/keywords'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_keywords_update(self):
        """Test case for keywords_update

        Update keywords
        """
        body = {"keywords":[{"archived":False,"id":"2886364308355","bid":1},{"archived":False,"id":"2886364308355","bid":1}]}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/keywords'.format(ad_account_id='ad_account_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_trending_keywords_list(self):
        """Test case for trending_keywords_list

        List trending keywords
        """
        query_string = [('interests', ['[\"beauty\",\"womens_fashion\"]']),
                        ('genders', ['[\"female\",\"unknown\"]']),
                        ('ages', ['[\"35-44\",\"50-54\"]']),
                        ('include_keywords', ['[\"recipes\",\"dessert\"]']),
                        ('normalize_against_group', False),
                        ('limit', 50),
                        ('include_prediction', False),
                        ('include_demographics', False)]
        response = self.client.open(
            '/v5/trends/keywords/{region}/top/{trend_type}'.format(region=openapi_server.TrendsSupportedRegion(), trend_type=openapi_server.TrendType()),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
