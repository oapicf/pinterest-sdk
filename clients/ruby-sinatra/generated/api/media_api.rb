require 'json'


MyApp.add_route('POST', '/v5/media', {
  "resourcePath" => "/Media",
  "summary" => "Register media upload",
  "nickname" => "media/create",
  "responseClass" => "MediaUpload",
  "endpoint" => "/media",
  "notes" => "Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using <tt>curl</tt>, for example) to <tt>upload_url</tt> using the <tt>Content-Type</tt> header value. Send the media file's contents as the request's <tt>file</tt> parameter and also include all of the parameters from <tt>upload_parameters</tt>.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.",
  "parameters" => [
    {
      "name" => "body",
      "description" => "Create a media upload request",
      "dataType" => "MediaUploadRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/media/{media_id}', {
  "resourcePath" => "/Media",
  "summary" => "Get media upload details",
  "nickname" => "media/get",
  "responseClass" => "MediaUploadDetails",
  "endpoint" => "/media/{media_id}",
  "notes" => "Get details for a registered media upload, including its current status.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.",
  "parameters" => [
    {
      "name" => "media_id",
      "description" => "Media identifier",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/media', {
  "resourcePath" => "/Media",
  "summary" => "List media uploads",
  "nickname" => "media/list",
  "responseClass" => "Paginated",
  "endpoint" => "/media",
  "notes" => "List media uploads filtered by given parameters.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.",
  "parameters" => [
    {
      "name" => "bookmark",
      "description" => "Cursor used to fetch the next page of items",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "page_size",
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

