namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsReportDistributionIssueFilter
open OpenAPI.Model.CatalogsReportFeedIngestionFilter
open OpenAPI.Model.CatalogsRetailReportAllItemsFilter

module CatalogsRetailReportParametersReport =

  //#region CatalogsRetailReportParametersReport

  [<CLIMutable>]
  type CatalogsRetailReportParametersReport = {
    [<JsonProperty(PropertyName = "feed_id")>]
    FeedId : string;
    [<JsonProperty(PropertyName = "processing_result_id")>]
    ProcessingResultId : string;
    [<JsonProperty(PropertyName = "report_type")>]
    ReportType : string;
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
    [<JsonProperty(PropertyName = "product_group_id")>]
    ProductGroupId : string;
  }

  //#endregion
