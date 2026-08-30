namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssetAccessRequestError
open System.Collections.Generic

module CreateAssetAccessRequestResponse =

  //#region CreateAssetAccessRequestResponse


  type CreateAssetAccessRequestResponse = {
    Exceptions : AssetAccessRequestError[];
    Invites : IDictionary<string, string>;
  }
  //#endregion
