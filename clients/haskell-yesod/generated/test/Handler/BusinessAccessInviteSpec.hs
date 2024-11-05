{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.BusinessAccessInviteSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postBusinessesByTextRequestsAssetsAccessR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByTextRequestsAssetsAccessR "729090764583391194"
            statusIs 501

    describe "deleteBusinessesByTextInvitesR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ BusinessesByTextInvitesR "729090764583391194"
            statusIs 501

    describe "postBusinessesByTextInvitesAssetsAccessR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByTextInvitesAssetsAccessR "729090764583391194"
            statusIs 501

    describe "postBusinessesByTextInvitesR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessesByTextInvitesR "729090764583391194"
            statusIs 501

    describe "getBusinessesByTextInvitesR" $
        it "returns 501 Not Implemented" $ do
            get $ BusinessesByTextInvitesR "729090764583391194"
            statusIs 501

    describe "patchBusinessesInvitesR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" BusinessesInvitesR
            statusIs 501
