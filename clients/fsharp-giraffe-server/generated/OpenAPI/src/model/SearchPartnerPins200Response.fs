namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.SummaryPin
open OpenAPI.Model.string option

module SearchPartnerPins200Response =

  //#region SearchPartnerPins200Response


  type search_partner_pins_200_response = {
    Items : SummaryPin[];
    Bookmark : string option;
  }
  //#endregion
