{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ConversionTagsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postAdAccountsByTextConversionTagsR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextConversionTagsR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextConversionTagsByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextConversionTagsByTextR "adAccountId_example" "2617998078212"
            statusIs 501

    describe "getAdAccountsByTextConversionTagsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextConversionTagsR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextConversionTagsOcpmEligibleR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextConversionTagsOcpmEligibleR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextConversionTagsPageVisitR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextConversionTagsPageVisitR "adAccountId_example"
            statusIs 501
