{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.LabelsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postAdAccountsByTextLabelsByTextApplyR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextLabelsByTextApplyR "adAccountId_example" "labelId_example"
            statusIs 501

    describe "postAdAccountsByTextLabelsR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextLabelsR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextLabelsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextLabelsR "adAccountId_example"
            statusIs 501

    describe "postAdAccountsByTextLabelsByTextRemoveR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextLabelsByTextRemoveR "adAccountId_example" "labelId_example"
            statusIs 501

    describe "patchAdAccountsByTextLabelsR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ AdAccountsByTextLabelsR "adAccountId_example"
            statusIs 501
