namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Country
open OpenAPI.Model.Currency

module AdAccountCreate =

  //#region AdAccountCreate


  type AdAccountCreate = {
    Country : Country;
    Currency : Currency;
    Name : string;
    OwnerUserId : string;
  }
  //#endregion
