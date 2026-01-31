namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsReportAllItemsFilter =

  //#region CatalogsReportAllItemsFilter

  [<CLIMutable>]
  type CatalogsReportAllItemsFilter = {
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
    [<JsonProperty(PropertyName = "report_type")>]
    ReportType : string;
  }

  //#endregion
