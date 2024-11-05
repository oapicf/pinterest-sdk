{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.AdvancedAuctionSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postAdvancedAuctionItemsGetR" $
        it "returns 501 Not Implemented" $ do
            post AdvancedAuctionItemsGetR
            statusIs 501

    describe "postAdvancedAuctionItemsSubmitR" $
        it "returns 501 Not Implemented" $ do
            post AdvancedAuctionItemsSubmitR
            statusIs 501
