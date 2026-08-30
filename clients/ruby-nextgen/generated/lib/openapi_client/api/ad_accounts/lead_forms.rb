# frozen_string_literal: true

module OpenapiClient
  module Api
    class AdAccounts::LeadForms
      def initialize(connection)
        @connection = connection
      end

      def bulk_partial_update(ad_account_id:, lead_form_batch_update:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'lead_form_batch_update is required' if lead_form_batch_update.nil?

        @connection.call(
          :PATCH,
          '/ad_accounts/{ad_account_id}/lead_forms'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::LeadFormsCreate200Response,
          auth: ['pinterest_oauth2'],
          body: lead_form_batch_update
        )
      end

      def create(ad_account_id:, lead_form_create:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'lead_form_create is required' if lead_form_create.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/lead_forms'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::LeadFormsCreate200Response,
          auth: ['pinterest_oauth2'],
          body: lead_form_create
        )
      end

      def get(lead_form_id:, ad_account_id:)
        raise ArgumentError, 'lead_form_id is required' if lead_form_id.nil?
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}'
            .gsub('{lead_form_id}', ERB::Util.url_encode(lead_form_id.to_s))
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::LeadForm,
          auth: ['pinterest_oauth2']
        )
      end

      def list(ad_account_id:, bookmark: nil, page_size: nil, order: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/lead_forms'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::LeadFormsList200Response,
          auth: ['pinterest_oauth2'],
          query: { 'bookmark' => bookmark, 'page_size' => page_size, 'order' => order }
        )
      end

      def test(ad_account_id:, lead_form_id:, lead_form_test_create:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'lead_form_id is required' if lead_form_id.nil?
        raise ArgumentError, 'lead_form_test_create is required' if lead_form_test_create.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s))
            .gsub('{lead_form_id}', ERB::Util.url_encode(lead_form_id.to_s)),
          type: OpenapiClient::Models::LeadFormTest,
          auth: ['pinterest_oauth2'],
          body: lead_form_test_create
        )
      end
    end
  end
end
