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
    Id : string;
    Name : string;
    Owner : AdAccountOwner;
    Country : Country;
    Currency : Currency;
    Permissions : BusinessAccessRole[];
    CreatedTime : int option;
    UpdatedTime : int option;
  }
  //#endregion
