namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssetGroupType

module CreateAssetGroupBody =

  //#region CreateAssetGroupBody


  type CreateAssetGroupBody = {
    AssetGroupName : string;
    AssetGroupDescription : string;
    AssetGroupTypes : AssetGroupType[];
  }
  //#endregion
