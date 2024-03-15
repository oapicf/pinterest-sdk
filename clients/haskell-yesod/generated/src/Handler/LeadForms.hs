{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.LeadForms where

import           Import


-- | Get lead form by id
--
-- Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID. Retrieving an advertiser&#39;s lead form will only contain results if you&#39;re a part of the Lead ads beta. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
-- operationId: leadForm/get
getAdAccountsByTextLeadFormsByTextR :: Text -- ^ Unique identifier of an ad account.
                                    -> Text -- ^ Unique identifier of a lead form.
                                    -> Handler Value
getAdAccountsByTextLeadFormsByTextR adAccountId leadFormId = notImplemented

-- | Create lead form test data
--
-- Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
-- operationId: leadFormTest/create
postAdAccountsByTextLeadFormsByTextTestR :: Text -- ^ Unique identifier of an ad account.
                                         -> Text -- ^ Unique identifier of a lead form.
                                         -> Handler Value
postAdAccountsByTextLeadFormsByTextTestR adAccountId leadFormId = notImplemented

-- | Get lead forms
--
-- Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser&#39;s list of lead forms will only contain results if you&#39;re a part of the Lead ads beta.  If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
-- operationId: leadForms/list
getAdAccountsByTextLeadFormsR :: Text -- ^ Unique identifier of an ad account.
                              -> Handler Value
getAdAccountsByTextLeadFormsR adAccountId = notImplemented
