namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsRetailReportAllItemsFilter =

  //#region CatalogsRetailReportAllItemsFilter

  //#region enums
  type ReportTypeEnum = ALLITEMSEnum of string  
  //#endregion

  type CatalogsRetailReportAllItemsFilter = {
    CatalogId : string;
    ProductGroupId : string;
    ReportType : ReportTypeEnum;
  }
  //#endregion
