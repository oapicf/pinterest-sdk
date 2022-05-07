namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsFeedValidationErrors
open OpenAPI.Model.CatalogsFeedValidationWarnings

module CatalogsFeedValidationDetails =

  //#region CatalogsFeedValidationDetails

  [<CLIMutable>]
  type CatalogsFeedValidationDetails = {
    [<JsonProperty(PropertyName = "errors")>]
    Errors : CatalogsFeedValidationErrors;
    [<JsonProperty(PropertyName = "warnings")>]
    Warnings : CatalogsFeedValidationWarnings;
  }

  //#endregion
