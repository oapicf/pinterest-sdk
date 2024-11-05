namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module InviteExceptionResponse =

  //#region InviteExceptionResponse


  type InviteExceptionResponse = {
    InviteOrRequestId : string option;
    Code : int;
    Message : string;
    UsersOrPartnerIds : string[];
  }
  //#endregion
