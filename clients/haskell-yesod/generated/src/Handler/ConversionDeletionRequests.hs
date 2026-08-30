{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.ConversionDeletionRequests where

import           Import


-- | Create a conversion deletion request
--
-- **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified &#x60;ad_account_id&#x60;. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.
-- operationId: conversionDeletionRequest/create
postAdAccountsByTextConversionDeletionRequestsR :: Text -- ^ Unique identifier of an ad account.
                                                -> Handler Value
postAdAccountsByTextConversionDeletionRequestsR adAccountId = notImplemented

-- | Delete a conversion deletion request
--
-- **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;. This will cancel the request and prevent it from being processed. This can only be done if the request is in the &#x60;PENDING&#x60; status and before the 72 hours mark.
-- operationId: conversionDeletionRequest/delete
deleteAdAccountsByTextConversionDeletionRequestsByTextR :: Text -- ^ Unique identifier of the conversion deletion request
                                                        -> Text -- ^ Unique identifier of an ad account.
                                                        -> Handler Value
deleteAdAccountsByTextConversionDeletionRequestsByTextR requestId adAccountId = notImplemented

-- | Get a single conversion deletion request
--
-- **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;.
-- operationId: conversionDeletionRequest/get
getAdAccountsByTextConversionDeletionRequestsByTextR :: Text -- ^ Unique identifier of the conversion deletion request
                                                     -> Text -- ^ Unique identifier of an ad account.
                                                     -> Handler Value
getAdAccountsByTextConversionDeletionRequestsByTextR requestId adAccountId = notImplemented

-- | List conversion deletion requests
--
-- **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified &#x60;ad_account_id&#x60;.
-- operationId: conversionDeletionRequest/list
getAdAccountsByTextConversionDeletionRequestsR :: Text -- ^ Unique identifier of an ad account.
                                               -> Handler Value
getAdAccountsByTextConversionDeletionRequestsR adAccountId = notImplemented
