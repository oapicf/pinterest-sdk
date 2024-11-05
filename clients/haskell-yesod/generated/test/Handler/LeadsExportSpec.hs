{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.LeadsExportSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postAdAccountsByTextLeadsExportR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextLeadsExportR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextLeadsExportByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextLeadsExportByTextR "adAccountId_example" "123755885175"
            statusIs 501
