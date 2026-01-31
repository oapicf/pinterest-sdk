namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BoardMedia
open OpenAPI.Model.BoardOwner
open OpenAPI.Model.BoardUpdatePrivacy
open OpenAPI.Model.string option

module BoardWithUpdatePrivacy =

  //#region BoardWithUpdatePrivacy

  [<CLIMutable>]
  type BoardWithUpdatePrivacy = {
    [<JsonProperty(PropertyName = "board_pins_modified_at")>]
    BoardPinsModifiedAt : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "collaborator_count")>]
    CollaboratorCount : int;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "follower_count")>]
    FollowerCount : int;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "is_ads_only")>]
    IsAdsOnly : bool;
    [<JsonProperty(PropertyName = "media")>]
    Media : BoardMedia;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "owner")>]
    Owner : BoardOwner;
    [<JsonProperty(PropertyName = "pin_count")>]
    PinCount : int;
    [<JsonProperty(PropertyName = "privacy")>]
    Privacy : BoardUpdatePrivacy;
  }

  //#endregion
