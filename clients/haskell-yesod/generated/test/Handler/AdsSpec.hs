{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.AdsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postAdAccountsByTextAdPreviewsR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextAdPreviewsR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextAdsTargetingAnalyticsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextAdsTargetingAnalyticsR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextAdsAnalyticsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextAdsAnalyticsR "adAccountId_example"
            statusIs 501

    describe "postAdAccountsByTextAdsR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextAdsR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextAdsByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextAdsByTextR "adAccountId_example" "adId_example"
            statusIs 501

    describe "getAdAccountsByTextAdsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextAdsR "adAccountId_example"
            statusIs 501

    describe "patchAdAccountsByTextAdsR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ AdAccountsByTextAdsR "adAccountId_example"
            statusIs 501
