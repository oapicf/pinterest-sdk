#
# Pinterest REST API
# 
# Pinterest's REST API
# The version of the OpenAPI document: 5.14.0
# Contact: blah+oapicf@cliffano.com
# Generated by: https://openapi-generator.tech
#

import json
import tables

import model_optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows

type ConversionEvent* {.pure.} = enum
  PAGEVISIT
  SIGNUP
  CHECKOUT
  CUSTOM
  VIEWCATEGORY
  SEARCH
  ADDTOCART
  WATCHVIDEO
  LEAD
  APPINSTALL

type LearningModeType* {.pure.} = enum
  NOTACTIVE
  ACTIVE

type OptimizationGoalMetadataConversionTagV3GoalMetadata* = object
  ## 
  attributionWindows*: OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows
  conversionEvent*: ConversionEvent
  conversionTagId*: string
  cpaGoalValueInMicroCurrency*: string
  isRoasOptimized*: bool ## ROAS optimization is not supported
  learningModeType*: LearningModeType ## Conversion learning model type

func `%`*(v: ConversionEvent): JsonNode =
  let str = case v:
    of ConversionEvent.PAGEVISIT: "PAGE_VISIT"
    of ConversionEvent.SIGNUP: "SIGNUP"
    of ConversionEvent.CHECKOUT: "CHECKOUT"
    of ConversionEvent.CUSTOM: "CUSTOM"
    of ConversionEvent.VIEWCATEGORY: "VIEW_CATEGORY"
    of ConversionEvent.SEARCH: "SEARCH"
    of ConversionEvent.ADDTOCART: "ADD_TO_CART"
    of ConversionEvent.WATCHVIDEO: "WATCH_VIDEO"
    of ConversionEvent.LEAD: "LEAD"
    of ConversionEvent.APPINSTALL: "APP_INSTALL"

  JsonNode(kind: JString, str: str)

func `$`*(v: ConversionEvent): string =
  result = case v:
    of ConversionEvent.PAGEVISIT: "PAGE_VISIT"
    of ConversionEvent.SIGNUP: "SIGNUP"
    of ConversionEvent.CHECKOUT: "CHECKOUT"
    of ConversionEvent.CUSTOM: "CUSTOM"
    of ConversionEvent.VIEWCATEGORY: "VIEW_CATEGORY"
    of ConversionEvent.SEARCH: "SEARCH"
    of ConversionEvent.ADDTOCART: "ADD_TO_CART"
    of ConversionEvent.WATCHVIDEO: "WATCH_VIDEO"
    of ConversionEvent.LEAD: "LEAD"
    of ConversionEvent.APPINSTALL: "APP_INSTALL"

func `%`*(v: LearningModeType): JsonNode =
  let str = case v:
    of LearningModeType.NOTACTIVE: "NOT_ACTIVE"
    of LearningModeType.ACTIVE: "ACTIVE"

  JsonNode(kind: JString, str: str)

func `$`*(v: LearningModeType): string =
  result = case v:
    of LearningModeType.NOTACTIVE: "NOT_ACTIVE"
    of LearningModeType.ACTIVE: "ACTIVE"
