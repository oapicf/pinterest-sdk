{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.BusinessAccessAssetsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postBusinessesByTextAssetGroupsR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByTextAssetGroupsR "businessId_example"
            statusIs 501

    describe "deleteBusinessesByTextAssetGroupsR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ BusinessesByTextAssetGroupsR "businessId_example"
            statusIs 501

    describe "patchBusinessesByTextAssetGroupsR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ BusinessesByTextAssetGroupsR "businessId_example"
            statusIs 501

    describe "getBusinessesByTextAssetsByTextMembersR" $
        it "returns 501 Not Implemented" $ do
            get $ BusinessesByTextAssetsByTextMembersR "businessId_example" "assetId_example"
            statusIs 501

    describe "getBusinessesByTextAssetsByTextPartnersR" $
        it "returns 501 Not Implemented" $ do
            get $ BusinessesByTextAssetsByTextPartnersR "businessId_example" "assetId_example"
            statusIs 501

    describe "getBusinessesByTextAssetsR" $
        it "returns 501 Not Implemented" $ do
            get $ BusinessesByTextAssetsR "businessId_example"
            statusIs 501

    describe "getBusinessesByTextMembersByTextAssetsR" $
        it "returns 501 Not Implemented" $ do
            get $ BusinessesByTextMembersByTextAssetsR "businessId_example" "memberId_example"
            statusIs 501

    describe "deleteBusinessesByTextMembersAssetsAccessR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ BusinessesByTextMembersAssetsAccessR "businessId_example"
            statusIs 501

    describe "patchBusinessesByTextMembersAssetsAccessR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ BusinessesByTextMembersAssetsAccessR "businessId_example"
            statusIs 501

    describe "getBusinessesByTextPartnersByTextAssetsR" $
        it "returns 501 Not Implemented" $ do
            get $ BusinessesByTextPartnersByTextAssetsR "businessId_example" "partnerId_example"
            statusIs 501

    describe "deleteBusinessesByTextPartnersAssetsR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ BusinessesByTextPartnersAssetsR "businessId_example"
            statusIs 501

    describe "patchBusinessesByTextPartnersAssetsR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ BusinessesByTextPartnersAssetsR "businessId_example"
            statusIs 501
