# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, field_validator  # noqa: F401
from typing import List, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.event_quality_score import EventQualityScore  # noqa: F401
from openapi_server.models.ingestion_source_options import IngestionSourceOptions  # noqa: F401
from openapi_server.models.lookback_period_options import LookbackPeriodOptions  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401
from openapi_server.models.source_platform_options import SourcePlatformOptions  # noqa: F401


def test_conversion_eqs_list(client: TestClient):
    """Test case for conversion_eqs_list

    Get event quality score (EQS)
    """
    params = [("lookback_period", openapi_server.LookbackPeriodOptions()),     ("source_platform", openapi_server.SourcePlatformOptions()),     ("ingestion_source", openapi_server.IngestionSourceOptions())]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/conversion_eqs".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

