namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsItemValidationErrors
open OpenAPI.Model.CatalogsItemValidationWarnings
open OpenAPI.Model.string option

module CatalogsItemValidationIssues =

  //#region CatalogsItemValidationIssues

  [<CLIMutable>]
  type CatalogsItemValidationIssues = {
    [<JsonProperty(PropertyName = "item_number")>]
    ItemNumber : int;
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string option;
    [<JsonProperty(PropertyName = "errors")>]
    Errors : CatalogsItemValidationErrors;
    [<JsonProperty(PropertyName = "warnings")>]
    Warnings : CatalogsItemValidationWarnings;
  }

  //#endregion
