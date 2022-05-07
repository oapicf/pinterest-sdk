{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.MediaSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postMediaR" $
        it "returns 501 Not Implemented" $ do
            post MediaR
            statusIs 501

    describe "getMediaByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ MediaByTextR "mediaId_example"
            statusIs 501

    describe "getMediaR" $
        it "returns 501 Not Implemented" $ do
            get MediaR
            statusIs 501
