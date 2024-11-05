# order_lines_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OrderLinesGet**](order_lines_api.md#OrderLinesGet) | **GET** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line
[**OrderLinesList**](order_lines_api.md#OrderLinesList) | **GET** /ad_accounts/{ad_account_id}/order_lines | Get order lines


<a name="OrderLinesGet"></a>
# **OrderLinesGet**
> OrderLine OrderLinesGet(adAccountId, orderLineId)

Get order line

Get a specific existing order line associated with an ad account.
<a name="OrderLinesList"></a>
# **OrderLinesList**
> OrderLinesList200Response OrderLinesList(adAccountId, pageSize, order, bookmark)

Get order lines

List existing order lines associated with an ad account.
