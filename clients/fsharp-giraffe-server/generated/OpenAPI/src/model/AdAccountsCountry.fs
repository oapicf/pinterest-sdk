namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Country

module AdAccountsCountry =

  //#region AdAccountsCountry


  type AdAccountsCountry = {
    Code : Country;
    Currency : string;
    Index : decimal;
    Name : string;
  }
  //#endregion
