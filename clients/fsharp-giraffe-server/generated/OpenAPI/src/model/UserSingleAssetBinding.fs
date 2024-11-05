namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BusinessAccessUserSummary

module UserSingleAssetBinding =

  //#region UserSingleAssetBinding


  type UserSingleAssetBinding = {
    Permissions : string[];
    User : BusinessAccessUserSummary;
  }
  //#endregion
