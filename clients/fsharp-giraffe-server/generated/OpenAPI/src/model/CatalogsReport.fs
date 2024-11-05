namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.decimal option
open OpenAPI.Model.string option

module CatalogsReport =

  //#region CatalogsReport

  //#region enums
  type ReportStatusEnum = FINISHEDEnum of string  |  INPROGRESSEnum of string  
  //#endregion

  type CatalogsReport = {
    ReportStatus : ReportStatusEnum;
    Url : string option;
    Size : decimal option;
  }
  //#endregion
