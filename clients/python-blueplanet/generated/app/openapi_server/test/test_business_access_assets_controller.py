# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.asset_group_deletion import AssetGroupDeletion  # noqa: E501
from app.openapi_server.models.asset_group_deletion_delete import AssetGroupDeletionDelete  # noqa: E501
from app.openapi_server.models.asset_group_input import AssetGroupInput  # noqa: E501
from app.openapi_server.models.asset_group_input_create import AssetGroupInputCreate  # noqa: E501
from app.openapi_server.models.asset_group_modification import AssetGroupModification  # noqa: E501
from app.openapi_server.models.asset_group_modification_read_or_update import AssetGroupModificationReadOrUpdate  # noqa: E501
from app.openapi_server.models.asset_permission_type import AssetPermissionType  # noqa: E501
from app.openapi_server.models.asset_search_by import AssetSearchBy  # noqa: E501
from app.openapi_server.models.asset_sort_by import AssetSortBy  # noqa: E501
from app.openapi_server.models.business_asset_members_get200_response import BusinessAssetMembersGet200Response  # noqa: E501
from app.openapi_server.models.business_assets_get200_response import BusinessAssetsGet200Response  # noqa: E501
from app.openapi_server.models.business_member_assets_get_response import BusinessMemberAssetsGetResponse  # noqa: E501
from app.openapi_server.models.business_members_asset_access_delete_body import BusinessMembersAssetAccessDeleteBody  # noqa: E501
from app.openapi_server.models.business_partner_asset_access_get200_response import BusinessPartnerAssetAccessGet200Response  # noqa: E501
from app.openapi_server.models.delete_member_access_results_response_array import DeleteMemberAccessResultsResponseArray  # noqa: E501
from app.openapi_server.models.delete_partner_asset_access_body import DeletePartnerAssetAccessBody  # noqa: E501
from app.openapi_server.models.delete_partner_asset_access_results_response_array import DeletePartnerAssetAccessResultsResponseArray  # noqa: E501
from app.openapi_server.models.non_draft_entity_status import NonDraftEntityStatus  # noqa: E501
from app.openapi_server.models.permissions_with_owner import PermissionsWithOwner  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
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
        body = {"asset_group":{"ad_accounts_ids":["549755885175"],"asset_group_description":"Asset group that has ad accounts used in Canada","asset_group_name":"Canada Ad Accounts","asset_group_types":["LOCATION_OR_LANGUAGE"],"catalogs_ids":["4836859046874"],"created_by":"","created_time":1646767577816,"id":"666791336903426391","owner":"","profiles_ids":["630433785246278264"],"updated_time":1646767577816},"asset_group_description":"Asset groups that has ad accounts shared in Canada","asset_group_name":"Canada Ad Accounts","asset_group_types":["BRAND","LOCATION_OR_LANGUAGE","PRODUCT_LINE","OTHER"]}
        response = self.client.open(
            '/v5/businesses/{business_id}/asset_groups'.format(business_id='business_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_asset_group_delete(self):
        """Test case for asset_group_delete

        Delete asset groups.
        """
        body = {"asset_groups_to_delete":[null,null,null,null,null]}
        response = self.client.open(
            '/v5/businesses/{business_id}/asset_groups'.format(business_id='business_id_example'),
            method='DELETE',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_asset_group_update(self):
        """Test case for asset_group_update

        Update asset groups.
        """
        body = {"asset_groups_to_update":[{"asset_group_id":"asset_group_id","asset_group_types":["BRAND","LOCATION_OR_LANGUAGE","PRODUCT_LINE","OTHER"],"assets_to_add":["assets_to_add","assets_to_add"],"assets_to_remove":["assets_to_remove","assets_to_remove"],"description":"description","name":"name"},{"asset_group_id":"asset_group_id","asset_group_types":["BRAND","LOCATION_OR_LANGUAGE","PRODUCT_LINE","OTHER"],"assets_to_add":["assets_to_add","assets_to_add"],"assets_to_remove":["assets_to_remove","assets_to_remove"],"description":"description","name":"name"}],"exceptions":[{"asset_group_id":"asset_group_id","code":0,"message":"message"},{"asset_group_id":"asset_group_id","code":0,"message":"message"}],"updated_asset_groups":[{"ad_accounts_ids":["549755885175"],"asset_group_description":"Asset group that has ad accounts used in Canada","asset_group_name":"Canada Ad Accounts","asset_group_types":["LOCATION_OR_LANGUAGE"],"catalogs_ids":["4836859046874"],"created_by":"","created_time":1646767577816,"id":"666791336903426391","owner":"","profiles_ids":["630433785246278264"],"updated_time":1646767577816},{"ad_accounts_ids":["549755885175"],"asset_group_description":"Asset group that has ad accounts used in Canada","asset_group_name":"Canada Ad Accounts","asset_group_types":["LOCATION_OR_LANGUAGE"],"catalogs_ids":["4836859046874"],"created_by":"","created_time":1646767577816,"id":"666791336903426391","owner":"","profiles_ids":["630433785246278264"],"updated_time":1646767577816}]}
        response = self.client.open(
            '/v5/businesses/{business_id}/asset_groups'.format(business_id='business_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_business_asset_members_get(self):
        """Test case for business_asset_members_get

        Get members with access to asset
        """
        query_string = [('start_index', 0),
                        ('fetch_system_users', False),
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/businesses/{business_id}/assets/{asset_id}/members'.format(business_id='business_id_example', asset_id='asset_id_example'),
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
            '/v5/businesses/{business_id}/assets/{asset_id}/partners'.format(business_id='business_id_example', asset_id='asset_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_business_assets_get(self):
        """Test case for business_assets_get

        List business assets
        """
        query_string = [('permissions', [openapi_server.PermissionsWithOwner()]),
                        ('child_asset_id', 'child_asset_id_example'),
                        ('asset_group_id', 'asset_group_id_example'),
                        ('asset_type', 'AD_ACCOUNT'),
                        ('start_index', 0),
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/businesses/{business_id}/assets'.format(business_id='business_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_business_member_assets_get(self):
        """Test case for business_member_assets_get

        Get assets assigned to a member
        """
        query_string = [('asset_type', 'AD_ACCOUNT'),
                        ('start_index', 0),
                        ('sort_by', openapi_server.AssetSortBy()),
                        ('sort_ascending', True),
                        ('search_by', openapi_server.AssetSearchBy()),
                        ('search_value', 'search_value_example'),
                        ('asset_permission_type', openapi_server.AssetPermissionType()),
                        ('ad_account_statuses', [openapi_server.NonDraftEntityStatus()]),
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/businesses/{business_id}/members/{member_id}/assets'.format(business_id='business_id_example', member_id='member_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_business_members_asset_access_delete(self):
        """Test case for business_members_asset_access_delete

        Delete member access to asset
        """
        body = {"accesses":[{"asset_id":"asset_id","member_id":"member_id"},{"asset_id":"asset_id","member_id":"member_id"},{"asset_id":"asset_id","member_id":"member_id"},{"asset_id":"asset_id","member_id":"member_id"},{"asset_id":"asset_id","member_id":"member_id"}]}
        response = self.client.open(
            '/v5/businesses/{business_id}/members/assets/access'.format(business_id='business_id_example'),
            method='DELETE',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_business_members_asset_access_update(self):
        """Test case for business_members_asset_access_update

        Assign/Update member asset permissions
        """
        body = {"accesses":[{"asset_id":"asset_id","member_id":"member_id","permissions":["ADMIN","ADMIN","ADMIN","ADMIN","ADMIN"]},{"asset_id":"asset_id","member_id":"member_id","permissions":["ADMIN","ADMIN","ADMIN","ADMIN","ADMIN"]},{"asset_id":"asset_id","member_id":"member_id","permissions":["ADMIN","ADMIN","ADMIN","ADMIN","ADMIN"]},{"asset_id":"asset_id","member_id":"member_id","permissions":["ADMIN","ADMIN","ADMIN","ADMIN","ADMIN"]},{"asset_id":"asset_id","member_id":"member_id","permissions":["ADMIN","ADMIN","ADMIN","ADMIN","ADMIN"]}]}
        response = self.client.open(
            '/v5/businesses/{business_id}/members/assets/access'.format(business_id='business_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_business_partner_asset_access_get(self):
        """Test case for business_partner_asset_access_get

        Get assets assigned to a partner or assets assigned by a partner
        """
        query_string = [('partner_type', 'INTERNAL'),
                        ('asset_type', 'AD_ACCOUNT'),
                        ('start_index', 0),
                        ('sort_by', openapi_server.AssetSortBy()),
                        ('sort_ascending', True),
                        ('search_by', openapi_server.AssetSearchBy()),
                        ('search_value', 'search_value_example'),
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/businesses/{business_id}/partners/{partner_id}/assets'.format(business_id='business_id_example', partner_id='partner_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_partner_asset_access_handler_impl(self):
        """Test case for delete_partner_asset_access_handler_impl

        Delete partner access to asset
        """
        body = {"accesses":[{"asset_id":"asset_id","partner_id":"partner_id","partner_type":"INTERNAL"},{"asset_id":"asset_id","partner_id":"partner_id","partner_type":"INTERNAL"},{"asset_id":"asset_id","partner_id":"partner_id","partner_type":"INTERNAL"},{"asset_id":"asset_id","partner_id":"partner_id","partner_type":"INTERNAL"},{"asset_id":"asset_id","partner_id":"partner_id","partner_type":"INTERNAL"}]}
        response = self.client.open(
            '/v5/businesses/{business_id}/partners/assets'.format(business_id='business_id_example'),
            method='DELETE',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_partner_asset_access_handler_impl(self):
        """Test case for update_partner_asset_access_handler_impl

        Assign/Update partner asset permissions
        """
        body = {"accesses":[{"asset_id":"asset_id","partner_id":"partner_id","permissions":["ADMIN","ADMIN","ADMIN","ADMIN","ADMIN"]},{"asset_id":"asset_id","partner_id":"partner_id","permissions":["ADMIN","ADMIN","ADMIN","ADMIN","ADMIN"]},{"asset_id":"asset_id","partner_id":"partner_id","permissions":["ADMIN","ADMIN","ADMIN","ADMIN","ADMIN"]},{"asset_id":"asset_id","partner_id":"partner_id","permissions":["ADMIN","ADMIN","ADMIN","ADMIN","ADMIN"]},{"asset_id":"asset_id","partner_id":"partner_id","permissions":["ADMIN","ADMIN","ADMIN","ADMIN","ADMIN"]}]}
        response = self.client.open(
            '/v5/businesses/{business_id}/partners/assets'.format(business_id='business_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
