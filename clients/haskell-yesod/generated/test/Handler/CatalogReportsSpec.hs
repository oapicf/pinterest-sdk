{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.CatalogReportsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postCatalogsReportsR" $
        it "returns 501 Not Implemented" $ do
            post CatalogsReportsR
            statusIs 501

    describe "getCatalogsReportsR" $
        it "returns 501 Not Implemented" $ do
            get CatalogsReportsR
            statusIs 501

    describe "getCatalogsReportsStatsR" $
        it "returns 501 Not Implemented" $ do
            get CatalogsReportsStatsR
            statusIs 501
