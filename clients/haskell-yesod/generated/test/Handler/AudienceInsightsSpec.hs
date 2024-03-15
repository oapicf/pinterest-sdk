{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.AudienceInsightsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getAdAccountsByTextAudienceInsightsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextAudienceInsightsR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextInsightsAudiencesR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextInsightsAudiencesR "adAccountId_example"
            statusIs 501
