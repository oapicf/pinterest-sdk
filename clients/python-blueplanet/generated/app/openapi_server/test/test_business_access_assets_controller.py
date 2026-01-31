# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.business_asset_members_get200_response import BusinessAssetMembersGet200Response  # noqa: E501
from app.openapi_server.models.business_asset_partners_get200_response import BusinessAssetPartnersGet200Response  # noqa: E501
from app.openapi_server.models.business_assets_get200_response import BusinessAssetsGet200Response  # noqa: E501
from app.openapi_server.models.business_member_assets_get200_response import BusinessMemberAssetsGet200Response  # noqa: E501
from app.openapi_server.models.business_members_asset_access_delete_request import BusinessMembersAssetAccessDeleteRequest  # noqa: E501
from app.openapi_server.models.business_partner_asset_access_get200_response import BusinessPartnerAssetAccessGet200Response  # noqa: E501
from app.openapi_server.models.create_asset_group_body import CreateAssetGroupBody  # noqa: E501
from app.openapi_server.models.create_asset_group_response import CreateAssetGroupResponse  # noqa: E501
from app.openapi_server.models.delete_asset_group_body import DeleteAssetGroupBody  # noqa: E501
from app.openapi_server.models.delete_asset_group_response import DeleteAssetGroupResponse  # noqa: E501
from app.openapi_server.models.delete_member_access_results_response_array import DeleteMemberAccessResultsResponseArray  # noqa: E501
from app.openapi_server.models.delete_partner_asset_access_body import DeletePartnerAssetAccessBody  # noqa: E501
from app.openapi_server.models.delete_partner_assets_results_response_array import DeletePartnerAssetsResultsResponseArray  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.partner_type import PartnerType  # noqa: E501
from app.openapi_server.models.permissions_with_owner import PermissionsWithOwner  # noqa: E501
from app.openapi_server.models.update_asset_group_body import UpdateAssetGroupBody  # noqa: E501
from app.openapi_server.models.update_asset_group_response import UpdateAssetGroupResponse  # noqa: E501
from app.openapi_server.models.update_member_asset_access_body import UpdateMemberAssetAccessBody  # noqa: E501
from app.openapi_server.models.update_member_assets_results_response_array import UpdateMemberAssetsResultsResponseArray  # noqa: E501
from app.openapi_server.models.update_partner_asset_access_body import UpdatePartnerAssetAccessBody  # noqa: E501
from app.openapi_server.models.update_partner_assets_results_response_array import UpdatePartnerAssetsResultsResponseArray  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBusinessAccessAssetsController(BaseTestCase):
    """BusinessAccessAssetsController integration test stubs"""

    def test_asset_group_create(self):
        """Test case for asset_group_create

        Create a new asset group.
        """
        body = {"asset_group_types":["BRAND","LOCATION_OR_LANGUAGE","PRODUCT_LINE","OTHER"],"asset_group_description":"Asset groups that has ad accounts shared in Canada","asset_group_name":"Canada Ad Accounts"}
        response = self.client.open(
            '/v5/businesses/{business_id}/asset_groups'.format(business_id='729090764583391194'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_asset_group_delete(self):
        """Test case for asset_group_delete

        Delete asset groups.
        """
        body = {"asset_groups_to_delete":["666791336903426391","666791336903426392"]}
        response = self.client.open(
            '/v5/businesses/{business_id}/asset_groups'.format(business_id='729090764583391194'),
            method='DELETE',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_asset_group_update(self):
        """Test case for asset_group_update

        Update asset groups.
        """
        body = {"asset_groups_to_update":[{"asset_group_id":"666791336903426391","assets_to_add":["549755885175","549755885175"],"asset_group_types":["BRAND","LOCATION_OR_LANGUAGE","PRODUCT_LINE","OTHER"],"assets_to_remove":["549755885175","549755885175"],"name":"Canada Ad Accounts","description":"Asset groups that has ad accounts shared in Canada"},{"asset_group_id":"666791336903426391","assets_to_add":["549755885175","549755885175"],"asset_group_types":["BRAND","LOCATION_OR_LANGUAGE","PRODUCT_LINE","OTHER"],"assets_to_remove":["549755885175","549755885175"],"name":"Canada Ad Accounts","description":"Asset groups that has ad accounts shared in Canada"}]}
        response = self.client.open(
            '/v5/businesses/{business_id}/asset_groups'.format(business_id='729090764583391194'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_business_asset_members_get(self):
        """Test case for business_asset_members_get

        Get members with access to asset
        """
        query_string = [('fetch_system_users', False),
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25),
                        ('start_index', 0)]
        response = self.client.open(
            '/v5/businesses/{business_id}/assets/{asset_id}/members'.format(business_id='729090764583391194', asset_id='729090764583391194'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_business_asset_partners_get(self):
        """Test case for business_asset_partners_get

        Get partners with access to asset
        """
        query_string = [('start_index', 0),
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/businesses/{business_id}/assets/{asset_id}/partners'.format(business_id='729090764583391194', asset_id='729090764583391194'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_business_assets_get(self):
        """Test case for business_assets_get

        List business assets
        """
        query_string = [('permissions', [openapi_server.PermissionsWithOwner()]),
                        ('child_asset_id', '549764894835'),
                        ('asset_group_id', '7078106104032'),
                        ('asset_type', AD_ACCOUNT),
                        ('start_index', 0),
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/businesses/{business_id}/assets'.format(business_id='729090764583391194'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_business_member_assets_get(self):
        """Test case for business_member_assets_get

        Get assets assigned to a member
        """
        query_string = [('asset_type', AD_ACCOUNT),
                        ('start_index', 0),
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/businesses/{business_id}/members/{member_id}/assets'.format(business_id='729090764583391194', member_id='729090764583391194'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_business_members_asset_access_delete(self):
        """Test case for business_members_asset_access_delete

        Delete member access to asset
        """
        body = openapi_server.BusinessMembersAssetAccessDeleteRequest()
        response = self.client.open(
            '/v5/businesses/{business_id}/members/assets/access'.format(business_id='729090764583391194'),
            method='DELETE',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_business_members_asset_access_update(self):
        """Test case for business_members_asset_access_update

        Assign/Update member asset permissions
        """
        body = {"accesses":[{"member_id":"140943737684417","permissions":["ANALYST","ADMIN"],"asset_id":"549755885175"},{"member_id":"140943737684417","permissions":["ANALYST","ADMIN"],"asset_id":"549755885175"},{"member_id":"140943737684417","permissions":["ANALYST","ADMIN"],"asset_id":"549755885175"},{"member_id":"140943737684417","permissions":["ANALYST","ADMIN"],"asset_id":"549755885175"},{"member_id":"140943737684417","permissions":["ANALYST","ADMIN"],"asset_id":"549755885175"}]}
        response = self.client.open(
            '/v5/businesses/{business_id}/members/assets/access'.format(business_id='729090764583391194'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_business_partner_asset_access_get(self):
        """Test case for business_partner_asset_access_get

        Get assets assigned to a partner or assets assigned by a partner
        """
        query_string = [('partner_type', openapi_server.PartnerType()),
                        ('asset_type', AD_ACCOUNT),
                        ('start_index', 0),
                        ('page_size', 25),
                        ('bookmark', 'bookmark_example')]
        response = self.client.open(
            '/v5/businesses/{business_id}/partners/{partner_id}/assets'.format(business_id='729090764583391194', partner_id='729090764583391194'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_partner_asset_access_handler_impl(self):
        """Test case for delete_partner_asset_access_handler_impl

        Delete partner access to asset
        """
        body = {"accesses":[{"partner_id":"1234567890123","partner_type":"INTERNAL","asset_id":"549755885175"},{"partner_id":"1234567890123","partner_type":"INTERNAL","asset_id":"549755885175"},{"partner_id":"1234567890123","partner_type":"INTERNAL","asset_id":"549755885175"},{"partner_id":"1234567890123","partner_type":"INTERNAL","asset_id":"549755885175"},{"partner_id":"1234567890123","partner_type":"INTERNAL","asset_id":"549755885175"}]}
        response = self.client.open(
            '/v5/businesses/{business_id}/partners/assets'.format(business_id='729090764583391194'),
            method='DELETE',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_partner_asset_access_handler_impl(self):
        """Test case for update_partner_asset_access_handler_impl

        Assign/Update partner asset permissions
        """
        body = {"accesses":[{"partner_id":"1234567890123","permissions":["ANALYST","ADMIN"],"asset_id":"549755885175"},{"partner_id":"1234567890123","permissions":["ANALYST","ADMIN"],"asset_id":"549755885175"},{"partner_id":"1234567890123","permissions":["ANALYST","ADMIN"],"asset_id":"549755885175"},{"partner_id":"1234567890123","permissions":["ANALYST","ADMIN"],"asset_id":"549755885175"},{"partner_id":"1234567890123","permissions":["ANALYST","ADMIN"],"asset_id":"549755885175"}]}
        response = self.client.open(
            '/v5/businesses/{business_id}/partners/assets'.format(business_id='729090764583391194'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
