namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateAssetAccessRequestBodyAssetRequestsInner

module CreateAssetAccessRequestBody =

  //#region CreateAssetAccessRequestBody

  [<CLIMutable>]
  type CreateAssetAccessRequestBody = {
    [<JsonProperty(PropertyName = "asset_requests")>]
    AssetRequests : CreateAssetAccessRequestBodyAssetRequestsInner[];
  }

  //#endregion
