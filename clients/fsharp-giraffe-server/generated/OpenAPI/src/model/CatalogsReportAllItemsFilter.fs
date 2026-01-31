namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsReportAllItemsFilter =

  //#region CatalogsReportAllItemsFilter

  //#region enums
  type ReportTypeEnum = ALLITEMSEnum of string  
  //#endregion

  type CatalogsReportAllItemsFilter = {
    CatalogId : string;
    ReportType : ReportTypeEnum;
  }
  //#endregion
