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


module Api.Request.BusinessAccessAssets exposing
    ( assetGroupCreate
    , assetGroupDelete
    , assetGroupUpdate
    , businessAssetMembersGet
    , businessAssetPartnersGet
    , businessAssetsGet, AssetType(..), assetTypeVariants
    , businessMemberAssetsGet, AssetType(..), assetTypeVariants
    , businessMembersAssetAccessDelete
    , businessMembersAssetAccessUpdate
    , businessPartnerAssetAccessGet, AssetType(..), assetTypeVariants
    , deletePartnerAssetAccessHandlerImpl
    , updatePartnerAssetAccessHandlerImpl
    )

import Api
import Api.Data exposing (..)
import Dict
import Http
import Json.Decode
import Json.Encode


type AssetType
    = AssetTypeADACCOUNT
    | AssetTypePROFILE
    | AssetTypeASSETGROUP


assetTypeVariants : List AssetType
assetTypeVariants =
    [ AssetTypeADACCOUNT
    , AssetTypePROFILE
    , AssetTypeASSETGROUP
    ]


stringFromAssetType : AssetType -> String
stringFromAssetType model =
    case model of
        AssetTypeADACCOUNT ->
            "AD_ACCOUNT"

        AssetTypePROFILE ->
            "PROFILE"

        AssetTypeASSETGROUP ->
            "ASSET_GROUP"




type AssetType
    = AssetTypeADACCOUNT
    | AssetTypePROFILE
    | AssetTypeASSETGROUP


assetTypeVariants : List AssetType
assetTypeVariants =
    [ AssetTypeADACCOUNT
    , AssetTypePROFILE
    , AssetTypeASSETGROUP
    ]


stringFromAssetType : AssetType -> String
stringFromAssetType model =
    case model of
        AssetTypeADACCOUNT ->
            "AD_ACCOUNT"

        AssetTypePROFILE ->
            "PROFILE"

        AssetTypeASSETGROUP ->
            "ASSET_GROUP"




type AssetType
    = AssetTypeADACCOUNT
    | AssetTypePROFILE
    | AssetTypeASSETGROUP


assetTypeVariants : List AssetType
assetTypeVariants =
    [ AssetTypeADACCOUNT
    , AssetTypePROFILE
    , AssetTypeASSETGROUP
    ]


stringFromAssetType : AssetType -> String
stringFromAssetType model =
    case model of
        AssetTypeADACCOUNT ->
            "AD_ACCOUNT"

        AssetTypePROFILE ->
            "PROFILE"

        AssetTypeASSETGROUP ->
            "ASSET_GROUP"



{-| Create a new asset group with the specified parameters. - An <a href=\"https://help.pinterest.com/en/business/article/asset-groups\">asset group</a> is a custom group of assets based on how you’d like to manage your accounts.
-}
assetGroupCreate : String -> Api.Data.CreateAssetGroupBody -> Api.Request Api.Data.CreateAssetGroupResponse
assetGroupCreate businessId_path createAssetGroupBody_body =
    Api.request
        "POST"
        "/businesses/{business_id}/asset_groups"
        [ ( "businessId", identity businessId_path ) ]
        []
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeCreateAssetGroupBody createAssetGroupBody_body)))
        Api.Data.createAssetGroupResponseDecoder


{-| Delete a batch of asset groups.
-}
assetGroupDelete : String -> Api.Data.DeleteAssetGroupBody -> Api.Request Api.Data.DeleteAssetGroupResponse
assetGroupDelete businessId_path deleteAssetGroupBody_body =
    Api.request
        "DELETE"
        "/businesses/{business_id}/asset_groups"
        [ ( "businessId", identity businessId_path ) ]
        []
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeDeleteAssetGroupBody deleteAssetGroupBody_body)))
        Api.Data.deleteAssetGroupResponseDecoder


{-| Update a batch of asset groups with the specified parameters.
-}
assetGroupUpdate : String -> Api.Data.UpdateAssetGroupBody -> Api.Request Api.Data.UpdateAssetGroupResponse
assetGroupUpdate businessId_path updateAssetGroupBody_body =
    Api.request
        "PATCH"
        "/businesses/{business_id}/asset_groups"
        [ ( "businessId", identity businessId_path ) ]
        []
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeUpdateAssetGroupBody updateAssetGroupBody_body)))
        Api.Data.updateAssetGroupResponseDecoder


{-| Get all the members the requesting business has granted access to on the given asset.
-}
businessAssetMembersGet : String -> String -> Maybe String -> Maybe Int -> Maybe Int -> Api.Request Api.Data.BusinessAssetMembersGet200Response
businessAssetMembersGet businessId_path assetId_path bookmark_query pageSize_query startIndex_query =
    Api.request
        "GET"
        "/businesses/{business_id}/assets/{asset_id}/members"
        [ ( "businessId", identity businessId_path ), ( "assetId", identity assetId_path ) ]
        [ ( "bookmark", Maybe.map identity bookmark_query ), ( "page_size", Maybe.map String.fromInt pageSize_query ), ( "start_index", Maybe.map String.fromInt startIndex_query ) ]
        []
        Nothing
        Api.Data.businessAssetMembersGet200ResponseDecoder


{-| Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
-}
businessAssetPartnersGet : String -> String -> Maybe Int -> Maybe String -> Maybe Int -> Api.Request Api.Data.BusinessAssetPartnersGet200Response
businessAssetPartnersGet businessId_path assetId_path startIndex_query bookmark_query pageSize_query =
    Api.request
        "GET"
        "/businesses/{business_id}/assets/{asset_id}/partners"
        [ ( "businessId", identity businessId_path ), ( "assetId", identity assetId_path ) ]
        [ ( "start_index", Maybe.map String.fromInt startIndex_query ), ( "bookmark", Maybe.map identity bookmark_query ), ( "page_size", Maybe.map String.fromInt pageSize_query ) ]
        []
        Nothing
        Api.Data.businessAssetPartnersGet200ResponseDecoder


{-| Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
-}
businessAssetsGet : String -> Maybe (List PermissionsWithOwner) -> Maybe String -> Maybe String -> Maybe AssetType -> Maybe Int -> Maybe String -> Maybe Int -> Api.Request Api.Data.BusinessAssetsGet200Response
businessAssetsGet businessId_path permissions_query childAssetId_query assetGroupId_query assetType_query startIndex_query bookmark_query pageSize_query =
    Api.request
        "GET"
        "/businesses/{business_id}/assets"
        [ ( "businessId", identity businessId_path ) ]
        [ ( "permissions", Maybe.map (String.join "," << List.map Api.Data.stringFromPermissionsWithOwner) permissions_query ), ( "child_asset_id", Maybe.map identity childAssetId_query ), ( "asset_group_id", Maybe.map identity assetGroupId_query ), ( "asset_type", Maybe.map stringFromAssetType assetType_query ), ( "start_index", Maybe.map String.fromInt startIndex_query ), ( "bookmark", Maybe.map identity bookmark_query ), ( "page_size", Maybe.map String.fromInt pageSize_query ) ]
        []
        Nothing
        Api.Data.businessAssetsGet200ResponseDecoder


{-| Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.
-}
businessMemberAssetsGet : String -> String -> Maybe AssetType -> Maybe Int -> Maybe String -> Maybe Int -> Api.Request Api.Data.BusinessMemberAssetsGet200Response
businessMemberAssetsGet businessId_path memberId_path assetType_query startIndex_query bookmark_query pageSize_query =
    Api.request
        "GET"
        "/businesses/{business_id}/members/{member_id}/assets"
        [ ( "businessId", identity businessId_path ), ( "memberId", identity memberId_path ) ]
        [ ( "asset_type", Maybe.map stringFromAssetType assetType_query ), ( "start_index", Maybe.map String.fromInt startIndex_query ), ( "bookmark", Maybe.map identity bookmark_query ), ( "page_size", Maybe.map String.fromInt pageSize_query ) ]
        []
        Nothing
        Api.Data.businessMemberAssetsGet200ResponseDecoder


{-| Terminate multiple members' access to an asset.
-}
businessMembersAssetAccessDelete : String -> Api.Data.BusinessMembersAssetAccessDeleteRequest -> Api.Request Api.Data.DeleteMemberAccessResultsResponseArray
businessMembersAssetAccessDelete businessId_path businessMembersAssetAccessDeleteRequest_body =
    Api.request
        "DELETE"
        "/businesses/{business_id}/members/assets/access"
        [ ( "businessId", identity businessId_path ) ]
        []
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeBusinessMembersAssetAccessDeleteRequest businessMembersAssetAccessDeleteRequest_body)))
        Api.Data.deleteMemberAccessResultsResponseArrayDecoder


{-| Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 
-}
businessMembersAssetAccessUpdate : String -> Api.Data.UpdateMemberAssetAccessBody -> Api.Request Api.Data.UpdateMemberAssetsResultsResponseArray
businessMembersAssetAccessUpdate businessId_path updateMemberAssetAccessBody_body =
    Api.request
        "PATCH"
        "/businesses/{business_id}/members/assets/access"
        [ ( "businessId", identity businessId_path ) ]
        []
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeUpdateMemberAssetAccessBody updateMemberAssetAccessBody_body)))
        Api.Data.updateMemberAssetsResultsResponseArrayDecoder


{-| Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.
-}
businessPartnerAssetAccessGet : String -> String -> Maybe Api.Data.Api.Data.PartnerType -> Maybe AssetType -> Maybe Int -> Maybe Int -> Maybe String -> Api.Request Api.Data.BusinessPartnerAssetAccessGet200Response
businessPartnerAssetAccessGet businessId_path partnerId_path partnerType_query assetType_query startIndex_query pageSize_query bookmark_query =
    Api.request
        "GET"
        "/businesses/{business_id}/partners/{partner_id}/assets"
        [ ( "businessId", identity businessId_path ), ( "partnerId", identity partnerId_path ) ]
        [ ( "partner_type", Maybe.map  partnerType_query ), ( "asset_type", Maybe.map stringFromAssetType assetType_query ), ( "start_index", Maybe.map String.fromInt startIndex_query ), ( "page_size", Maybe.map String.fromInt pageSize_query ), ( "bookmark", Maybe.map identity bookmark_query ) ]
        []
        Nothing
        Api.Data.businessPartnerAssetAccessGet200ResponseDecoder


{-| Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.
-}
deletePartnerAssetAccessHandlerImpl : String -> Api.Data.DeletePartnerAssetAccessBody -> Api.Request Api.Data.DeletePartnerAssetsResultsResponseArray
deletePartnerAssetAccessHandlerImpl businessId_path deletePartnerAssetAccessBody_body =
    Api.request
        "DELETE"
        "/businesses/{business_id}/partners/assets"
        [ ( "businessId", identity businessId_path ) ]
        []
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeDeletePartnerAssetAccessBody deletePartnerAssetAccessBody_body)))
        Api.Data.deletePartnerAssetsResultsResponseArrayDecoder


{-| Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
-}
updatePartnerAssetAccessHandlerImpl : String -> Api.Data.UpdatePartnerAssetAccessBody -> Api.Request Api.Data.UpdatePartnerAssetsResultsResponseArray
updatePartnerAssetAccessHandlerImpl businessId_path updatePartnerAssetAccessBody_body =
    Api.request
        "PATCH"
        "/businesses/{business_id}/partners/assets"
        [ ( "businessId", identity businessId_path ) ]
        []
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeUpdatePartnerAssetAccessBody updatePartnerAssetAccessBody_body)))
        Api.Data.updatePartnerAssetsResultsResponseArrayDecoder

