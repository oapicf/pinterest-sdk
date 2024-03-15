{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.UserAccountSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getUserAccountFollowingBoardsR" $
        it "returns 501 Not Implemented" $ do
            get UserAccountFollowingBoardsR
            statusIs 501

    describe "postUserAccountFollowingByTextR" $
        it "returns 501 Not Implemented" $ do
            post $ UserAccountFollowingByTextR "username"
            statusIs 501

    describe "getUserAccountFollowersR" $
        it "returns 501 Not Implemented" $ do
            get UserAccountFollowersR
            statusIs 501

    describe "getUserAccountBusinessesR" $
        it "returns 501 Not Implemented" $ do
            get UserAccountBusinessesR
            statusIs 501

    describe "deleteUserAccountWebsitesR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" UserAccountWebsitesR
            statusIs 501

    describe "getUserAccountAnalyticsR" $
        it "returns 501 Not Implemented" $ do
            get UserAccountAnalyticsR
            statusIs 501

    describe "getUserAccountAnalyticsTopPinsR" $
        it "returns 501 Not Implemented" $ do
            get UserAccountAnalyticsTopPinsR
            statusIs 501

    describe "getUserAccountAnalyticsTopVideoPinsR" $
        it "returns 501 Not Implemented" $ do
            get UserAccountAnalyticsTopVideoPinsR
            statusIs 501

    describe "getUsersByTextInterestsFollowR" $
        it "returns 501 Not Implemented" $ do
            get $ UsersByTextInterestsFollowR "username"
            statusIs 501

    describe "getUserAccountR" $
        it "returns 501 Not Implemented" $ do
            get UserAccountR
            statusIs 501

    describe "getUserAccountFollowingR" $
        it "returns 501 Not Implemented" $ do
            get UserAccountFollowingR
            statusIs 501

    describe "getUserAccountWebsitesR" $
        it "returns 501 Not Implemented" $ do
            get UserAccountWebsitesR
            statusIs 501

    describe "postUserAccountWebsitesR" $
        it "returns 501 Not Implemented" $ do
            post UserAccountWebsitesR
            statusIs 501

    describe "getUserAccountWebsitesVerificationR" $
        it "returns 501 Not Implemented" $ do
            get UserAccountWebsitesVerificationR
            statusIs 501
