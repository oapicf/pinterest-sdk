{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.PinsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getPinsByTextAnalyticsR" $
        it "returns 501 Not Implemented" $ do
            get $ PinsByTextAnalyticsR "pinId_example"
            statusIs 501

    describe "postPinsR" $
        it "returns 501 Not Implemented" $ do
            post PinsR
            statusIs 501

    describe "deletePinsByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ PinsByTextR "pinId_example"
            statusIs 501

    describe "getPinsByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ PinsByTextR "pinId_example"
            statusIs 501
