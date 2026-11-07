# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.keywords import Keywords  # noqa: E501
from app.openapi_server.models.keywords_create import KeywordsCreate  # noqa: E501
from app.openapi_server.models.keywords_get200_response import KeywordsGet200Response  # noqa: E501
from app.openapi_server.models.keywords_metrics_array_response import KeywordsMetricsArrayResponse  # noqa: E501
from app.openapi_server.models.keywords_update import KeywordsUpdate  # noqa: E501
from app.openapi_server.models.match_type import MatchType  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.trend_type import TrendType  # noqa: E501
from app.openapi_server.models.trending_keywords_response import TrendingKeywordsResponse  # noqa: E501
from app.openapi_server.models.trends_age_bucket import TrendsAgeBucket  # noqa: E501
from app.openapi_server.models.trends_gender_filter import TrendsGenderFilter  # noqa: E501
from app.openapi_server.models.trends_l1_interest import TrendsL1Interest  # noqa: E501
from app.openapi_server.models.trends_supported_region import TrendsSupportedRegion  # noqa: E501
from openapi_server.test import BaseTestCase


class TestKeywordsController(BaseTestCase):
    """KeywordsController integration test stubs"""

    def test_country_keywords_metrics_get(self):
        """Test case for country_keywords_metrics_get

        Get country's keyword metrics
        """
        query_string = [('country_code', 'country_code_example'),
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
        body = {"keywords":[{"bid":0,"match_type":"","value":"value"},{"bid":0,"match_type":"","value":"value"}],"parent_id":"parent_id"}
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
                        ('ad_group_id', 'ad_group_id_example'),
                        ('ad_group_ids', ['ad_group_ids_example']),
                        ('match_types', [openapi_server.MatchType()]),
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
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
        body = {"keywords":[{"archived":False,"bid":0,"id":"383791336903426391"},{"archived":False,"bid":0,"id":"383791336903426391"}]}
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
        query_string = [('interests', [openapi_server.TrendsL1Interest()]),
                        ('genders', [openapi_server.TrendsGenderFilter()]),
                        ('ages', [openapi_server.TrendsAgeBucket()]),
                        ('include_keywords', ['include_keywords_example']),
                        ('normalize_against_group', False),
                        ('limit', 50),
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
