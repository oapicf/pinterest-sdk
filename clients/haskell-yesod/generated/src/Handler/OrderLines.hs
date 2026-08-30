{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.OrderLines where

import           Import


-- | Get order line
--
-- Get a specific existing order line associated with an ad account.
-- operationId: orderLines/get
getAdAccountsByTextOrderLinesByTextR :: Text -- ^ Order line ID.
                                     -> Text -- ^ Unique identifier of an ad account.
                                     -> Handler Value
getAdAccountsByTextOrderLinesByTextR orderLineId adAccountId = notImplemented

-- | Get order lines.
--
-- List existing order lines associated with an ad account.
-- operationId: orderLines/list
getAdAccountsByTextOrderLinesR :: Text -- ^ Unique identifier of an ad account.
                               -> Handler Value
getAdAccountsByTextOrderLinesR adAccountId = notImplemented
