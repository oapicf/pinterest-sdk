namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Country
open OpenAPI.Model.ImageBase64

module BrandAccountsUpdateRequest =

  //#region BrandAccountsUpdateRequest

  [<CLIMutable>]
  type BrandAccountsUpdateRequest = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "username")>]
    Username : string;
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "about")>]
    About : string;
    [<JsonProperty(PropertyName = "website")>]
    Website : string;
    [<JsonProperty(PropertyName = "profile_image")>]
    ProfileImage : ImageBase64;
  }

  //#endregion
