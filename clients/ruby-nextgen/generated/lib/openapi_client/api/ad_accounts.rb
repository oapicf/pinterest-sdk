# frozen_string_literal: true

module OpenapiClient
  module Api
    class AdAccounts
      def initialize(connection)
        @connection = connection
      end

      def ad_previews(ad_account_id:, ad_preview_request:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'ad_preview_request is required' if ad_preview_request.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/ad_previews'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::AdPreviewURLResponse,
          auth: ['pinterest_oauth2'],
          body: ad_preview_request
        )
      end

      def ads_credit_discounts(ad_account_id:, bookmark: nil, page_size: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/ads_credit/discounts'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::AdsCreditsDiscountsGet200Response,
          auth: ['pinterest_oauth2'],
          query: { 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end

      def ads_credit_redeem(ad_account_id:, ads_credit_redeem_create:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'ads_credit_redeem_create is required' if ads_credit_redeem_create.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/ads_credit/redeem'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::AdsCreditRedeem,
          auth: ['pinterest_oauth2'],
          body: ads_credit_redeem_create
        )
      end

      def advertiser_defined_events(ad_account_id:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/advertiser_defined_events'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::AdvertiserDefinedEventsGet200Response,
          auth: ['pinterest_oauth2', 'client_credentials']
        )
      end

      def advertiser_defined_events_delete(ad_account_id:, event_names:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'event_names is required' if event_names.nil?

        @connection.call(
          :DELETE,
          '/ad_accounts/{ad_account_id}/advertiser_defined_events'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::AdvertiserDefinedEventsCreate200Response,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'event_names' => event_names }
        )
      end

      def advertiser_defined_events_patch(ad_account_id:, advertiser_defined_events_create_request:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'advertiser_defined_events_create_request is required' if advertiser_defined_events_create_request.nil?

        @connection.call(
          :PATCH,
          '/ad_accounts/{ad_account_id}/advertiser_defined_events'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::AdvertiserDefinedEventsCreate200Response,
          auth: ['pinterest_oauth2', 'client_credentials'],
          body: advertiser_defined_events_create_request
        )
      end

      def advertiser_defined_events_post(ad_account_id:, advertiser_defined_events_create_request:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'advertiser_defined_events_create_request is required' if advertiser_defined_events_create_request.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/advertiser_defined_events'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::AdvertiserDefinedEventsCreate200Response,
          auth: ['pinterest_oauth2', 'client_credentials'],
          body: advertiser_defined_events_create_request
        )
      end

      def analytics(start_date:, end_date:, columns:, granularity:, ad_account_id:, click_window_days: nil, engagement_window_days: nil, view_window_days: nil, conversion_report_time: nil, reporting_timezone: nil)
        raise ArgumentError, 'start_date is required' if start_date.nil?
        raise ArgumentError, 'end_date is required' if end_date.nil?
        raise ArgumentError, 'columns is required' if columns.nil?
        raise ArgumentError, 'granularity is required' if granularity.nil?
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/analytics'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: [OpenapiClient::Models::AdAccountAnalyticsItems],
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'start_date' => start_date, 'end_date' => end_date, 'columns' => columns, 'granularity' => granularity, 'click_window_days' => click_window_days, 'engagement_window_days' => engagement_window_days, 'view_window_days' => view_window_days, 'conversion_report_time' => conversion_report_time, 'reporting_timezone' => reporting_timezone }
        )
      end

      def audience_insights(ad_account_id:, audience_insight_type:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'audience_insight_type is required' if audience_insight_type.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/audience_insights'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::AudienceInsights,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'audience_insight_type' => audience_insight_type }
        )
      end

      def bid_floor(ad_account_id:, bid_floor_create:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'bid_floor_create is required' if bid_floor_create.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/bid_floor'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::BidFloor,
          auth: ['pinterest_oauth2', 'client_credentials'],
          body: bid_floor_create
        )
      end

      def billing_invoices(ad_account_id:, bookmark: nil, page_size: nil, order: nil, sort: nil, status: nil, document_type: nil, start_due_date: nil, end_due_date: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/billing_invoices'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::BillingInvoicesGet200Response,
          auth: ['pinterest_oauth2'],
          query: { 'bookmark' => bookmark, 'page_size' => page_size, 'order' => order, 'sort' => sort, 'status' => status, 'document_type' => document_type, 'start_due_date' => start_due_date, 'end_due_date' => end_due_date }
        )
      end

      def billing_profiles(is_active:, ad_account_id:, bookmark: nil, page_size: nil)
        raise ArgumentError, 'is_active is required' if is_active.nil?
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/billing_profiles'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::BillingProfilesGet200Response,
          auth: ['pinterest_oauth2'],
          query: { 'is_active' => is_active, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end

      def campaign_ad_preview(ad_group_ids:, ad_account_id:)
        raise ArgumentError, 'ad_group_ids is required' if ad_group_ids.nil?
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/campaign_ad_preview'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: [OpenapiClient::Models::CampaignAdPreview],
          auth: ['pinterest_oauth2'],
          query: { 'ad_group_ids' => ad_group_ids }
        )
      end

      def campaign_ad_preview_delete(ad_group_ids:, ad_account_id:)
        raise ArgumentError, 'ad_group_ids is required' if ad_group_ids.nil?
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :DELETE,
          '/ad_accounts/{ad_account_id}/campaign_ad_preview'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: [OpenapiClient::Models::CampaignAdPreviewDelete200ResponseInner],
          auth: ['pinterest_oauth2'],
          query: { 'ad_group_ids' => ad_group_ids }
        )
      end

      def campaign_ad_preview_post(ad_account_id:, campaign_ad_preview_create:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'campaign_ad_preview_create is required' if campaign_ad_preview_create.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/campaign_ad_preview'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: [OpenapiClient::Models::CampaignAdPreviewCreate200ResponseInner],
          auth: ['pinterest_oauth2'],
          body: campaign_ad_preview_create
        )
      end

      def conversion_eqs(lookback_period:, ad_account_id:, source_platform: nil, ingestion_source: nil)
        raise ArgumentError, 'lookback_period is required' if lookback_period.nil?
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/conversion_eqs'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: [OpenapiClient::Models::EventQualityScore],
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'lookback_period' => lookback_period, 'source_platform' => source_platform, 'ingestion_source' => ingestion_source }
        )
      end

      def create(ad_account_create:)
        raise ArgumentError, 'ad_account_create is required' if ad_account_create.nil?

        @connection.call(
          :POST,
          '/ad_accounts',
          type: OpenapiClient::Models::AdAccount,
          auth: ['pinterest_oauth2'],
          body: ad_account_create
        )
      end

      def customer_segments(ad_account_id:, bookmark: nil, page_size: nil, order: nil, include_sizing: nil, search_query: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/customer_segments'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::CustomerSegmentList200Response,
          auth: ['pinterest_oauth2'],
          query: { 'bookmark' => bookmark, 'page_size' => page_size, 'order' => order, 'include_sizing' => include_sizing, 'search_query' => search_query }
        )
      end

      def customer_segments_patch(ad_account_id:, customer_segment_update_request_update_with_required_body:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'customer_segment_update_request_update_with_required_body is required' if customer_segment_update_request_update_with_required_body.nil?

        @connection.call(
          :PATCH,
          '/ad_accounts/{ad_account_id}/customer_segments'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: nil,
          auth: ['pinterest_oauth2'],
          body: customer_segment_update_request_update_with_required_body
        )
      end

      def customer_segments_post(ad_account_id:, customer_segment_create:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'customer_segment_create is required' if customer_segment_create.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/customer_segments'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::CustomerSegment,
          auth: ['pinterest_oauth2'],
          body: customer_segment_create
        )
      end

      def events(ad_account_id:, conversion_events_create:, test: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'conversion_events_create is required' if conversion_events_create.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/events'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::ConversionEvents,
          auth: ['pinterest_oauth2', 'conversion_token'],
          query: { 'test' => test },
          body: conversion_events_create
        )
      end

      def get(ad_account_id:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::AdAccount,
          auth: ['pinterest_oauth2', 'client_credentials']
        )
      end

      def insights_audiences(ad_account_id:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/insights/audiences'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::AudienceInsightsScopeAndTypeGet200Response,
          auth: ['pinterest_oauth2', 'client_credentials']
        )
      end

      def list(include_shared_accounts: nil, bookmark: nil, page_size: nil)
        @connection.call(
          :GET,
          '/ad_accounts',
          type: OpenapiClient::Models::AdAccountsList200Response,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'include_shared_accounts' => include_shared_accounts, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end

      def mmm_reports(ad_account_id:, token:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'token is required' if token.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/mmm_reports'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::MMMReport,
          auth: ['pinterest_oauth2'],
          query: { 'token' => token }
        )
      end

      def mmm_reports_post(ad_account_id:, mmm_report_create:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'mmm_report_create is required' if mmm_report_create.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/mmm_reports'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::MMMReport,
          auth: ['pinterest_oauth2'],
          body: mmm_report_create
        )
      end

      def msot_events(ad_account_id:, conversion_msot_events_create:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'conversion_msot_events_create is required' if conversion_msot_events_create.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/msot/events'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: nil,
          auth: ['pinterest_oauth2'],
          body: conversion_msot_events_create
        )
      end

      def promotion_applied_entities(ad_account_id:, promotion_ids:, bookmark: nil, page_size: nil, order: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'promotion_ids is required' if promotion_ids.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/promotion_applied_entities'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::AdGroupsList200Response,
          auth: ['pinterest_oauth2'],
          query: { 'bookmark' => bookmark, 'page_size' => page_size, 'order' => order, 'promotion_ids' => promotion_ids }
        )
      end

      def reports(ad_account_id:, token:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'token is required' if token.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/reports'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::AdsAnalyticsGetAsyncResponse,
          auth: ['pinterest_oauth2'],
          query: { 'token' => token }
        )
      end

      def reports_brand_category_sku(ad_account_id:, token:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'token is required' if token.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/reports/brand_category_sku'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::ConversionProductReport,
          auth: ['pinterest_oauth2'],
          query: { 'token' => token }
        )
      end

      def reports_brand_category_sku_post(ad_account_id:, conversion_product_report_create:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'conversion_product_report_create is required' if conversion_product_report_create.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/reports/brand_category_sku'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::ConversionProductReport,
          auth: ['pinterest_oauth2'],
          body: conversion_product_report_create
        )
      end

      def reports_post(ad_account_id:, ads_analytics_create_async_request:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'ads_analytics_create_async_request is required' if ads_analytics_create_async_request.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/reports'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::AdsAnalyticsCreateAsyncResponse,
          auth: ['pinterest_oauth2'],
          body: ads_analytics_create_async_request
        )
      end

      def sandbox(ad_account_id:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :DELETE,
          '/ad_accounts/{ad_account_id}/sandbox'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: nil,
          auth: ['pinterest_oauth2']
        )
      end

      def schedules(ad_account_id:, entity_ids:, bookmark: nil, page_size: nil, order: nil, schedule_statuses: nil, schedule_type: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'entity_ids is required' if entity_ids.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/schedules'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::SchedulesList200Response,
          auth: ['pinterest_oauth2'],
          query: { 'bookmark' => bookmark, 'page_size' => page_size, 'order' => order, 'schedule_statuses' => schedule_statuses, 'schedule_type' => schedule_type, 'entity_ids' => entity_ids }
        )
      end

      def schedules_patch(ad_account_id:, schedule_batch_update:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'schedule_batch_update is required' if schedule_batch_update.nil?

        @connection.call(
          :PATCH,
          '/ad_accounts/{ad_account_id}/schedules'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: [OpenapiClient::Models::SchedulesCreate200ResponseInner],
          auth: ['pinterest_oauth2'],
          body: schedule_batch_update
        )
      end

      def schedules_post(ad_account_id:, schedule_create:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'schedule_create is required' if schedule_create.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/schedules'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: [OpenapiClient::Models::SchedulesCreate200ResponseInner],
          auth: ['pinterest_oauth2'],
          body: schedule_create
        )
      end

      def ssio_accounts(ad_account_id:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/ssio/accounts'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::SSIOAccount,
          auth: ['pinterest_oauth2']
        )
      end

      def ssio_insertion_orders(ad_account_id:, ssio_insertion_order_create:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'ssio_insertion_order_create is required' if ssio_insertion_order_create.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/ssio/insertion_orders'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::SSIOInsertionOrder,
          auth: ['pinterest_oauth2'],
          body: ssio_insertion_order_create
        )
      end

      def ssio_insertion_orders_patch(ad_account_id:, ssio_insertion_order_update:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'ssio_insertion_order_update is required' if ssio_insertion_order_update.nil?

        @connection.call(
          :PATCH,
          '/ad_accounts/{ad_account_id}/ssio/insertion_orders'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::SSIOInsertionOrder,
          auth: ['pinterest_oauth2'],
          body: ssio_insertion_order_update
        )
      end

      def ssio_insertion_orders_status(ad_account_id:, bookmark: nil, page_size: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/ssio/insertion_orders/status'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::SsioInsertionOrdersStatusGetByAdAccount200Response,
          auth: ['pinterest_oauth2'],
          query: { 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end

      def ssio_insertion_orders_status_get(ad_account_id:, pin_order_id:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'pin_order_id is required' if pin_order_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s))
            .gsub('{pin_order_id}', ERB::Util.url_encode(pin_order_id.to_s)),
          type: OpenapiClient::Models::SSIOInsertionOrderStatusResponse,
          auth: ['pinterest_oauth2']
        )
      end

      def ssio_order_lines(ad_account_id:, pin_order_id: nil, bookmark: nil, page_size: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/ssio/order_lines'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::SsioOrderLinesGetByAdAccount200Response,
          auth: ['pinterest_oauth2'],
          query: { 'pin_order_id' => pin_order_id, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end

      def subscriptions/del_by_id(ad_account_id:, subscription_id:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'subscription_id is required' if subscription_id.nil?

        @connection.call(
          :DELETE,
          '/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s))
            .gsub('{subscription_id}', ERB::Util.url_encode(subscription_id.to_s)),
          type: OpenapiClient::Models::LeadSubscription,
          auth: ['pinterest_oauth2']
        )
      end

      def subscriptions/get_by_id(ad_account_id:, subscription_id:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'subscription_id is required' if subscription_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s))
            .gsub('{subscription_id}', ERB::Util.url_encode(subscription_id.to_s)),
          type: OpenapiClient::Models::LeadSubscription,
          auth: ['pinterest_oauth2', 'client_credentials']
        )
      end

      def subscriptions/get_list(ad_account_id:, bookmark: nil, page_size: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/leads/subscriptions'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::AdAccountsSubscriptionsGetList200Response,
          auth: ['pinterest_oauth2'],
          query: { 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end

      def subscriptions/post(ad_account_id:, lead_subscription_post_params_create:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'lead_subscription_post_params_create is required' if lead_subscription_post_params_create.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/leads/subscriptions'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::LeadSubscription,
          auth: ['pinterest_oauth2'],
          body: lead_subscription_post_params_create
        )
      end

      def targeting_analytics(ad_account_id:, start_date:, end_date:, targeting_types:, columns:, granularity:, click_window_days: nil, engagement_window_days: nil, view_window_days: nil, conversion_report_time: nil, attribution_types: nil, reporting_timezone: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'start_date is required' if start_date.nil?
        raise ArgumentError, 'end_date is required' if end_date.nil?
        raise ArgumentError, 'targeting_types is required' if targeting_types.nil?
        raise ArgumentError, 'columns is required' if columns.nil?
        raise ArgumentError, 'granularity is required' if granularity.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/targeting_analytics'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::MetricsResponse,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'start_date' => start_date, 'end_date' => end_date, 'targeting_types' => targeting_types, 'columns' => columns, 'granularity' => granularity, 'click_window_days' => click_window_days, 'engagement_window_days' => engagement_window_days, 'view_window_days' => view_window_days, 'conversion_report_time' => conversion_report_time, 'attribution_types' => attribution_types, 'reporting_timezone' => reporting_timezone }
        )
      end

      def targeting_templates(ad_account_id:, bookmark: nil, page_size: nil, order: nil, include_sizing: nil, search_query: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/targeting_templates'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::TargetingTemplateList200Response,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'bookmark' => bookmark, 'page_size' => page_size, 'order' => order, 'include_sizing' => include_sizing, 'search_query' => search_query }
        )
      end

      def targeting_templates_patch(ad_account_id:, targeting_template_update_request_read_or_update:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'targeting_template_update_request_read_or_update is required' if targeting_template_update_request_read_or_update.nil?

        @connection.call(
          :PATCH,
          '/ad_accounts/{ad_account_id}/targeting_templates'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: nil,
          auth: ['pinterest_oauth2'],
          body: targeting_template_update_request_read_or_update
        )
      end

      def targeting_templates_post(ad_account_id:, targeting_template_create:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'targeting_template_create is required' if targeting_template_create.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/targeting_templates'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::TargetingTemplate,
          auth: ['pinterest_oauth2'],
          body: targeting_template_create
        )
      end

      def terms_of_service(ad_account_id:, include_html: nil, tos_type: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/terms_of_service'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::TermsOfService,
          auth: ['pinterest_oauth2'],
          query: { 'include_html' => include_html, 'tos_type' => tos_type }
        )
      end
    end
  end
end
