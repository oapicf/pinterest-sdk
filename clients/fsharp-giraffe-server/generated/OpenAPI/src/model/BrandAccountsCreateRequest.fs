namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Country
open OpenAPI.Model.ImageBase64

module BrandAccountsCreateRequest =

  //#region BrandAccountsCreateRequest


  type brand_accounts_create_request = {
    Name : string;
    Username : string;
    Country : Country;
    About : string;
    Website : string;
    ProfileImage : ImageBase64;
  }
  //#endregion
