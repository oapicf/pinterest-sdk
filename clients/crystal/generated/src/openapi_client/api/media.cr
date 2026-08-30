require "json"

module OpenAPIClient
  module Api
  class Media
    def initialize(@conn : Connection); end

    # Register media upload Register your intent to upload media.  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using &#x60;curl&#x60;, for example) to &#x60;upload_url&#x60; using the &#x60;Content-Type&#x60; header value. Send the media file&#39;s contents as the request&#39;s &#x60;file&#x60; parameter and also include all of the parameters from &#x60;upload_parameters&#x60;.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
    def create(media_upload_create : OpenAPIClient::MediaUploadCreate) : Response(OpenAPIClient::MediaUpload)
      @conn.request(OpenAPIClient::MediaUpload,
        method: :POST,
        path: "/media",
        body: media_upload_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get media upload details Get details for a registered media upload, including its current status.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
    def get(media_id : String) : Response(OpenAPIClient::Media)
      @conn.request(OpenAPIClient::Media,
        method: :GET,
        path: "/media/{media_id}".sub("{media_id}", OpenAPIClient.enc(media_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # List media uploads List media uploads filtered by given parameters.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
    def list(*, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::MediaList200Response)
      @conn.request(OpenAPIClient::MediaList200Response,
        method: :GET,
        path: "/media",
        query: { "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
