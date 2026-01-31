# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.brand_accounts_create200_response import BrandAccountsCreate200Response  # noqa: E501
from app.openapi_server.models.brand_accounts_create_request import BrandAccountsCreateRequest  # noqa: E501
from app.openapi_server.models.brand_accounts_update_request import BrandAccountsUpdateRequest  # noqa: E501
from app.openapi_server.models.delete_partners_request import DeletePartnersRequest  # noqa: E501
from app.openapi_server.models.delete_partners_response import DeletePartnersResponse  # noqa: E501
from app.openapi_server.models.deleted_members_response import DeletedMembersResponse  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.get_business_employers200_response import GetBusinessEmployers200Response  # noqa: E501
from app.openapi_server.models.get_business_members200_response import GetBusinessMembers200Response  # noqa: E501
from app.openapi_server.models.get_business_partners200_response import GetBusinessPartners200Response  # noqa: E501
from app.openapi_server.models.member_business_role import MemberBusinessRole  # noqa: E501
from app.openapi_server.models.members_to_delete_body import MembersToDeleteBody  # noqa: E501
from app.openapi_server.models.partner_type import PartnerType  # noqa: E501
from app.openapi_server.models.system_user_update_request import SystemUserUpdateRequest  # noqa: E501
from app.openapi_server.models.update_member_business_role_body import UpdateMemberBusinessRoleBody  # noqa: E501
from app.openapi_server.models.update_member_results_response_array import UpdateMemberResultsResponseArray  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBusinessAccessRelationshipsController(BaseTestCase):
    """BusinessAccessRelationshipsController integration test stubs"""

    def test_brand_accounts_create(self):
        """Test case for brand_accounts_create

        Create a Brand Account
        """
        body = openapi_server.BrandAccountsCreateRequest()
        response = self.client.open(
            '/v5/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts'.format(business_hierarchy_id='7009386637860'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_brand_accounts_update(self):
        """Test case for brand_accounts_update

        Update a Brand Account
        """
        body = openapi_server.BrandAccountsUpdateRequest()
        response = self.client.open(
            '/v5/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}'.format(business_hierarchy_id='7009386637860', brand_account_id='729090764583391194'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_business_membership(self):
        """Test case for delete_business_membership

        Terminate business memberships
        """
        body = {"members":[{"member_id":"140943737684417","business_role":"BIZ_ADMIN"},{"member_id":"140943737684417","business_role":"BIZ_ADMIN"},{"member_id":"140943737684417","business_role":"BIZ_ADMIN"},{"member_id":"140943737684417","business_role":"BIZ_ADMIN"},{"member_id":"140943737684417","business_role":"BIZ_ADMIN"}]}
        response = self.client.open(
            '/v5/businesses/{business_id}/members'.format(business_id='729090764583391194'),
            method='DELETE',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_business_partners(self):
        """Test case for delete_business_partners

        Terminate business partnerships
        """
        body = {"partner_type":"partner_type","partner_ids":["1234567890123","1234567890123","1234567890123","1234567890123","1234567890123"]}
        response = self.client.open(
            '/v5/businesses/{business_id}/partners'.format(business_id='729090764583391194'),
            method='DELETE',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_business_employers(self):
        """Test case for get_business_employers

        List business employers for user
        """
        query_string = [('page_size', 25),
                        ('bookmark', 'bookmark_example')]
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
                        ('member_ids', '00101010101,2222220101'),
                        ('start_index', 0),
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/businesses/{business_id}/members'.format(business_id='729090764583391194'),
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
                        ('partner_ids', '00101010101,2222220101'),
                        ('start_index', 0),
                        ('page_size', 25),
                        ('bookmark', 'bookmark_example')]
        response = self.client.open(
            '/v5/businesses/{business_id}/partners'.format(business_id='729090764583391194'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_system_user_update(self):
        """Test case for system_user_update

        Update a system user information.
        """
        body = openapi_server.SystemUserUpdateRequest()
        response = self.client.open(
            '/v5/businesses/{business_id}/system_users/{system_user_id}'.format(business_id='729090764583391194', system_user_id='729090764583391194'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_business_memberships(self):
        """Test case for update_business_memberships

        Update member's business role
        """
        body = {"member_id":"140943737684417","business_role":"BIZ_ADMIN"}
        response = self.client.open(
            '/v5/businesses/{business_id}/members'.format(business_id='729090764583391194'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
