{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.CatalogItemsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postCatalogsItemsR" $
        it "returns 501 Not Implemented" $ do
            post CatalogsItemsR
            statusIs 501

    describe "getCatalogsItemsBatchByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ CatalogsItemsBatchByTextR "66753b9bb65c46c49bd8503b27fecf9e"
            statusIs 501

    describe "postCatalogsItemsBatchR" $
        it "returns 501 Not Implemented" $ do
            post CatalogsItemsBatchR
            statusIs 501
