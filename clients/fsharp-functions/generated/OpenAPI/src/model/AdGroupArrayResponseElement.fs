namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdGroupResponse
open OpenAPI.Model.Exception

module AdGroupArrayResponseElement =

  //#region AdGroupArrayResponseElement

  [<CLIMutable>]
  type AdGroupArrayResponseElement = {
    [<JsonProperty(PropertyName = "data")>]
    Data : AdGroupResponse;
    [<JsonProperty(PropertyName = "exceptions")>]
    Exceptions : Exception[];
  }

  //#endregion
