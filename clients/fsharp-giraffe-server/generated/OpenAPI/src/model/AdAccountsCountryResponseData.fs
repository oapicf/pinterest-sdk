namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdCountry

module AdAccountsCountryResponseData =

  //#region AdAccountsCountryResponseData


  type AdAccountsCountryResponseData = {
    Code : AdCountry;
    Currency : string;
    Index : decimal;
    Name : string;
  }
  //#endregion
