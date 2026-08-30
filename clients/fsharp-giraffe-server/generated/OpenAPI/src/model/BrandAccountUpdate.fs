namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BrandAccountProfileImageUpdate
open OpenAPI.Model.Country

module BrandAccountUpdate =

  //#region BrandAccountUpdate


  type BrandAccountUpdate = {
    About : string;
    Country : Country;
    Name : string;
    ProfileImage : BrandAccountProfileImageUpdate;
    Username : string;
    Website : string;
  }
  //#endregion
