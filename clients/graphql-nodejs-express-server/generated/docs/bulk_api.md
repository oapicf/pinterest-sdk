# bulk_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BulkDownloadCreate**](bulk_api.md#BulkDownloadCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk
[**BulkRequestGet**](bulk_api.md#BulkRequestGet) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk
[**BulkUpsertCreate**](bulk_api.md#BulkUpsertCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk


<a name="BulkDownloadCreate"></a>
# **BulkDownloadCreate**
> BulkDownloadResponse BulkDownloadCreate(adAccountId, bulkDownloadRequest)

Get advertiser entities in bulk

Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
<a name="BulkRequestGet"></a>
# **BulkRequestGet**
> BulkUpsertStatusResponse BulkRequestGet(adAccountId, bulkRequestId, includeDetails)

Download advertiser entities in bulk

Get the status of a bulk request by &lt;code&gt;request_id&lt;/code&gt;, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
<a name="BulkUpsertCreate"></a>
# **BulkUpsertCreate**
> BulkUpsertResponse BulkUpsertCreate(adAccountId, bulkUpsertRequest)

Create/update ad entities in bulk

Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a &lt;code&gt;request_id&lt;/code&gt; that can be used to obtain the status of the request.
