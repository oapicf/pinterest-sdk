namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BrandAccountProfileImage
open OpenAPI.Model.Country

module BrandAccountCreate =

  //#region BrandAccountCreate

  [<CLIMutable>]
  type BrandAccountCreate = {
    [<JsonProperty(PropertyName = "about")>]
    About : string;
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "profile_image")>]
    ProfileImage : BrandAccountProfileImage;
    [<JsonProperty(PropertyName = "username")>]
    Username : string;
    [<JsonProperty(PropertyName = "website")>]
    Website : string;
  }

  //#endregion
