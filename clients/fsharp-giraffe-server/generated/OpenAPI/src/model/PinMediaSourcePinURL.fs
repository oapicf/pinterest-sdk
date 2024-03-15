namespace OpenAPI.Model

open System
open System.Collections.Generic

module PinMediaSourcePinURL =

  //#region PinMediaSourcePinURL

  //#region enums
  type SourceTypeEnum = PinUrlEnum of string  
  //#endregion

  type PinMediaSourcePinURL = {
    SourceType : SourceTypeEnum;
    IsAffiliateLink : bool;
  }
  //#endregion
