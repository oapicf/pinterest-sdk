import connexion

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
from openapi_server import util


def asset_access_requests_create(business_id, body):  # noqa: E501
    """Create a request to access an existing partner&#39;s assets.

    Create a request to access an existing partner&#39;s assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles. # noqa: E501

    :param business_id: Unique identifier of the requesting business.
    :type business_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: CreateAssetAccessRequestResponse
    """
    if connexion.request.is_json:
        body = CreateAssetAccessRequestBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def cancel_invites_or_requests(business_id, body):  # noqa: E501
    """Cancel invites/requests

    Cancel membership/partnership invites and/or requests. # noqa: E501

    :param business_id: Unique identifier of the requesting business.
    :type business_id: str
    :param body: A list with invite ids
    :type body: dict | bytes

    :rtype: DeleteInvitesResultsResponseArray
    """
    if connexion.request.is_json:
        body = CancelInvitesBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_asset_invites(business_id, body):  # noqa: E501
    """Update invite/request with an asset permission

    Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner&#39;s asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \&quot;Create a request to access an existing partner&#39;s assets\&quot; to request access to your   partner&#39;s assets.     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot; - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \&quot;Assign/Update partner asset permissions\&quot; to assign a partner access to   new assets.     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot; - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \&quot;Assign/Update member asset permissions\&quot; to assign a member access to new   assets.     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview. # noqa: E501

    :param business_id: Unique identifier of the requesting business.
    :type business_id: str
    :param body: A list of invites/requests together with the asset permissions to be assigned to the invite/request. 
    :type body: dict | bytes

    :rtype: UpdateInvitesResultsResponseArray
    """
    if connexion.request.is_json:
        body = CreateAssetInvitesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_membership_or_partnership_invites(business_id, body):  # noqa: E501
    """Create invites or requests

    Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;     - business_role&#x3D;\&quot;EMPLOYEE\&quot; OR business_role&#x3D;\&quot;BIZ_ADMIN\&quot; (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners # noqa: E501

    :param business_id: Unique identifier of the requesting business.
    :type business_id: str
    :param body: An object with the properties: invite_type, partners, members, business_role
    :type body: dict | bytes

    :rtype: CreateInvitesResultsResponseArray
    """
    if connexion.request.is_json:
        body = CreateMembershipOrPartnershipInvitesBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_invites(business_id, is_member=None, invite_status=None, invite_type=None, bookmark=None, page_size=None):  # noqa: E501
    """Get invites/requests

    Get the membership/partnership invites and/or requests for the authorized user. # noqa: E501

    :param business_id: Unique identifier of the requesting business.
    :type business_id: str
    :param is_member: A boolean field to indicate whether the invite is to create a partnership or a membership.
    :type is_member: bool
    :param invite_status: A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned.
    :type invite_status: List[str]
    :param invite_type: Invite type to filter invites by. Only invites of the specified type will be returned.
    :type invite_type: dict | bytes
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    :type page_size: int

    :rtype: GetInvites200Response
    """
    if connexion.request.is_json:
        invite_type = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def respond_business_access_invites(body):  # noqa: E501
    """Accept or decline an invite/request

    Accept or decline invites or requests. # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: RespondToInvitesResponseArray
    """
    if connexion.request.is_json:
        body = AuthRespondInvitesBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
