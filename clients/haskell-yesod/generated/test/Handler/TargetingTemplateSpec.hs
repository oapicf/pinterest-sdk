{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.TargetingTemplateSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postAdAccountsByTextTargetingTemplatesR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextTargetingTemplatesR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextTargetingTemplatesR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextTargetingTemplatesR "adAccountId_example"
            statusIs 501

    describe "patchAdAccountsByTextTargetingTemplatesR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ AdAccountsByTextTargetingTemplatesR "adAccountId_example"
            statusIs 501
