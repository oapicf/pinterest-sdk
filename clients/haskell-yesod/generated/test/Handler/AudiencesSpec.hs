{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.AudiencesSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postAdAccountsByTextAudiencesR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextAudiencesR "adAccountId_example"
            statusIs 501

    describe "postAdAccountsByTextAudiencesCustomR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextAudiencesCustomR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextAudiencesByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextAudiencesByTextR "adAccountId_example" "audienceId_example"
            statusIs 501

    describe "getAdAccountsByTextAudiencesR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextAudiencesR "adAccountId_example"
            statusIs 501

    describe "patchAdAccountsByTextAudiencesByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ AdAccountsByTextAudiencesByTextR "adAccountId_example" "audienceId_example"
            statusIs 501
