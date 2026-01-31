require 'json'


MyApp.add_route('POST', '/v5/media', {
  "resourcePath" => "/Media",
  "summary" => "Register media upload",
  "nickname" => "media/create",
  "responseClass" => "MediaUpload",
  "endpoint" => "/media",
  "notes" => "Register your intent to upload media.  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using `curl`, for example) to `upload_url` using the `Content-Type` header value. Send the media file's contents as the request's `file` parameter and also include all of the parameters from `upload_parameters`.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "MediaUploadCreate",
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
  "responseClass" => "Media",
  "endpoint" => "/media/{media_id}",
  "notes" => "Get details for a registered media upload, including its current status.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.",
  "parameters" => [
    {
      "name" => "media_id",
      "description" => "Unique identifier for this media upload. Used to track status and for attaching during Pin creation.",
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
  "responseClass" => "media_list_200_response",
  "endpoint" => "/media",
  "notes" => "List media uploads filtered by given parameters.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.",
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
      "description" => "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.",
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

