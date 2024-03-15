namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BoardMedia
open OpenAPI.Model.BoardOwner
open OpenAPI.Model.string option

module Board =

  //#region Board

  [<CLIMutable>]
  type Board = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "board_pins_modified_at")>]
    BoardPinsModifiedAt : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "collaborator_count")>]
    CollaboratorCount : int;
    [<JsonProperty(PropertyName = "pin_count")>]
    PinCount : int;
    [<JsonProperty(PropertyName = "follower_count")>]
    FollowerCount : int;
    [<JsonProperty(PropertyName = "media")>]
    Media : BoardMedia;
    [<JsonProperty(PropertyName = "owner")>]
    Owner : BoardOwner;
    [<JsonProperty(PropertyName = "privacy")>]
    Privacy : string;
  }

  //#endregion
