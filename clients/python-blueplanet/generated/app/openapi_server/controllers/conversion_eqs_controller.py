import connexion

from app.openapi_server.models.event_quality_score import EventQualityScore  # noqa: E501
from app.openapi_server.models.ingestion_source_options import IngestionSourceOptions  # noqa: E501
from app.openapi_server.models.lookback_period_options import LookbackPeriodOptions  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.source_platform_options import SourcePlatformOptions  # noqa: E501
from openapi_server import util


def conversion_eqs_list(lookback_period, ad_account_id, source_platform=None, ingestion_source=None):  # noqa: E501
    """Get event quality score (EQS)

    Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user. # noqa: E501

    :param lookback_period: Lookback window (number of days).
    :type lookback_period: dict | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param source_platform: Source platform of event.
    :type source_platform: dict | bytes
    :param ingestion_source: Ingestion source of event.
    :type ingestion_source: dict | bytes

    :rtype: List[EventQualityScore]
    """
    if connexion.request.is_json:
        lookback_period = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        source_platform = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        ingestion_source = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
