namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Country

module AdAccountCreateRequest =

  //#region AdAccountCreateRequest

  [<CLIMutable>]
  type AdAccountCreateRequest = {
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "owner_user_id")>]
    OwnerUserId : string;
  }

  //#endregion
