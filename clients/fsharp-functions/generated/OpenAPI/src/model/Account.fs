namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module Account =

  //#region Account

  [<CLIMutable>]
  type Account = {
    [<JsonProperty(PropertyName = "account_type")>]
    AccountType : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "profile_image")>]
    ProfileImage : string;
    [<JsonProperty(PropertyName = "website_url")>]
    WebsiteUrl : string;
    [<JsonProperty(PropertyName = "username")>]
    Username : string;
    [<JsonProperty(PropertyName = "about")>]
    About : string;
    [<JsonProperty(PropertyName = "business_name")>]
    BusinessName : string option;
    [<JsonProperty(PropertyName = "board_count")>]
    BoardCount : int option;
    [<JsonProperty(PropertyName = "pin_count")>]
    PinCount : int option;
    [<JsonProperty(PropertyName = "follower_count")>]
    FollowerCount : int option;
    [<JsonProperty(PropertyName = "following_count")>]
    FollowingCount : int option;
    [<JsonProperty(PropertyName = "monthly_views")>]
    MonthlyViews : int option;
  }

  //#endregion
