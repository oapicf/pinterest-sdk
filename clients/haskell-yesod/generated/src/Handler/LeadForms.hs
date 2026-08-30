{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.LeadForms where

import           Import


-- | Get lead form by id
--
-- **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
-- operationId: leadForm/get
getAdAccountsByTextLeadFormsByTextR :: Text -- ^ The ID of this lead form
                                    -> Text -- ^ Unique identifier of an ad account.
                                    -> Handler Value
getAdAccountsByTextLeadFormsByTextR leadFormId adAccountId = notImplemented

-- | Create lead form test data
--
-- Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.
-- operationId: leadFormTest/create
postAdAccountsByTextLeadFormsByTextTestR :: Text -- ^ 
                                         -> Text -- ^ Unique identifier of a lead form.
                                         -> Handler Value
postAdAccountsByTextLeadFormsByTextTestR adAccountId leadFormId = notImplemented

-- | Create lead forms
--
-- **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form&#39;s description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
-- operationId: leadForms/create
postAdAccountsByTextLeadFormsR :: Text -- ^ Unique identifier of an ad account.
                               -> Handler Value
postAdAccountsByTextLeadFormsR adAccountId = notImplemented

-- | List lead forms
--
-- **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
-- operationId: leadForms/list
getAdAccountsByTextLeadFormsR :: Text -- ^ Unique identifier of an ad account.
                              -> Handler Value
getAdAccountsByTextLeadFormsR adAccountId = notImplemented

-- | Update lead forms
--
-- **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
-- operationId: leadForms/update
patchAdAccountsByTextLeadFormsR :: Text -- ^ Unique identifier of an ad account.
                                -> Handler Value
patchAdAccountsByTextLeadFormsR adAccountId = notImplemented
