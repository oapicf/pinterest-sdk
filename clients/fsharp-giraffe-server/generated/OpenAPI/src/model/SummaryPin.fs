namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.SummaryPinMedia
open OpenAPI.Model.string option

module SummaryPin =

  //#region SummaryPin


  type SummaryPin = {
    Media : SummaryPinMedia;
    AltText : string option;
    Link : string option;
    Title : string option;
    Description : string option;
  }
  //#endregion
