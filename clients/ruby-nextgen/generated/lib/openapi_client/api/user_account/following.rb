# frozen_string_literal: true

module OpenapiClient
  module Api
    class UserAccount::Following
      def initialize(connection)
        @connection = connection
      end

      def boards(ad_account_id: nil, explicit_following: nil, bookmark: nil, page_size: nil)
        @connection.call(
          :GET,
          '/user_account/following/boards',
          type: OpenapiClient::Models::BoardsList200Response,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'ad_account_id' => ad_account_id, 'explicit_following' => explicit_following, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end

      def create(username:, follow_user_create:)
        raise ArgumentError, 'username is required' if username.nil?
        raise ArgumentError, 'follow_user_create is required' if follow_user_create.nil?

        @connection.call(
          :POST,
          '/user_account/following/{username}'
            .gsub('{username}', ERB::Util.url_encode(username.to_s)),
          type: OpenapiClient::Models::FollowUser,
          auth: ['pinterest_oauth2'],
          body: follow_user_create
        )
      end

      def list(ad_account_id: nil, explicit_following: nil, feed_type: nil, bookmark: nil, page_size: nil)
        @connection.call(
          :GET,
          '/user_account/following',
          type: OpenapiClient::Models::FollowersList200Response,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'ad_account_id' => ad_account_id, 'explicit_following' => explicit_following, 'feed_type' => feed_type, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end
    end
  end
end
