{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.SearchSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getSearchPartnerPinsR" $
        it "returns 501 Not Implemented" $ do
            get SearchPartnerPinsR
            statusIs 501

    describe "getSearchBoardsR" $
        it "returns 501 Not Implemented" $ do
            get SearchBoardsR
            statusIs 501

    describe "getSearchPinsR" $
        it "returns 501 Not Implemented" $ do
            get SearchPinsR
            statusIs 501
