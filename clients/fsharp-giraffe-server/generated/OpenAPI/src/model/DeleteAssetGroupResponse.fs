namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.DeleteAssetGroupResponseExceptionsInner

module DeleteAssetGroupResponse =

  //#region DeleteAssetGroupResponse


  type DeleteAssetGroupResponse = {
    DeletedAssetGroups : string[];
    Exceptions : DeleteAssetGroupResponseExceptionsInner[];
  }
  //#endregion
