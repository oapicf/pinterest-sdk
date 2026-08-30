{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.ProductTags where

import           Import


-- | Add product tags to pin
--
-- Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.
-- operationId: productTags/bulkAdd
postPinsByTextProductTagsR :: Text -- ^ Unique identifier of the hero pin that will receive product tags.
                           -> Handler Value
postPinsByTextProductTagsR pinId = notImplemented

-- | Delete product tags from pin
--
-- Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.
-- operationId: productTags/bulkDelete
postPinsByTextProductTagsBulkDeleteR :: Text -- ^ Unique identifier of the hero pin that will receive product tags.
                                     -> Handler Value
postPinsByTextProductTagsBulkDeleteR pinId = notImplemented

-- | Get product tags for pin
--
-- Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.
-- operationId: productTags/list
getPinsByTextProductTagsR :: Text -- ^ Unique identifier of the hero pin that will receive product tags.
                          -> Handler Value
getPinsByTextProductTagsR pinId = notImplemented
