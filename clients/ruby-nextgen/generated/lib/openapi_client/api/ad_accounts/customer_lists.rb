# frozen_string_literal: true

module OpenapiClient
  module Api
    class AdAccounts::CustomerLists
      def initialize(connection)
        @connection = connection
      end

      def create(ad_account_id:, customer_list_create:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'customer_list_create is required' if customer_list_create.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/customer_lists'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::CustomerList,
          auth: ['pinterest_oauth2'],
          body: customer_list_create
        )
      end

      def get(ad_account_id:, customer_list_id:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'customer_list_id is required' if customer_list_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s))
            .gsub('{customer_list_id}', ERB::Util.url_encode(customer_list_id.to_s)),
          type: OpenapiClient::Models::CustomerList,
          auth: ['pinterest_oauth2', 'client_credentials']
        )
      end

      def list(ad_account_id:, bookmark: nil, page_size: nil, order: nil, exclude_nca: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/customer_lists'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::CustomerListsList200Response,
          auth: ['pinterest_oauth2'],
          query: { 'bookmark' => bookmark, 'page_size' => page_size, 'order' => order, 'exclude_nca' => exclude_nca }
        )
      end

      def partial_update(ad_account_id:, customer_list_id:, customer_list_update_with_required_body:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'customer_list_id is required' if customer_list_id.nil?
        raise ArgumentError, 'customer_list_update_with_required_body is required' if customer_list_update_with_required_body.nil?

        @connection.call(
          :PATCH,
          '/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s))
            .gsub('{customer_list_id}', ERB::Util.url_encode(customer_list_id.to_s)),
          type: OpenapiClient::Models::CustomerList,
          auth: ['pinterest_oauth2'],
          body: customer_list_update_with_required_body
        )
      end

      def uploads(ad_account_id:, customer_list_id:, customer_list_upload_create_request:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'customer_list_id is required' if customer_list_id.nil?
        raise ArgumentError, 'customer_list_upload_create_request is required' if customer_list_upload_create_request.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s))
            .gsub('{customer_list_id}', ERB::Util.url_encode(customer_list_id.to_s)),
          type: OpenapiClient::Models::CustomerListUploadCreateResponse,
          auth: ['pinterest_oauth2'],
          body: customer_list_upload_create_request
        )
      end

      def uploads_get(ad_account_id:, customer_list_id:, customer_list_upload_id:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'customer_list_id is required' if customer_list_id.nil?
        raise ArgumentError, 'customer_list_upload_id is required' if customer_list_upload_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s))
            .gsub('{customer_list_id}', ERB::Util.url_encode(customer_list_id.to_s))
            .gsub('{customer_list_upload_id}', ERB::Util.url_encode(customer_list_upload_id.to_s)),
          type: OpenapiClient::Models::CustomerListUpload,
          auth: ['pinterest_oauth2']
        )
      end

      def uploads_run(ad_account_id:, customer_list_id:, customer_list_upload_id:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'customer_list_id is required' if customer_list_id.nil?
        raise ArgumentError, 'customer_list_upload_id is required' if customer_list_upload_id.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s))
            .gsub('{customer_list_id}', ERB::Util.url_encode(customer_list_id.to_s))
            .gsub('{customer_list_upload_id}', ERB::Util.url_encode(customer_list_upload_id.to_s)),
          type: OpenapiClient::Models::CustomerListUpload,
          auth: ['pinterest_oauth2']
        )
      end
    end
  end
end
