# boards_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BoardSectionsCreate**](boards_api.md#BoardSectionsCreate) | **POST** /boards/{board_id}/sections | Create board section
[**BoardSectionsDelete**](boards_api.md#BoardSectionsDelete) | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section
[**BoardSectionsList**](boards_api.md#BoardSectionsList) | **GET** /boards/{board_id}/sections | List board sections
[**BoardSectionsListPins**](boards_api.md#BoardSectionsListPins) | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
[**BoardSectionsUpdate**](boards_api.md#BoardSectionsUpdate) | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section
[**BoardsCreate**](boards_api.md#BoardsCreate) | **POST** /boards | Create board
[**BoardsDelete**](boards_api.md#BoardsDelete) | **DELETE** /boards/{board_id} | Delete board
[**BoardsGet**](boards_api.md#BoardsGet) | **GET** /boards/{board_id} | Get board
[**BoardsList**](boards_api.md#BoardsList) | **GET** /boards | List boards
[**BoardsListPins**](boards_api.md#BoardsListPins) | **GET** /boards/{board_id}/pins | List Pins on board
[**BoardsUpdate**](boards_api.md#BoardsUpdate) | **PATCH** /boards/{board_id} | Update board


<a name="BoardSectionsCreate"></a>
# **BoardSectionsCreate**
> BoardSection BoardSectionsCreate(boardId, boardSection, adAccountId)

Create board section

Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
<a name="BoardSectionsDelete"></a>
# **BoardSectionsDelete**
> BoardSectionsDelete(boardId, sectionId, adAccountId)

Delete board section

Delete a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
<a name="BoardSectionsList"></a>
# **BoardSectionsList**
> BoardSectionsList200Response BoardSectionsList(boardId, adAccountId, bookmark, pageSize)

List board sections

Get a list of all board sections from a board owned by the \&quot;operation user_account\&quot; - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
<a name="BoardSectionsListPins"></a>
# **BoardSectionsListPins**
> BoardsListPins200Response BoardSectionsListPins(boardId, sectionId, adAccountId, bookmark, pageSize)

List Pins on board section

Get a list of the Pins on a board section of a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
<a name="BoardSectionsUpdate"></a>
# **BoardSectionsUpdate**
> BoardSection BoardSectionsUpdate(boardId, sectionId, boardSection, adAccountId)

Update board section

Update a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
<a name="BoardsCreate"></a>
# **BoardsCreate**
> Board BoardsCreate(board, adAccountId)

Create board

Create a board owned by the \&quot;operation user_account\&quot;. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
<a name="BoardsDelete"></a>
# **BoardsDelete**
> BoardsDelete(boardId, adAccountId)

Delete board

Delete a board owned by the \&quot;operation user_account\&quot;. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
<a name="BoardsGet"></a>
# **BoardsGet**
> Board BoardsGet(boardId, adAccountId)

Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
<a name="BoardsList"></a>
# **BoardsList**
> BoardsList200Response BoardsList(adAccountId, bookmark, pageSize, privacy)

List boards

Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
<a name="BoardsListPins"></a>
# **BoardsListPins**
> BoardsListPins200Response BoardsListPins(boardId, bookmark, pageSize, creativeTypes, adAccountId, pinMetrics)

List Pins on board

Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
<a name="BoardsUpdate"></a>
# **BoardsUpdate**
> Board BoardsUpdate(boardId, boardUpdate, adAccountId)

Update board

Update a board owned by the \&quot;operating user_account\&quot;. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
