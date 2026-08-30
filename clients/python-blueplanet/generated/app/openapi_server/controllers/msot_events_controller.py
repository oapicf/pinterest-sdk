import connexion

from app.openapi_server.models.conversion_msot_events_create import ConversionMSOTEventsCreate  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from openapi_server import util


def msot_events_create(ad_account_id, body):  # noqa: E501
    """Send Measurement Source Of Truth (MSOT) attributed conversion events

    **This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their &#x60;ad_account_id&#x60;. The request body should be a JSON object.  - These events will not be used in Reporting. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        body = ConversionMSOTEventsCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
