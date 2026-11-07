# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.brand_account import BrandAccount  # noqa: E501
from app.openapi_server.models.brand_account_create import BrandAccountCreate  # noqa: E501
from app.openapi_server.models.brand_account_update import BrandAccountUpdate  # noqa: E501
from app.openapi_server.models.business_membership_member import BusinessMembershipMember  # noqa: E501
from app.openapi_server.models.delete_business_membership200_response import DeleteBusinessMembership200Response  # noqa: E501
from app.openapi_server.models.delete_business_membership_body import DeleteBusinessMembershipBody  # noqa: E501
from app.openapi_server.models.delete_business_partners import DeleteBusinessPartners  # noqa: E501
from app.openapi_server.models.delete_business_partners_delete import DeleteBusinessPartnersDelete  # noqa: E501
from app.openapi_server.models.get_business_employers200_response import GetBusinessEmployers200Response  # noqa: E501
from app.openapi_server.models.member_business_role import MemberBusinessRole  # noqa: E501
from app.openapi_server.models.partner_type import PartnerType  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.system_user_update_with_required_body import SystemUserUpdateWithRequiredBody  # noqa: E501
from app.openapi_server.models.update_business_memberships_response import UpdateBusinessMembershipsResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBusinessAccessRelationshipsController(BaseTestCase):
    """BusinessAccessRelationshipsController integration test stubs"""

    def test_brand_accounts_create(self):
        """Test case for brand_accounts_create

        Create a Brand Account
        """
        body = {"about":"about","country":"AD","name":"name","profile_image":{"content_type":"image/jpeg","data":"data"},"username":"username","website":"website"}
        response = self.client.open(
            '/v5/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts'.format(business_hierarchy_id='business_hierarchy_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_brand_accounts_update(self):
        """Test case for brand_accounts_update

        Update a Brand Account
        """
        body = {"about":"about","country":"AD","name":"name","profile_image":{"content_type":"image/jpeg","data":"data"},"username":"username","website":"website"}
        response = self.client.open(
            '/v5/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}'.format(brand_account_id='brand_account_id_example', business_hierarchy_id='business_hierarchy_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_business_membership(self):
        """Test case for delete_business_membership

        Terminate business memberships
        """
        body = {"members":[{"business_role":"BIZ_ADMIN","member_id":"140943737684417"},{"business_role":"BIZ_ADMIN","member_id":"140943737684417"},{"business_role":"BIZ_ADMIN","member_id":"140943737684417"},{"business_role":"BIZ_ADMIN","member_id":"140943737684417"},{"business_role":"BIZ_ADMIN","member_id":"140943737684417"}]}
        response = self.client.open(
            '/v5/businesses/{business_id}/members'.format(business_id='business_id_example'),
            method='DELETE',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_business_partners(self):
        """Test case for delete_business_partners

        Terminate business partnerships
        """
        body = {"partner_ids":[null,null,null,null,null],"partner_type":""}
        response = self.client.open(
            '/v5/businesses/{business_id}/partners'.format(business_id='business_id_example'),
            method='DELETE',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_business_employers(self):
        """Test case for get_business_employers

        List business employers for user
        """
        query_string = [('assets_summary', True),
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/businesses/employers',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_business_members(self):
        """Test case for get_business_members

        Get business members
        """
        query_string = [('fetch_system_users', False),
                        ('assets_summary', False),
                        ('business_roles', [openapi_server.MemberBusinessRole()]),
                        ('member_ids', 'member_ids_example'),
                        ('start_index', 0),
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/businesses/{business_id}/members'.format(business_id='business_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_business_partners(self):
        """Test case for get_business_partners

        Get business partners
        """
        query_string = [('assets_summary', False),
                        ('partner_type', openapi_server.PartnerType()),
                        ('partner_ids', 'partner_ids_example'),
                        ('start_index', 0),
                        ('sort_ascending', True),
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/businesses/{business_id}/partners'.format(business_id='business_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_system_user_update(self):
        """Test case for system_user_update

        Update a system user information.
        """
        body = {"name":"name"}
        response = self.client.open(
            '/v5/businesses/{business_id}/system_users/{system_user_id}'.format(business_id='business_id_example', system_user_id='system_user_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_business_memberships(self):
        """Test case for update_business_memberships

        Update member's business role
        """
        body = {"business_role":"BIZ_ADMIN","member_id":"140943737684417"}
        response = self.client.open(
            '/v5/businesses/{business_id}/members'.format(business_id='business_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
