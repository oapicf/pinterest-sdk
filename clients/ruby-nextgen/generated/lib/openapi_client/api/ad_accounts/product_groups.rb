# frozen_string_literal: true

module OpenapiClient
  module Api
    class AdAccounts::ProductGroups
      def initialize(connection)
        @connection = connection
      end

      def analytics(start_date:, end_date:, product_group_ids:, columns:, granularity:, ad_account_id:, click_window_days: nil, engagement_window_days: nil, view_window_days: nil, conversion_report_time: nil, reporting_timezone: nil)
        raise ArgumentError, 'start_date is required' if start_date.nil?
        raise ArgumentError, 'end_date is required' if end_date.nil?
        raise ArgumentError, 'product_group_ids is required' if product_group_ids.nil?
        raise ArgumentError, 'columns is required' if columns.nil?
        raise ArgumentError, 'granularity is required' if granularity.nil?
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/product_groups/analytics'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: [OpenapiClient::Models::ProductGroupAnalyticsItems],
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'start_date' => start_date, 'end_date' => end_date, 'product_group_ids' => product_group_ids, 'columns' => columns, 'granularity' => granularity, 'click_window_days' => click_window_days, 'engagement_window_days' => engagement_window_days, 'view_window_days' => view_window_days, 'conversion_report_time' => conversion_report_time, 'reporting_timezone' => reporting_timezone }
        )
      end
    end
  end
end
