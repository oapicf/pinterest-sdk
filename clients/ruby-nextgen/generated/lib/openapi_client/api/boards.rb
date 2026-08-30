# frozen_string_literal: true

module OpenapiClient
  module Api
    class Boards
      def initialize(connection)
        @connection = connection
      end

      def create(board_create:, ad_account_id: nil)
        raise ArgumentError, 'board_create is required' if board_create.nil?

        @connection.call(
          :POST,
          '/boards',
          type: OpenapiClient::Models::Board,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'ad_account_id' => ad_account_id },
          body: board_create
        )
      end

      def delete(board_id:, ad_account_id: nil)
        raise ArgumentError, 'board_id is required' if board_id.nil?

        @connection.call(
          :DELETE,
          '/boards/{board_id}'
            .gsub('{board_id}', ERB::Util.url_encode(board_id.to_s)),
          type: OpenapiClient::Models::Board,
          auth: ['pinterest_oauth2'],
          query: { 'ad_account_id' => ad_account_id }
        )
      end

      def get(board_id:, ad_account_id: nil)
        raise ArgumentError, 'board_id is required' if board_id.nil?

        @connection.call(
          :GET,
          '/boards/{board_id}'
            .gsub('{board_id}', ERB::Util.url_encode(board_id.to_s)),
          type: OpenapiClient::Models::Board,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'ad_account_id' => ad_account_id }
        )
      end

      def list(ad_account_id: nil, privacy: nil, bookmark: nil, page_size: nil)
        @connection.call(
          :GET,
          '/boards',
          type: OpenapiClient::Models::BoardsList200Response,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'ad_account_id' => ad_account_id, 'privacy' => privacy, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end

      def partial_update(board_id:, board_with_update_privacy_update:, ad_account_id: nil)
        raise ArgumentError, 'board_id is required' if board_id.nil?
        raise ArgumentError, 'board_with_update_privacy_update is required' if board_with_update_privacy_update.nil?

        @connection.call(
          :PATCH,
          '/boards/{board_id}'
            .gsub('{board_id}', ERB::Util.url_encode(board_id.to_s)),
          type: OpenapiClient::Models::BoardWithUpdatePrivacy,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'ad_account_id' => ad_account_id },
          body: board_with_update_privacy_update
        )
      end
    end
  end
end
