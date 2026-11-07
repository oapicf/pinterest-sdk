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

    describe "getAdAccountsByTextAudiencesByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextAudiencesByTextR "audienceId_example" "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextAudiencesR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextAudiencesR "adAccountId_example"
            statusIs 501

    describe "patchAdAccountsByTextAudiencesByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ AdAccountsByTextAudiencesByTextR "audienceId_example" "adAccountId_example"
            statusIs 501
