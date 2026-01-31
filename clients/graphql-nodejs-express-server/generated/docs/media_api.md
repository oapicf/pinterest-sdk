# media_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MediaCreate**](media_api.md#MediaCreate) | **POST** /media | Register media upload
[**MediaGet**](media_api.md#MediaGet) | **GET** /media/{media_id} | Get media upload details
[**MediaList**](media_api.md#MediaList) | **GET** /media | List media uploads


<a name="MediaCreate"></a>
# **MediaCreate**
> MediaUpload MediaCreate(mediaUploadCreate)

Register media upload

Register your intent to upload media.  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using &#x60;curl&#x60;, for example) to &#x60;upload_url&#x60; using the &#x60;Content-Type&#x60; header value. Send the media file&#39;s contents as the request&#39;s &#x60;file&#x60; parameter and also include all of the parameters from &#x60;upload_parameters&#x60;.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
<a name="MediaGet"></a>
# **MediaGet**
> Media MediaGet(mediaId)

Get media upload details

Get details for a registered media upload, including its current status.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
<a name="MediaList"></a>
# **MediaList**
> MediaList200Response MediaList(bookmark, pageSize)

List media uploads

List media uploads filtered by given parameters.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
