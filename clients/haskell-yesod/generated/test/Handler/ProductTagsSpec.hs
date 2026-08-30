{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ProductTagsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postPinsByTextProductTagsR" $
        it "returns 501 Not Implemented" $ do
            post $ PinsByTextProductTagsR "pinId_example"
            statusIs 501

    describe "postPinsByTextProductTagsBulkDeleteR" $
        it "returns 501 Not Implemented" $ do
            post $ PinsByTextProductTagsBulkDeleteR "pinId_example"
            statusIs 501

    describe "getPinsByTextProductTagsR" $
        it "returns 501 Not Implemented" $ do
            get $ PinsByTextProductTagsR "pinId_example"
            statusIs 501
