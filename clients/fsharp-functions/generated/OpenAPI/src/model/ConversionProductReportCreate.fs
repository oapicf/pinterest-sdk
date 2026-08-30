namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
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

  [<CLIMutable>]
  type ConversionProductReportCreate = {
    [<JsonProperty(PropertyName = "ad_group_ids")>]
    AdGroupIds : string[];
    [<JsonProperty(PropertyName = "campaign_ids")>]
    CampaignIds : string[];
    [<JsonProperty(PropertyName = "campaign_objective_types")>]
    CampaignObjectiveTypes : ConversionObjectiveType[];
    [<JsonProperty(PropertyName = "click_window_days")>]
    ClickWindowDays : ConversionAttributionWindowDays;
    [<JsonProperty(PropertyName = "columns")>]
    Columns : ConversionProductReportingColumn[];
    [<JsonProperty(PropertyName = "conversion_product_attribution_type")>]
    ConversionProductAttributionType : ConversionProductAttributionType;
    [<JsonProperty(PropertyName = "conversion_product_breakdown")>]
    ConversionProductBreakdown : ConversionProductReportBreakdownType;
    [<JsonProperty(PropertyName = "conversion_report_time")>]
    ConversionReportTime : ConversionReportTimeType;
    [<JsonProperty(PropertyName = "end_date")>]
    EndDate : string;
    [<JsonProperty(PropertyName = "granularity")>]
    Granularity : ConversionProductReportGranularity;
    [<JsonProperty(PropertyName = "level")>]
    Level : ConversionProductReportLevel;
    [<JsonProperty(PropertyName = "product_sku_ids")>]
    ProductSkuIds : string[];
    [<JsonProperty(PropertyName = "report_name")>]
    ReportName : string;
    [<JsonProperty(PropertyName = "start_date")>]
    StartDate : string;
    [<JsonProperty(PropertyName = "view_window_days")>]
    ViewWindowDays : ConversionAttributionWindowDays;
  }

  //#endregion
