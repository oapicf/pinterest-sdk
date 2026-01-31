import connexion

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
from openapi_server import util


def brand_accounts_create(business_hierarchy_id, body):  # noqa: E501
    """Create a Brand Account

    Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country. # noqa: E501

    :param business_hierarchy_id: business hierarchy node id
    :type business_hierarchy_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: BrandAccountsCreate200Response
    """
    if connexion.request.is_json:
        body = BrandAccountsCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def brand_accounts_update(business_hierarchy_id, brand_account_id, body):  # noqa: E501
    """Update a Brand Account

    Update an existing Brand Account # noqa: E501

    :param business_hierarchy_id: business hierarchy node id
    :type business_hierarchy_id: str
    :param brand_account_id: Unique identifier of a brand account.
    :type brand_account_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: BrandAccountsCreate200Response
    """
    if connexion.request.is_json:
        body = BrandAccountsUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_business_membership(business_id, body):  # noqa: E501
    """Terminate business memberships

    Terminate memberships between the specified members and your business. # noqa: E501

    :param business_id: Business id
    :type business_id: str
    :param body: List of members with role to delete.
    :type body: dict | bytes

    :rtype: DeletedMembersResponse
    """
    if connexion.request.is_json:
        body = MembersToDeleteBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_business_partners(business_id, body):  # noqa: E501
    """Terminate business partnerships

    Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type. # noqa: E501

    :param business_id: Unique identifier of the requesting business.
    :type business_id: str
    :param body: An object containing a \&quot;partner_ids\&quot; property composed of a list of partner IDs and a \&quot;partners_type\&quot; property specifying the type of partners to delete. 
    :type body: dict | bytes

    :rtype: DeletePartnersResponse
    """
    if connexion.request.is_json:
        body = DeletePartnersRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_business_employers(page_size=None, bookmark=None):  # noqa: E501
    """List business employers for user

    Get all of the viewing user&#39;s business employers. # noqa: E501

    :param page_size: Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    :type page_size: int
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str

    :rtype: GetBusinessEmployers200Response
    """
    return 'do some magic!'


def get_business_members(business_id, fetch_system_users=None, assets_summary=None, business_roles=None, member_ids=None, start_index=None, bookmark=None, page_size=None):  # noqa: E501
    """Get business members

    Get all members of the specified business. The return response will include the member&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE # noqa: E501

    :param business_id: Unique identifier of the requesting business.
    :type business_id: str
    :param fetch_system_users: Fetches system users if True. Fetches regular user employees if False.
    :type fetch_system_users: bool
    :param assets_summary: Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
    :type assets_summary: bool
    :param business_roles: A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.
    :type business_roles: list | bytes
    :param member_ids: A list of business members ids separated by comma.
    :type member_ids: str
    :param start_index: An index to start fetching the results from. Only the results starting from this index will be returned.
    :type start_index: int
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    :type page_size: int

    :rtype: GetBusinessMembers200Response
    """
    if connexion.request.is_json:
        business_roles = [MemberBusinessRole.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_business_partners(business_id, assets_summary=None, partner_type=None, partner_ids=None, start_index=None, page_size=None, bookmark=None):  # noqa: E501
    """Get business partners

    Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to. # noqa: E501

    :param business_id: Unique identifier of the requesting business.
    :type business_id: str
    :param assets_summary: Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
    :type assets_summary: bool
    :param partner_type: Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset.
    :type partner_type: dict | bytes
    :param partner_ids: A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.
    :type partner_ids: str
    :param start_index: An index to start fetching the results from. Only the results starting from this index will be returned.
    :type start_index: int
    :param page_size: Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    :type page_size: int
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str

    :rtype: GetBusinessPartners200Response
    """
    if connexion.request.is_json:
        partner_type = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def system_user_update(business_id, system_user_id, body):  # noqa: E501
    """Update a system user information.

    Update a system user information such as name. # noqa: E501

    :param business_id: Unique identifier of the requesting business.
    :type business_id: str
    :param system_user_id: Unique identifier of a system user.
    :type system_user_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        body = SystemUserUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_business_memberships(business_id, body):  # noqa: E501
    """Update member&#39;s business role

    Update a member&#39;s business role within the business. # noqa: E501

    :param business_id: Business id
    :type business_id: str
    :param body: List of objects with the member id and the business_role.
    :type body: list | bytes

    :rtype: UpdateMemberResultsResponseArray
    """
    if connexion.request.is_json:
        body = [UpdateMemberBusinessRoleBody.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'
