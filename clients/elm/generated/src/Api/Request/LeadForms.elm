{-
   Pinterest REST API
   Pinterest's REST API

   The version of the OpenAPI document: 5.12.0
   Contact: blah+oapicf@cliffano.com

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git

   DO NOT EDIT THIS FILE MANUALLY.

   For more info on generating Elm code, see https://eriktim.github.io/openapi-elm/
-}


module Api.Request.LeadForms exposing
    ( leadFormGet
    , leadFormTestCreate
    , leadFormsList, Order_(..), orderVariants
    )

import Api
import Api.Data exposing (..)
import Dict
import Http
import Json.Decode
import Json.Encode


type Order_
    = Order_ASCENDING
    | Order_DESCENDING


orderVariants : List Order_
orderVariants =
    [ Order_ASCENDING
    , Order_DESCENDING
    ]


stringFromOrder_ : Order_ -> String
stringFromOrder_ model =
    case model of
        Order_ASCENDING ->
            "ASCENDING"

        Order_DESCENDING ->
            "DESCENDING"



{-| Gets a lead form given it's ID. It must also be associated with the provided ad account ID. Retrieving an advertiser's lead form will only contain results if you're a part of the Lead ads beta. If you're interested in joining the beta, please reach out to your Pinterest account manager.
-}
leadFormGet : String -> String -> Api.Request Api.Data.LeadFormResponse
leadFormGet adAccountId_path leadFormId_path =
    Api.request
        "GET"
        "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}"
        [ ( "adAccountId", identity adAccountId_path ), ( "leadFormId", identity leadFormId_path ) ]
        []
        []
        Nothing
        Api.Data.leadFormResponseDecoder


{-| Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
-}
leadFormTestCreate : String -> String -> Api.Data.LeadFormTestRequest -> Api.Request Api.Data.LeadFormTestResponse
leadFormTestCreate adAccountId_path leadFormId_path leadFormTestRequest_body =
    Api.request
        "POST"
        "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test"
        [ ( "adAccountId", identity adAccountId_path ), ( "leadFormId", identity leadFormId_path ) ]
        []
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeLeadFormTestRequest leadFormTestRequest_body)))
        Api.Data.leadFormTestResponseDecoder


{-| Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser's list of lead forms will only contain results if you're a part of the Lead ads beta.  If you're interested in joining the beta, please reach out to your Pinterest account manager.
-}
leadFormsList : String -> Maybe Int -> Maybe Order_ -> Maybe String -> Api.Request Api.Data.LeadFormsList200Response
leadFormsList adAccountId_path pageSize_query order_query bookmark_query =
    Api.request
        "GET"
        "/ad_accounts/{ad_account_id}/lead_forms"
        [ ( "adAccountId", identity adAccountId_path ) ]
        [ ( "page_size", Maybe.map String.fromInt pageSize_query ), ( "order", Maybe.map stringFromOrder_ order_query ), ( "bookmark", Maybe.map identity bookmark_query ) ]
        []
        Nothing
        Api.Data.leadFormsList200ResponseDecoder
