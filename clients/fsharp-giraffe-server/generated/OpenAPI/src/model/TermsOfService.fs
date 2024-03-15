namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module TermsOfService =

  //#region TermsOfService


  type TermsOfService = {
    Id : string;
    Html : string option;
    HasAccepted : bool;
    AdAccountId : string;
  }
  //#endregion
