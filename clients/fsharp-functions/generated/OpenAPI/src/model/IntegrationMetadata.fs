namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module IntegrationMetadata =

  //#region IntegrationMetadata

  [<CLIMutable>]
  type IntegrationMetadata = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "external_business_id")>]
    ExternalBusinessId : string;
    [<JsonProperty(PropertyName = "connected_merchant_id")>]
    ConnectedMerchantId : string;
    [<JsonProperty(PropertyName = "connected_user_id")>]
    ConnectedUserId : string;
    [<JsonProperty(PropertyName = "connected_advertiser_id")>]
    ConnectedAdvertiserId : string;
    [<JsonProperty(PropertyName = "connected_lba_id")>]
    ConnectedLbaId : string;
    [<JsonProperty(PropertyName = "connected_tag_id")>]
    ConnectedTagId : string;
    [<JsonProperty(PropertyName = "partner_access_token_expiry")>]
    PartnerAccessTokenExpiry : decimal;
    [<JsonProperty(PropertyName = "partner_refresh_token_expiry")>]
    PartnerRefreshTokenExpiry : decimal;
    [<JsonProperty(PropertyName = "scopes")>]
    Scopes : string;
    [<JsonProperty(PropertyName = "created_timestamp")>]
    CreatedTimestamp : decimal;
    [<JsonProperty(PropertyName = "updated_timestamp")>]
    UpdatedTimestamp : decimal;
    [<JsonProperty(PropertyName = "additional_id_1")>]
    AdditionalId1 : string;
    [<JsonProperty(PropertyName = "partner_metadata")>]
    PartnerMetadata : string;
  }

  //#endregion
