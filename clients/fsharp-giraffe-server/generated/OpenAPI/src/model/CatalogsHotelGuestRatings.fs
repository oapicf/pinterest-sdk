namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.decimal option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module CatalogsHotelGuestRatings =

  //#region CatalogsHotelGuestRatings


  type CatalogsHotelGuestRatings = {
    MaxScore : decimal option;
    NumberOfReviewers : int option;
    RatingSystem : string option;
    Score : decimal option;
  }
  //#endregion
