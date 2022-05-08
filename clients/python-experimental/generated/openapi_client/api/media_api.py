# coding: utf-8

"""
    Pinterest REST API

    Pinterest's REST API  # noqa: E501

    The version of the OpenAPI document: 5.3.0
    Contact: pinterest-api@pinterest.com
    Generated by: https://openapi-generator.tech
"""

from openapi_client.api_client import ApiClient
from openapi_client.api.media_api_endpoints.media_create import MediaCreate
from openapi_client.api.media_api_endpoints.media_get import MediaGet
from openapi_client.api.media_api_endpoints.media_list import MediaList


class MediaApi(
    MediaCreate,
    MediaGet,
    MediaList,
    ApiClient,
):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """
    pass