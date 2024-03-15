{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Integrations where

import           Import


-- | Get integration metadata
--
-- Get integration metadata by ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
-- operationId: integrations/getById
getIntegrationsByTextR :: Text -- ^ Integration ID.
                       -> Handler Value
getIntegrationsByTextR id = notImplemented

-- | Get integration metadata list
--
-- Get integration metadata list. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
-- operationId: integrations/getList
getIntegrationsR :: Handler Value
getIntegrationsR = notImplemented

-- | Delete commerce integration
--
-- Delete commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
-- operationId: integrationsCommerce/del
deleteIntegrationsCommerceByTextR :: Text -- ^ External business ID for the integration.
                                  -> Handler Value
deleteIntegrationsCommerceByTextR externalBusinessId = notImplemented

-- | Get commerce integration
--
-- Get commerce integration metadata associated with the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
-- operationId: integrationsCommerce/get
getIntegrationsCommerceByTextR :: Text -- ^ External business ID for the integration.
                               -> Handler Value
getIntegrationsCommerceByTextR externalBusinessId = notImplemented

-- | Update commerce integration
--
-- Update commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
-- operationId: integrationsCommerce/patch
patchIntegrationsCommerceByTextR :: Text -- ^ External business ID for the integration.
                                 -> Handler Value
patchIntegrationsCommerceByTextR externalBusinessId = notImplemented

-- | Create commerce integration
--
-- Create commerce integration metadata to link an external business ID with a Pinterest merchant &amp; ad account. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
-- operationId: integrationsCommerce/post
postIntegrationsCommerceR :: Handler Value
postIntegrationsCommerceR = notImplemented

-- | Receives batched logs from integration applications.
--
-- This endpoint receives batched logs from integration applications on partner platforms. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
-- operationId: integrationsLogs/post
postIntegrationsLogsR :: Handler Value
postIntegrationsLogsR = notImplemented
