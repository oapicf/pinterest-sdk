{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.LeadsExport where

import           Import


-- | Create a request to export leads collected from a lead ad
--
-- **This feature is currently in beta and not available to all apps. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create an export of leads collected from a lead ad. This returns a &#x60;leads_export_id&#x60; token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
-- operationId: leadsExport/create
postAdAccountsByTextLeadsExportR :: Text -- ^ Unique identifier of an ad account.
                                 -> Handler Value
postAdAccountsByTextLeadsExportR adAccountId = notImplemented

-- | Get the lead export from the lead export create call
--
-- **This feature is currently in beta and not available to all apps. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
-- operationId: leadsExport/get
getAdAccountsByTextLeadsExportByTextR :: Text -- ^ Unique identifier of an ad account.
                                      -> Text -- ^ lead_export_id token returned from the create a lead export endpoint
                                      -> Handler Value
getAdAccountsByTextLeadsExportByTextR adAccountId leadsExportId = notImplemented
