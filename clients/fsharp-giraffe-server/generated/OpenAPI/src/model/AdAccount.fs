namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdAccountOwner
open OpenAPI.Model.BusinessAccessRole
open OpenAPI.Model.Country
open OpenAPI.Model.Currency
open OpenAPI.Model.int option

module AdAccount =

  //#region AdAccount


  type AdAccount = {
    Country : Country;
    CreatedTime : int option;
    Currency : Currency;
    Id : string;
    Name : string;
    Owner : AdAccountOwner;
    Permissions : BusinessAccessRole[];
    TimeZone : string;
    UpdatedTime : int option;
  }
  //#endregion
