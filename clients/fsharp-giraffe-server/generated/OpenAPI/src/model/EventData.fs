namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Currency
open OpenAPI.Model.LineItem

module EventData =

  //#region EventData


  type EventData = {
    Currency : Currency;
    LeadType : string;
    LineItems : LineItem;
    OrderId : string;
    OrderQuantity : int;
    PageName : string;
    PromoCode : string;
    Property : string;
    SearchQuery : string;
    Value : string;
    VideoTitle : string;
  }
  //#endregion
