namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsItemValidationErrors
open OpenAPI.Model.CatalogsItemValidationWarnings
open OpenAPI.Model.string option

module CatalogsItemValidationIssues =

  //#region CatalogsItemValidationIssues


  type CatalogsItemValidationIssues = {
    ItemNumber : int;
    ItemId : string option;
    Errors : CatalogsItemValidationErrors;
    Warnings : CatalogsItemValidationWarnings;
  }
  //#endregion
