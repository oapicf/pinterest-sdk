namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConversionAttributionWindowDays
open OpenAPI.Model.ConversionObjectiveType
open OpenAPI.Model.ConversionProductAttributionType
open OpenAPI.Model.ConversionProductReportBreakdownType
open OpenAPI.Model.ConversionProductReportGranularity
open OpenAPI.Model.ConversionProductReportLevel
open OpenAPI.Model.ConversionProductReportingColumn
open OpenAPI.Model.ConversionReportTimeType

module ConversionProductReportCreate =

  //#region ConversionProductReportCreate


  type ConversionProductReportCreate = {
    AdGroupIds : string[];
    CampaignIds : string[];
    CampaignObjectiveTypes : ConversionObjectiveType[];
    ClickWindowDays : ConversionAttributionWindowDays;
    Columns : ConversionProductReportingColumn[];
    ConversionProductAttributionType : ConversionProductAttributionType;
    ConversionProductBreakdown : ConversionProductReportBreakdownType;
    ConversionReportTime : ConversionReportTimeType;
    EndDate : string;
    Granularity : ConversionProductReportGranularity;
    Level : ConversionProductReportLevel;
    ProductSkuIds : string[];
    ReportName : string;
    StartDate : string;
    ViewWindowDays : ConversionAttributionWindowDays;
  }
  //#endregion
