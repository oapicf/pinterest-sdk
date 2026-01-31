namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module TermsOfService =

  //#region TermsOfService


  type TermsOfService = {
    AdAccountId : string;
    HasAccepted : bool;
    Html : string option;
    Id : string;
  }
  //#endregion
