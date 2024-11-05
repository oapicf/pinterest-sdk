namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PinMedia
open OpenAPI.Model.string option

module SummaryPin =

  //#region SummaryPin


  type SummaryPin = {
    Media : PinMedia;
    AltText : string option;
    Link : string option;
    Title : string option;
    Description : string option;
  }
  //#endregion
