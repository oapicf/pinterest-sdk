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


class CatalogsItemsBatchRequest(
    DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Request object of catalogs items batch
    """

    @classmethod
    @property
    def country(cls) -> typing.Type['Country']:
        return Country

    @classmethod
    @property
    def language(cls) -> typing.Type['Language']:
        return Language

    @classmethod
    @property
    def operation(cls) -> typing.Type['BatchOperation']:
        return BatchOperation
    
    
    class items(
        ListSchema
    ):
    
        @classmethod
        @property
        def _items(cls) -> typing.Type['ItemBatchRecord']:
            return ItemBatchRecord


    def __new__(
        cls,
        *args: typing.Union[dict, frozendict, ],
        country: typing.Union['Country', Unset] = unset,
        language: typing.Union['Language', Unset] = unset,
        operation: typing.Union['BatchOperation', Unset] = unset,
        items: typing.Union[items, Unset] = unset,
        _instantiation_metadata: typing.Optional[InstantiationMetadata] = None,
        **kwargs: typing.Type[Schema],
    ) -> 'CatalogsItemsBatchRequest':
        return super().__new__(
            cls,
            *args,
            country=country,
            language=language,
            operation=operation,
            items=items,
            _instantiation_metadata=_instantiation_metadata,
            **kwargs,
        )

from openapi_client.model.batch_operation import BatchOperation
from openapi_client.model.country import Country
from openapi_client.model.item_batch_record import ItemBatchRecord
from openapi_client.model.language import Language