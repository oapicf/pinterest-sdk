# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, validator  # noqa: F401


class PinMedia(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    PinMedia - a model defined in OpenAPI

        media_type: The media_type of this PinMedia [Optional].
    """

    media_type: Optional[str] = None

PinMedia.update_forward_refs()