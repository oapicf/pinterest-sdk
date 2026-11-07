# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, field_validator  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.audience_insight_type import AudienceInsightType  # noqa: F401
from openapi_server.models.audience_insights import AudienceInsights  # noqa: F401
from openapi_server.models.audience_insights_scope_and_type_get200_response import AudienceInsightsScopeAndTypeGet200Response  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401


def test_audience_insights_get(client: TestClient):
    """Test case for audience_insights_get

    Get audience insights
    """
    params = [("audience_insight_type", openapi_server.AudienceInsightType())]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/audience_insights".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_audience_insights_scope_and_type_get(client: TestClient):
    """Test case for audience_insights_scope_and_type_get

    Get audience insights scope and type
    """

    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/insights/audiences".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

