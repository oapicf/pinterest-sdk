namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BusinessAccessUserSummary
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module AssetGroupBinding =

  //#region AssetGroupBinding


  type AssetGroupBinding = {
    Id : string;
    AssetGroupName : string option;
    AssetGroupDescription : string option;
    AssetGroupTypes : string[];
    AdAccountsIds : string[];
    ProfilesIds : string[];
    CreatedTime : int option;
    UpdatedTime : int option;
    Owner : BusinessAccessUserSummary;
    CreatedBy : BusinessAccessUserSummary;
  }
  //#endregion
