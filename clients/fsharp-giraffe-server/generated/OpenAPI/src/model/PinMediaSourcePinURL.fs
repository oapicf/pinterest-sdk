namespace OpenAPI.Model

open System
open System.Collections.Generic

module PinMediaSourcePinURL =

  //#region PinMediaSourcePinURL

  //#region enums
  type SourceTypeEnum = PinUrlEnum of string  
  //#endregion

  type PinMediaSourcePinURL = {
    IsAffiliateLink : bool;
    SourceType : SourceTypeEnum;
  }
  //#endregion
