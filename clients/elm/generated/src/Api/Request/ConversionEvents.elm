{-
   Pinterest REST API
   Pinterest's REST API

   The version of the OpenAPI document: 5.14.0
   Contact: blah+oapicf@cliffano.com

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git

   DO NOT EDIT THIS FILE MANUALLY.

   For more info on generating Elm code, see https://eriktim.github.io/openapi-elm/
-}


module Api.Request.ConversionEvents exposing
    ( eventsCreate
    )

import Api
import Api.Data exposing (..)
import Dict
import Http
import Json.Decode
import Json.Encode

{-| The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their <code>ad_account_id</code>. The request body should be a JSON object. - This endpoint requires an <code>access_token</code> be generated through Ads Manager. Review the <a href=\"/docs/api-features/conversion-overview/\">Conversions Guide</a> for more details. (Note that the authorization header required is <code>Authorization: Bearer &lt;access_token&gt;</code>). - The token's <code>user_account</code> must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)
-}
eventsCreate : String -> Maybe Bool -> Api.Data.ConversionEvents -> String -> Api.Request Api.Data.ConversionApiResponse
eventsCreate adAccountId_path test_query conversionEvents_body auth_token =
    Api.request
        "POST"
        "/ad_accounts/{ad_account_id}/events"
        [ ( "adAccountId", identity adAccountId_path ) ]
        [ ( "test", Maybe.map (\val -> if val then "true" else "false") test_query ) ]
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeConversionEvents conversionEvents_body)))
        Api.Data.conversionApiResponseDecoder
        |> Api.withBearerToken auth_token
