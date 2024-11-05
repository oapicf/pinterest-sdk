# media_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MediaCreate**](media_api.md#MediaCreate) | **POST** /media | Register media upload
[**MediaGet**](media_api.md#MediaGet) | **GET** /media/{media_id} | Get media upload details
[**MediaList**](media_api.md#MediaList) | **GET** /media | List media uploads


<a name="MediaCreate"></a>
# **MediaCreate**
> MediaUpload MediaCreate(mediaUploadRequest)

Register media upload

Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using &lt;tt&gt;curl&lt;/tt&gt;, for example) to &lt;tt&gt;upload_url&lt;/tt&gt; using the &lt;tt&gt;Content-Type&lt;/tt&gt; header value. Send the media file&#39;s contents as the request&#39;s &lt;tt&gt;file&lt;/tt&gt; parameter and also include all of the parameters from &lt;tt&gt;upload_parameters&lt;/tt&gt;.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/api-features/creating-boards-and-pins/#creating-video-pins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
<a name="MediaGet"></a>
# **MediaGet**
> MediaUploadDetails MediaGet(mediaId)

Get media upload details

Get details for a registered media upload, including its current status.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/api-features/creating-boards-and-pins/#creating-video-pins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
<a name="MediaList"></a>
# **MediaList**
> MediaList200Response MediaList(bookmark, pageSize)

List media uploads

List media uploads filtered by given parameters.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/api-features/creating-boards-and-pins/#creating-video-pins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
