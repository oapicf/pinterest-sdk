namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module IntegrationRecord =

  //#region IntegrationRecord

  [<CLIMutable>]
  type IntegrationRecord = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "external_business_id")>]
    ExternalBusinessId : string option;
    [<JsonProperty(PropertyName = "connected_merchant_id")>]
    ConnectedMerchantId : string option;
    [<JsonProperty(PropertyName = "connected_user_id")>]
    ConnectedUserId : string;
    [<JsonProperty(PropertyName = "connected_advertiser_id")>]
    ConnectedAdvertiserId : string option;
    [<JsonProperty(PropertyName = "connected_lba_id")>]
    ConnectedLbaId : string option;
    [<JsonProperty(PropertyName = "connected_tag_id")>]
    ConnectedTagId : string option;
    [<JsonProperty(PropertyName = "partner_access_token")>]
    PartnerAccessToken : string option;
    [<JsonProperty(PropertyName = "partner_refresh_token")>]
    PartnerRefreshToken : string option;
    [<JsonProperty(PropertyName = "partner_primary_email")>]
    PartnerPrimaryEmail : string option;
    [<JsonProperty(PropertyName = "partner_access_token_expiry")>]
    PartnerAccessTokenExpiry : int option;
    [<JsonProperty(PropertyName = "partner_refresh_token_expiry")>]
    PartnerRefreshTokenExpiry : int option;
    [<JsonProperty(PropertyName = "scopes")>]
    Scopes : string option;
    [<JsonProperty(PropertyName = "partner_metadata")>]
    PartnerMetadata : string option;
    [<JsonProperty(PropertyName = "additional_id_1")>]
    AdditionalId1 : string option;
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : int;
    [<JsonProperty(PropertyName = "updated_time")>]
    UpdatedTime : int;
  }

  //#endregion
