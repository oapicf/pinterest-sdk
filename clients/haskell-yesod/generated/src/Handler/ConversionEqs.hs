{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.ConversionEqs where

import           Import


-- | Get event quality score (EQS)
--
-- Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.
-- operationId: conversionEqs/list
getAdAccountsByTextConversionEqsR :: Text -- ^ Unique identifier of an ad account.
                                  -> Handler Value
getAdAccountsByTextConversionEqsR adAccountId = notImplemented
