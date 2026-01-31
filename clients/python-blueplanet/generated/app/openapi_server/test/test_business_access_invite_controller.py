# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.auth_respond_invites_body import AuthRespondInvitesBody  # noqa: E501
from app.openapi_server.models.cancel_invites_body import CancelInvitesBody  # noqa: E501
from app.openapi_server.models.create_asset_access_request_body import CreateAssetAccessRequestBody  # noqa: E501
from app.openapi_server.models.create_asset_access_request_response import CreateAssetAccessRequestResponse  # noqa: E501
from app.openapi_server.models.create_asset_invites_request import CreateAssetInvitesRequest  # noqa: E501
from app.openapi_server.models.create_invites_results_response_array import CreateInvitesResultsResponseArray  # noqa: E501
from app.openapi_server.models.create_membership_or_partnership_invites_body import CreateMembershipOrPartnershipInvitesBody  # noqa: E501
from app.openapi_server.models.delete_invites_results_response_array import DeleteInvitesResultsResponseArray  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.get_invites200_response import GetInvites200Response  # noqa: E501
from app.openapi_server.models.invite_type import InviteType  # noqa: E501
from app.openapi_server.models.respond_to_invites_response_array import RespondToInvitesResponseArray  # noqa: E501
from app.openapi_server.models.update_invites_results_response_array import UpdateInvitesResultsResponseArray  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBusinessAccessInviteController(BaseTestCase):
    """BusinessAccessInviteController integration test stubs"""

    def test_asset_access_requests_create(self):
        """Test case for asset_access_requests_create

        Create a request to access an existing partner's assets.
        """
        body = {"asset_requests":[{"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},"partner_id":"809944451643622187"},{"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},"partner_id":"809944451643622187"},{"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},"partner_id":"809944451643622187"},{"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},"partner_id":"809944451643622187"},{"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},"partner_id":"809944451643622187"}]}
        response = self.client.open(
            '/v5/businesses/{business_id}/requests/assets/access'.format(business_id='729090764583391194'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_cancel_invites_or_requests(self):
        """Test case for cancel_invites_or_requests

        Cancel invites/requests
        """
        body = {"invite_ids":["1234567890123456789","1122334455667788991"]}
        response = self.client.open(
            '/v5/businesses/{business_id}/invites'.format(business_id='729090764583391194'),
            method='DELETE',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_asset_invites(self):
        """Test case for create_asset_invites

        Update invite/request with an asset permission
        """
        body = {"invites":[{"invite_type":"MEMBER_INVITE","invite_id":"1234567890123","asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]}},{"invite_type":"MEMBER_INVITE","invite_id":"1234567890123","asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]}},{"invite_type":"MEMBER_INVITE","invite_id":"1234567890123","asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]}},{"invite_type":"MEMBER_INVITE","invite_id":"1234567890123","asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]}},{"invite_type":"MEMBER_INVITE","invite_id":"1234567890123","asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]}}]}
        response = self.client.open(
            '/v5/businesses/{business_id}/invites/assets/access'.format(business_id='729090764583391194'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_membership_or_partnership_invites(self):
        """Test case for create_membership_or_partnership_invites

        Create invites or requests
        """
        body = {"invite_type":"MEMBER_INVITE","partners":["809944451643622187","766456567741825556"],"members":["business0101","user@business.com"],"business_role":"BIZ_ADMIN"}
        response = self.client.open(
            '/v5/businesses/{business_id}/invites'.format(business_id='729090764583391194'),
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
                        ('invite_status', ['invite_status_example']),
                        ('invite_type', openapi_server.InviteType()),
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/businesses/{business_id}/invites'.format(business_id='729090764583391194'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_respond_business_access_invites(self):
        """Test case for respond_business_access_invites

        Accept or decline an invite/request
        """
        body = {"invites":[{"invite_id":"invite_id","action":{"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},"accept_invite":True}},{"invite_id":"invite_id","action":{"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},"accept_invite":True}},{"invite_id":"invite_id","action":{"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},"accept_invite":True}},{"invite_id":"invite_id","action":{"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},"accept_invite":True}},{"invite_id":"invite_id","action":{"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},"accept_invite":True}}]}
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
