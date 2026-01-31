# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, StrictBool, StrictStr, field_validator  # noqa: F401
from typing import List, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.auth_respond_invites_body import AuthRespondInvitesBody  # noqa: F401
from openapi_server.models.cancel_invites_body import CancelInvitesBody  # noqa: F401
from openapi_server.models.create_asset_access_request_body import CreateAssetAccessRequestBody  # noqa: F401
from openapi_server.models.create_asset_access_request_response import CreateAssetAccessRequestResponse  # noqa: F401
from openapi_server.models.create_asset_invites_request import CreateAssetInvitesRequest  # noqa: F401
from openapi_server.models.create_invites_results_response_array import CreateInvitesResultsResponseArray  # noqa: F401
from openapi_server.models.create_membership_or_partnership_invites_body import CreateMembershipOrPartnershipInvitesBody  # noqa: F401
from openapi_server.models.delete_invites_results_response_array import DeleteInvitesResultsResponseArray  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401
from openapi_server.models.get_invites200_response import GetInvites200Response  # noqa: F401
from openapi_server.models.invite_type import InviteType  # noqa: F401
from openapi_server.models.respond_to_invites_response_array import RespondToInvitesResponseArray  # noqa: F401
from openapi_server.models.update_invites_results_response_array import UpdateInvitesResultsResponseArray  # noqa: F401


def test_respond_business_access_invites(client: TestClient):
    """Test case for respond_business_access_invites

    Accept or decline an invite/request
    """
    auth_respond_invites_body = {"invites":[{"invite_id":"invite_id","action":{"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},"accept_invite":1}},{"invite_id":"invite_id","action":{"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},"accept_invite":1}},{"invite_id":"invite_id","action":{"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},"accept_invite":1}},{"invite_id":"invite_id","action":{"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},"accept_invite":1}},{"invite_id":"invite_id","action":{"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},"accept_invite":1}}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/businesses/invites",
    #    headers=headers,
    #    json=auth_respond_invites_body,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_create_asset_invites(client: TestClient):
    """Test case for create_asset_invites

    Update invite/request with an asset permission
    """
    create_asset_invites_request = {"invites":[{"invite_type":"MEMBER_INVITE","invite_id":"1234567890123","asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]}},{"invite_type":"MEMBER_INVITE","invite_id":"1234567890123","asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]}},{"invite_type":"MEMBER_INVITE","invite_id":"1234567890123","asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]}},{"invite_type":"MEMBER_INVITE","invite_id":"1234567890123","asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]}},{"invite_type":"MEMBER_INVITE","invite_id":"1234567890123","asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]}}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{business_id}/invites/assets/access".format(business_id='729090764583391194'),
    #    headers=headers,
    #    json=create_asset_invites_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_asset_access_requests_create(client: TestClient):
    """Test case for asset_access_requests_create

    Create a request to access an existing partner's assets.
    """
    create_asset_access_request_body = {"asset_requests":[{"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},"partner_id":"809944451643622187"},{"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},"partner_id":"809944451643622187"},{"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},"partner_id":"809944451643622187"},{"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},"partner_id":"809944451643622187"},{"asset_id_to_permissions":{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},"partner_id":"809944451643622187"}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{business_id}/requests/assets/access".format(business_id='729090764583391194'),
    #    headers=headers,
    #    json=create_asset_access_request_body,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_invites(client: TestClient):
    """Test case for get_invites

    Get invites/requests
    """
    params = [("is_member", True),     ("invite_status", ['invite_status_example']),     ("invite_type", openapi_server.InviteType()),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/businesses/{business_id}/invites".format(business_id='729090764583391194'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_create_membership_or_partnership_invites(client: TestClient):
    """Test case for create_membership_or_partnership_invites

    Create invites or requests
    """
    create_membership_or_partnership_invites_body = {"invite_type":"MEMBER_INVITE","partners":["809944451643622187","766456567741825556"],"members":["business0101","user@business.com"],"business_role":"BIZ_ADMIN"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{business_id}/invites".format(business_id='729090764583391194'),
    #    headers=headers,
    #    json=create_membership_or_partnership_invites_body,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_cancel_invites_or_requests(client: TestClient):
    """Test case for cancel_invites_or_requests

    Cancel invites/requests
    """
    cancel_invites_body = {"invite_ids":["1234567890123456789","1122334455667788991"]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/businesses/{business_id}/invites".format(business_id='729090764583391194'),
    #    headers=headers,
    #    json=cancel_invites_body,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

