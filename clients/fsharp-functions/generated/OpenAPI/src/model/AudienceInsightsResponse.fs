namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AudienceCategory
open OpenAPI.Model.AudienceDemographics
open OpenAPI.Model.AudienceInsightType
open OpenAPI.Model.string option

module AudienceInsightsResponse =

  //#region AudienceInsightsResponse

  [<CLIMutable>]
  type AudienceInsightsResponse = {
    [<JsonProperty(PropertyName = "categories")>]
    Categories : AudienceCategory[];
    [<JsonProperty(PropertyName = "date")>]
    Date : string option;
    [<JsonProperty(PropertyName = "demographics")>]
    Demographics : AudienceDemographics;
    [<JsonProperty(PropertyName = "size")>]
    Size : int;
    [<JsonProperty(PropertyName = "size_is_upper_bound")>]
    SizeIsUpperBound : bool;
    [<JsonProperty(PropertyName = "type")>]
    Type : AudienceInsightType;
  }

  //#endregion
