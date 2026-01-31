{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.PromotionsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postAdAccountsByTextPromotionsR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextPromotionsR "adAccountId_example"
            statusIs 501

    describe "deleteAdAccountsByTextPromotionsByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ AdAccountsByTextPromotionsByTextR "adAccountId_example" "promotionId_example"
            statusIs 501

    describe "getAdAccountsByTextPromotionsByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextPromotionsByTextR "adAccountId_example" "promotionId_example"
            statusIs 501

    describe "getAdAccountsByTextPromotionsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextPromotionsR "adAccountId_example"
            statusIs 501

    describe "patchAdAccountsByTextPromotionsR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ AdAccountsByTextPromotionsR "adAccountId_example"
            statusIs 501
