namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssetGroupBinding
open OpenAPI.Model.AssetGroupType

module AssetGroupInputCreate =

  //#region AssetGroupInputCreate


  type AssetGroupInputCreate = {
    AssetGroup : AssetGroupBinding;
    AssetGroupDescription : string;
    AssetGroupName : string;
    AssetGroupTypes : AssetGroupType[];
  }
  //#endregion
