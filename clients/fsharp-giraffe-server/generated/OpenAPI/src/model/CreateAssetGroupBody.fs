namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssetGroupType

module CreateAssetGroupBody =

  //#region CreateAssetGroupBody


  type CreateAssetGroupBody = {
    AssetGroupDescription : string;
    AssetGroupName : string;
    AssetGroupTypes : AssetGroupType[];
  }
  //#endregion
