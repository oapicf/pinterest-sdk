namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module ConversionEventsUserDataProperties =

  //#region ConversionEventsUserDataProperties


  type ConversionEventsUserDataProperties = {
    ClickId : string option;
    ClientIpAddress : string;
    ClientUserAgent : string;
    Country : string[];
    Ct : string[];
    Db : string[];
    Em : string[];
    ExternalId : string[];
    Fn : string[];
    Ge : string[];
    HashedMaids : string[];
    Ln : string[];
    PartnerId : string option;
    Ph : string[];
    St : string[];
    Zp : string[];
  }
  //#endregion
