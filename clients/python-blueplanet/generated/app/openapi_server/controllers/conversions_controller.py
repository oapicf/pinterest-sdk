import connexion

from app.openapi_server.models.advertiser_defined_events_create200_response import AdvertiserDefinedEventsCreate200Response  # noqa: E501
from app.openapi_server.models.advertiser_defined_events_create_request import AdvertiserDefinedEventsCreateRequest  # noqa: E501
from app.openapi_server.models.advertiser_defined_events_get200_response import AdvertiserDefinedEventsGet200Response  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from openapi_server import util


def advertiser_defined_events_create(ad_account_id, body):  # noqa: E501
    """Create advertiser defined events

    Map advertiser defined events to standard events for the given ad account. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: AdvertiserDefinedEventsCreate200Response
    """
    if connexion.request.is_json:
        body = AdvertiserDefinedEventsCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def advertiser_defined_events_delete(ad_account_id, event_names):  # noqa: E501
    """Delete advertiser defined events

    Untrack advertiser defined events for the given ad account. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param event_names: List of event names to delete
    :type event_names: List[str]

    :rtype: AdvertiserDefinedEventsCreate200Response
    """
    return 'do some magic!'


def advertiser_defined_events_get(ad_account_id):  # noqa: E501
    """Get advertiser defined events

    Get advertiser defined events for the given ad account. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: AdvertiserDefinedEventsGet200Response
    """
    return 'do some magic!'


def advertiser_defined_events_update(ad_account_id, body):  # noqa: E501
    """Update advertiser defined events

    Update advertiser defined event names or mappings for the given ad account. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: AdvertiserDefinedEventsCreate200Response
    """
    if connexion.request.is_json:
        body = AdvertiserDefinedEventsCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
