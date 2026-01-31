import connexion

from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.label_create_request import LabelCreateRequest  # noqa: E501
from app.openapi_server.models.label_update_request import LabelUpdateRequest  # noqa: E501
from app.openapi_server.models.labels_list200_response import LabelsList200Response  # noqa: E501
from app.openapi_server.models.labels_response import LabelsResponse  # noqa: E501
from openapi_server import util


def labels_create(ad_account_id, body):  # noqa: E501
    """Create labels

    &lt;p&gt; &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt; This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    &lt;b&gt;Note:&lt;/b&gt; You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  &lt;/p&gt; # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: LabelsResponse
    """
    if connexion.request.is_json:
        body = LabelCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def labels_list(ad_account_id, campaign_ids=None, label_ids=None, entity_statuses=None, label_types=None, page_size=None, bookmark=None):  # noqa: E501
    """List labels

    &lt;p&gt;   &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;   This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   See a list of labels for assets that your account owns, and filter the list by different criteria. &lt;/p&gt; # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param campaign_ids: List of Campaign Ids to use to filter the results.
    :type campaign_ids: List[str]
    :param label_ids: List of Label Ids to use to filter the results.
    :type label_ids: List[str]
    :param entity_statuses: Label entity status
    :type entity_statuses: List[str]
    :param label_types: Label type.
    :type label_types: List[str]
    :param page_size: Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    :type page_size: int
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str

    :rtype: LabelsList200Response
    """
    return 'do some magic!'


def labels_update(ad_account_id, body):  # noqa: E501
    """Update labels

    &lt;p&gt;   &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;   This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   Change the properties of one or more labels. &lt;/p&gt; # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: LabelsResponse
    """
    if connexion.request.is_json:
        body = LabelUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
