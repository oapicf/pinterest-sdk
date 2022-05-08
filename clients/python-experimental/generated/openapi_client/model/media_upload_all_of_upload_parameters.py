# coding: utf-8

"""
    Pinterest REST API

    Pinterest's REST API  # noqa: E501

    The version of the OpenAPI document: 5.3.0
    Contact: pinterest-api@pinterest.com
    Generated by: https://openapi-generator.tech
"""

import re  # noqa: F401
import sys  # noqa: F401
import typing  # noqa: F401

from frozendict import frozendict  # noqa: F401

import decimal  # noqa: F401
from datetime import date, datetime  # noqa: F401
from frozendict import frozendict  # noqa: F401

from openapi_client.schemas import (  # noqa: F401
    AnyTypeSchema,
    ComposedSchema,
    DictSchema,
    ListSchema,
    StrSchema,
    IntSchema,
    Int32Schema,
    Int64Schema,
    Float32Schema,
    Float64Schema,
    NumberSchema,
    DateSchema,
    DateTimeSchema,
    DecimalSchema,
    BoolSchema,
    BinarySchema,
    NoneSchema,
    none_type,
    InstantiationMetadata,
    Unset,
    unset,
    ComposedBase,
    ListBase,
    DictBase,
    NoneBase,
    StrBase,
    IntBase,
    NumberBase,
    DateBase,
    DateTimeBase,
    BoolBase,
    BinaryBase,
    Schema,
    _SchemaValidator,
    _SchemaTypeChecker,
    _SchemaEnumMaker
)


class MediaUploadAllOfUploadParameters(
    DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
    """
    x_amz_date = StrSchema
    locals()['x-amz-date'] = x_amz_date
    del locals()['x_amz_date']
    x_amz_signature = StrSchema
    locals()['x-amz-signature'] = x_amz_signature
    del locals()['x_amz_signature']
    x_amz_security_token = StrSchema
    locals()['x-amz-security-token'] = x_amz_security_token
    del locals()['x_amz_security_token']
    x_amz_algorithm = StrSchema
    locals()['x-amz-algorithm'] = x_amz_algorithm
    del locals()['x_amz_algorithm']
    key = StrSchema
    policy = StrSchema
    x_amz_credential = StrSchema
    locals()['x-amz-credential'] = x_amz_credential
    del locals()['x_amz_credential']
    content_type = StrSchema
    locals()['Content-Type'] = content_type
    del locals()['content_type']


    def __new__(
        cls,
        *args: typing.Union[dict, frozendict, ],
        key: typing.Union[key, Unset] = unset,
        policy: typing.Union[policy, Unset] = unset,
        _instantiation_metadata: typing.Optional[InstantiationMetadata] = None,
        **kwargs: typing.Type[Schema],
    ) -> 'MediaUploadAllOfUploadParameters':
        return super().__new__(
            cls,
            *args,
            key=key,
            policy=policy,
            _instantiation_metadata=_instantiation_metadata,
            **kwargs,
        )