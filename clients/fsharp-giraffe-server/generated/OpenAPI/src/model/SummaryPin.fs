namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PinMedia
open OpenAPI.Model.string option

module SummaryPin =

  //#region SummaryPin


  type SummaryPin = {
    AltText : string option;
    Description : string option;
    Id : string;
    Link : string option;
    Media : PinMedia;
    Title : string option;
  }
  //#endregion
