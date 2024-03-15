{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.TermsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getTermsRelatedR" $
        it "returns 501 Not Implemented" $ do
            get TermsRelatedR
            statusIs 501

    describe "getTermsSuggestedR" $
        it "returns 501 Not Implemented" $ do
            get TermsSuggestedR
            statusIs 501
