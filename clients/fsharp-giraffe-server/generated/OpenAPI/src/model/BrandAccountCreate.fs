namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BrandAccountProfileImage
open OpenAPI.Model.Country

module BrandAccountCreate =

  //#region BrandAccountCreate


  type BrandAccountCreate = {
    About : string;
    Country : Country;
    Name : string;
    ProfileImage : BrandAccountProfileImage;
    Username : string;
    Website : string;
  }
  //#endregion
