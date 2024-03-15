namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Country

module AdAccountCreateRequest =

  //#region AdAccountCreateRequest


  type AdAccountCreateRequest = {
    Country : Country;
    Name : string;
    OwnerUserId : string;
  }
  //#endregion
