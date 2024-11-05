{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.BusinessAccessAssetsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postBusinessesByTextAssetGroupsR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByTextAssetGroupsR "729090764583391194"
            statusIs 501

    describe "deleteBusinessesByTextAssetGroupsR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ BusinessesByTextAssetGroupsR "729090764583391194"
            statusIs 501

    describe "patchBusinessesByTextAssetGroupsR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ BusinessesByTextAssetGroupsR "729090764583391194"
            statusIs 501

    describe "getBusinessesByTextAssetsByTextMembersR" $
        it "returns 501 Not Implemented" $ do
            get $ BusinessesByTextAssetsByTextMembersR "729090764583391194" "729090764583391194"
            statusIs 501

    describe "getBusinessesByTextAssetsByTextPartnersR" $
        it "returns 501 Not Implemented" $ do
            get $ BusinessesByTextAssetsByTextPartnersR "729090764583391194" "729090764583391194"
            statusIs 501

    describe "getBusinessesByTextAssetsR" $
        it "returns 501 Not Implemented" $ do
            get $ BusinessesByTextAssetsR "729090764583391194"
            statusIs 501

    describe "getBusinessesByTextMembersByTextAssetsR" $
        it "returns 501 Not Implemented" $ do
            get $ BusinessesByTextMembersByTextAssetsR "729090764583391194" "729090764583391194"
            statusIs 501

    describe "deleteBusinessesByTextMembersAssetsAccessR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ BusinessesByTextMembersAssetsAccessR "729090764583391194"
            statusIs 501

    describe "patchBusinessesByTextMembersAssetsAccessR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ BusinessesByTextMembersAssetsAccessR "729090764583391194"
            statusIs 501

    describe "getBusinessesByTextPartnersByTextAssetsR" $
        it "returns 501 Not Implemented" $ do
            get $ BusinessesByTextPartnersByTextAssetsR "729090764583391194" "729090764583391194"
            statusIs 501

    describe "deleteBusinessesByTextPartnersAssetsR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ BusinessesByTextPartnersAssetsR "729090764583391194"
            statusIs 501

    describe "patchBusinessesByTextPartnersAssetsR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ BusinessesByTextPartnersAssetsR "729090764583391194"
            statusIs 501
