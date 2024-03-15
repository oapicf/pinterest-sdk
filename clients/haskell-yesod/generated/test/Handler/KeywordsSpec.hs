{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.KeywordsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getAdAccountsByTextKeywordsMetricsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextKeywordsMetricsR "adAccountId_example"
            statusIs 501

    describe "postAdAccountsByTextKeywordsR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextKeywordsR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextKeywordsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextKeywordsR "adAccountId_example"
            statusIs 501

    describe "patchAdAccountsByTextKeywordsR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ AdAccountsByTextKeywordsR "adAccountId_example"
            statusIs 501

    describe "getTrendsKeywordsByTrendsSupportedRegionTopByTrendTypeR" $
        it "returns 501 Not Implemented" $ do
            get $ TrendsKeywordsByTrendsSupportedRegionTopByTrendTypeR unknown unknown
            statusIs 501
