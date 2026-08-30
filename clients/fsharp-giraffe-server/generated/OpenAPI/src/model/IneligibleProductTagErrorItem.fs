namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.IneligibleProductTagReason

module IneligibleProductTagErrorItem =

  //#region IneligibleProductTagErrorItem


  type IneligibleProductTagErrorItem = {
    ErrorMessage : IneligibleProductTagReason;
    PinId : string;
  }
  //#endregion
