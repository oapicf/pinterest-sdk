# frozen_string_literal: true

module OpenapiClient
  module Api
    class Boards::Sections
      def initialize(connection)
        @connection = connection
      end

      def create(board_id:, board_section_create:, ad_account_id: nil)
        raise ArgumentError, 'board_id is required' if board_id.nil?
        raise ArgumentError, 'board_section_create is required' if board_section_create.nil?

        @connection.call(
          :POST,
          '/boards/{board_id}/sections'
            .gsub('{board_id}', ERB::Util.url_encode(board_id.to_s)),
          type: OpenapiClient::Models::BoardSection,
          auth: ['pinterest_oauth2'],
          query: { 'ad_account_id' => ad_account_id },
          body: board_section_create
        )
      end

      def delete(board_id:, section_id:, ad_account_id: nil)
        raise ArgumentError, 'board_id is required' if board_id.nil?
        raise ArgumentError, 'section_id is required' if section_id.nil?

        @connection.call(
          :DELETE,
          '/boards/{board_id}/sections/{section_id}'
            .gsub('{board_id}', ERB::Util.url_encode(board_id.to_s))
            .gsub('{section_id}', ERB::Util.url_encode(section_id.to_s)),
          type: OpenapiClient::Models::BoardSection,
          auth: ['pinterest_oauth2'],
          query: { 'ad_account_id' => ad_account_id }
        )
      end

      def list(board_id:, ad_account_id: nil, bookmark: nil, page_size: nil)
        raise ArgumentError, 'board_id is required' if board_id.nil?

        @connection.call(
          :GET,
          '/boards/{board_id}/sections'
            .gsub('{board_id}', ERB::Util.url_encode(board_id.to_s)),
          type: OpenapiClient::Models::BoardSectionsList200Response,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'ad_account_id' => ad_account_id, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end

      def partial_update(board_id:, section_id:, board_section_update_with_required_body:, ad_account_id: nil)
        raise ArgumentError, 'board_id is required' if board_id.nil?
        raise ArgumentError, 'section_id is required' if section_id.nil?
        raise ArgumentError, 'board_section_update_with_required_body is required' if board_section_update_with_required_body.nil?

        @connection.call(
          :PATCH,
          '/boards/{board_id}/sections/{section_id}'
            .gsub('{board_id}', ERB::Util.url_encode(board_id.to_s))
            .gsub('{section_id}', ERB::Util.url_encode(section_id.to_s)),
          type: OpenapiClient::Models::BoardSection,
          auth: ['pinterest_oauth2'],
          query: { 'ad_account_id' => ad_account_id },
          body: board_section_update_with_required_body
        )
      end

      def pins(board_id:, section_id:, ad_account_id: nil, bookmark: nil, page_size: nil)
        raise ArgumentError, 'board_id is required' if board_id.nil?
        raise ArgumentError, 'section_id is required' if section_id.nil?

        @connection.call(
          :GET,
          '/boards/{board_id}/sections/{section_id}/pins'
            .gsub('{board_id}', ERB::Util.url_encode(board_id.to_s))
            .gsub('{section_id}', ERB::Util.url_encode(section_id.to_s)),
          type: OpenapiClient::Models::BoardsListPins200Response,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'ad_account_id' => ad_account_id, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end
    end
  end
end
