{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Schedules where

import           Import


-- | Create schedules
--
-- Batch create schedules
-- operationId: schedules/create
postAdAccountsByTextSchedulesR :: Text -- ^ 
                               -> Handler Value
postAdAccountsByTextSchedulesR adAccountId = notImplemented

-- | Get Schedules
--
-- Get schedules for a specific advertiser
-- operationId: schedules/list
getAdAccountsByTextSchedulesR :: Text -- ^ 
                              -> Handler Value
getAdAccountsByTextSchedulesR adAccountId = notImplemented

-- | Update schedules
--
-- Update one or more schedules
-- operationId: schedules/update
patchAdAccountsByTextSchedulesR :: Text -- ^ 
                                -> Handler Value
patchAdAccountsByTextSchedulesR adAccountId = notImplemented
