{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.IntegrationsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getIntegrationsByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ IntegrationsByTextR "id_example"
            statusIs 501

    describe "getIntegrationsR" $
        it "returns 501 Not Implemented" $ do
            get IntegrationsR
            statusIs 501

    describe "deleteIntegrationsCommerceByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ IntegrationsCommerceByTextR "externalBusinessId_example"
            statusIs 501

    describe "getIntegrationsCommerceByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ IntegrationsCommerceByTextR "externalBusinessId_example"
            statusIs 501

    describe "patchIntegrationsCommerceByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ IntegrationsCommerceByTextR "externalBusinessId_example"
            statusIs 501

    describe "postIntegrationsCommerceR" $
        it "returns 501 Not Implemented" $ do
            post IntegrationsCommerceR
            statusIs 501

    describe "postIntegrationsLogsR" $
        it "returns 501 Not Implemented" $ do
            post IntegrationsLogsR
            statusIs 501
