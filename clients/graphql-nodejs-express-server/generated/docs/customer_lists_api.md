# customer_lists_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CustomerListsCreate**](customer_lists_api.md#CustomerListsCreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists
[**CustomerListsGet**](customer_lists_api.md#CustomerListsGet) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list
[**CustomerListsList**](customer_lists_api.md#CustomerListsList) | **GET** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists
[**CustomerListsUpdate**](customer_lists_api.md#CustomerListsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list


<a name="CustomerListsCreate"></a>
# **CustomerListsCreate**
> CustomerList CustomerListsCreate(adAccountId, customerListCreate)

Create customer lists

Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the &#x60;CUSTOMER_LIST&#x60; audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).
<a name="CustomerListsGet"></a>
# **CustomerListsGet**
> CustomerList CustomerListsGet(adAccountId, customerListId)

Get customer list

Gets a specific customer list given the customer list ID.
<a name="CustomerListsList"></a>
# **CustomerListsList**
> CustomerListsList200Response CustomerListsList(adAccountId, bookmark, pageSize, order, excludeNca)

Get customer lists

Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
<a name="CustomerListsUpdate"></a>
# **CustomerListsUpdate**
> CustomerList CustomerListsUpdate(adAccountId, customerListId, customerListUpdateWithRequiredBody)

Update customer list

Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \&quot;CUSTOMER_LIST\&quot; audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
