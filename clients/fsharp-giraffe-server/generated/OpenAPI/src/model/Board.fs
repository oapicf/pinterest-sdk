namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BoardOwner
open OpenAPI.Model.string option

module Board =

  //#region Board

  //#region enums
  type PrivacyEnum = PUBLICEnum of string  |  PROTECTEDEnum of string  |  SECRETEnum of string  
  //#endregion

  type Board = {
    Id : string;
    Name : string;
    Description : string option;
    Owner : BoardOwner;
    Privacy : PrivacyEnum;
  }
  //#endregion
