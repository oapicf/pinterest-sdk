namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module InviteExceptionResponse =

  //#region InviteExceptionResponse


  type InviteExceptionResponse = {
    Code : int;
    InviteOrRequestId : string option;
    Message : string;
    UsersOrPartnerIds : string[];
  }
  //#endregion
