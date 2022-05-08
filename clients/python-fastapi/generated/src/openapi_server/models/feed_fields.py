# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, validator  # noqa: F401
from openapi_server.models.catalogs_feed_credentials import CatalogsFeedCredentials
from openapi_server.models.catalogs_feed_processing_schedule import CatalogsFeedProcessingSchedule
from openapi_server.models.catalogs_format import CatalogsFormat
from openapi_server.models.catalogs_status import CatalogsStatus
from openapi_server.models.country import Country
from openapi_server.models.nullable_currency import NullableCurrency
from openapi_server.models.product_availability_type import ProductAvailabilityType


class FeedFields(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    FeedFields - a model defined in OpenAPI

        default_country: The default_country of this FeedFields.
        default_availability: The default_availability of this FeedFields.
        default_currency: The default_currency of this FeedFields.
        name: The name of this FeedFields.
        format: The format of this FeedFields.
        default_locale: The default_locale of this FeedFields.
        credentials: The credentials of this FeedFields.
        location: The location of this FeedFields.
        preferred_processing_schedule: The preferred_processing_schedule of this FeedFields.
        status: The status of this FeedFields.
    """

    default_country: Country
    default_availability: ProductAvailabilityType
    default_currency: NullableCurrency
    name: str
    format: CatalogsFormat
    default_locale: str
    credentials: CatalogsFeedCredentials
    location: str
    preferred_processing_schedule: CatalogsFeedProcessingSchedule
    status: CatalogsStatus

FeedFields.update_forward_refs()