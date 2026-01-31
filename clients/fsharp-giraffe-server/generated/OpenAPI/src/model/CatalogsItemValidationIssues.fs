namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsItemValidationErrors
open OpenAPI.Model.CatalogsItemValidationWarnings
open OpenAPI.Model.string option

module CatalogsItemValidationIssues =

  //#region CatalogsItemValidationIssues


  type CatalogsItemValidationIssues = {
    Errors : CatalogsItemValidationErrors;
    ItemId : string option;
    ItemNumber : int;
    Warnings : CatalogsItemValidationWarnings;
  }
  //#endregion
