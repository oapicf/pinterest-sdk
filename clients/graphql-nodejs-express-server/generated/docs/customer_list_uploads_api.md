# customer_list_uploads_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CustomerListUploadsCreate**](customer_list_uploads_api.md#CustomerListUploadsCreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload
[**CustomerListUploadsGet**](customer_list_uploads_api.md#CustomerListUploadsGet) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload
[**CustomerListUploadsRun**](customer_list_uploads_api.md#CustomerListUploadsRun) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload


<a name="CustomerListUploadsCreate"></a>
# **CustomerListUploadsCreate**
> CustomerListUploadCreateResponse CustomerListUploadsCreate(adAccountId, customerListId, customerListUploadCreateRequest)

Create customer list upload

Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**
<a name="CustomerListUploadsGet"></a>
# **CustomerListUploadsGet**
> CustomerListUpload CustomerListUploadsGet(adAccountId, customerListId, customerListUploadId)

Get customer list upload

Get the metadata for a given upload by its ID.
<a name="CustomerListUploadsRun"></a>
# **CustomerListUploadsRun**
> CustomerListUpload CustomerListUploadsRun(adAccountId, customerListId, customerListUploadId)

Run customer list upload

Begin processing a customer list upload.
