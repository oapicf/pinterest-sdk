import connexion

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
from openapi_server import util


def brand_accounts_create(business_hierarchy_id, body):  # noqa: E501
    """Create a Brand Account

    Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country. # noqa: E501

    :param business_hierarchy_id: business hierarchy node id
    :type business_hierarchy_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: BrandAccount
    """
    if connexion.request.is_json:
        body = BrandAccountCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def brand_accounts_update(brand_account_id, business_hierarchy_id, body):  # noqa: E501
    """Update a Brand Account

    Update an existing Brand Account # noqa: E501

    :param brand_account_id: 
    :type brand_account_id: str
    :param business_hierarchy_id: business hierarchy node id
    :type business_hierarchy_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: BrandAccount
    """
    if connexion.request.is_json:
        body = BrandAccountUpdate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_business_membership(business_id, body):  # noqa: E501
    """Terminate business memberships

    Terminate memberships between the specified members and your business. # noqa: E501

    :param business_id: Business id
    :type business_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: DeleteBusinessMembership200Response
    """
    if connexion.request.is_json:
        body = DeleteBusinessMembershipBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_business_partners(business_id, body):  # noqa: E501
    """Terminate business partnerships

    Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type. # noqa: E501

    :param business_id: Unique identifier of the requesting business.
    :type business_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: DeleteBusinessPartners
    """
    if connexion.request.is_json:
        body = DeleteBusinessPartnersDelete.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_business_employers(assets_summary=None, bookmark=None, page_size=None):  # noqa: E501
    """List business employers for user

    Get all of the viewing user&#39;s business employers. # noqa: E501

    :param assets_summary: Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
    :type assets_summary: bool
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

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
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

    :rtype: GetBusinessEmployers200Response
    """
    if connexion.request.is_json:
        business_roles = [MemberBusinessRole.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_business_partners(business_id, assets_summary=None, partner_type=None, partner_ids=None, start_index=None, sort_ascending=None, bookmark=None, page_size=None):  # noqa: E501
    """Get business partners

    Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to. # noqa: E501

    :param business_id: Unique identifier of the requesting business.
    :type business_id: str
    :param assets_summary: Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
    :type assets_summary: bool
    :param partner_type: Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset.
    :type partner_type: dict | bytes
    :param partner_ids: A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.
    :type partner_ids: str
    :param start_index: An index to start fetching the results from. Only the results starting from this index will be returned.
    :type start_index: int
    :param sort_ascending: Sort ascending.
    :type sort_ascending: bool
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

    :rtype: GetBusinessEmployers200Response
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
        body = SystemUserUpdateWithRequiredBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_business_memberships(business_id, body):  # noqa: E501
    """Update member&#39;s business role

    Update a member&#39;s business role within the business. # noqa: E501

    :param business_id: Business id
    :type business_id: str
    :param body: 
    :type body: list | bytes

    :rtype: UpdateBusinessMembershipsResponse
    """
    if connexion.request.is_json:
        body = [BusinessMembershipMember.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'
