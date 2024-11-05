{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.LeadForms where

import           Import


-- | Get lead form by id
--
-- &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
-- operationId: leadForm/get
getAdAccountsByTextLeadFormsByTextR :: Text -- ^ Unique identifier of an ad account.
                                    -> Text -- ^ Unique identifier of a lead form.
                                    -> Handler Value
getAdAccountsByTextLeadFormsByTextR adAccountId leadFormId = notImplemented

-- | Create lead form test data
--
-- Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
-- operationId: leadFormTest/create
postAdAccountsByTextLeadFormsByTextTestR :: Text -- ^ Unique identifier of an ad account.
                                         -> Text -- ^ Unique identifier of a lead form.
                                         -> Handler Value
postAdAccountsByTextLeadFormsByTextTestR adAccountId leadFormId = notImplemented

-- | Create lead forms
--
-- &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’ s description, questions and confirmation sections.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
-- operationId: leadForms/create
postAdAccountsByTextLeadFormsR :: Text -- ^ Unique identifier of an ad account.
                               -> Handler Value
postAdAccountsByTextLeadFormsR adAccountId = notImplemented

-- | List lead forms
--
-- &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  List lead forms associated with an ad account ID.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
-- operationId: leadForms/list
getAdAccountsByTextLeadFormsR :: Text -- ^ Unique identifier of an ad account.
                              -> Handler Value
getAdAccountsByTextLeadFormsR adAccountId = notImplemented

-- | Update lead forms
--
-- &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
-- operationId: leadForms/update
patchAdAccountsByTextLeadFormsR :: Text -- ^ Unique identifier of an ad account.
                                -> Handler Value
patchAdAccountsByTextLeadFormsR adAccountId = notImplemented
