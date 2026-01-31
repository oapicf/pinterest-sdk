namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.decimal option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module CatalogsHotelGuestRatings =

  //#region CatalogsHotelGuestRatings

  [<CLIMutable>]
  type CatalogsHotelGuestRatings = {
    [<JsonProperty(PropertyName = "max_score")>]
    MaxScore : decimal option;
    [<JsonProperty(PropertyName = "number_of_reviewers")>]
    NumberOfReviewers : int option;
    [<JsonProperty(PropertyName = "rating_system")>]
    RatingSystem : string option;
    [<JsonProperty(PropertyName = "score")>]
    Score : decimal option;
  }

  //#endregion
