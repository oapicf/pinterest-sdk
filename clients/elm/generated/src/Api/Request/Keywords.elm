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


module Api.Request.Keywords exposing
    ( countryKeywordsMetricsGet
    , keywordsCreate
    , keywordsGet
    , keywordsUpdate
    , trendingKeywordsList, Interests(..), interestsVariants, Genders(..), gendersVariants, Ages(..), agesVariants
    )

import Api
import Api.Data exposing (..)
import Dict
import Http
import Json.Decode
import Json.Encode


type Interests
    = InterestsAnimals
    | InterestsArchitecture
    | InterestsArt
    | InterestsBeauty
    | InterestsChildrensFashion
    | InterestsDesign
    | InterestsDiyAndCrafts
    | InterestsEducation
    | InterestsElectronics
    | InterestsEntertainment
    | InterestsEventPlanning
    | InterestsFinance
    | InterestsFoodAndDrinks
    | InterestsGardening
    | InterestsHealth
    | InterestsHomeDecor
    | InterestsMensFashion
    | InterestsParenting
    | InterestsQuotes
    | InterestsSport
    | InterestsTravel
    | InterestsVehicles
    | InterestsWedding
    | InterestsWomensFashion


interestsVariants : List Interests
interestsVariants =
    [ InterestsAnimals
    , InterestsArchitecture
    , InterestsArt
    , InterestsBeauty
    , InterestsChildrensFashion
    , InterestsDesign
    , InterestsDiyAndCrafts
    , InterestsEducation
    , InterestsElectronics
    , InterestsEntertainment
    , InterestsEventPlanning
    , InterestsFinance
    , InterestsFoodAndDrinks
    , InterestsGardening
    , InterestsHealth
    , InterestsHomeDecor
    , InterestsMensFashion
    , InterestsParenting
    , InterestsQuotes
    , InterestsSport
    , InterestsTravel
    , InterestsVehicles
    , InterestsWedding
    , InterestsWomensFashion
    ]


stringFromInterests : Interests -> String
stringFromInterests model =
    case model of
        InterestsAnimals ->
            "animals"

        InterestsArchitecture ->
            "architecture"

        InterestsArt ->
            "art"

        InterestsBeauty ->
            "beauty"

        InterestsChildrensFashion ->
            "childrens_fashion"

        InterestsDesign ->
            "design"

        InterestsDiyAndCrafts ->
            "diy_and_crafts"

        InterestsEducation ->
            "education"

        InterestsElectronics ->
            "electronics"

        InterestsEntertainment ->
            "entertainment"

        InterestsEventPlanning ->
            "event_planning"

        InterestsFinance ->
            "finance"

        InterestsFoodAndDrinks ->
            "food_and_drinks"

        InterestsGardening ->
            "gardening"

        InterestsHealth ->
            "health"

        InterestsHomeDecor ->
            "home_decor"

        InterestsMensFashion ->
            "mens_fashion"

        InterestsParenting ->
            "parenting"

        InterestsQuotes ->
            "quotes"

        InterestsSport ->
            "sport"

        InterestsTravel ->
            "travel"

        InterestsVehicles ->
            "vehicles"

        InterestsWedding ->
            "wedding"

        InterestsWomensFashion ->
            "womens_fashion"




type Genders
    = GendersFemale
    | GendersMale
    | GendersUnknown


gendersVariants : List Genders
gendersVariants =
    [ GendersFemale
    , GendersMale
    , GendersUnknown
    ]


stringFromGenders : Genders -> String
stringFromGenders model =
    case model of
        GendersFemale ->
            "female"

        GendersMale ->
            "male"

        GendersUnknown ->
            "unknown"




type Ages
    = Ages1824
    | Ages2534
    | Ages3544
    | Ages4549
    | Ages5054
    | Ages5564
    | Ages65+


agesVariants : List Ages
agesVariants =
    [ Ages1824
    , Ages2534
    , Ages3544
    , Ages4549
    , Ages5054
    , Ages5564
    , Ages65+
    ]


stringFromAges : Ages -> String
stringFromAges model =
    case model of
        Ages1824 ->
            "18-24"

        Ages2534 ->
            "25-34"

        Ages3544 ->
            "35-44"

        Ages4549 ->
            "45-49"

        Ages5054 ->
            "50-54"

        Ages5564 ->
            "55-64"

        Ages65+ ->
            "65+"



{-| See keyword metrics for a specified country, aggregated across all of Pinterest. (Definitions are available from the \"Get delivery metrics definitions\" <a href=\"/docs/api/v5/#operation/delivery_metrics/get\">API endpoint</a>).
-}
countryKeywordsMetricsGet : String -> String -> List String -> Api.Request Api.Data.KeywordsMetricsArrayResponse
countryKeywordsMetricsGet adAccountId_path countryCode_query keywords_query =
    Api.request
        "GET"
        "/ad_accounts/{ad_account_id}/keywords/metrics"
        [ ( "adAccountId", identity adAccountId_path ) ]
        [ ( "country_code", Just <| identity countryCode_query ), ( "keywords", Just <| (String.join "," << List.map identity) keywords_query ) ]
        []
        Nothing
        Api.Data.keywordsMetricsArrayResponseDecoder


{-| <p>Create keywords for following entity types(advertiser, campaign, ad group or ad).</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a  target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul> <p><b>Rate limit</b>: <a href=\"/docs/redoc/#tag/Rate-Limits\">WRITE</a>.</p>
-}
keywordsCreate : String -> Api.Data.KeywordsRequest -> Api.Request Api.Data.KeywordsResponse
keywordsCreate adAccountId_path keywordsRequest_body =
    Api.request
        "POST"
        "/ad_accounts/{ad_account_id}/keywords"
        [ ( "adAccountId", identity adAccountId_path ) ]
        []
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeKeywordsRequest keywordsRequest_body)))
        Api.Data.keywordsResponseDecoder


{-| <p>Get a list of keywords based on the filters provided. If no filter is provided, it will default to the ad_account_id filter, which means it will only return keywords that specifically have parent_id set to the ad_account_id. Note: Keywords can have ad_account_ids, campaign_ids, and ad_group_ids set as their parent_ids. Keywords created through Ads Manager will have their parent_id set to an ad_group_id, not ad_account_id.</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul>
-}
keywordsGet : String -> Maybe String -> Maybe String -> Maybe (List MatchType) -> Maybe Int -> Maybe String -> Api.Request Api.Data.KeywordsGet200Response
keywordsGet adAccountId_path campaignId_query adGroupId_query matchTypes_query pageSize_query bookmark_query =
    Api.request
        "GET"
        "/ad_accounts/{ad_account_id}/keywords"
        [ ( "adAccountId", identity adAccountId_path ) ]
        [ ( "campaign_id", Maybe.map identity campaignId_query ), ( "ad_group_id", Maybe.map identity adGroupId_query ), ( "match_types", Maybe.map (String.join "," << List.map Api.Data.stringFromMatchType) matchTypes_query ), ( "page_size", Maybe.map String.fromInt pageSize_query ), ( "bookmark", Maybe.map identity bookmark_query ) ]
        []
        Nothing
        Api.Data.keywordsGet200ResponseDecoder


{-| <p>Update one or more keywords' bid and archived fields.</p> <p>Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity's keywords list.</p>
-}
keywordsUpdate : String -> Api.Data.KeywordUpdateBody -> Api.Request Api.Data.KeywordsResponse
keywordsUpdate adAccountId_path keywordUpdateBody_body =
    Api.request
        "PATCH"
        "/ad_accounts/{ad_account_id}/keywords"
        [ ( "adAccountId", identity adAccountId_path ) ]
        []
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeKeywordUpdateBody keywordUpdateBody_body)))
        Api.Data.keywordsResponseDecoder


{-| <p>Get the top trending search keywords among the Pinterest user audience.</p> <p>Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.</p> <p>Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.</p> <p>For an interactive way to explore this data, please visit <a href=\"https://trends.pinterest.com\">trends.pinterest.com</a>.
-}
trendingKeywordsList : TrendsSupportedRegion -> TrendType -> Maybe (List Interests) -> Maybe (List Genders) -> Maybe (List Ages) -> Maybe Bool -> Maybe Int -> Api.Request Api.Data.TrendingKeywordsResponse
trendingKeywordsList region_path trendType_path interests_query genders_query ages_query normalizeAgainstGroup_query limit_query =
    Api.request
        "GET"
        "/trends/keywords/{region}/top/{trend_type}"
        [ ( "region", Api.Data.stringFromTrendsSupportedRegion region_path ), ( "trendType", Api.Data.stringFromTrendType trendType_path ) ]
        [ ( "interests", Maybe.map (String.join "," << List.map stringFromInterests) interests_query ), ( "genders", Maybe.map (String.join "," << List.map stringFromGenders) genders_query ), ( "ages", Maybe.map (String.join "," << List.map stringFromAges) ages_query ), ( "normalize_against_group", Maybe.map (\val -> if val then "true" else "false") normalizeAgainstGroup_query ), ( "limit", Maybe.map String.fromInt limit_query ) ]
        []
        Nothing
        Api.Data.trendingKeywordsResponseDecoder
