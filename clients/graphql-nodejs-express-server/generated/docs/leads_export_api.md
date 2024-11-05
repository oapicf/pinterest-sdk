# leads_export_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LeadsExportCreate**](leads_export_api.md#LeadsExportCreate) | **POST** /ad_accounts/{ad_account_id}/leads_export | Create a request to export leads collected from a lead ad
[**LeadsExportGet**](leads_export_api.md#LeadsExportGet) | **GET** /ad_accounts/{ad_account_id}/leads_export/{leads_export_id} | Get the lead export from the lead export create call


<a name="LeadsExportCreate"></a>
# **LeadsExportCreate**
> LeadsExportCreateResponse LeadsExportCreate(adAccountId, leadsExportCreateRequest)

Create a request to export leads collected from a lead ad

&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
<a name="LeadsExportGet"></a>
# **LeadsExportGet**
> LeadsExportResponseData LeadsExportGet(adAccountId, leadsExportId)

Get the lead export from the lead export create call

&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
