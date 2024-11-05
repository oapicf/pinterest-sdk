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
            get $ BusinessesByTextAudiencesSharedAccountsR "729090764583391194"
            statusIs 501

    describe "getBusinessesByTextAudiencesR" $
        it "returns 501 Not Implemented" $ do
            get $ BusinessesByTextAudiencesR "729090764583391194"
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
            performMethod "PATCH" $ BusinessesByTextAudiencesAdAccountsSharedR "729090764583391194"
            statusIs 501

    describe "patchBusinessesByTextAudiencesBusinessesSharedR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ BusinessesByTextAudiencesBusinessesSharedR "729090764583391194"
            statusIs 501
