# frozen_string_literal: true

module OpenapiClient
  module Api
    class AdAccounts::Campaigns
      def initialize(connection)
        @connection = connection
      end

      def analytics(start_date:, end_date:, campaign_ids:, columns:, granularity:, ad_account_id:, click_window_days: nil, engagement_window_days: nil, view_window_days: nil, conversion_report_time: nil, aggregate_report_rows: nil, reporting_timezone: nil)
        raise ArgumentError, 'start_date is required' if start_date.nil?
        raise ArgumentError, 'end_date is required' if end_date.nil?
        raise ArgumentError, 'campaign_ids is required' if campaign_ids.nil?
        raise ArgumentError, 'columns is required' if columns.nil?
        raise ArgumentError, 'granularity is required' if granularity.nil?
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/campaigns/analytics'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: [OpenapiClient::Models::CampaignsAnalyticsMetrics],
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'start_date' => start_date, 'end_date' => end_date, 'campaign_ids' => campaign_ids, 'columns' => columns, 'granularity' => granularity, 'click_window_days' => click_window_days, 'engagement_window_days' => engagement_window_days, 'view_window_days' => view_window_days, 'conversion_report_time' => conversion_report_time, 'aggregate_report_rows' => aggregate_report_rows, 'reporting_timezone' => reporting_timezone }
        )
      end

      def bulk_partial_update(ad_account_id:, campaign_batch_update_item:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'campaign_batch_update_item is required' if campaign_batch_update_item.nil?

        @connection.call(
          :PATCH,
          '/ad_accounts/{ad_account_id}/campaigns'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::CampaignBatchWriteResponseModel,
          auth: ['pinterest_oauth2'],
          body: campaign_batch_update_item
        )
      end

      def create(ad_account_id:, campaign_create_item:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'campaign_create_item is required' if campaign_create_item.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/campaigns'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::CampaignBatchWriteResponseModel,
          auth: ['pinterest_oauth2'],
          body: campaign_create_item
        )
      end

      def delivery_estimates(ad_account_id:, campaign_delivery_estimates_campaign:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'campaign_delivery_estimates_campaign is required' if campaign_delivery_estimates_campaign.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/campaigns/delivery_estimates'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::CampaignDeliveryEstimatesResponse,
          auth: ['pinterest_oauth2'],
          body: campaign_delivery_estimates_campaign
        )
      end

      def get(campaign_id:, ad_account_id:)
        raise ArgumentError, 'campaign_id is required' if campaign_id.nil?
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/campaigns/{campaign_id}'
            .gsub('{campaign_id}', ERB::Util.url_encode(campaign_id.to_s))
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::Campaign,
          auth: ['pinterest_oauth2', 'client_credentials']
        )
      end

      def list(ad_account_id:, bookmark: nil, page_size: nil, order: nil, campaign_ids: nil, entity_statuses: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/campaigns'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::CampaignsList200Response,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'bookmark' => bookmark, 'page_size' => page_size, 'order' => order, 'campaign_ids' => campaign_ids, 'entity_statuses' => entity_statuses }
        )
      end

      def targeting_analytics(ad_account_id:, campaign_ids:, start_date:, end_date:, targeting_types:, columns:, granularity:, click_window_days: nil, engagement_window_days: nil, view_window_days: nil, conversion_report_time: nil, attribution_types: nil, reporting_timezone: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'campaign_ids is required' if campaign_ids.nil?
        raise ArgumentError, 'start_date is required' if start_date.nil?
        raise ArgumentError, 'end_date is required' if end_date.nil?
        raise ArgumentError, 'targeting_types is required' if targeting_types.nil?
        raise ArgumentError, 'columns is required' if columns.nil?
        raise ArgumentError, 'granularity is required' if granularity.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/campaigns/targeting_analytics'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::MetricsResponse,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'campaign_ids' => campaign_ids, 'start_date' => start_date, 'end_date' => end_date, 'targeting_types' => targeting_types, 'columns' => columns, 'granularity' => granularity, 'click_window_days' => click_window_days, 'engagement_window_days' => engagement_window_days, 'view_window_days' => view_window_days, 'conversion_report_time' => conversion_report_time, 'attribution_types' => attribution_types, 'reporting_timezone' => reporting_timezone }
        )
      end
    end
  end
end
