{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.LabelsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postAdAccountsByTextLabelsR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextLabelsR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextLabelsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextLabelsR "adAccountId_example"
            statusIs 501

    describe "patchAdAccountsByTextLabelsR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ AdAccountsByTextLabelsR "adAccountId_example"
            statusIs 501
