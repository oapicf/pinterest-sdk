import connexion

from app.openapi_server.models.label_create_request import LabelCreateRequest  # noqa: E501
from app.openapi_server.models.label_update_request import LabelUpdateRequest  # noqa: E501
from app.openapi_server.models.labeled_entities import LabeledEntities  # noqa: E501
from app.openapi_server.models.labeled_entities_create import LabeledEntitiesCreate  # noqa: E501
from app.openapi_server.models.labels_list200_response import LabelsList200Response  # noqa: E501
from app.openapi_server.models.labels_response import LabelsResponse  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.query_label_entity_statuses_items import QueryLabelEntityStatusesItems  # noqa: E501
from app.openapi_server.models.query_label_types_items import QueryLabelTypesItems  # noqa: E501
from openapi_server import util


def labels_apply(ad_account_id, label_id, body):  # noqa: E501
    """Apply label to entity

      [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign. # noqa: E501

    :param ad_account_id: 
    :type ad_account_id: str
    :param label_id: Label ID.
    :type label_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: LabeledEntities
    """
    if connexion.request.is_json:
        body = LabeledEntitiesCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def labels_create(ad_account_id, body):  # noqa: E501
    """Create labels

    [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: LabelsResponse
    """
    if connexion.request.is_json:
        body = LabelCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def labels_list(ad_account_id, campaign_ids=None, label_ids=None, entity_statuses=None, label_types=None, bookmark=None, page_size=None):  # noqa: E501
    """List labels

    [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param campaign_ids: List of Campaign Ids to use to filter the results.
    :type campaign_ids: List[str]
    :param label_ids: List of Label Ids to use to filter the results.
    :type label_ids: List[str]
    :param entity_statuses: Label entity status
    :type entity_statuses: list | bytes
    :param label_types: Label type.
    :type label_types: list | bytes
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

    :rtype: LabelsList200Response
    """
    if connexion.request.is_json:
        entity_statuses = [QueryLabelEntityStatusesItems.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        label_types = [QueryLabelTypesItems.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def labels_remove(ad_account_id, label_id, body):  # noqa: E501
    """Remove label from entities

      [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities. # noqa: E501

    :param ad_account_id: 
    :type ad_account_id: str
    :param label_id: Label ID.
    :type label_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: LabeledEntities
    """
    if connexion.request.is_json:
        body = LabeledEntitiesCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def labels_update(ad_account_id, body):  # noqa: E501
    """Update labels

    [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: LabelsResponse
    """
    if connexion.request.is_json:
        body = LabelUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
