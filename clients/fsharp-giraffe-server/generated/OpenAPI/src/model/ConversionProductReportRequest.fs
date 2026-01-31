namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConversionAttributionWindowDays
open OpenAPI.Model.ConversionProductReportingColumn
open OpenAPI.Model.ConversionReportTimeType
open OpenAPI.Model.ObjectiveType

module ConversionProductReportRequest =

  //#region ConversionProductReportRequest

  //#region enums
  type ConversionProductAttributionTypeEnum = DEFAULTEnum of string  |  BRANDATTRIBUTIONEnum of string  
  //#endregion
  //#region enums
  type ConversionProductBreakdownEnum = PRODUCTBRANDEnum of string  |  PRODUCTCATEGORYEnum of string  |  PRODUCTBRANDANDCATEGORYEnum of string  |  PRODUCTSKUEnum of string  |  PRODUCTSKUGROUPEnum of string  
  //#endregion
  //#region enums
  type GranularityEnum = WEEKEnum of string  |  MONTHEnum of string  |  TOTALEnum of string  
  //#endregion
  //#region enums
  type LevelEnum = ADVERTISEREnum of string  |  CAMPAIGNEnum of string  |  ADGROUPEnum of string  
  //#endregion

  type ConversionProductReportRequest = {
    AdGroupIds : string[];
    CampaignIds : string[];
    CampaignObjectiveTypes : ObjectiveType[];
    ClickWindowDays : ConversionAttributionWindowDays;
    Columns : ConversionProductReportingColumn[];
    ConversionProductAttributionType : ConversionProductAttributionTypeEnum;
    ConversionProductBreakdown : ConversionProductBreakdownEnum;
    ConversionReportTime : ConversionReportTimeType;
    EndDate : string;
    Granularity : GranularityEnum;
    Level : LevelEnum;
    ProductSkuIds : string[];
    ReportName : string;
    StartDate : string;
    ViewWindowDays : ConversionAttributionWindowDays;
  }
  //#endregion
