namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module AdsCreditRedeemResponse =

  //#region AdsCreditRedeemResponse


  type AdsCreditRedeemResponse = {
    Success : bool;
    ErrorCode : int option;
    ErrorMessage : string option;
  }
  //#endregion
