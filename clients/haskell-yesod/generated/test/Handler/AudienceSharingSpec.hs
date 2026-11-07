{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.AudienceSharingSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getAdAccountsByTextAudiencesSharedAccountsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextAudiencesSharedAccountsR "adAccountId_example"
            statusIs 501

    describe "getBusinessesByTextAudiencesSharedAccountsR" $
        it "returns 501 Not Implemented" $ do
            get $ BusinessesByTextAudiencesSharedAccountsR "businessId_example"
            statusIs 501

    describe "getBusinessesByTextAudiencesR" $
        it "returns 501 Not Implemented" $ do
            get $ BusinessesByTextAudiencesR "businessId_example"
            statusIs 501

    describe "patchAdAccountsByTextAudiencesAdAccountsSharedR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ AdAccountsByTextAudiencesAdAccountsSharedR "adAccountId_example"
            statusIs 501

    describe "patchAdAccountsByTextAudiencesBusinessesSharedR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ AdAccountsByTextAudiencesBusinessesSharedR "adAccountId_example"
            statusIs 501

    describe "patchBusinessesByTextAudiencesAdAccountsSharedR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ BusinessesByTextAudiencesAdAccountsSharedR "businessId_example"
            statusIs 501

    describe "patchBusinessesByTextAudiencesBusinessesSharedR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ BusinessesByTextAudiencesBusinessesSharedR "businessId_example"
            statusIs 501
