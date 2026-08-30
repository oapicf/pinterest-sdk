# customer_segment_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CustomerSegmentCreate**](customer_segment_api.md#CustomerSegmentCreate) | **POST** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments
[**CustomerSegmentList**](customer_segment_api.md#CustomerSegmentList) | **GET** /ad_accounts/{ad_account_id}/customer_segments | List customer segments
[**CustomerSegmentUpdate**](customer_segment_api.md#CustomerSegmentUpdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments


<a name="CustomerSegmentCreate"></a>
# **CustomerSegmentCreate**
> CustomerSegment CustomerSegmentCreate(adAccountId, customerSegmentCreate)

Create customer segments

Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.
<a name="CustomerSegmentList"></a>
# **CustomerSegmentList**
> CustomerSegmentList200Response CustomerSegmentList(adAccountId, bookmark, pageSize, order, includeSizing, searchQuery)

List customer segments

Get a list of the customer segments in the specified &#x60;ad_account_id&#x60;.
<a name="CustomerSegmentUpdate"></a>
# **CustomerSegmentUpdate**
> CustomerSegmentUpdate(adAccountId, customerSegmentUpdateRequestUpdateWithRequiredBody)

Update customer segments

Update the customer segment given advertiser ID and customer segment ID
