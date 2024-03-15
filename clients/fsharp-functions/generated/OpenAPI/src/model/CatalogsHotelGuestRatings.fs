namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsHotelGuestRatings =

  //#region CatalogsHotelGuestRatings

  [<CLIMutable>]
  type CatalogsHotelGuestRatings = {
    [<JsonProperty(PropertyName = "score")>]
    Score : decimal;
    [<JsonProperty(PropertyName = "number_of_reviewers")>]
    NumberOfReviewers : int;
    [<JsonProperty(PropertyName = "max_score")>]
    MaxScore : decimal;
    [<JsonProperty(PropertyName = "rating_system")>]
    RatingSystem : string;
  }

  //#endregion
