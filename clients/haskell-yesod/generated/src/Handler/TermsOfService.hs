{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.TermsOfService where

import           Import


-- | Get terms of service
--
-- Get the text of the terms of service and see whether the advertiser has accepted the terms of service.
-- operationId: termsOfService/get
getAdAccountsByTextTermsOfServiceR :: Text -- ^ Unique identifier of an ad account.
                                   -> Handler Value
getAdAccountsByTextTermsOfServiceR adAccountId = notImplemented
