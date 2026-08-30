# search_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SearchPartnerPins**](search_api.md#SearchPartnerPins) | **GET** /search/partner/pins | Search pins by a given search term
[**SearchUserBoardsGet**](search_api.md#SearchUserBoardsGet) | **GET** /search/boards | Search user&#39;s boards
[**SearchUserPinsList**](search_api.md#SearchUserPinsList) | **GET** /search/pins | Search user&#39;s Pins


<a name="SearchPartnerPins"></a>
# **SearchPartnerPins**
> SearchPartnerPins200Response SearchPartnerPins(term, countryCode, bookmark, locale, limit)

Search pins by a given search term

**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get the top 10 Pins by a given search term.
<a name="SearchUserBoardsGet"></a>
# **SearchUserBoardsGet**
> BoardsList200Response SearchUserBoardsGet(adAccountId, Query_, bookmark, pageSize)

Search user&#39;s boards

Search for boards for the \&quot;operation user_account\&quot;. This includes boards of all board types. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.
<a name="SearchUserPinsList"></a>
# **SearchUserPinsList**
> PinsList200Response SearchUserPinsList(Query_, adAccountId, bookmark)

Search user&#39;s Pins

Search for pins for the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.
