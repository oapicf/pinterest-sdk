{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ConversionDeletionRequestsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postAdAccountsByTextConversionDeletionRequestsR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextConversionDeletionRequestsR "adAccountId_example"
            statusIs 501

    describe "deleteAdAccountsByTextConversionDeletionRequestsByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ AdAccountsByTextConversionDeletionRequestsByTextR "requestId_example" "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextConversionDeletionRequestsByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextConversionDeletionRequestsByTextR "requestId_example" "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextConversionDeletionRequestsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextConversionDeletionRequestsR "adAccountId_example"
            statusIs 501
