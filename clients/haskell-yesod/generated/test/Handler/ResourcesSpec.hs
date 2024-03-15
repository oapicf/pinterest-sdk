{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ResourcesSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getResourcesAdAccountCountriesR" $
        it "returns 501 Not Implemented" $ do
            get ResourcesAdAccountCountriesR
            statusIs 501

    describe "getResourcesDeliveryMetricsR" $
        it "returns 501 Not Implemented" $ do
            get ResourcesDeliveryMetricsR
            statusIs 501

    describe "getResourcesTargetingInterestsByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ResourcesTargetingInterestsByTextR "interestId_example"
            statusIs 501

    describe "getResourcesLeadFormQuestionsR" $
        it "returns 501 Not Implemented" $ do
            get ResourcesLeadFormQuestionsR
            statusIs 501

    describe "getResourcesMetricsReadyStateR" $
        it "returns 501 Not Implemented" $ do
            get ResourcesMetricsReadyStateR
            statusIs 501

    describe "getResourcesTargetingByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ResourcesTargetingByTextR "APPTYPE"
            statusIs 501
