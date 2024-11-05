{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.LeadFormsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getAdAccountsByTextLeadFormsByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextLeadFormsByTextR "adAccountId_example" "1234567890123"
            statusIs 501

    describe "postAdAccountsByTextLeadFormsByTextTestR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextLeadFormsByTextTestR "adAccountId_example" "1234567890123"
            statusIs 501

    describe "postAdAccountsByTextLeadFormsR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextLeadFormsR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextLeadFormsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextLeadFormsR "adAccountId_example"
            statusIs 501

    describe "patchAdAccountsByTextLeadFormsR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ AdAccountsByTextLeadFormsR "adAccountId_example"
            statusIs 501
