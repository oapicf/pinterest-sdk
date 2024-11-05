namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CreateAssetAccessRequestErrorMessageInner =

  //#region CreateAssetAccessRequestErrorMessageInner

  [<CLIMutable>]
  type CreateAssetAccessRequestErrorMessageInner = {
    [<JsonProperty(PropertyName = "code")>]
    Code : int;
    [<JsonProperty(PropertyName = "messages")>]
    Messages : string[];
  }

  //#endregion
