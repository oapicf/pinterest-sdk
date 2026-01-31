# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.account import Account  # noqa: E501
from app.openapi_server.models.analytics_metrics_response import AnalyticsMetricsResponse  # noqa: E501
from app.openapi_server.models.boards_user_follows_list200_response import BoardsUserFollowsList200Response  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.follow_user_request import FollowUserRequest  # noqa: E501
from app.openapi_server.models.followers_list200_response import FollowersList200Response  # noqa: E501
from app.openapi_server.models.linked_business import LinkedBusiness  # noqa: E501
from app.openapi_server.models.top_pins_analytics_response import TopPinsAnalyticsResponse  # noqa: E501
from app.openapi_server.models.top_video_pins_analytics_response import TopVideoPinsAnalyticsResponse  # noqa: E501
from app.openapi_server.models.user_account_followed_interests200_response import UserAccountFollowedInterests200Response  # noqa: E501
from app.openapi_server.models.user_following_feed_type import UserFollowingFeedType  # noqa: E501
from app.openapi_server.models.user_following_get200_response import UserFollowingGet200Response  # noqa: E501
from app.openapi_server.models.user_summary import UserSummary  # noqa: E501
from app.openapi_server.models.user_website_summary import UserWebsiteSummary  # noqa: E501
from app.openapi_server.models.user_website_verification_code import UserWebsiteVerificationCode  # noqa: E501
from app.openapi_server.models.user_website_verify_request import UserWebsiteVerifyRequest  # noqa: E501
from app.openapi_server.models.user_websites_get200_response import UserWebsitesGet200Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestUserAccountController(BaseTestCase):
    """UserAccountController integration test stubs"""

    def test_boards_user_follows_list(self):
        """Test case for boards_user_follows_list

        List following boards
        """
        query_string = [('bookmark', 'bookmark_example'),
                        ('page_size', 25),
                        ('explicit_following', False),
                        ('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/user_account/following/boards',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_follow_user_update(self):
        """Test case for follow_user_update

        Follow user
        """
        body = {"auto_follow":False}
        response = self.client.open(
            '/v5/user_account/following/{username}'.format(username='username'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_followers_list(self):
        """Test case for followers_list

        List followers
        """
        query_string = [('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/user_account/followers',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_linked_business_accounts_get(self):
        """Test case for linked_business_accounts_get

        List linked businesses
        """
        response = self.client.open(
            '/v5/user_account/businesses',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_unverify_website_delete(self):
        """Test case for unverify_website_delete

        Unverify website
        """
        query_string = [('website', 'mysite.test')]
        response = self.client.open(
            '/v5/user_account/websites',
            method='DELETE',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_user_account_analytics(self):
        """Test case for user_account_analytics

        Get user account analytics
        """
        query_string = [('start_date', '2013-10-20'),
                        ('end_date', '2013-10-20'),
                        ('from_claimed_content', BOTH),
                        ('pin_format', ALL),
                        ('app_types', ALL),
                        ('content_type', ALL),
                        ('source', ALL),
                        ('metric_types', ['metric_types_example']),
                        ('split_field', NO_SPLIT),
                        ('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/user_account/analytics',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_user_account_analytics_top_pins(self):
        """Test case for user_account_analytics_top_pins

        Get user account top pins analytics
        """
        query_string = [('start_date', '2013-10-20'),
                        ('end_date', '2013-10-20'),
                        ('sort_by', 'sort_by_example'),
                        ('from_claimed_content', BOTH),
                        ('pin_format', ALL),
                        ('app_types', ALL),
                        ('content_type', ALL),
                        ('source', ALL),
                        ('metric_types', ['metric_types_example']),
                        ('num_of_pins', 10),
                        ('created_in_last_n_days', 30),
                        ('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/user_account/analytics/top_pins',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_user_account_analytics_top_video_pins(self):
        """Test case for user_account_analytics_top_video_pins

        Get user account top video pins analytics
        """
        query_string = [('start_date', '2013-10-20'),
                        ('end_date', '2013-10-20'),
                        ('sort_by', 'sort_by_example'),
                        ('from_claimed_content', BOTH),
                        ('pin_format', ALL),
                        ('app_types', ALL),
                        ('content_type', ALL),
                        ('source', ALL),
                        ('metric_types', ['metric_types_example']),
                        ('num_of_pins', 10),
                        ('created_in_last_n_days', 30),
                        ('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/user_account/analytics/top_video_pins',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_user_account_followed_interests(self):
        """Test case for user_account_followed_interests

        List following interests
        """
        query_string = [('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/users/{username}/interests/follow'.format(username='username'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_user_account_get(self):
        """Test case for user_account_get

        Get user account
        """
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/user_account',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_user_following_get(self):
        """Test case for user_following_get

        List following
        """
        query_string = [('bookmark', 'bookmark_example'),
                        ('page_size', 25),
                        ('feed_type', ALL),
                        ('explicit_following', False),
                        ('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/user_account/following',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_user_websites_get(self):
        """Test case for user_websites_get

        Get user websites
        """
        query_string = [('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/user_account/websites',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_verify_website_update(self):
        """Test case for verify_website_update

        Verify website
        """
        body = {"website":"pintest-website-12345678.test/test_1","verification_method":"METATAG"}
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/user_account/websites',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_website_verification_get(self):
        """Test case for website_verification_get

        Get user verification code for website claiming
        """
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/user_account/websites/verification',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
