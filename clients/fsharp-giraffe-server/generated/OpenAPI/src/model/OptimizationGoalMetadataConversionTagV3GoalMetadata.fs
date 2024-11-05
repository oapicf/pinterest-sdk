namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows
open OpenAPI.Model.bool option
open OpenAPI.Model.string option

module OptimizationGoalMetadataConversionTagV3GoalMetadata =

  //#region OptimizationGoalMetadataConversionTagV3GoalMetadata

  //#region enums
  type ConversionEventEnum = PAGEVISITEnum of string  |  SIGNUPEnum of string  |  CHECKOUTEnum of string  |  CUSTOMEnum of string  |  VIEWCATEGORYEnum of string  |  SEARCHEnum of string  |  ADDTOCARTEnum of string  |  WATCHVIDEOEnum of string  |  LEADEnum of string  |  APPINSTALLEnum of string  
  //#endregion
  //#region enums
  type LearningModeTypeEnum = NOTACTIVEEnum of string option  |  ACTIVEEnum of string option  
  //#endregion

  type OptimizationGoalMetadata_conversion_tag_v3_goal_metadata = {
    AttributionWindows : OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows;
    ConversionEvent : ConversionEventEnum;
    ConversionTagId : string;
    CpaGoalValueInMicroCurrency : string;
    IsRoasOptimized : bool option;
    LearningModeType : LearningModeTypeEnum;
  }
  //#endregion
