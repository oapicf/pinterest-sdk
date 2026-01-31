namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module AdsCreditRedeemResponse =

  //#region AdsCreditRedeemResponse


  type AdsCreditRedeemResponse = {
    ErrorCode : int option;
    ErrorMessage : string option;
    Success : bool;
  }
  //#endregion
