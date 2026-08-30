{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.SchedulesSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postAdAccountsByTextSchedulesR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextSchedulesR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextSchedulesR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextSchedulesR "adAccountId_example"
            statusIs 501

    describe "patchAdAccountsByTextSchedulesR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ AdAccountsByTextSchedulesR "adAccountId_example"
            statusIs 501
