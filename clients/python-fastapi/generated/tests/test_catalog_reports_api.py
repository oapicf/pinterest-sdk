# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, StrictStr, field_validator  # noqa: F401
from typing import Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.catalogs_create_report_response import CatalogsCreateReportResponse  # noqa: F401
from openapi_server.models.catalogs_report import CatalogsReport  # noqa: F401
from openapi_server.models.catalogs_report_parameters import CatalogsReportParameters  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401
from openapi_server.models.reports_stats200_response import ReportsStats200Response  # noqa: F401
from openapi_server.models.reports_stats_parameters_parameter import ReportsStatsParametersParameter  # noqa: F401


def test_reports_get(client: TestClient):
    """Test case for reports_get

    Get catalogs report
    """
    params = [("ad_account_id", 'ad_account_id_example'),     ("token", 'token_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/catalogs/reports",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_reports_create(client: TestClient):
    """Test case for reports_create

    Build catalogs report
    """
    catalogs_report_parameters = {"catalog_type":"RETAIL"}
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/catalogs/reports",
    #    headers=headers,
    #    json=catalogs_report_parameters,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_reports_stats(client: TestClient):
    """Test case for reports_stats

    List report stats
    """
    params = [("ad_account_id", 'ad_account_id_example'),     ("page_size", 25),     ("bookmark", 'bookmark_example'),     ("parameters", openapi_server.ReportsStatsParametersParameter())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/catalogs/reports/stats",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

