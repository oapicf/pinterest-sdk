{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ProductGroupPromotionsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postAdAccountsByTextProductGroupPromotionsR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextProductGroupPromotionsR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextProductGroupPromotionsByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextProductGroupPromotionsByTextR "adAccountId_example" "productGroupPromotionId_example"
            statusIs 501

    describe "getAdAccountsByTextProductGroupPromotionsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextProductGroupPromotionsR "adAccountId_example"
            statusIs 501

    describe "patchAdAccountsByTextProductGroupPromotionsR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ AdAccountsByTextProductGroupPromotionsR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextProductGroupsAnalyticsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextProductGroupsAnalyticsR "adAccountId_example"
            statusIs 501
