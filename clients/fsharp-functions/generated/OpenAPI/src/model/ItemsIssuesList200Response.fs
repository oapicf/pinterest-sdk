namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsItemValidationIssues
open OpenAPI.Model.string option

module ItemsIssuesList200Response =

  //#region ItemsIssuesList200Response

  [<CLIMutable>]
  type ItemsIssuesList200Response = {
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
    [<JsonProperty(PropertyName = "items")>]
    Items : CatalogsItemValidationIssues[];
  }

  //#endregion
