{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.TermsOfServiceSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getAdAccountsByTextTermsOfServiceR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextTermsOfServiceR "adAccountId_example"
            statusIs 501
