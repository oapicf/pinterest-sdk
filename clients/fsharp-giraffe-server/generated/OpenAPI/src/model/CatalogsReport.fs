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
    Size : decimal option;
    Url : string option;
  }
  //#endregion
