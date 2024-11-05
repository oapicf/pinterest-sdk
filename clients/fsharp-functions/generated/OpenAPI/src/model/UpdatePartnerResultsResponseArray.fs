namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.UpdatePartnerResultsResponseArrayItemsInner

module UpdatePartnerResultsResponseArray =

  //#region UpdatePartnerResultsResponseArray

  [<CLIMutable>]
  type UpdatePartnerResultsResponseArray = {
    [<JsonProperty(PropertyName = "items")>]
    Items : UpdatePartnerResultsResponseArrayItemsInner[];
  }

  //#endregion
