import connexion

from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: E501
from app.openapi_server.models.schedule import Schedule  # noqa: E501
from app.openapi_server.models.schedule_batch_update import ScheduleBatchUpdate  # noqa: E501
from app.openapi_server.models.schedule_create import ScheduleCreate  # noqa: E501
from app.openapi_server.models.schedule_status import ScheduleStatus  # noqa: E501
from app.openapi_server.models.schedule_type import ScheduleType  # noqa: E501
from app.openapi_server.models.schedules_create200_response_inner import SchedulesCreate200ResponseInner  # noqa: E501
from app.openapi_server.models.schedules_list200_response import SchedulesList200Response  # noqa: E501
from openapi_server import util


def schedules_create(ad_account_id, body):  # noqa: E501
    """Create schedules

    Batch create schedules # noqa: E501

    :param ad_account_id: 
    :type ad_account_id: str
    :param body: 
    :type body: list | bytes

    :rtype: List[SchedulesCreate200ResponseInner]
    """
    if connexion.request.is_json:
        body = [ScheduleCreate.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def schedules_list(ad_account_id, entity_ids, bookmark=None, page_size=None, order=None, schedule_statuses=None, schedule_type=None):  # noqa: E501
    """Get Schedules

    Get schedules for a specific advertiser # noqa: E501

    :param ad_account_id: 
    :type ad_account_id: str
    :param entity_ids: List of Entity IDs, must be associated with the Ad Accound ID provided in the path.
    :type entity_ids: List[str]
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int
    :param order: The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
    :type order: dict | bytes
    :param schedule_statuses: Filter schedules by status (one or more)
    :type schedule_statuses: list | bytes
    :param schedule_type: Filter schedules by a type
    :type schedule_type: dict | bytes

    :rtype: SchedulesList200Response
    """
    if connexion.request.is_json:
        order = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        schedule_statuses = [ScheduleStatus.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        schedule_type = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def schedules_update(ad_account_id, body):  # noqa: E501
    """Update schedules

    Update one or more schedules # noqa: E501

    :param ad_account_id: 
    :type ad_account_id: str
    :param body: 
    :type body: list | bytes

    :rtype: List[SchedulesCreate200ResponseInner]
    """
    if connexion.request.is_json:
        body = [ScheduleBatchUpdate.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'
