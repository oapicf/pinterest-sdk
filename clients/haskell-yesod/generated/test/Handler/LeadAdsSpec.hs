{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.LeadAdsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "deleteAdAccountsByTextLeadsSubscriptionsByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ AdAccountsByTextLeadsSubscriptionsByTextR "adAccountId_example" "subscriptionId_example"
            statusIs 501

    describe "getAdAccountsByTextLeadsSubscriptionsByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextLeadsSubscriptionsByTextR "adAccountId_example" "subscriptionId_example"
            statusIs 501

    describe "getAdAccountsByTextLeadsSubscriptionsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextLeadsSubscriptionsR "adAccountId_example"
            statusIs 501

    describe "postAdAccountsByTextLeadsSubscriptionsR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextLeadsSubscriptionsR "adAccountId_example"
            statusIs 501
