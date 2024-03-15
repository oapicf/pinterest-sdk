namespace OpenAPI.Model

open System
open System.Collections.Generic

module UserWebsiteVerifyRequest =

  //#region UserWebsiteVerifyRequest

  //#region enums
  type VerificationMethodEnum = FILENAMEEnum of string  |  METATAGEnum of string  |  DNSTXTEnum of string  
  //#endregion

  type UserWebsiteVerifyRequest = {
    Website : string;
    VerificationMethod : VerificationMethodEnum;
  }
  //#endregion
