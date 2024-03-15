{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.CampaignsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getAdAccountsByTextCampaignsTargetingAnalyticsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextCampaignsTargetingAnalyticsR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextCampaignsAnalyticsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextCampaignsAnalyticsR "adAccountId_example"
            statusIs 501

    describe "postAdAccountsByTextCampaignsR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextCampaignsR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextCampaignsByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextCampaignsByTextR "adAccountId_example" "campaignId_example"
            statusIs 501

    describe "getAdAccountsByTextCampaignsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextCampaignsR "adAccountId_example"
            statusIs 501

    describe "patchAdAccountsByTextCampaignsR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ AdAccountsByTextCampaignsR "adAccountId_example"
            statusIs 501
