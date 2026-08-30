namespace OpenAPI.Model

open System
open System.Collections.Generic

module DeletePartnerAssetAccessItem =

  //#region DeletePartnerAssetAccessItem

  //#region enums
  type PartnerTypeEnum = INTERNALEnum of string  |  EXTERNALEnum of string  
  //#endregion

  type DeletePartnerAssetAccessItem = {
    AssetId : string;
    PartnerId : string;
    PartnerType : PartnerTypeEnum;
  }
  //#endregion
