namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module BoardUpdate =

  //#region BoardUpdate

  //#region enums
  type PrivacyEnum = PUBLICEnum of string  |  SECRETEnum of string  
  //#endregion

  type BoardUpdate = {
    Name : string;
    Description : string option;
    Privacy : PrivacyEnum;
  }
  //#endregion
