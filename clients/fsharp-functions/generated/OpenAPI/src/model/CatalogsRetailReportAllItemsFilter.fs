namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsRetailReportAllItemsFilter =

  //#region CatalogsRetailReportAllItemsFilter

  [<CLIMutable>]
  type CatalogsRetailReportAllItemsFilter = {
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
    [<JsonProperty(PropertyName = "product_group_id")>]
    ProductGroupId : string;
    [<JsonProperty(PropertyName = "report_type")>]
    ReportType : string;
  }

  //#endregion
