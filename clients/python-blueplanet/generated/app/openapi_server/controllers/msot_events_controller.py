import connexion

from app.openapi_server.models.conversion_msot_events import ConversionMSOTEvents  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def msot_events_create(ad_account_id, body):  # noqa: E501
    """Send Measurement Source Of Truth (MSOT) attributed conversion events

    &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt; &lt;br&gt; &lt;p&gt;Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their &lt;code&gt;ad_account_id&lt;/code&gt;. The request body should be a JSON object.&lt;/p&gt; - These events will NOT be used in Reporting. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: Attributed MSOT conversion events
    :type body: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        body = ConversionMSOTEvents.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
