{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ConversionsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postAdAccountsByTextAdvertiserDefinedEventsR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextAdvertiserDefinedEventsR "adAccountId_example"
            statusIs 501

    describe "deleteAdAccountsByTextAdvertiserDefinedEventsR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ AdAccountsByTextAdvertiserDefinedEventsR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextAdvertiserDefinedEventsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextAdvertiserDefinedEventsR "adAccountId_example"
            statusIs 501

    describe "patchAdAccountsByTextAdvertiserDefinedEventsR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ AdAccountsByTextAdvertiserDefinedEventsR "adAccountId_example"
            statusIs 501
