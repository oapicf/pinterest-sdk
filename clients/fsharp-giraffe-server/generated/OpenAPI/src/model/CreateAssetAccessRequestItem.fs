namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Permissions
open System.Collections.Generic

module CreateAssetAccessRequestItem =

  //#region CreateAssetAccessRequestItem


  type CreateAssetAccessRequestItem = {
    AssetIdToPermissions : IDictionary<string, list>;
    PartnerId : string;
  }
  //#endregion
