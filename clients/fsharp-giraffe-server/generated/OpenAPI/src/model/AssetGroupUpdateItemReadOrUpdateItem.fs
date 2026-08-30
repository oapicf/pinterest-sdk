namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssetGroupType

module AssetGroupUpdateItemReadOrUpdateItem =

  //#region AssetGroupUpdateItemReadOrUpdateItem


  type AssetGroupUpdateItemReadOrUpdateItem = {
    AssetGroupId : string;
    AssetGroupTypes : AssetGroupType[];
    AssetsToAdd : string[];
    AssetsToRemove : string[];
    Description : string;
    Name : string;
  }
  //#endregion
