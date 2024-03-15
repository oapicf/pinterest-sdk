namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module ConversionEventsUserData =

  //#region ConversionEventsUserData


  type ConversionEventsUserData = {
    Ph : string[];
    Ge : string[];
    Db : string[];
    Ln : string[];
    Fn : string[];
    Ct : string[];
    St : string[];
    Zp : string[];
    Country : string[];
    ExternalId : string[];
    ClickId : string option;
    PartnerId : string option;
  }
  //#endregion
