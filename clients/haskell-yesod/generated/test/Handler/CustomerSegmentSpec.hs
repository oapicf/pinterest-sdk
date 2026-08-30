{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.CustomerSegmentSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postAdAccountsByTextCustomerSegmentsR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextCustomerSegmentsR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextCustomerSegmentsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextCustomerSegmentsR "adAccountId_example"
            statusIs 501

    describe "patchAdAccountsByTextCustomerSegmentsR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ AdAccountsByTextCustomerSegmentsR "adAccountId_example"
            statusIs 501
