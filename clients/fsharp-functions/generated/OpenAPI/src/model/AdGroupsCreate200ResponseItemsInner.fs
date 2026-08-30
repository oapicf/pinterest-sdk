namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdGroup
open OpenAPI.Model.PinterestLibBatchItemException

module AdGroupsCreate200ResponseItemsInner =

  //#region AdGroupsCreate200ResponseItemsInner

  [<CLIMutable>]
  type AdGroupsCreate200ResponseItemsInner = {
    [<JsonProperty(PropertyName = "data")>]
    Data : AdGroup;
    [<JsonProperty(PropertyName = "exceptions")>]
    Exceptions : PinterestLibBatchItemException[];
  }

  //#endregion
