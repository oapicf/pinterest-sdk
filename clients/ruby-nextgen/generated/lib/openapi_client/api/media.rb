# frozen_string_literal: true

module OpenapiClient
  module Api
    class Media
      def initialize(connection)
        @connection = connection
      end

      def create(media_upload_create:)
        raise ArgumentError, 'media_upload_create is required' if media_upload_create.nil?

        @connection.call(
          :POST,
          '/media',
          type: OpenapiClient::Models::MediaUpload,
          auth: ['pinterest_oauth2'],
          body: media_upload_create
        )
      end

      def get(media_id:)
        raise ArgumentError, 'media_id is required' if media_id.nil?

        @connection.call(
          :GET,
          '/media/{media_id}'
            .gsub('{media_id}', ERB::Util.url_encode(media_id.to_s)),
          type: OpenapiClient::Models::Media,
          auth: ['pinterest_oauth2']
        )
      end

      def list(bookmark: nil, page_size: nil)
        @connection.call(
          :GET,
          '/media',
          type: OpenapiClient::Models::MediaList200Response,
          auth: ['pinterest_oauth2'],
          query: { 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end
    end
  end
end
