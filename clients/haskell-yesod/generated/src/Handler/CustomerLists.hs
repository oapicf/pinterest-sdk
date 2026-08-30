{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.CustomerLists where

import           Import


-- | Create customer lists
--
-- Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the &#x60;CUSTOMER_LIST&#x60; audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).
-- operationId: customerLists/create
postAdAccountsByTextCustomerListsR :: Text -- ^ 
                                   -> Handler Value
postAdAccountsByTextCustomerListsR adAccountId = notImplemented

-- | Get customer list
--
-- Gets a specific customer list given the customer list ID.
-- operationId: customerLists/get
getAdAccountsByTextCustomerListsByTextR :: Text -- ^ 
                                        -> Text -- ^ Customer list ID.
                                        -> Handler Value
getAdAccountsByTextCustomerListsByTextR adAccountId customerListId = notImplemented

-- | Get customer lists
--
-- Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
-- operationId: customerLists/list
getAdAccountsByTextCustomerListsR :: Text -- ^ 
                                  -> Handler Value
getAdAccountsByTextCustomerListsR adAccountId = notImplemented

-- | Update customer list
--
-- Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \&quot;CUSTOMER_LIST\&quot; audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
-- operationId: customerLists/update
patchAdAccountsByTextCustomerListsByTextR :: Text -- ^ 
                                          -> Text -- ^ Customer list ID.
                                          -> Handler Value
patchAdAccountsByTextCustomerListsByTextR adAccountId customerListId = notImplemented
