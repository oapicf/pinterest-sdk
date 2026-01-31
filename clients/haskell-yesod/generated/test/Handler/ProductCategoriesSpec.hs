{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ProductCategoriesSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getTrendsTopicsFeaturedR" $
        it "returns 501 Not Implemented" $ do
            get TrendsTopicsFeaturedR
            statusIs 501

    describe "getTrendsProductCategoriesDetailsR" $
        it "returns 501 Not Implemented" $ do
            get TrendsProductCategoriesDetailsR
            statusIs 501

    describe "getTrendsProductCategoriesTrendingR" $
        it "returns 501 Not Implemented" $ do
            get TrendsProductCategoriesTrendingR
            statusIs 501
