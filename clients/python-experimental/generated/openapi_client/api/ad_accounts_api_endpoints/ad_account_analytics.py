# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

from dataclasses import dataclass
import re  # noqa: F401
import sys  # noqa: F401
import typing
import urllib3
from urllib3._collections import HTTPHeaderDict

from openapi_client import api_client, exceptions
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

from openapi_client.model.error import Error
from openapi_client.model.ad_account_analytics_response import AdAccountAnalyticsResponse
from openapi_client.model.granularity import Granularity

# query params
StartDateSchema = DateSchema
EndDateSchema = DateSchema


class ColumnsSchema(
    ListSchema
):
    
    
    class _items(
        _SchemaEnumMaker(
            enum_value_to_name={
                "AD_ACCOUNT_ID": "AD_ACCOUNT_ID",
                "AD_GROUP_ENTITY_STATUS": "AD_GROUP_ENTITY_STATUS",
                "AD_GROUP_ID": "AD_GROUP_ID",
                "AD_ID": "AD_ID",
                "CAMPAIGN_DAILY_SPEND_CAP": "CAMPAIGN_DAILY_SPEND_CAP",
                "CAMPAIGN_ENTITY_STATUS": "CAMPAIGN_ENTITY_STATUS",
                "CAMPAIGN_ID": "CAMPAIGN_ID",
                "CAMPAIGN_LIFETIME_SPEND_CAP": "CAMPAIGN_LIFETIME_SPEND_CAP",
                "CAMPAIGN_NAME": "CAMPAIGN_NAME",
                "CHECKOUT_ROAS": "CHECKOUT_ROAS",
                "CLICKTHROUGH_1": "CLICKTHROUGH_1",
                "CLICKTHROUGH_1_GROSS": "CLICKTHROUGH_1_GROSS",
                "CLICKTHROUGH_2": "CLICKTHROUGH_2",
                "CPC_IN_MICRO_DOLLAR": "CPC_IN_MICRO_DOLLAR",
                "CPM_IN_DOLLAR": "CPM_IN_DOLLAR",
                "CPM_IN_MICRO_DOLLAR": "CPM_IN_MICRO_DOLLAR",
                "CTR": "CTR",
                "CTR_2": "CTR_2",
                "ECPCV_IN_DOLLAR": "ECPCV_IN_DOLLAR",
                "ECPCV_P95_IN_DOLLAR": "ECPCV_P95_IN_DOLLAR",
                "ECPC_IN_DOLLAR": "ECPC_IN_DOLLAR",
                "ECPC_IN_MICRO_DOLLAR": "ECPC_IN_MICRO_DOLLAR",
                "ECPE_IN_DOLLAR": "ECPE_IN_DOLLAR",
                "ECPM_IN_MICRO_DOLLAR": "ECPM_IN_MICRO_DOLLAR",
                "ECPV_IN_DOLLAR": "ECPV_IN_DOLLAR",
                "ECTR": "ECTR",
                "EENGAGEMENT_RATE": "EENGAGEMENT_RATE",
                "ENGAGEMENT_1": "ENGAGEMENT_1",
                "ENGAGEMENT_2": "ENGAGEMENT_2",
                "ENGAGEMENT_RATE": "ENGAGEMENT_RATE",
                "IDEA_PIN_PRODUCT_TAG_VISIT_1": "IDEA_PIN_PRODUCT_TAG_VISIT_1",
                "IDEA_PIN_PRODUCT_TAG_VISIT_2": "IDEA_PIN_PRODUCT_TAG_VISIT_2",
                "IMPRESSION_1": "IMPRESSION_1",
                "IMPRESSION_1_GROSS": "IMPRESSION_1_GROSS",
                "IMPRESSION_2": "IMPRESSION_2",
                "INAPP_CHECKOUT_COST_PER_ACTION": "INAPP_CHECKOUT_COST_PER_ACTION",
                "OUTBOUND_CLICK_1": "OUTBOUND_CLICK_1",
                "OUTBOUND_CLICK_2": "OUTBOUND_CLICK_2",
                "PAGE_VISIT_COST_PER_ACTION": "PAGE_VISIT_COST_PER_ACTION",
                "PAGE_VISIT_ROAS": "PAGE_VISIT_ROAS",
                "PAID_IMPRESSION": "PAID_IMPRESSION",
                "PIN_ID": "PIN_ID",
                "REPIN_1": "REPIN_1",
                "REPIN_2": "REPIN_2",
                "REPIN_RATE": "REPIN_RATE",
                "SPEND_IN_DOLLAR": "SPEND_IN_DOLLAR",
                "SPEND_IN_MICRO_DOLLAR": "SPEND_IN_MICRO_DOLLAR",
                "TOTAL_CHECKOUT": "TOTAL_CHECKOUT",
                "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR": "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR",
                "TOTAL_CLICKTHROUGH": "TOTAL_CLICKTHROUGH",
                "TOTAL_CLICK_CHECKOUT": "TOTAL_CLICK_CHECKOUT",
                "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR": "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR",
                "TOTAL_CLICK_LEAD": "TOTAL_CLICK_LEAD",
                "TOTAL_CLICK_SIGNUP": "TOTAL_CLICK_SIGNUP",
                "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR": "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR",
                "TOTAL_CONVERSIONS": "TOTAL_CONVERSIONS",
                "TOTAL_CUSTOM": "TOTAL_CUSTOM",
                "TOTAL_ENGAGEMENT": "TOTAL_ENGAGEMENT",
                "TOTAL_ENGAGEMENT_CHECKOUT": "TOTAL_ENGAGEMENT_CHECKOUT",
                "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR": "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR",
                "TOTAL_ENGAGEMENT_LEAD": "TOTAL_ENGAGEMENT_LEAD",
                "TOTAL_ENGAGEMENT_SIGNUP": "TOTAL_ENGAGEMENT_SIGNUP",
                "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR": "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR",
                "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT": "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT",
                "TOTAL_IMPRESSION_FREQUENCY": "TOTAL_IMPRESSION_FREQUENCY",
                "TOTAL_IMPRESSION_USER": "TOTAL_IMPRESSION_USER",
                "TOTAL_LEAD": "TOTAL_LEAD",
                "TOTAL_PAGE_VISIT": "TOTAL_PAGE_VISIT",
                "TOTAL_REPIN_RATE": "TOTAL_REPIN_RATE",
                "TOTAL_SIGNUP": "TOTAL_SIGNUP",
                "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR": "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR",
                "TOTAL_VIDEO_3SEC_VIEWS": "TOTAL_VIDEO_3SEC_VIEWS",
                "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND": "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND",
                "TOTAL_VIDEO_MRC_VIEWS": "TOTAL_VIDEO_MRC_VIEWS",
                "TOTAL_VIDEO_P0_COMBINED": "TOTAL_VIDEO_P0_COMBINED",
                "TOTAL_VIDEO_P100_COMPLETE": "TOTAL_VIDEO_P100_COMPLETE",
                "TOTAL_VIDEO_P25_COMBINED": "TOTAL_VIDEO_P25_COMBINED",
                "TOTAL_VIDEO_P50_COMBINED": "TOTAL_VIDEO_P50_COMBINED",
                "TOTAL_VIDEO_P75_COMBINED": "TOTAL_VIDEO_P75_COMBINED",
                "TOTAL_VIDEO_P95_COMBINED": "TOTAL_VIDEO_P95_COMBINED",
                "TOTAL_VIEW_CHECKOUT": "TOTAL_VIEW_CHECKOUT",
                "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR": "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR",
                "TOTAL_VIEW_LEAD": "TOTAL_VIEW_LEAD",
                "TOTAL_VIEW_SIGNUP": "TOTAL_VIEW_SIGNUP",
                "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR": "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR",
                "TOTAL_WEB_CHECKOUT": "TOTAL_WEB_CHECKOUT",
                "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR": "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR",
                "TOTAL_WEB_CLICK_CHECKOUT": "TOTAL_WEB_CLICK_CHECKOUT",
                "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR": "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR",
                "TOTAL_WEB_ENGAGEMENT_CHECKOUT": "TOTAL_WEB_ENGAGEMENT_CHECKOUT",
                "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR": "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR",
                "TOTAL_WEB_VIEW_CHECKOUT": "TOTAL_WEB_VIEW_CHECKOUT",
                "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR": "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR",
                "VIDEO_3SEC_VIEWS_2": "VIDEO_3SEC_VIEWS_2",
                "VIDEO_LENGTH": "VIDEO_LENGTH",
                "VIDEO_MRC_VIEWS_2": "VIDEO_MRC_VIEWS_2",
                "VIDEO_P0_COMBINED_2": "VIDEO_P0_COMBINED_2",
                "VIDEO_P100_COMPLETE_2": "VIDEO_P100_COMPLETE_2",
                "VIDEO_P25_COMBINED_2": "VIDEO_P25_COMBINED_2",
                "VIDEO_P50_COMBINED_2": "VIDEO_P50_COMBINED_2",
                "VIDEO_P75_COMBINED_2": "VIDEO_P75_COMBINED_2",
                "VIDEO_P95_COMBINED_2": "VIDEO_P95_COMBINED_2",
                "WEB_CHECKOUT_COST_PER_ACTION": "WEB_CHECKOUT_COST_PER_ACTION",
                "WEB_CHECKOUT_ROAS": "WEB_CHECKOUT_ROAS",
            }
        ),
        StrSchema
    ):
        
        @classmethod
        @property
        def AD_ACCOUNT_ID(cls):
            return cls._enum_by_value["AD_ACCOUNT_ID"]("AD_ACCOUNT_ID")
        
        @classmethod
        @property
        def AD_GROUP_ENTITY_STATUS(cls):
            return cls._enum_by_value["AD_GROUP_ENTITY_STATUS"]("AD_GROUP_ENTITY_STATUS")
        
        @classmethod
        @property
        def AD_GROUP_ID(cls):
            return cls._enum_by_value["AD_GROUP_ID"]("AD_GROUP_ID")
        
        @classmethod
        @property
        def AD_ID(cls):
            return cls._enum_by_value["AD_ID"]("AD_ID")
        
        @classmethod
        @property
        def CAMPAIGN_DAILY_SPEND_CAP(cls):
            return cls._enum_by_value["CAMPAIGN_DAILY_SPEND_CAP"]("CAMPAIGN_DAILY_SPEND_CAP")
        
        @classmethod
        @property
        def CAMPAIGN_ENTITY_STATUS(cls):
            return cls._enum_by_value["CAMPAIGN_ENTITY_STATUS"]("CAMPAIGN_ENTITY_STATUS")
        
        @classmethod
        @property
        def CAMPAIGN_ID(cls):
            return cls._enum_by_value["CAMPAIGN_ID"]("CAMPAIGN_ID")
        
        @classmethod
        @property
        def CAMPAIGN_LIFETIME_SPEND_CAP(cls):
            return cls._enum_by_value["CAMPAIGN_LIFETIME_SPEND_CAP"]("CAMPAIGN_LIFETIME_SPEND_CAP")
        
        @classmethod
        @property
        def CAMPAIGN_NAME(cls):
            return cls._enum_by_value["CAMPAIGN_NAME"]("CAMPAIGN_NAME")
        
        @classmethod
        @property
        def CHECKOUT_ROAS(cls):
            return cls._enum_by_value["CHECKOUT_ROAS"]("CHECKOUT_ROAS")
        
        @classmethod
        @property
        def CLICKTHROUGH_1(cls):
            return cls._enum_by_value["CLICKTHROUGH_1"]("CLICKTHROUGH_1")
        
        @classmethod
        @property
        def CLICKTHROUGH_1_GROSS(cls):
            return cls._enum_by_value["CLICKTHROUGH_1_GROSS"]("CLICKTHROUGH_1_GROSS")
        
        @classmethod
        @property
        def CLICKTHROUGH_2(cls):
            return cls._enum_by_value["CLICKTHROUGH_2"]("CLICKTHROUGH_2")
        
        @classmethod
        @property
        def CPC_IN_MICRO_DOLLAR(cls):
            return cls._enum_by_value["CPC_IN_MICRO_DOLLAR"]("CPC_IN_MICRO_DOLLAR")
        
        @classmethod
        @property
        def CPM_IN_DOLLAR(cls):
            return cls._enum_by_value["CPM_IN_DOLLAR"]("CPM_IN_DOLLAR")
        
        @classmethod
        @property
        def CPM_IN_MICRO_DOLLAR(cls):
            return cls._enum_by_value["CPM_IN_MICRO_DOLLAR"]("CPM_IN_MICRO_DOLLAR")
        
        @classmethod
        @property
        def CTR(cls):
            return cls._enum_by_value["CTR"]("CTR")
        
        @classmethod
        @property
        def CTR_2(cls):
            return cls._enum_by_value["CTR_2"]("CTR_2")
        
        @classmethod
        @property
        def ECPCV_IN_DOLLAR(cls):
            return cls._enum_by_value["ECPCV_IN_DOLLAR"]("ECPCV_IN_DOLLAR")
        
        @classmethod
        @property
        def ECPCV_P95_IN_DOLLAR(cls):
            return cls._enum_by_value["ECPCV_P95_IN_DOLLAR"]("ECPCV_P95_IN_DOLLAR")
        
        @classmethod
        @property
        def ECPC_IN_DOLLAR(cls):
            return cls._enum_by_value["ECPC_IN_DOLLAR"]("ECPC_IN_DOLLAR")
        
        @classmethod
        @property
        def ECPC_IN_MICRO_DOLLAR(cls):
            return cls._enum_by_value["ECPC_IN_MICRO_DOLLAR"]("ECPC_IN_MICRO_DOLLAR")
        
        @classmethod
        @property
        def ECPE_IN_DOLLAR(cls):
            return cls._enum_by_value["ECPE_IN_DOLLAR"]("ECPE_IN_DOLLAR")
        
        @classmethod
        @property
        def ECPM_IN_MICRO_DOLLAR(cls):
            return cls._enum_by_value["ECPM_IN_MICRO_DOLLAR"]("ECPM_IN_MICRO_DOLLAR")
        
        @classmethod
        @property
        def ECPV_IN_DOLLAR(cls):
            return cls._enum_by_value["ECPV_IN_DOLLAR"]("ECPV_IN_DOLLAR")
        
        @classmethod
        @property
        def ECTR(cls):
            return cls._enum_by_value["ECTR"]("ECTR")
        
        @classmethod
        @property
        def EENGAGEMENT_RATE(cls):
            return cls._enum_by_value["EENGAGEMENT_RATE"]("EENGAGEMENT_RATE")
        
        @classmethod
        @property
        def ENGAGEMENT_1(cls):
            return cls._enum_by_value["ENGAGEMENT_1"]("ENGAGEMENT_1")
        
        @classmethod
        @property
        def ENGAGEMENT_2(cls):
            return cls._enum_by_value["ENGAGEMENT_2"]("ENGAGEMENT_2")
        
        @classmethod
        @property
        def ENGAGEMENT_RATE(cls):
            return cls._enum_by_value["ENGAGEMENT_RATE"]("ENGAGEMENT_RATE")
        
        @classmethod
        @property
        def IDEA_PIN_PRODUCT_TAG_VISIT_1(cls):
            return cls._enum_by_value["IDEA_PIN_PRODUCT_TAG_VISIT_1"]("IDEA_PIN_PRODUCT_TAG_VISIT_1")
        
        @classmethod
        @property
        def IDEA_PIN_PRODUCT_TAG_VISIT_2(cls):
            return cls._enum_by_value["IDEA_PIN_PRODUCT_TAG_VISIT_2"]("IDEA_PIN_PRODUCT_TAG_VISIT_2")
        
        @classmethod
        @property
        def IMPRESSION_1(cls):
            return cls._enum_by_value["IMPRESSION_1"]("IMPRESSION_1")
        
        @classmethod
        @property
        def IMPRESSION_1_GROSS(cls):
            return cls._enum_by_value["IMPRESSION_1_GROSS"]("IMPRESSION_1_GROSS")
        
        @classmethod
        @property
        def IMPRESSION_2(cls):
            return cls._enum_by_value["IMPRESSION_2"]("IMPRESSION_2")
        
        @classmethod
        @property
        def INAPP_CHECKOUT_COST_PER_ACTION(cls):
            return cls._enum_by_value["INAPP_CHECKOUT_COST_PER_ACTION"]("INAPP_CHECKOUT_COST_PER_ACTION")
        
        @classmethod
        @property
        def OUTBOUND_CLICK_1(cls):
            return cls._enum_by_value["OUTBOUND_CLICK_1"]("OUTBOUND_CLICK_1")
        
        @classmethod
        @property
        def OUTBOUND_CLICK_2(cls):
            return cls._enum_by_value["OUTBOUND_CLICK_2"]("OUTBOUND_CLICK_2")
        
        @classmethod
        @property
        def PAGE_VISIT_COST_PER_ACTION(cls):
            return cls._enum_by_value["PAGE_VISIT_COST_PER_ACTION"]("PAGE_VISIT_COST_PER_ACTION")
        
        @classmethod
        @property
        def PAGE_VISIT_ROAS(cls):
            return cls._enum_by_value["PAGE_VISIT_ROAS"]("PAGE_VISIT_ROAS")
        
        @classmethod
        @property
        def PAID_IMPRESSION(cls):
            return cls._enum_by_value["PAID_IMPRESSION"]("PAID_IMPRESSION")
        
        @classmethod
        @property
        def PIN_ID(cls):
            return cls._enum_by_value["PIN_ID"]("PIN_ID")
        
        @classmethod
        @property
        def REPIN_1(cls):
            return cls._enum_by_value["REPIN_1"]("REPIN_1")
        
        @classmethod
        @property
        def REPIN_2(cls):
            return cls._enum_by_value["REPIN_2"]("REPIN_2")
        
        @classmethod
        @property
        def REPIN_RATE(cls):
            return cls._enum_by_value["REPIN_RATE"]("REPIN_RATE")
        
        @classmethod
        @property
        def SPEND_IN_DOLLAR(cls):
            return cls._enum_by_value["SPEND_IN_DOLLAR"]("SPEND_IN_DOLLAR")
        
        @classmethod
        @property
        def SPEND_IN_MICRO_DOLLAR(cls):
            return cls._enum_by_value["SPEND_IN_MICRO_DOLLAR"]("SPEND_IN_MICRO_DOLLAR")
        
        @classmethod
        @property
        def TOTAL_CHECKOUT(cls):
            return cls._enum_by_value["TOTAL_CHECKOUT"]("TOTAL_CHECKOUT")
        
        @classmethod
        @property
        def TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR(cls):
            return cls._enum_by_value["TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR"]("TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR")
        
        @classmethod
        @property
        def TOTAL_CLICKTHROUGH(cls):
            return cls._enum_by_value["TOTAL_CLICKTHROUGH"]("TOTAL_CLICKTHROUGH")
        
        @classmethod
        @property
        def TOTAL_CLICK_CHECKOUT(cls):
            return cls._enum_by_value["TOTAL_CLICK_CHECKOUT"]("TOTAL_CLICK_CHECKOUT")
        
        @classmethod
        @property
        def TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR(cls):
            return cls._enum_by_value["TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"]("TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR")
        
        @classmethod
        @property
        def TOTAL_CLICK_LEAD(cls):
            return cls._enum_by_value["TOTAL_CLICK_LEAD"]("TOTAL_CLICK_LEAD")
        
        @classmethod
        @property
        def TOTAL_CLICK_SIGNUP(cls):
            return cls._enum_by_value["TOTAL_CLICK_SIGNUP"]("TOTAL_CLICK_SIGNUP")
        
        @classmethod
        @property
        def TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR(cls):
            return cls._enum_by_value["TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR"]("TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR")
        
        @classmethod
        @property
        def TOTAL_CONVERSIONS(cls):
            return cls._enum_by_value["TOTAL_CONVERSIONS"]("TOTAL_CONVERSIONS")
        
        @classmethod
        @property
        def TOTAL_CUSTOM(cls):
            return cls._enum_by_value["TOTAL_CUSTOM"]("TOTAL_CUSTOM")
        
        @classmethod
        @property
        def TOTAL_ENGAGEMENT(cls):
            return cls._enum_by_value["TOTAL_ENGAGEMENT"]("TOTAL_ENGAGEMENT")
        
        @classmethod
        @property
        def TOTAL_ENGAGEMENT_CHECKOUT(cls):
            return cls._enum_by_value["TOTAL_ENGAGEMENT_CHECKOUT"]("TOTAL_ENGAGEMENT_CHECKOUT")
        
        @classmethod
        @property
        def TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR(cls):
            return cls._enum_by_value["TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"]("TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR")
        
        @classmethod
        @property
        def TOTAL_ENGAGEMENT_LEAD(cls):
            return cls._enum_by_value["TOTAL_ENGAGEMENT_LEAD"]("TOTAL_ENGAGEMENT_LEAD")
        
        @classmethod
        @property
        def TOTAL_ENGAGEMENT_SIGNUP(cls):
            return cls._enum_by_value["TOTAL_ENGAGEMENT_SIGNUP"]("TOTAL_ENGAGEMENT_SIGNUP")
        
        @classmethod
        @property
        def TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR(cls):
            return cls._enum_by_value["TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR"]("TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR")
        
        @classmethod
        @property
        def TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT(cls):
            return cls._enum_by_value["TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT"]("TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT")
        
        @classmethod
        @property
        def TOTAL_IMPRESSION_FREQUENCY(cls):
            return cls._enum_by_value["TOTAL_IMPRESSION_FREQUENCY"]("TOTAL_IMPRESSION_FREQUENCY")
        
        @classmethod
        @property
        def TOTAL_IMPRESSION_USER(cls):
            return cls._enum_by_value["TOTAL_IMPRESSION_USER"]("TOTAL_IMPRESSION_USER")
        
        @classmethod
        @property
        def TOTAL_LEAD(cls):
            return cls._enum_by_value["TOTAL_LEAD"]("TOTAL_LEAD")
        
        @classmethod
        @property
        def TOTAL_PAGE_VISIT(cls):
            return cls._enum_by_value["TOTAL_PAGE_VISIT"]("TOTAL_PAGE_VISIT")
        
        @classmethod
        @property
        def TOTAL_REPIN_RATE(cls):
            return cls._enum_by_value["TOTAL_REPIN_RATE"]("TOTAL_REPIN_RATE")
        
        @classmethod
        @property
        def TOTAL_SIGNUP(cls):
            return cls._enum_by_value["TOTAL_SIGNUP"]("TOTAL_SIGNUP")
        
        @classmethod
        @property
        def TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR(cls):
            return cls._enum_by_value["TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR"]("TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR")
        
        @classmethod
        @property
        def TOTAL_VIDEO_3SEC_VIEWS(cls):
            return cls._enum_by_value["TOTAL_VIDEO_3SEC_VIEWS"]("TOTAL_VIDEO_3SEC_VIEWS")
        
        @classmethod
        @property
        def TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND(cls):
            return cls._enum_by_value["TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND"]("TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND")
        
        @classmethod
        @property
        def TOTAL_VIDEO_MRC_VIEWS(cls):
            return cls._enum_by_value["TOTAL_VIDEO_MRC_VIEWS"]("TOTAL_VIDEO_MRC_VIEWS")
        
        @classmethod
        @property
        def TOTAL_VIDEO_P0_COMBINED(cls):
            return cls._enum_by_value["TOTAL_VIDEO_P0_COMBINED"]("TOTAL_VIDEO_P0_COMBINED")
        
        @classmethod
        @property
        def TOTAL_VIDEO_P100_COMPLETE(cls):
            return cls._enum_by_value["TOTAL_VIDEO_P100_COMPLETE"]("TOTAL_VIDEO_P100_COMPLETE")
        
        @classmethod
        @property
        def TOTAL_VIDEO_P25_COMBINED(cls):
            return cls._enum_by_value["TOTAL_VIDEO_P25_COMBINED"]("TOTAL_VIDEO_P25_COMBINED")
        
        @classmethod
        @property
        def TOTAL_VIDEO_P50_COMBINED(cls):
            return cls._enum_by_value["TOTAL_VIDEO_P50_COMBINED"]("TOTAL_VIDEO_P50_COMBINED")
        
        @classmethod
        @property
        def TOTAL_VIDEO_P75_COMBINED(cls):
            return cls._enum_by_value["TOTAL_VIDEO_P75_COMBINED"]("TOTAL_VIDEO_P75_COMBINED")
        
        @classmethod
        @property
        def TOTAL_VIDEO_P95_COMBINED(cls):
            return cls._enum_by_value["TOTAL_VIDEO_P95_COMBINED"]("TOTAL_VIDEO_P95_COMBINED")
        
        @classmethod
        @property
        def TOTAL_VIEW_CHECKOUT(cls):
            return cls._enum_by_value["TOTAL_VIEW_CHECKOUT"]("TOTAL_VIEW_CHECKOUT")
        
        @classmethod
        @property
        def TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR(cls):
            return cls._enum_by_value["TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"]("TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR")
        
        @classmethod
        @property
        def TOTAL_VIEW_LEAD(cls):
            return cls._enum_by_value["TOTAL_VIEW_LEAD"]("TOTAL_VIEW_LEAD")
        
        @classmethod
        @property
        def TOTAL_VIEW_SIGNUP(cls):
            return cls._enum_by_value["TOTAL_VIEW_SIGNUP"]("TOTAL_VIEW_SIGNUP")
        
        @classmethod
        @property
        def TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR(cls):
            return cls._enum_by_value["TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR"]("TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR")
        
        @classmethod
        @property
        def TOTAL_WEB_CHECKOUT(cls):
            return cls._enum_by_value["TOTAL_WEB_CHECKOUT"]("TOTAL_WEB_CHECKOUT")
        
        @classmethod
        @property
        def TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR(cls):
            return cls._enum_by_value["TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR"]("TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR")
        
        @classmethod
        @property
        def TOTAL_WEB_CLICK_CHECKOUT(cls):
            return cls._enum_by_value["TOTAL_WEB_CLICK_CHECKOUT"]("TOTAL_WEB_CLICK_CHECKOUT")
        
        @classmethod
        @property
        def TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR(cls):
            return cls._enum_by_value["TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"]("TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR")
        
        @classmethod
        @property
        def TOTAL_WEB_ENGAGEMENT_CHECKOUT(cls):
            return cls._enum_by_value["TOTAL_WEB_ENGAGEMENT_CHECKOUT"]("TOTAL_WEB_ENGAGEMENT_CHECKOUT")
        
        @classmethod
        @property
        def TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR(cls):
            return cls._enum_by_value["TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"]("TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR")
        
        @classmethod
        @property
        def TOTAL_WEB_VIEW_CHECKOUT(cls):
            return cls._enum_by_value["TOTAL_WEB_VIEW_CHECKOUT"]("TOTAL_WEB_VIEW_CHECKOUT")
        
        @classmethod
        @property
        def TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR(cls):
            return cls._enum_by_value["TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"]("TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR")
        
        @classmethod
        @property
        def VIDEO_3SEC_VIEWS_2(cls):
            return cls._enum_by_value["VIDEO_3SEC_VIEWS_2"]("VIDEO_3SEC_VIEWS_2")
        
        @classmethod
        @property
        def VIDEO_LENGTH(cls):
            return cls._enum_by_value["VIDEO_LENGTH"]("VIDEO_LENGTH")
        
        @classmethod
        @property
        def VIDEO_MRC_VIEWS_2(cls):
            return cls._enum_by_value["VIDEO_MRC_VIEWS_2"]("VIDEO_MRC_VIEWS_2")
        
        @classmethod
        @property
        def VIDEO_P0_COMBINED_2(cls):
            return cls._enum_by_value["VIDEO_P0_COMBINED_2"]("VIDEO_P0_COMBINED_2")
        
        @classmethod
        @property
        def VIDEO_P100_COMPLETE_2(cls):
            return cls._enum_by_value["VIDEO_P100_COMPLETE_2"]("VIDEO_P100_COMPLETE_2")
        
        @classmethod
        @property
        def VIDEO_P25_COMBINED_2(cls):
            return cls._enum_by_value["VIDEO_P25_COMBINED_2"]("VIDEO_P25_COMBINED_2")
        
        @classmethod
        @property
        def VIDEO_P50_COMBINED_2(cls):
            return cls._enum_by_value["VIDEO_P50_COMBINED_2"]("VIDEO_P50_COMBINED_2")
        
        @classmethod
        @property
        def VIDEO_P75_COMBINED_2(cls):
            return cls._enum_by_value["VIDEO_P75_COMBINED_2"]("VIDEO_P75_COMBINED_2")
        
        @classmethod
        @property
        def VIDEO_P95_COMBINED_2(cls):
            return cls._enum_by_value["VIDEO_P95_COMBINED_2"]("VIDEO_P95_COMBINED_2")
        
        @classmethod
        @property
        def WEB_CHECKOUT_COST_PER_ACTION(cls):
            return cls._enum_by_value["WEB_CHECKOUT_COST_PER_ACTION"]("WEB_CHECKOUT_COST_PER_ACTION")
        
        @classmethod
        @property
        def WEB_CHECKOUT_ROAS(cls):
            return cls._enum_by_value["WEB_CHECKOUT_ROAS"]("WEB_CHECKOUT_ROAS")
GranularitySchema = Granularity


class ClickWindowDaysSchema(
    _SchemaEnumMaker(
        enum_value_to_name={
            1: "POSITIVE_1",
            7: "POSITIVE_7",
            30: "POSITIVE_30",
            60: "POSITIVE_60",
        }
    ),
    IntSchema
):
    
    @classmethod
    @property
    def POSITIVE_1(cls):
        return cls._enum_by_value[1](1)
    
    @classmethod
    @property
    def POSITIVE_7(cls):
        return cls._enum_by_value[7](7)
    
    @classmethod
    @property
    def POSITIVE_30(cls):
        return cls._enum_by_value[30](30)
    
    @classmethod
    @property
    def POSITIVE_60(cls):
        return cls._enum_by_value[60](60)


class EngagementWindowDaysSchema(
    _SchemaEnumMaker(
        enum_value_to_name={
            1: "POSITIVE_1",
            7: "POSITIVE_7",
            30: "POSITIVE_30",
            60: "POSITIVE_60",
        }
    ),
    IntSchema
):
    
    @classmethod
    @property
    def POSITIVE_1(cls):
        return cls._enum_by_value[1](1)
    
    @classmethod
    @property
    def POSITIVE_7(cls):
        return cls._enum_by_value[7](7)
    
    @classmethod
    @property
    def POSITIVE_30(cls):
        return cls._enum_by_value[30](30)
    
    @classmethod
    @property
    def POSITIVE_60(cls):
        return cls._enum_by_value[60](60)


class ViewWindowDaysSchema(
    _SchemaEnumMaker(
        enum_value_to_name={
            1: "POSITIVE_1",
            7: "POSITIVE_7",
            30: "POSITIVE_30",
            60: "POSITIVE_60",
        }
    ),
    IntSchema
):
    
    @classmethod
    @property
    def POSITIVE_1(cls):
        return cls._enum_by_value[1](1)
    
    @classmethod
    @property
    def POSITIVE_7(cls):
        return cls._enum_by_value[7](7)
    
    @classmethod
    @property
    def POSITIVE_30(cls):
        return cls._enum_by_value[30](30)
    
    @classmethod
    @property
    def POSITIVE_60(cls):
        return cls._enum_by_value[60](60)


class ConversionReportTimeSchema(
    _SchemaEnumMaker(
        enum_value_to_name={
            "TIME_OF_AD_ACTION": "AD_ACTION",
            "TIME_OF_CONVERSION": "CONVERSION",
        }
    ),
    StrSchema
):
    
    @classmethod
    @property
    def AD_ACTION(cls):
        return cls._enum_by_value["TIME_OF_AD_ACTION"]("TIME_OF_AD_ACTION")
    
    @classmethod
    @property
    def CONVERSION(cls):
        return cls._enum_by_value["TIME_OF_CONVERSION"]("TIME_OF_CONVERSION")
RequestRequiredQueryParams = typing.TypedDict(
    'RequestRequiredQueryParams',
    {
        'start_date': StartDateSchema,
        'end_date': EndDateSchema,
        'columns': ColumnsSchema,
        'granularity': GranularitySchema,
    }
)
RequestOptionalQueryParams = typing.TypedDict(
    'RequestOptionalQueryParams',
    {
        'click_window_days': ClickWindowDaysSchema,
        'engagement_window_days': EngagementWindowDaysSchema,
        'view_window_days': ViewWindowDaysSchema,
        'conversion_report_time': ConversionReportTimeSchema,
    },
    total=False
)


class RequestQueryParams(RequestRequiredQueryParams, RequestOptionalQueryParams):
    pass


request_query_start_date = api_client.QueryParameter(
    name="start_date",
    style=api_client.ParameterStyle.FORM,
    schema=StartDateSchema,
    required=True,
    explode=True,
)
request_query_end_date = api_client.QueryParameter(
    name="end_date",
    style=api_client.ParameterStyle.FORM,
    schema=EndDateSchema,
    required=True,
    explode=True,
)
request_query_columns = api_client.QueryParameter(
    name="columns",
    style=api_client.ParameterStyle.FORM,
    schema=ColumnsSchema,
    required=True,
)
request_query_granularity = api_client.QueryParameter(
    name="granularity",
    style=api_client.ParameterStyle.FORM,
    schema=GranularitySchema,
    required=True,
    explode=True,
)
request_query_click_window_days = api_client.QueryParameter(
    name="click_window_days",
    style=api_client.ParameterStyle.FORM,
    schema=ClickWindowDaysSchema,
    explode=True,
)
request_query_engagement_window_days = api_client.QueryParameter(
    name="engagement_window_days",
    style=api_client.ParameterStyle.FORM,
    schema=EngagementWindowDaysSchema,
    explode=True,
)
request_query_view_window_days = api_client.QueryParameter(
    name="view_window_days",
    style=api_client.ParameterStyle.FORM,
    schema=ViewWindowDaysSchema,
    explode=True,
)
request_query_conversion_report_time = api_client.QueryParameter(
    name="conversion_report_time",
    style=api_client.ParameterStyle.FORM,
    schema=ConversionReportTimeSchema,
    explode=True,
)
# path params


class AdAccountIdSchema(
    _SchemaValidator(
        regex=[{
            'pattern': r'^\d+$',  # noqa: E501
        }],
    ),
    StrSchema
):
    pass
RequestRequiredPathParams = typing.TypedDict(
    'RequestRequiredPathParams',
    {
        'ad_account_id': AdAccountIdSchema,
    }
)
RequestOptionalPathParams = typing.TypedDict(
    'RequestOptionalPathParams',
    {
    },
    total=False
)


class RequestPathParams(RequestRequiredPathParams, RequestOptionalPathParams):
    pass


request_path_ad_account_id = api_client.PathParameter(
    name="ad_account_id",
    style=api_client.ParameterStyle.SIMPLE,
    schema=AdAccountIdSchema,
    required=True,
)
_path = '/ad_accounts/{ad_account_id}/analytics'
_method = 'GET'
_auth = [
    'pinterest_oauth2',
]
SchemaFor200ResponseBodyApplicationJson = AdAccountAnalyticsResponse


@dataclass
class ApiResponseFor200(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        SchemaFor200ResponseBodyApplicationJson,
    ]
    headers: Unset = unset


_response_for_200 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor200,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor200ResponseBodyApplicationJson),
    },
)
SchemaFor400ResponseBodyApplicationJson = Error


@dataclass
class ApiResponseFor400(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        SchemaFor400ResponseBodyApplicationJson,
    ]
    headers: Unset = unset


_response_for_400 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor400,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor400ResponseBodyApplicationJson),
    },
)
SchemaFor0ResponseBodyApplicationJson = Error


@dataclass
class ApiResponseForDefault(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        SchemaFor0ResponseBodyApplicationJson,
    ]
    headers: Unset = unset


_response_for_default = api_client.OpenApiResponse(
    response_cls=ApiResponseForDefault,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor0ResponseBodyApplicationJson),
    },
)
_status_code_to_response = {
    '200': _response_for_200,
    '400': _response_for_400,
    'default': _response_for_default,
}
_all_accept_content_types = (
    'application/json',
)


class AdAccountAnalytics(api_client.Api):

    def ad_account_analytics(
        self: api_client.Api,
        query_params: RequestQueryParams = frozendict(),
        path_params: RequestPathParams = frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ) -> typing.Union[
        ApiResponseFor200,
        ApiResponseForDefault,
        api_client.ApiResponseWithoutDeserialization
    ]:
        """
        Get ad account analytics
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        self._verify_typed_dict_inputs(RequestQueryParams, query_params)
        self._verify_typed_dict_inputs(RequestPathParams, path_params)

        _path_params = {}
        for parameter in (
            request_path_ad_account_id,
        ):
            parameter_data = path_params.get(parameter.name, unset)
            if parameter_data is unset:
                continue
            serialized_data = parameter.serialize(parameter_data)
            _path_params.update(serialized_data)

        _query_params = []
        for parameter in (
            request_query_start_date,
            request_query_end_date,
            request_query_columns,
            request_query_granularity,
            request_query_click_window_days,
            request_query_engagement_window_days,
            request_query_view_window_days,
            request_query_conversion_report_time,
        ):
            parameter_data = query_params.get(parameter.name, unset)
            if parameter_data is unset:
                continue
            serialized_data = parameter.serialize(parameter_data)
            _query_params.extend(serialized_data)

        _headers = HTTPHeaderDict()
        # TODO add cookie handling
        if accept_content_types:
            for accept_content_type in accept_content_types:
                _headers.add('Accept', accept_content_type)

        response = self.api_client.call_api(
            resource_path=_path,
            method=_method,
            path_params=_path_params,
            query_params=tuple(_query_params),
            headers=_headers,
            auth_settings=_auth,
            stream=stream,
            timeout=timeout,
        )

        if skip_deserialization:
            api_response = api_client.ApiResponseWithoutDeserialization(response=response)
        else:
            response_for_status = _status_code_to_response.get(str(response.status))
            if response_for_status:
                api_response = response_for_status.deserialize(response, self.api_client.configuration)
            else:
                default_response = _status_code_to_response.get('default')
                if default_response:
                    api_response = default_response.deserialize(response, self.api_client.configuration)
                else:
                    api_response = api_client.ApiResponseWithoutDeserialization(response=response)

        if not 200 <= response.status <= 299:
            raise exceptions.ApiException(api_response=api_response)

        return api_response