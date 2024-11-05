namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateAssetAccessRequestErrorMessageInner
open System.Collections.Generic

module CreateAssetAccessRequestResponse =

  //#region CreateAssetAccessRequestResponse


  type CreateAssetAccessRequestResponse = {
    Exceptions : CreateAssetAccessRequestErrorMessageInner[];
    Invites : IDictionary<string, string>;
  }
  //#endregion
