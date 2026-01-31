import connexion

from app.openapi_server.models.audience import Audience  # noqa: E501
from app.openapi_server.models.audience_create_request import AudienceCreateRequest  # noqa: E501
from app.openapi_server.models.audience_update_request import AudienceUpdateRequest  # noqa: E501
from app.openapi_server.models.audiences_list200_response import AudiencesList200Response  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def audiences_create(ad_account_id, body):  # noqa: E501
    """Create audience

    Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific &#x60;audience_ids&#x60; when you create an ad group. &lt;p/&gt; Learn about &lt;a href&#x3D;\&quot;/docs/work-with-targets-and-audiences/create-audiences/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;creating different kinds of audiences&lt;/a&gt;. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: List of ads to create, size limit [1, 30]
    :type body: dict | bytes

    :rtype: Audience
    """
    if connexion.request.is_json:
        body = AudienceCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def audiences_get(ad_account_id, audience_id):  # noqa: E501
    """Get audience

    Get a specific audience given the audience ID. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param audience_id: Unique identifier of an audience
    :type audience_id: str

    :rtype: Audience
    """
    return 'do some magic!'


def audiences_list(ad_account_id, bookmark=None, order=None, page_size=None, ownership_type=None):  # noqa: E501
    """List audiences

    Get list of audiences for the ad account. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param order: The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items.
    :type order: str
    :param page_size: Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    :type page_size: int
    :param ownership_type: Filter audiences by ownership type.
    :type ownership_type: str

    :rtype: AudiencesList200Response
    """
    return 'do some magic!'


def audiences_update(ad_account_id, audience_id, body):  # noqa: E501
    """Update audience

    Update (edit or remove) an existing targeting audience. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param audience_id: Unique identifier of an audience
    :type audience_id: str
    :param body: The audience to be updated.
    :type body: dict | bytes

    :rtype: Audience
    """
    if connexion.request.is_json:
        body = AudienceUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
