namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BoardUpdatePrivacy
open OpenAPI.Model.string option

module BoardWithUpdatePrivacyUpdate =

  //#region BoardWithUpdatePrivacyUpdate

  [<CLIMutable>]
  type BoardWithUpdatePrivacyUpdate = {
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "privacy")>]
    Privacy : BoardUpdatePrivacy;
  }

  //#endregion
