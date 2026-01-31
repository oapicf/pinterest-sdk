namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BoardPrivacy
open OpenAPI.Model.string option

module BoardCreate =

  //#region BoardCreate


  type BoardCreate = {
    Description : string option;
    IsAdsOnly : bool;
    Name : string;
    Privacy : BoardPrivacy;
  }
  //#endregion
