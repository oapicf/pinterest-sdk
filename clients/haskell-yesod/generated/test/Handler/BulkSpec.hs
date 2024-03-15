{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.BulkSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postAdAccountsByTextBulkDownloadR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextBulkDownloadR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextBulkByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextBulkByTextR "adAccountId_example" "bulkRequestId_example"
            statusIs 501

    describe "postAdAccountsByTextBulkUpsertR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextBulkUpsertR "adAccountId_example"
            statusIs 501
