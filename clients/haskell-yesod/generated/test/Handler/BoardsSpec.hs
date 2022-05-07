{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.BoardsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postBoardsByTextSectionsR" $
        it "returns 501 Not Implemented" $ do
            post $ BoardsByTextSectionsR "boardId_example"
            statusIs 501

    describe "deleteBoardsByTextSectionsByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ BoardsByTextSectionsByTextR "boardId_example" "sectionId_example"
            statusIs 501

    describe "getBoardsByTextSectionsR" $
        it "returns 501 Not Implemented" $ do
            get $ BoardsByTextSectionsR "boardId_example"
            statusIs 501

    describe "getBoardsByTextSectionsByTextPinsR" $
        it "returns 501 Not Implemented" $ do
            get $ BoardsByTextSectionsByTextPinsR "boardId_example" "sectionId_example"
            statusIs 501

    describe "patchBoardsByTextSectionsByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ BoardsByTextSectionsByTextR "boardId_example" "sectionId_example"
            statusIs 501

    describe "postBoardsR" $
        it "returns 501 Not Implemented" $ do
            post BoardsR
            statusIs 501

    describe "deleteBoardsByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ BoardsByTextR "boardId_example"
            statusIs 501

    describe "getBoardsByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ BoardsByTextR "boardId_example"
            statusIs 501

    describe "getBoardsR" $
        it "returns 501 Not Implemented" $ do
            get BoardsR
            statusIs 501

    describe "getBoardsByTextPinsR" $
        it "returns 501 Not Implemented" $ do
            get $ BoardsByTextPinsR "boardId_example"
            statusIs 501

    describe "patchBoardsByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ BoardsByTextR "boardId_example"
            statusIs 501
