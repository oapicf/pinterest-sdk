{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.AdAccountsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getAdAccountsByTextAnalyticsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextAnalyticsR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextTargetingAnalyticsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextTargetingAnalyticsR "adAccountId_example"
            statusIs 501

    describe "postAdAccountsR" $
        it "returns 501 Not Implemented" $ do
            post AdAccountsR
            statusIs 501

    describe "getAdAccountsByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsR" $
        it "returns 501 Not Implemented" $ do
            get AdAccountsR
            statusIs 501

    describe "postAdAccountsByTextMmmReportsR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextMmmReportsR "adAccountId_example"
            statusIs 501

    describe "postAdAccountsByTextReportsR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextReportsR "adAccountId_example"
            statusIs 501

    describe "postAdAccountsByTextTemplatesByTextReportsR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextTemplatesByTextReportsR "adAccountId_example" "templateId_example"
            statusIs 501

    describe "getAdAccountsByTextMmmReportsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextMmmReportsR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextReportsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextReportsR "adAccountId_example"
            statusIs 501

    describe "deleteAdAccountsByTextSandboxR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ AdAccountsByTextSandboxR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextTemplatesR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextTemplatesR "adAccountId_example"
            statusIs 501
