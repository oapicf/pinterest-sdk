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

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get the top 10 Pins by a given search term.
<a name="SearchUserBoardsGet"></a>
# **SearchUserBoardsGet**
> SearchUserBoardsGet200Response SearchUserBoardsGet(adAccountId, bookmark, pageSize, Query_)

Search user&#39;s boards

Search for boards for the \&quot;operation user_account\&quot;. This includes boards of all board types. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/getting-started/using-business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
<a name="SearchUserPinsList"></a>
# **SearchUserPinsList**
> PinsList200Response SearchUserPinsList(Query_, adAccountId, bookmark)

Search user&#39;s Pins

Search for pins for the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/getting-started/using-business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
