namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Country
open OpenAPI.Model.ImageBase64

module BrandAccountsUpdateRequest =

  //#region BrandAccountsUpdateRequest


  type brand_accounts_update_request = {
    Name : string;
    Username : string;
    Country : Country;
    About : string;
    Website : string;
    ProfileImage : ImageBase64;
  }
  //#endregion
