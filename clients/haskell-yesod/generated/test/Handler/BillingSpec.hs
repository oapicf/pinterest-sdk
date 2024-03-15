{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.BillingSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postAdAccountsByTextAdsCreditRedeemR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextAdsCreditRedeemR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextAdsCreditDiscountsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextAdsCreditDiscountsR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextBillingProfilesR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextBillingProfilesR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextSsioAccountsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextSsioAccountsR "adAccountId_example"
            statusIs 501

    describe "postAdAccountsByTextSsioInsertionOrdersR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextSsioInsertionOrdersR "adAccountId_example"
            statusIs 501

    describe "patchAdAccountsByTextSsioInsertionOrdersR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ AdAccountsByTextSsioInsertionOrdersR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextSsioInsertionOrdersStatusR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextSsioInsertionOrdersStatusR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextSsioInsertionOrdersByTextStatusR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextSsioInsertionOrdersByTextStatusR "adAccountId_example" "0Q01N0000015hekSVDFDC"
            statusIs 501

    describe "getAdAccountsByTextSsioOrderLinesR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextSsioOrderLinesR "adAccountId_example"
            statusIs 501
