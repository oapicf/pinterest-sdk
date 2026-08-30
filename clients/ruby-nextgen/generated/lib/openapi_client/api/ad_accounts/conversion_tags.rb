# frozen_string_literal: true

module OpenapiClient
  module Api
    class AdAccounts::ConversionTags
      def initialize(connection)
        @connection = connection
      end

      def create(ad_account_id:, conversion_tag_create:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'conversion_tag_create is required' if conversion_tag_create.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/conversion_tags'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::ConversionTag,
          auth: ['pinterest_oauth2'],
          body: conversion_tag_create
        )
      end

      def get(ad_account_id:, conversion_tag_id:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'conversion_tag_id is required' if conversion_tag_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s))
            .gsub('{conversion_tag_id}', ERB::Util.url_encode(conversion_tag_id.to_s)),
          type: OpenapiClient::Models::ConversionTag,
          auth: ['pinterest_oauth2', 'client_credentials']
        )
      end

      def list(ad_account_id:, filter_deleted: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/conversion_tags'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::ConversionTagsList200Response,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'filter_deleted' => filter_deleted }
        )
      end

      def ocpm_eligible(ad_account_id:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: nil,
          auth: ['pinterest_oauth2', 'client_credentials']
        )
      end

      def page_visit(ad_account_id:, bookmark: nil, page_size: nil, order: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/conversion_tags/page_visit'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::PageVisitConversionTagsGet200Response,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'bookmark' => bookmark, 'page_size' => page_size, 'order' => order }
        )
      end
    end
  end
end
