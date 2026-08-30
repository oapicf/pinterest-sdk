namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BrandAccountProfileImageUpdate
open OpenAPI.Model.Country

module BrandAccountUpdate =

  //#region BrandAccountUpdate

  [<CLIMutable>]
  type BrandAccountUpdate = {
    [<JsonProperty(PropertyName = "about")>]
    About : string;
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "profile_image")>]
    ProfileImage : BrandAccountProfileImageUpdate;
    [<JsonProperty(PropertyName = "username")>]
    Username : string;
    [<JsonProperty(PropertyName = "website")>]
    Website : string;
  }

  //#endregion
