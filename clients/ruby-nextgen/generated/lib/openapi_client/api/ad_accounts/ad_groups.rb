# frozen_string_literal: true

module OpenapiClient
  module Api
    class AdAccounts::AdGroups
      def initialize(connection)
        @connection = connection
      end

      def analytics(start_date:, end_date:, ad_group_ids:, columns:, granularity:, ad_account_id:, click_window_days: nil, engagement_window_days: nil, view_window_days: nil, conversion_report_time: nil, aggregate_report_rows: nil, reporting_timezone: nil)
        raise ArgumentError, 'start_date is required' if start_date.nil?
        raise ArgumentError, 'end_date is required' if end_date.nil?
        raise ArgumentError, 'ad_group_ids is required' if ad_group_ids.nil?
        raise ArgumentError, 'columns is required' if columns.nil?
        raise ArgumentError, 'granularity is required' if granularity.nil?
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/ad_groups/analytics'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: [OpenapiClient::Models::AdGroupsAnalyticsMetrics],
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'start_date' => start_date, 'end_date' => end_date, 'ad_group_ids' => ad_group_ids, 'columns' => columns, 'granularity' => granularity, 'click_window_days' => click_window_days, 'engagement_window_days' => engagement_window_days, 'view_window_days' => view_window_days, 'conversion_report_time' => conversion_report_time, 'aggregate_report_rows' => aggregate_report_rows, 'reporting_timezone' => reporting_timezone }
        )
      end

      def audience_sizing(ad_account_id:, ad_group_audience_sizing_create:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'ad_group_audience_sizing_create is required' if ad_group_audience_sizing_create.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/ad_groups/audience_sizing'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::AdGroupAudienceSizing,
          auth: ['pinterest_oauth2', 'client_credentials'],
          body: ad_group_audience_sizing_create
        )
      end

      def bulk_partial_update(ad_account_id:, ad_group_update_batch_update:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'ad_group_update_batch_update is required' if ad_group_update_batch_update.nil?

        @connection.call(
          :PATCH,
          '/ad_accounts/{ad_account_id}/ad_groups'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::AdGroupsCreate200Response,
          auth: ['pinterest_oauth2'],
          body: ad_group_update_batch_update
        )
      end

      def create(ad_account_id:, ad_group_create_create:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'ad_group_create_create is required' if ad_group_create_create.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/ad_groups'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::AdGroupsCreate200Response,
          auth: ['pinterest_oauth2'],
          body: ad_group_create_create
        )
      end

      def dynamic_titles(ad_account_id:, ad_group_id:, dynamic_titles_process_csv_create:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'ad_group_id is required' if ad_group_id.nil?
        raise ArgumentError, 'dynamic_titles_process_csv_create is required' if dynamic_titles_process_csv_create.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s))
            .gsub('{ad_group_id}', ERB::Util.url_encode(ad_group_id.to_s)),
          type: OpenapiClient::Models::DynamicTitlesProcessCSV,
          auth: ['pinterest_oauth2'],
          body: dynamic_titles_process_csv_create
        )
      end

      def dynamic_titles_csv(ad_account_id:, ad_group_id:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'ad_group_id is required' if ad_group_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s))
            .gsub('{ad_group_id}', ERB::Util.url_encode(ad_group_id.to_s)),
          type: OpenapiClient::Models::DynamicTitlesDownloadCSV,
          auth: ['pinterest_oauth2']
        )
      end

      def dynamic_titles_status(ad_account_id:, ad_group_id:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'ad_group_id is required' if ad_group_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s))
            .gsub('{ad_group_id}', ERB::Util.url_encode(ad_group_id.to_s)),
          type: OpenapiClient::Models::DynamicTitlesGetStatus,
          auth: ['pinterest_oauth2']
        )
      end

      def dynamic_titles_uploads(ad_account_id:, ad_group_id:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'ad_group_id is required' if ad_group_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s))
            .gsub('{ad_group_id}', ERB::Util.url_encode(ad_group_id.to_s)),
          type: OpenapiClient::Models::DynamicTitlesUploadURL,
          auth: ['pinterest_oauth2']
        )
      end

      def get(ad_group_id:, ad_account_id:)
        raise ArgumentError, 'ad_group_id is required' if ad_group_id.nil?
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}'
            .gsub('{ad_group_id}', ERB::Util.url_encode(ad_group_id.to_s))
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::AdGroup,
          auth: ['pinterest_oauth2', 'client_credentials']
        )
      end

      def list(ad_account_id:, bookmark: nil, page_size: nil, order: nil, campaign_ids: nil, ad_group_ids: nil, entity_statuses: nil, translate_interests_to_names: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/ad_groups'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::AdGroupsList200Response,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'bookmark' => bookmark, 'page_size' => page_size, 'order' => order, 'campaign_ids' => campaign_ids, 'ad_group_ids' => ad_group_ids, 'entity_statuses' => entity_statuses, 'translate_interests_to_names' => translate_interests_to_names }
        )
      end

      def targeting_analytics(ad_account_id:, ad_group_ids:, start_date:, end_date:, targeting_types:, columns:, granularity:, click_window_days: nil, engagement_window_days: nil, view_window_days: nil, conversion_report_time: nil, attribution_types: nil, reporting_timezone: nil, sort_columns: nil, sort_ascending: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'ad_group_ids is required' if ad_group_ids.nil?
        raise ArgumentError, 'start_date is required' if start_date.nil?
        raise ArgumentError, 'end_date is required' if end_date.nil?
        raise ArgumentError, 'targeting_types is required' if targeting_types.nil?
        raise ArgumentError, 'columns is required' if columns.nil?
        raise ArgumentError, 'granularity is required' if granularity.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::MetricsResponse,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'ad_group_ids' => ad_group_ids, 'start_date' => start_date, 'end_date' => end_date, 'targeting_types' => targeting_types, 'columns' => columns, 'granularity' => granularity, 'click_window_days' => click_window_days, 'engagement_window_days' => engagement_window_days, 'view_window_days' => view_window_days, 'conversion_report_time' => conversion_report_time, 'attribution_types' => attribution_types, 'reporting_timezone' => reporting_timezone, 'sort_columns' => sort_columns, 'sort_ascending' => sort_ascending }
        )
      end
    end
  end
end
