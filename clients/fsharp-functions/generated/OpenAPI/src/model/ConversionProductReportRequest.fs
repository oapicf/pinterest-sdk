namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConversionAttributionWindowDays
open OpenAPI.Model.ConversionProductReportingColumn
open OpenAPI.Model.ConversionReportTimeType
open OpenAPI.Model.ObjectiveType

module ConversionProductReportRequest =

  //#region ConversionProductReportRequest

  [<CLIMutable>]
  type ConversionProductReportRequest = {
    [<JsonProperty(PropertyName = "ad_group_ids")>]
    AdGroupIds : string[];
    [<JsonProperty(PropertyName = "campaign_ids")>]
    CampaignIds : string[];
    [<JsonProperty(PropertyName = "campaign_objective_types")>]
    CampaignObjectiveTypes : ObjectiveType[];
    [<JsonProperty(PropertyName = "click_window_days")>]
    ClickWindowDays : ConversionAttributionWindowDays;
    [<JsonProperty(PropertyName = "columns")>]
    Columns : ConversionProductReportingColumn[];
    [<JsonProperty(PropertyName = "conversion_product_attribution_type")>]
    ConversionProductAttributionType : string;
    [<JsonProperty(PropertyName = "conversion_product_breakdown")>]
    ConversionProductBreakdown : string;
    [<JsonProperty(PropertyName = "conversion_report_time")>]
    ConversionReportTime : ConversionReportTimeType;
    [<JsonProperty(PropertyName = "end_date")>]
    EndDate : string;
    [<JsonProperty(PropertyName = "granularity")>]
    Granularity : string;
    [<JsonProperty(PropertyName = "level")>]
    Level : string;
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
