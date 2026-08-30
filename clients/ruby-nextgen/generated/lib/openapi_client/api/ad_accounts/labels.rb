# frozen_string_literal: true

module OpenapiClient
  module Api
    class AdAccounts::Labels
      def initialize(connection)
        @connection = connection
      end

      def apply(ad_account_id:, label_id:, labeled_entities_create:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'label_id is required' if label_id.nil?
        raise ArgumentError, 'labeled_entities_create is required' if labeled_entities_create.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/labels/{label_id}/apply'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s))
            .gsub('{label_id}', ERB::Util.url_encode(label_id.to_s)),
          type: OpenapiClient::Models::LabeledEntities,
          auth: ['pinterest_oauth2'],
          body: labeled_entities_create
        )
      end

      def bulk_partial_update(ad_account_id:, label_update_request:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'label_update_request is required' if label_update_request.nil?

        @connection.call(
          :PATCH,
          '/ad_accounts/{ad_account_id}/labels'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::LabelsResponse,
          auth: ['pinterest_oauth2'],
          body: label_update_request
        )
      end

      def create(ad_account_id:, label_create_request:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'label_create_request is required' if label_create_request.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/labels'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::LabelsResponse,
          auth: ['pinterest_oauth2'],
          body: label_create_request
        )
      end

      def list(ad_account_id:, campaign_ids: nil, label_ids: nil, entity_statuses: nil, label_types: nil, bookmark: nil, page_size: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/labels'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::LabelsList200Response,
          auth: ['pinterest_oauth2'],
          query: { 'campaign_ids' => campaign_ids, 'label_ids' => label_ids, 'entity_statuses' => entity_statuses, 'label_types' => label_types, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end

      def remove(ad_account_id:, label_id:, labeled_entities_create:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'label_id is required' if label_id.nil?
        raise ArgumentError, 'labeled_entities_create is required' if labeled_entities_create.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/labels/{label_id}/remove'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s))
            .gsub('{label_id}', ERB::Util.url_encode(label_id.to_s)),
          type: OpenapiClient::Models::LabeledEntities,
          auth: ['pinterest_oauth2'],
          body: labeled_entities_create
        )
      end
    end
  end
end
