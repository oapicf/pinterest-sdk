namespace OpenAPI.Model

open System
open System.Collections.Generic

module DeletePartnerAssetAccessBodyAccessesInner =

  //#region DeletePartnerAssetAccessBodyAccessesInner

  //#region enums
  type PartnerTypeEnum = INTERNALEnum of string  |  EXTERNALEnum of string  
  //#endregion

  type DeletePartnerAssetAccessBody_accesses_inner = {
    PartnerId : string;
    AssetId : string;
    PartnerType : PartnerTypeEnum;
  }
  //#endregion
