namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.KeywordsCommon

module KeywordsRequest =

  //#region KeywordsRequest


  type KeywordsRequest = {
    Keywords : KeywordsCommon[];
    ParentId : string;
  }
  //#endregion
