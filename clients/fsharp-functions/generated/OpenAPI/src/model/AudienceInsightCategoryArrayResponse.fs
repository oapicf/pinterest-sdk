namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AudienceInsightCategoryCommon

module AudienceInsightCategoryArrayResponse =

  //#region AudienceInsightCategoryArrayResponse

  [<CLIMutable>]
  type AudienceInsightCategoryArrayResponse = {
    [<JsonProperty(PropertyName = "items")>]
    Items : AudienceInsightCategoryCommon[];
  }

  //#endregion
