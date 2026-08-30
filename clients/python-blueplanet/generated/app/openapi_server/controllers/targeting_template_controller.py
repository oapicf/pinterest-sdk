import connexion

from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: E501
from app.openapi_server.models.targeting_template import TargetingTemplate  # noqa: E501
from app.openapi_server.models.targeting_template_create import TargetingTemplateCreate  # noqa: E501
from app.openapi_server.models.targeting_template_list200_response import TargetingTemplateList200Response  # noqa: E501
from app.openapi_server.models.targeting_template_update_request_read_or_update import TargetingTemplateUpdateRequestReadOrUpdate  # noqa: E501
from openapi_server import util


def targeting_template_create(ad_account_id, body):  # noqa: E501
    """Create targeting templates

    Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: TargetingTemplate
    """
    if connexion.request.is_json:
        body = TargetingTemplateCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def targeting_template_list(ad_account_id, bookmark=None, page_size=None, order=None, include_sizing=None, search_query=None):  # noqa: E501
    """List targeting templates

    Get a list of the targeting templates in the specified &#x60;ad_account_id&#x60; # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int
    :param order: The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
    :type order: dict | bytes
    :param include_sizing: Include audience sizing in result or not
    :type include_sizing: bool
    :param search_query: Search query. Can contain pin description keywords or comma-separated pin IDs.
    :type search_query: str

    :rtype: TargetingTemplateList200Response
    """
    if connexion.request.is_json:
        order = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def targeting_template_update(ad_account_id, body):  # noqa: E501
    """Update targeting templates

    Update the targeting template given advertiser ID and targeting template ID # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        body = TargetingTemplateUpdateRequestReadOrUpdate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
