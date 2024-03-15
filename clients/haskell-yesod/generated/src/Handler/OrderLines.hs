{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.OrderLines where

import           Import


-- | Get order line
--
-- Get a specific existing order line associated with an ad account.
-- operationId: orderLines/get
getAdAccountsByTextOrderLinesByTextR :: Text -- ^ Unique identifier of an ad account.
                                     -> Text -- ^ Unique identifier of an order line.
                                     -> Handler Value
getAdAccountsByTextOrderLinesByTextR adAccountId orderLineId = notImplemented

-- | Get order lines
--
-- List existing order lines associated with an ad account.
-- operationId: orderLines/list
getAdAccountsByTextOrderLinesR :: Text -- ^ Unique identifier of an ad account.
                               -> Handler Value
getAdAccountsByTextOrderLinesR adAccountId = notImplemented
