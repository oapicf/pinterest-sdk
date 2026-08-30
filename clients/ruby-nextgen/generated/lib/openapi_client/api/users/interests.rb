# frozen_string_literal: true

module OpenapiClient
  module Api
    class Users::Interests
      def initialize(connection)
        @connection = connection
      end

      def follow(username:, bookmark: nil, page_size: nil)
        raise ArgumentError, 'username is required' if username.nil?

        @connection.call(
          :GET,
          '/users/{username}/interests/follow'
            .gsub('{username}', ERB::Util.url_encode(username.to_s)),
          type: OpenapiClient::Models::UserAccountFollowedInterests200Response,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end
    end
  end
end
