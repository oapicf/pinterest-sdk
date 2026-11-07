{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.AdGroupsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getAdAccountsByTextAdGroupsAnalyticsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextAdGroupsAnalyticsR "adAccountId_example"
            statusIs 501

    describe "postAdAccountsByTextAdGroupsAudienceSizingR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextAdGroupsAudienceSizingR "adAccountId_example"
            statusIs 501

    describe "postAdAccountsByTextAdGroupsR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextAdGroupsR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextAdGroupsByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextAdGroupsByTextR "adGroupId_example" "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextAdGroupsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextAdGroupsR "adAccountId_example"
            statusIs 501

    describe "patchAdAccountsByTextAdGroupsR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ AdAccountsByTextAdGroupsR "adAccountId_example"
            statusIs 501

    describe "postAdAccountsByTextBidFloorR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextBidFloorR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextAdGroupsByTextDynamicTitlesCsvR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextAdGroupsByTextDynamicTitlesCsvR "adAccountId_example" "adGroupId_example"
            statusIs 501

    describe "getAdAccountsByTextAdGroupsByTextDynamicTitlesStatusR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextAdGroupsByTextDynamicTitlesStatusR "adAccountId_example" "adGroupId_example"
            statusIs 501

    describe "getAdAccountsByTextAdGroupsByTextDynamicTitlesUploadsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextAdGroupsByTextDynamicTitlesUploadsR "adAccountId_example" "adGroupId_example"
            statusIs 501

    describe "postAdAccountsByTextAdGroupsByTextDynamicTitlesR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextAdGroupsByTextDynamicTitlesR "adAccountId_example" "adGroupId_example"
            statusIs 501

    describe "getAdAccountsByTextAdGroupsTargetingAnalyticsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextAdGroupsTargetingAnalyticsR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextPromotionAppliedEntitiesR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextPromotionAppliedEntitiesR "adAccountId_example"
            statusIs 501
