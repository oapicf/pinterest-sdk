{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.AdAccountsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getAdAccountsByTextAnalyticsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextAnalyticsR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsR" $
        it "returns 501 Not Implemented" $ do
            get AdAccountsR
            statusIs 501

    describe "getAdAccountsByTextAdGroupsAnalyticsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextAdGroupsAnalyticsR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextAdGroupsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextAdGroupsR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextAdsAnalyticsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextAdsAnalyticsR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextAdsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextAdsR "adAccountId_example"
            statusIs 501

    describe "postAdAccountsByTextReportsR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextReportsR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextReportsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextReportsR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextCampaignsAnalyticsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextCampaignsAnalyticsR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextCampaignsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextCampaignsR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextProductGroupsAnalyticsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextProductGroupsAnalyticsR "adAccountId_example"
            statusIs 501
