# frozen_string_literal: true

module OpenapiClient
  module Api
    class UserAccount
      def initialize(connection)
        @connection = connection
      end

      def analytics(start_date:, end_date:, from_claimed_content: nil, pin_format: nil, app_types: nil, content_type: nil, source: nil, metric_types: nil, split_field: nil, ad_account_id: nil)
        raise ArgumentError, 'start_date is required' if start_date.nil?
        raise ArgumentError, 'end_date is required' if end_date.nil?

        @connection.call(
          :GET,
          '/user_account/analytics',
          type: nil,
          auth: ['pinterest_oauth2'],
          query: { 'start_date' => start_date, 'end_date' => end_date, 'from_claimed_content' => from_claimed_content, 'pin_format' => pin_format, 'app_types' => app_types, 'content_type' => content_type, 'source' => source, 'metric_types' => metric_types, 'split_field' => split_field, 'ad_account_id' => ad_account_id }
        )
      end

      def analytics_top_pins(start_date:, end_date:, sort_by:, from_claimed_content: nil, pin_format: nil, app_types: nil, content_type: nil, source: nil, metric_types: nil, num_of_pins: nil, created_in_last_n_days: nil, ad_account_id: nil)
        raise ArgumentError, 'start_date is required' if start_date.nil?
        raise ArgumentError, 'end_date is required' if end_date.nil?
        raise ArgumentError, 'sort_by is required' if sort_by.nil?

        @connection.call(
          :GET,
          '/user_account/analytics/top_pins',
          type: OpenapiClient::Models::TopPinsAnalyticsResponse,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'start_date' => start_date, 'end_date' => end_date, 'sort_by' => sort_by, 'from_claimed_content' => from_claimed_content, 'pin_format' => pin_format, 'app_types' => app_types, 'content_type' => content_type, 'source' => source, 'metric_types' => metric_types, 'num_of_pins' => num_of_pins, 'created_in_last_n_days' => created_in_last_n_days, 'ad_account_id' => ad_account_id }
        )
      end

      def analytics_top_video_pins(start_date:, end_date:, sort_by:, from_claimed_content: nil, pin_format: nil, app_types: nil, content_type: nil, source: nil, metric_types: nil, num_of_pins: nil, created_in_last_n_days: nil, ad_account_id: nil)
        raise ArgumentError, 'start_date is required' if start_date.nil?
        raise ArgumentError, 'end_date is required' if end_date.nil?
        raise ArgumentError, 'sort_by is required' if sort_by.nil?

        @connection.call(
          :GET,
          '/user_account/analytics/top_video_pins',
          type: OpenapiClient::Models::TopVideoPinsAnalyticsResponse,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'start_date' => start_date, 'end_date' => end_date, 'sort_by' => sort_by, 'from_claimed_content' => from_claimed_content, 'pin_format' => pin_format, 'app_types' => app_types, 'content_type' => content_type, 'source' => source, 'metric_types' => metric_types, 'num_of_pins' => num_of_pins, 'created_in_last_n_days' => created_in_last_n_days, 'ad_account_id' => ad_account_id }
        )
      end

      def followers(bookmark: nil, page_size: nil)
        @connection.call(
          :GET,
          '/user_account/followers',
          type: OpenapiClient::Models::FollowersList200Response,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end

      def list(ad_account_id: nil)
        @connection.call(
          :GET,
          '/user_account',
          type: OpenapiClient::Models::Account,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'ad_account_id' => ad_account_id }
        )
      end

      def websites(bookmark: nil, page_size: nil)
        @connection.call(
          :GET,
          '/user_account/websites',
          type: OpenapiClient::Models::UserWebsitesGet200Response,
          auth: ['pinterest_oauth2'],
          query: { 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end

      def websites_delete(website:)
        raise ArgumentError, 'website is required' if website.nil?

        @connection.call(
          :DELETE,
          '/user_account/websites',
          type: OpenapiClient::Models::UserWebsite,
          auth: ['pinterest_oauth2'],
          query: { 'website' => website }
        )
      end

      def websites_post(user_website_create:, ad_account_id: nil)
        raise ArgumentError, 'user_website_create is required' if user_website_create.nil?

        @connection.call(
          :POST,
          '/user_account/websites',
          type: OpenapiClient::Models::UserWebsite,
          auth: ['pinterest_oauth2'],
          query: { 'ad_account_id' => ad_account_id },
          body: user_website_create
        )
      end

      def websites_verification(ad_account_id: nil)
        @connection.call(
          :GET,
          '/user_account/websites/verification',
          type: OpenapiClient::Models::UserWebsiteVerification,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'ad_account_id' => ad_account_id }
        )
      end
    end
  end
end
