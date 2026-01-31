namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BusinessAccessUserSummary
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module AssetGroupBinding =

  //#region AssetGroupBinding


  type AssetGroupBinding = {
    AdAccountsIds : string[];
    AssetGroupDescription : string option;
    AssetGroupName : string option;
    AssetGroupTypes : string[];
    CatalogsIds : string[];
    CreatedBy : BusinessAccessUserSummary;
    CreatedTime : int option;
    Id : string;
    Owner : BusinessAccessUserSummary;
    ProfilesIds : string[];
    UpdatedTime : int option;
  }
  //#endregion
