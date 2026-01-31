namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.QualityComponentIssue

module QualityComponentDetails =

  //#region QualityComponentDetails

  [<CLIMutable>]
  type QualityComponentDetails = {
    [<JsonProperty(PropertyName = "coverage")>]
    Coverage : decimal;
    [<JsonProperty(PropertyName = "issues")>]
    Issues : QualityComponentIssue[];
    [<JsonProperty(PropertyName = "overlap")>]
    Overlap : decimal;
  }

  //#endregion
