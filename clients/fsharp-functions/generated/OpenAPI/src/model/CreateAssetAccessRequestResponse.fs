namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateAssetAccessRequestErrorMessageInner
open System.Collections.Generic

module CreateAssetAccessRequestResponse =

  //#region CreateAssetAccessRequestResponse

  [<CLIMutable>]
  type CreateAssetAccessRequestResponse = {
    [<JsonProperty(PropertyName = "exceptions")>]
    Exceptions : CreateAssetAccessRequestErrorMessageInner[];
    [<JsonProperty(PropertyName = "invites")>]
    Invites : IDictionary<string, string>;
  }

  //#endregion
