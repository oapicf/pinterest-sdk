# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.auth_respond_invites_body import AuthRespondInvitesBody  # noqa: E501
from app.openapi_server.models.cancel_invites_request import CancelInvitesRequest  # noqa: E501
from app.openapi_server.models.cancel_invites_response import CancelInvitesResponse  # noqa: E501
from app.openapi_server.models.create_asset_access_request_body import CreateAssetAccessRequestBody  # noqa: E501
from app.openapi_server.models.create_asset_access_request_response import CreateAssetAccessRequestResponse  # noqa: E501
from app.openapi_server.models.create_asset_invites_request import CreateAssetInvitesRequest  # noqa: E501
from app.openapi_server.models.create_invites_results_response_array import CreateInvitesResultsResponseArray  # noqa: E501
from app.openapi_server.models.create_membership_or_partnership_invites_body import CreateMembershipOrPartnershipInvitesBody  # noqa: E501
from app.openapi_server.models.get_invites200_response import GetInvites200Response  # noqa: E501
from app.openapi_server.models.invite_filter_status import InviteFilterStatus  # noqa: E501
from app.openapi_server.models.invite_type import InviteType  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.respond_to_invites_response_array import RespondToInvitesResponseArray  # noqa: E501
from app.openapi_server.models.update_invites_results_response_array import UpdateInvitesResultsResponseArray  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBusinessAccessInviteController(BaseTestCase):
    """BusinessAccessInviteController integration test stubs"""

    def test_asset_access_requests_create(self):
        """Test case for asset_access_requests_create

        Create a request to access an existing partner's assets.
        """
        body = {"asset_requests":[{"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},"partner_id":"partner_id"},{"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},"partner_id":"partner_id"},{"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},"partner_id":"partner_id"},{"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},"partner_id":"partner_id"},{"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},"partner_id":"partner_id"}]}
        response = self.client.open(
            '/v5/businesses/{business_id}/requests/assets/access'.format(business_id='business_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_cancel_invites_or_requests(self):
        """Test case for cancel_invites_or_requests

        Cancel invites/requests
        """
        body = {"invite_ids":[null,null,null,null,null]}
        response = self.client.open(
            '/v5/businesses/{business_id}/invites'.format(business_id='business_id_example'),
            method='DELETE',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_asset_invites(self):
        """Test case for create_asset_invites

        Update invite/request with an asset permission
        """
        body = {"invites":[{"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},"invite_id":"1234567890123","invite_type":"MEMBER_INVITE"},{"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},"invite_id":"1234567890123","invite_type":"MEMBER_INVITE"},{"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},"invite_id":"1234567890123","invite_type":"MEMBER_INVITE"},{"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},"invite_id":"1234567890123","invite_type":"MEMBER_INVITE"},{"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},"invite_id":"1234567890123","invite_type":"MEMBER_INVITE"}]}
        response = self.client.open(
            '/v5/businesses/{business_id}/invites/assets/access'.format(business_id='business_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_membership_or_partnership_invites(self):
        """Test case for create_membership_or_partnership_invites

        Create invites or requests
        """
        body = {"business_role":"BIZ_ADMIN","invite_type":"MEMBER_INVITE","members":["business0101","user@business.com"],"partners":["809944451643622187","766456567741825556"]}
        response = self.client.open(
            '/v5/businesses/{business_id}/invites'.format(business_id='business_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_invites(self):
        """Test case for get_invites

        Get invites/requests
        """
        query_string = [('is_member', True),
                        ('invite_status', [openapi_server.InviteFilterStatus()]),
                        ('invite_type', openapi_server.InviteType()),
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/businesses/{business_id}/invites'.format(business_id='business_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_respond_business_access_invites(self):
        """Test case for respond_business_access_invites

        Accept or decline an invite/request
        """
        body = {"invites":[{"action":{"accept_invite":True,"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]}},"invite_id":"invite_id"},{"action":{"accept_invite":True,"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]}},"invite_id":"invite_id"},{"action":{"accept_invite":True,"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]}},"invite_id":"invite_id"},{"action":{"accept_invite":True,"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]}},"invite_id":"invite_id"},{"action":{"accept_invite":True,"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]}},"invite_id":"invite_id"}]}
        response = self.client.open(
            '/v5/businesses/invites',
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
