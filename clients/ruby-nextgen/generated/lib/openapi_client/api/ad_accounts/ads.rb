# frozen_string_literal: true

module OpenapiClient
  module Api
    class AdAccounts::Ads
      def initialize(connection)
        @connection = connection
      end

      def analytics(start_date:, end_date:, columns:, granularity:, ad_account_id:, pin_ids: nil, ad_ids: nil, click_window_days: nil, engagement_window_days: nil, view_window_days: nil, conversion_report_time: nil, campaign_ids: nil, reporting_timezone: nil)
        raise ArgumentError, 'start_date is required' if start_date.nil?
        raise ArgumentError, 'end_date is required' if end_date.nil?
        raise ArgumentError, 'columns is required' if columns.nil?
        raise ArgumentError, 'granularity is required' if granularity.nil?
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/ads/analytics'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: [OpenapiClient::Models::AdsAnalytics],
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'pin_ids' => pin_ids, 'start_date' => start_date, 'end_date' => end_date, 'ad_ids' => ad_ids, 'columns' => columns, 'granularity' => granularity, 'click_window_days' => click_window_days, 'engagement_window_days' => engagement_window_days, 'view_window_days' => view_window_days, 'conversion_report_time' => conversion_report_time, 'campaign_ids' => campaign_ids, 'reporting_timezone' => reporting_timezone }
        )
      end

      def bulk_partial_update(ad_account_id:, ad_batch_update:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'ad_batch_update is required' if ad_batch_update.nil?

        @connection.call(
          :PATCH,
          '/ad_accounts/{ad_account_id}/ads'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::AdBatchWriteResponseModel,
          auth: ['pinterest_oauth2'],
          body: ad_batch_update
        )
      end

      def create(ad_account_id:, ad_create:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'ad_create is required' if ad_create.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/ads'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::AdBatchWriteResponseModel,
          auth: ['pinterest_oauth2'],
          body: ad_create
        )
      end

      def get(ad_id:, ad_account_id:)
        raise ArgumentError, 'ad_id is required' if ad_id.nil?
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/ads/{ad_id}'
            .gsub('{ad_id}', ERB::Util.url_encode(ad_id.to_s))
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::Ad,
          auth: ['pinterest_oauth2', 'client_credentials']
        )
      end

      def list(ad_account_id:, bookmark: nil, page_size: nil, order: nil, campaign_ids: nil, ad_group_ids: nil, ad_ids: nil, entity_statuses: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/ads'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::AdsList200Response,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'bookmark' => bookmark, 'page_size' => page_size, 'order' => order, 'campaign_ids' => campaign_ids, 'ad_group_ids' => ad_group_ids, 'ad_ids' => ad_ids, 'entity_statuses' => entity_statuses }
        )
      end

      def targeting_analytics(ad_account_id:, ad_ids:, start_date:, end_date:, targeting_types:, columns:, granularity:, click_window_days: nil, engagement_window_days: nil, view_window_days: nil, conversion_report_time: nil, attribution_types: nil, reporting_timezone: nil, sort_columns: nil, sort_ascending: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'ad_ids is required' if ad_ids.nil?
        raise ArgumentError, 'start_date is required' if start_date.nil?
        raise ArgumentError, 'end_date is required' if end_date.nil?
        raise ArgumentError, 'targeting_types is required' if targeting_types.nil?
        raise ArgumentError, 'columns is required' if columns.nil?
        raise ArgumentError, 'granularity is required' if granularity.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/ads/targeting_analytics'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::MetricsResponse,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'ad_ids' => ad_ids, 'start_date' => start_date, 'end_date' => end_date, 'targeting_types' => targeting_types, 'columns' => columns, 'granularity' => granularity, 'click_window_days' => click_window_days, 'engagement_window_days' => engagement_window_days, 'view_window_days' => view_window_days, 'conversion_report_time' => conversion_report_time, 'attribution_types' => attribution_types, 'reporting_timezone' => reporting_timezone, 'sort_columns' => sort_columns, 'sort_ascending' => sort_ascending }
        )
      end
    end
  end
end
