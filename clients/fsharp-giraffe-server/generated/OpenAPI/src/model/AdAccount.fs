namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdAccountOwner
open OpenAPI.Model.Country
open OpenAPI.Model.Currency

module AdAccount =

  //#region AdAccount


  type AdAccount = {
    Id : string;
    Name : string;
    Owner : AdAccountOwner;
    Country : Country;
    Currency : Currency;
  }
  //#endregion
