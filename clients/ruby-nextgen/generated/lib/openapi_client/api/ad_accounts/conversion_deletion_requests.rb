# frozen_string_literal: true

module OpenapiClient
  module Api
    class AdAccounts::ConversionDeletionRequests
      def initialize(connection)
        @connection = connection
      end

      def create(ad_account_id:, conversion_deletion_request_create:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'conversion_deletion_request_create is required' if conversion_deletion_request_create.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/conversion_deletion_requests'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::ConversionDeletionRequest,
          auth: ['pinterest_oauth2', 'client_credentials'],
          body: conversion_deletion_request_create
        )
      end

      def delete(request_id:, ad_account_id:)
        raise ArgumentError, 'request_id is required' if request_id.nil?
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :DELETE,
          '/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}'
            .gsub('{request_id}', ERB::Util.url_encode(request_id.to_s))
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::ConversionDeletionRequest,
          auth: ['pinterest_oauth2', 'client_credentials']
        )
      end

      def get(request_id:, ad_account_id:)
        raise ArgumentError, 'request_id is required' if request_id.nil?
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}'
            .gsub('{request_id}', ERB::Util.url_encode(request_id.to_s))
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::ConversionDeletionRequest,
          auth: ['pinterest_oauth2', 'client_credentials']
        )
      end

      def list(ad_account_id:, bookmark: nil, page_size: nil, order: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/conversion_deletion_requests'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::ConversionDeletionRequestList200Response,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'bookmark' => bookmark, 'page_size' => page_size, 'order' => order }
        )
      end
    end
  end
end
