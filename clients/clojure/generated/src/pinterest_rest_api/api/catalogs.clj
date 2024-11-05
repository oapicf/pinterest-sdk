(ns pinterest-rest-api.api.catalogs
  (:require [pinterest-rest-api.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]
            [pinterest-rest-api.specs.exception :refer :all]
            [pinterest-rest-api.specs.keyword-metrics :refer :all]
            [pinterest-rest-api.specs.oauth-access-token-response :refer :all]
            [pinterest-rest-api.specs.ad-group-create-request :refer :all]
            [pinterest-rest-api.specs.price-filter :refer :all]
            [pinterest-rest-api.specs.order-line-error :refer :all]
            [pinterest-rest-api.specs.creative-assets-visibility-type :refer :all]
            [pinterest-rest-api.specs.item-delete-discontinued-batch-record :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-guest-ratings :refer :all]
            [pinterest-rest-api.specs.catalogs-report-parameters :refer :all]
            [pinterest-rest-api.specs.catalogs-retail-items-post-filter :refer :all]
            [pinterest-rest-api.specs.create-mmm-report-response :refer :all]
            [pinterest-rest-api.specs.integration-logs-success-response :refer :all]
            [pinterest-rest-api.specs.create-mmm-report-response-data :refer :all]
            [pinterest-rest-api.specs.respond-to-invites-response-array-items-inner :refer :all]
            [pinterest-rest-api.specs.catalogs-retail-product-group-product-counts :refer :all]
            [pinterest-rest-api.specs.batch-operation-status :refer :all]
            [pinterest-rest-api.specs.creative-assets-processing-record :refer :all]
            [pinterest-rest-api.specs.catalogs-create-report-response :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-product-group-product-counts :refer :all]
            [pinterest-rest-api.specs.oauth-access-token-response-client-credentials :refer :all]
            [pinterest-rest-api.specs.keywords-request :refer :all]
            [pinterest-rest-api.specs.bulk-upsert-status :refer :all]
            [pinterest-rest-api.specs.catalogs-creative-assets-product-group-filters-any-of :refer :all]
            [pinterest-rest-api.specs.catalogs-retail-batch-request-items-inner :refer :all]
            [pinterest-rest-api.specs.custom-label2-filter :refer :all]
            [pinterest-rest-api.specs.oauth-access-token-response-everlasting-refresh :refer :all]
            [pinterest-rest-api.specs.member-business-role :refer :all]
            [pinterest-rest-api.specs.pacing-delivery-type :refer :all]
            [pinterest-rest-api.specs.audience :refer :all]
            [pinterest-rest-api.specs.order-lines :refer :all]
            [pinterest-rest-api.specs.catalogs-product-group-status :refer :all]
            [pinterest-rest-api.specs.catalogs-retail-items-filter :refer :all]
            [pinterest-rest-api.specs.integration-record :refer :all]
            [pinterest-rest-api.specs.invite-assets-summary :refer :all]
            [pinterest-rest-api.specs.audience-insight-category-common :refer :all]
            [pinterest-rest-api.specs.catalogs-creative-assets-items-batch :refer :all]
            [pinterest-rest-api.specs.catalogs-type :refer :all]
            [pinterest-rest-api.specs.quiz-pin-option :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-address :refer :all]
            [pinterest-rest-api.specs.product-group-promotion-response-item :refer :all]
            [pinterest-rest-api.specs.catalogs-creative-assets-item-error-response :refer :all]
            [pinterest-rest-api.specs.search-user-boards-get-200-response :refer :all]
            [pinterest-rest-api.specs.respond-to-invites-response-array :refer :all]
            [pinterest-rest-api.specs.operation-type :refer :all]
            [pinterest-rest-api.specs.targeting-advertiser-country :refer :all]
            [pinterest-rest-api.specs.catalogs-items-create-batch-request :refer :all]
            [pinterest-rest-api.specs.media-upload-type :refer :all]
            [pinterest-rest-api.specs.audience-rule :refer :all]
            [pinterest-rest-api.specs.catalogs-items-delete-discontinued-batch-request :refer :all]
            [pinterest-rest-api.specs.catalogs-vertical-product-group-update-request :refer :all]
            [pinterest-rest-api.specs.ad-account-create-subscription-response :refer :all]
            [pinterest-rest-api.specs.campaign-update-request :refer :all]
            [pinterest-rest-api.specs.catalogs-items-batch :refer :all]
            [pinterest-rest-api.specs.role :refer :all]
            [pinterest-rest-api.specs.advanced-auction-item :refer :all]
            [pinterest-rest-api.specs.item-group-id-filter :refer :all]
            [pinterest-rest-api.specs.product-type1-filter :refer :all]
            [pinterest-rest-api.specs.integration-metadata :refer :all]
            [pinterest-rest-api.specs.update-member-result :refer :all]
            [pinterest-rest-api.specs.objective-type :refer :all]
            [pinterest-rest-api.specs.members-to-delete-body-members-inner :refer :all]
            [pinterest-rest-api.specs.asset-id-permissions :refer :all]
            [pinterest-rest-api.specs.asset-group-type :refer :all]
            [pinterest-rest-api.specs.ssio-create-insertion-order-response :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-issues :refer :all]
            [pinterest-rest-api.specs.bulk-upsert-request-update :refer :all]
            [pinterest-rest-api.specs.update-member-assets-results-response-array :refer :all]
            [pinterest-rest-api.specs.catalogs-product-group-filter-keys :refer :all]
            [pinterest-rest-api.specs.catalogs-product-group-update-request :refer :all]
            [pinterest-rest-api.specs.pin-media-source-image-url :refer :all]
            [pinterest-rest-api.specs.items-issues-list-200-response :refer :all]
            [pinterest-rest-api.specs.product-group-promotion-response :refer :all]
            [pinterest-rest-api.specs.ad-array-response-element :refer :all]
            [pinterest-rest-api.specs.catalogs-retail-product-metadata :refer :all]
            [pinterest-rest-api.specs.customer-list :refer :all]
            [pinterest-rest-api.specs.integration-log-client-request :refer :all]
            [pinterest-rest-api.specs.advanced-auction-processed-items :refer :all]
            [pinterest-rest-api.specs.entity-status :refer :all]
            [pinterest-rest-api.specs.advanced-auction-items :refer :all]
            [pinterest-rest-api.specs.campaign-create-response-data :refer :all]
            [pinterest-rest-api.specs.catalogs-retail-item-error-response :refer :all]
            [pinterest-rest-api.specs.oauth-access-token-response-refresh :refer :all]
            [pinterest-rest-api.specs.campaign-response :refer :all]
            [pinterest-rest-api.specs.media-upload :refer :all]
            [pinterest-rest-api.specs.ad-group-array-response :refer :all]
            [pinterest-rest-api.specs.item-attributes :refer :all]
            [pinterest-rest-api.specs.detailed-error :refer :all]
            [pinterest-rest-api.specs.base-invite-data-response :refer :all]
            [pinterest-rest-api.specs.ad-account-create-subscription-request-partner-metadata :refer :all]
            [pinterest-rest-api.specs.media-upload-status :refer :all]
            [pinterest-rest-api.specs.catalogs-updatable-hotel-attributes :refer :all]
            [pinterest-rest-api.specs.catalogs-retail-feed :refer :all]
            [pinterest-rest-api.specs.top-pins-analytics-response-pins-inner :refer :all]
            [pinterest-rest-api.specs.ad-account :refer :all]
            [pinterest-rest-api.specs.targeting-spec-app-type :refer :all]
            [pinterest-rest-api.specs.lead-forms-list-200-response :refer :all]
            [pinterest-rest-api.specs.conversion-events-data-inner-custom-data :refer :all]
            [pinterest-rest-api.specs.board-update :refer :all]
            [pinterest-rest-api.specs.catalogs-vertical-batch-request :refer :all]
            [pinterest-rest-api.specs.keyword-update-body :refer :all]
            [pinterest-rest-api.specs.oauth-access-token-response-code :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-batch-item :refer :all]
            [pinterest-rest-api.specs.catalogs-product-group-multiple-gender-criteria :refer :all]
            [pinterest-rest-api.specs.create-asset-access-request-response :refer :all]
            [pinterest-rest-api.specs.audience-type :refer :all]
            [pinterest-rest-api.specs.pin-media-with-video :refer :all]
            [pinterest-rest-api.specs.custom-column-id :refer :all]
            [pinterest-rest-api.specs.pin-promotion-summary-status :refer :all]
            [pinterest-rest-api.specs.metrics-response :refer :all]
            [pinterest-rest-api.specs.get-audiences-order-by :refer :all]
            [pinterest-rest-api.specs.update-member-asset-access-body-accesses-inner :refer :all]
            [pinterest-rest-api.specs.language :refer :all]
            [pinterest-rest-api.specs.ad-group-audience-sizing-request :refer :all]
            [pinterest-rest-api.specs.lead-form-test-request :refer :all]
            [pinterest-rest-api.specs.gender-filter :refer :all]
            [pinterest-rest-api.specs.invite-status :refer :all]
            [pinterest-rest-api.specs.audience-common :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-items-batch :refer :all]
            [pinterest-rest-api.specs.catalogs-creative-assets-list-products-by-catalog-based-filter-request :refer :all]
            [pinterest-rest-api.specs.create-asset-access-request-error-message-inner :refer :all]
            [pinterest-rest-api.specs.update-partner-results-response-array :refer :all]
            [pinterest-rest-api.specs.ad-preview-url-response :refer :all]
            [pinterest-rest-api.specs.catalogs-feed-ingestion-warnings :refer :all]
            [pinterest-rest-api.specs.boards-user-follows-list-200-response :refer :all]
            [pinterest-rest-api.specs.audience-category :refer :all]
            [pinterest-rest-api.specs.item-create-batch-record :refer :all]
            [pinterest-rest-api.specs.catalogs-product-group-multiple-string-criteria :refer :all]
            [pinterest-rest-api.specs.placement-multipliers :refer :all]
            [pinterest-rest-api.specs.integration-log :refer :all]
            [pinterest-rest-api.specs.catalogs-feed-credentials :refer :all]
            [pinterest-rest-api.specs.catalogs-feed-ingestion :refer :all]
            [pinterest-rest-api.specs.ad-update-request :refer :all]
            [pinterest-rest-api.specs.template-response-date-range-dynamic-date-range :refer :all]
            [pinterest-rest-api.specs.permissions-with-owner :refer :all]
            [pinterest-rest-api.specs.update-partner-results-response-array-items-inner :refer :all]
            [pinterest-rest-api.specs.billing-profiles-response :refer :all]
            [pinterest-rest-api.specs.item-attributes-request :refer :all]
            [pinterest-rest-api.specs.business-role :refer :all]
            [pinterest-rest-api.specs.catalogs-feed-processing-status :refer :all]
            [pinterest-rest-api.specs.conversion-api-response-events-inner :refer :all]
            [pinterest-rest-api.specs.audience-account-type :refer :all]
            [pinterest-rest-api.specs.data-status :refer :all]
            [pinterest-rest-api.specs.conversion-tag-common :refer :all]
            [pinterest-rest-api.specs.catalogs-items-update-batch-request :refer :all]
            [pinterest-rest-api.specs.catalogs-product-group-multiple-string-list-criteria :refer :all]
            [pinterest-rest-api.specs.board-section :refer :all]
            [pinterest-rest-api.specs.lead-form-update-request :refer :all]
            [pinterest-rest-api.specs.create-asset-invites-request :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-product-group-create-request :refer :all]
            [pinterest-rest-api.specs.catalogs-delete-creative-assets-item :refer :all]
            [pinterest-rest-api.specs.delete-member-access-results-response-array :refer :all]
            [pinterest-rest-api.specs.business-access-error :refer :all]
            [pinterest-rest-api.specs.item-response :refer :all]
            [pinterest-rest-api.specs.non-nullable-catalogs-currency :refer :all]
            [pinterest-rest-api.specs.business-member-assets-summary :refer :all]
            [pinterest-rest-api.specs.nullable-currency :refer :all]
            [pinterest-rest-api.specs.user-websites-get-200-response :refer :all]
            [pinterest-rest-api.specs.catalogs-format :refer :all]
            [pinterest-rest-api.specs.update-partner-assets-results-response-array :refer :all]
            [pinterest-rest-api.specs.google-product-category1-filter :refer :all]
            [pinterest-rest-api.specs.catalogs-product-group-filters :refer :all]
            [pinterest-rest-api.specs.product-type0-filter :refer :all]
            [pinterest-rest-api.specs.ad-group-audience-sizing-response :refer :all]
            [pinterest-rest-api.specs.invite-assets-summary-profiles-inner :refer :all]
            [pinterest-rest-api.specs.pin-analytics-metrics-response-daily-metrics-inner :refer :all]
            [pinterest-rest-api.specs.conversion-tag-configs :refer :all]
            [pinterest-rest-api.specs.user-website-summary :refer :all]
            [pinterest-rest-api.specs.targeting-template-audience-sizing-reach-estimate :refer :all]
            [pinterest-rest-api.specs.catalogs-items-post-filters :refer :all]
            [pinterest-rest-api.specs.google-product-category4-filter :refer :all]
            [pinterest-rest-api.specs.ads-analytics-response-inner :refer :all]
            [pinterest-rest-api.specs.business-member-assets-summary-ad-accounts-inner :refer :all]
            [pinterest-rest-api.specs.update-member-business-role-body :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-attributes-all-of-main-image :refer :all]
            [pinterest-rest-api.specs.update-invites-results-response-array :refer :all]
            [pinterest-rest-api.specs.template-response :refer :all]
            [pinterest-rest-api.specs.user-list-type :refer :all]
            [pinterest-rest-api.specs.user-business-role-binding :refer :all]
            [pinterest-rest-api.specs.invite-type :refer :all]
            [pinterest-rest-api.specs.catalogs-feed-validation-warnings :refer :all]
            [pinterest-rest-api.specs.delete-member-access-result :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-report-parameters-report :refer :all]
            [pinterest-rest-api.specs.catalogs-vertical-product-group :refer :all]
            [pinterest-rest-api.specs.user-following-feed-type :refer :all]
            [pinterest-rest-api.specs.ads-analytics-create-async-response :refer :all]
            [pinterest-rest-api.specs.video-metadata :refer :all]
            [pinterest-rest-api.specs.catalogs-retail-report-parameters :refer :all]
            [pinterest-rest-api.specs.business-role-check-mode :refer :all]
            [pinterest-rest-api.specs.create-membership-or-partnership-invites-body :refer :all]
            [pinterest-rest-api.specs.integration-request-patch :refer :all]
            [pinterest-rest-api.specs.bid-floor-request :refer :all]
            [pinterest-rest-api.specs.catalogs-product-group-currency-criteria :refer :all]
            [pinterest-rest-api.specs.audience-create-request-1-audience-type :refer :all]
            [pinterest-rest-api.specs.optimization-goal-metadata-conversion-tag-v3-goal-metadata :refer :all]
            [pinterest-rest-api.specs.conversion-event-response :refer :all]
            [pinterest-rest-api.specs.catalogs-retail-product-group-create-request :refer :all]
            [pinterest-rest-api.specs.users-for-individual-asset-response :refer :all]
            [pinterest-rest-api.specs.items-batch-post-request :refer :all]
            [pinterest-rest-api.specs.ad-groups-analytics-response-inner :refer :all]
            [pinterest-rest-api.specs.condition-filter :refer :all]
            [pinterest-rest-api.specs.update-asset-group-body-asset-groups-to-update-inner :refer :all]
            [pinterest-rest-api.specs.min-price-filter :refer :all]
            [pinterest-rest-api.specs.catalogs-product-group-filters-request-any-of :refer :all]
            [pinterest-rest-api.specs.catalogs-items-filters :refer :all]
            [pinterest-rest-api.specs.catalogs-product-groups-update-request :refer :all]
            [pinterest-rest-api.specs.members-to-delete-body :refer :all]
            [pinterest-rest-api.specs.availability-filter :refer :all]
            [pinterest-rest-api.specs.integration-logs-invalid-log-response-rejected-logs-inner :refer :all]
            [pinterest-rest-api.specs.catalog :refer :all]
            [pinterest-rest-api.specs.advanced-auction-key :refer :all]
            [pinterest-rest-api.specs.ad-account-create-request :refer :all]
            [pinterest-rest-api.specs.item-id-filter :refer :all]
            [pinterest-rest-api.specs.shared-audience-response :refer :all]
            [pinterest-rest-api.specs.media-upload-request :refer :all]
            [pinterest-rest-api.specs.user-account-followed-interests-200-response :refer :all]
            [pinterest-rest-api.specs.grid-click-type :refer :all]
            [pinterest-rest-api.specs.business-asset-partners-get-200-response :refer :all]
            [pinterest-rest-api.specs.media-upload-details :refer :all]
            [pinterest-rest-api.specs.product-group-promotion-create-request-element :refer :all]
            [pinterest-rest-api.specs.ad-group-common :refer :all]
            [pinterest-rest-api.specs.get-business-asset-type-response :refer :all]
            [pinterest-rest-api.specs.update-asset-group-response :refer :all]
            [pinterest-rest-api.specs.campaign-summary-status :refer :all]
            [pinterest-rest-api.specs.custom-label3-filter :refer :all]
            [pinterest-rest-api.specs.data-output-format :refer :all]
            [pinterest-rest-api.specs.audiences-list-200-response :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-product :refer :all]
            [pinterest-rest-api.specs.image-metadata-images :refer :all]
            [pinterest-rest-api.specs.ads-analytics-targeting-type :refer :all]
            [pinterest-rest-api.specs.custom-label1-filter :refer :all]
            [pinterest-rest-api.specs.audience-update-operation-type :refer :all]
            [pinterest-rest-api.specs.image-metadata :refer :all]
            [pinterest-rest-api.specs.targeting-template-get-response-data :refer :all]
            [pinterest-rest-api.specs.lead-form-common-policy-links-inner :refer :all]
            [pinterest-rest-api.specs.analytics-metrics-response :refer :all]
            [pinterest-rest-api.specs.update-member-assets-results-response-array-items-inner :refer :all]
            [pinterest-rest-api.specs.pin-media-metadata :refer :all]
            [pinterest-rest-api.specs.ads-credits-discounts-get-200-response :refer :all]
            [pinterest-rest-api.specs.bid-floor :refer :all]
            [pinterest-rest-api.specs.order-line-response :refer :all]
            [pinterest-rest-api.specs.catalogs-product-group-filters-any-of :refer :all]
            [pinterest-rest-api.specs.nullable-catalogs-item-field-type :refer :all]
            [pinterest-rest-api.specs.catalogs-creative-assets-product-group-create-request :refer :all]
            [pinterest-rest-api.specs.optimization-goal-metadata-frequency-goal-metadata :refer :all]
            [pinterest-rest-api.specs.asset-type-response :refer :all]
            [pinterest-rest-api.specs.audience-insight-category-array-response :refer :all]
            [pinterest-rest-api.specs.pin-media-source-image-base64 :refer :all]
            [pinterest-rest-api.specs.catalogs-creative-assets-product-group-filter-keys :refer :all]
            [pinterest-rest-api.specs.integration-log-client-error :refer :all]
            [pinterest-rest-api.specs.catalogs-items-request :refer :all]
            [pinterest-rest-api.specs.catalogs-vertical-feeds-update-request :refer :all]
            [pinterest-rest-api.specs.conversion-tag-list-response :refer :all]
            [pinterest-rest-api.specs.ssio-account-pmp-name :refer :all]
            [pinterest-rest-api.specs.targeting-template-list-200-response :refer :all]
            [pinterest-rest-api.specs.granularity :refer :all]
            [pinterest-rest-api.specs.catalogs-product-group-filters-all-of :refer :all]
            [pinterest-rest-api.specs.conversion-events-data-inner-custom-data-contents-inner :refer :all]
            [pinterest-rest-api.specs.campaign-is-flexible-daily-budgets :refer :all]
            [pinterest-rest-api.specs.hotel-id-filter :refer :all]
            [pinterest-rest-api.specs.pin-media-source-video-id :refer :all]
            [pinterest-rest-api.specs.order-line :refer :all]
            [pinterest-rest-api.specs.pin-media-source :refer :all]
            [pinterest-rest-api.specs.lead-form-question-type :refer :all]
            [pinterest-rest-api.specs.reports-stats-200-response :refer :all]
            [pinterest-rest-api.specs.ad-accounts-audiences-shared-accounts-list-200-response :refer :all]
            [pinterest-rest-api.specs.bulk-upsert-response :refer :all]
            [pinterest-rest-api.specs.catalogs-report-distribution-issue-filter :refer :all]
            [pinterest-rest-api.specs.catalogs-create-creative-assets-item :refer :all]
            [pinterest-rest-api.specs.ssio-insertion-order-common :refer :all]
            [pinterest-rest-api.specs.conversion-events-user-data :refer :all]
            [pinterest-rest-api.specs.feeds-create-request :refer :all]
            [pinterest-rest-api.specs.delete-invites-results-response-array :refer :all]
            [pinterest-rest-api.specs.update-mask-field-type :refer :all]
            [pinterest-rest-api.specs.bulk-reporting-job-status :refer :all]
            [pinterest-rest-api.specs.delete-partners-request :refer :all]
            [pinterest-rest-api.specs.catalogs-creative-assets-feeds-update-request :refer :all]
            [pinterest-rest-api.specs.keywords-response :refer :all]
            [pinterest-rest-api.specs.business-role-for-members :refer :all]
            [pinterest-rest-api.specs.create-asset-group-body :refer :all]
            [pinterest-rest-api.specs.catalogs-creative-assets-product-group-update-request :refer :all]
            [pinterest-rest-api.specs.feeds-update-request :refer :all]
            [pinterest-rest-api.specs.templates-list-200-response :refer :all]
            [pinterest-rest-api.specs.catalogs-retail-feeds-create-request :refer :all]
            [pinterest-rest-api.specs.enhanced-match-status-type :refer :all]
            [pinterest-rest-api.specs.bulk-upsert-request :refer :all]
            [pinterest-rest-api.specs.pins-save-request :refer :all]
            [pinterest-rest-api.specs.catalogs-updatable-creative-assets-attributes :refer :all]
            [pinterest-rest-api.specs.order-line-status :refer :all]
            [pinterest-rest-api.specs.ad-account-get-subscription-response :refer :all]
            [pinterest-rest-api.specs.targeting-template-common :refer :all]
            [pinterest-rest-api.specs.catalogs-feed :refer :all]
            [pinterest-rest-api.specs.customer-list-request :refer :all]
            [pinterest-rest-api.specs.item-processing-record :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-feeds-create-request :refer :all]
            [pinterest-rest-api.specs.pin-update :refer :all]
            [pinterest-rest-api.specs.catalogs-vertical-feeds-create-request :refer :all]
            [pinterest-rest-api.specs.business-assets-get-200-response :refer :all]
            [pinterest-rest-api.specs.catalogs-upsert-retail-item :refer :all]
            [pinterest-rest-api.specs.quiz-pin-data :refer :all]
            [pinterest-rest-api.specs.business-members-asset-access-delete-request-accesses-inner :refer :all]
            [pinterest-rest-api.specs.ads-analytics-get-async-response :refer :all]
            [pinterest-rest-api.specs.audience-definition :refer :all]
            [pinterest-rest-api.specs.update-partner-asset-access-body :refer :all]
            [pinterest-rest-api.specs.catalogs-retail-list-products-by-catalog-based-filter-request :refer :all]
            [pinterest-rest-api.specs.catalogs-creative-assets-batch-item :refer :all]
            [pinterest-rest-api.specs.integration-logs-request :refer :all]
            [pinterest-rest-api.specs.top-pins-analytics-response :refer :all]
            [pinterest-rest-api.specs.pins-analytics-metric-types-parameter-inner :refer :all]
            [pinterest-rest-api.specs.catalogs-product-group-pricing-currency-criteria :refer :all]
            [pinterest-rest-api.specs.conversion-tag-type :refer :all]
            [pinterest-rest-api.specs.template-response-date-range :refer :all]
            [pinterest-rest-api.specs.campaign-create-response-item :refer :all]
            [pinterest-rest-api.specs.business-shared-audience :refer :all]
            [pinterest-rest-api.specs.business-member-assets-get-200-response :refer :all]
            [pinterest-rest-api.specs.mmm-reporting-column :refer :all]
            [pinterest-rest-api.specs.leads-export-status :refer :all]
            [pinterest-rest-api.specs.audience-sharing-type :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-product-group-filter-keys :refer :all]
            [pinterest-rest-api.specs.advanced-auction-items-submit-upsert-record :refer :all]
            [pinterest-rest-api.specs.pin :refer :all]
            [pinterest-rest-api.specs.keyword-metrics-response :refer :all]
            [pinterest-rest-api.specs.oauth-access-token-request-refresh :refer :all]
            [pinterest-rest-api.specs.conversion-report-time-type :refer :all]
            [pinterest-rest-api.specs.targeting-template-response-data :refer :all]
            [pinterest-rest-api.specs.update-member-results-response-array :refer :all]
            [pinterest-rest-api.specs.targeting-template-create :refer :all]
            [pinterest-rest-api.specs.catalogs-upsert-hotel-item :refer :all]
            [pinterest-rest-api.specs.user-summary :refer :all]
            [pinterest-rest-api.specs.catalogs-items-request-language :refer :all]
            [pinterest-rest-api.specs.product-group-reference-filter :refer :all]
            [pinterest-rest-api.specs.bid-floor-spec :refer :all]
            [pinterest-rest-api.specs.keyword-error :refer :all]
            [pinterest-rest-api.specs.reporting-column-async :refer :all]
            [pinterest-rest-api.specs.trending-keywords-response-trends-inner-time-series :refer :all]
            [pinterest-rest-api.specs.catalogs-list-products-by-feed-based-filter :refer :all]
            [pinterest-rest-api.specs.ssio-create-insertion-order-request :refer :all]
            [pinterest-rest-api.specs.product-group-analytics-response-inner :refer :all]
            [pinterest-rest-api.specs.catalogs-feed-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-feeds-create-request-default-locale :refer :all]
            [pinterest-rest-api.specs.board-owner :refer :all]
            [pinterest-rest-api.specs.delete-asset-group-body :refer :all]
            [pinterest-rest-api.specs.campaign-is-campaign-budget-optimization :refer :all]
            [pinterest-rest-api.specs.catalogs-items :refer :all]
            [pinterest-rest-api.specs.leads-export-response-data :refer :all]
            [pinterest-rest-api.specs.item-upsert-batch-record :refer :all]
            [pinterest-rest-api.specs.leads-export-create-response :refer :all]
            [pinterest-rest-api.specs.delete-asset-group-response :refer :all]
            [pinterest-rest-api.specs.feed-processing-results-list-200-response :refer :all]
            [pinterest-rest-api.specs.delete-asset-group-response-exceptions-inner :refer :all]
            [pinterest-rest-api.specs.get-business-employers-200-response :refer :all]
            [pinterest-rest-api.specs.lead-form-common :refer :all]
            [pinterest-rest-api.specs.conversion-events :refer :all]
            [pinterest-rest-api.specs.ad-response :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-warnings :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-feeds-update-request :refer :all]
            [pinterest-rest-api.specs.ssio-insertion-orders-status-get-by-ad-account-200-response :refer :all]
            [pinterest-rest-api.specs.creative-type :refer :all]
            [pinterest-rest-api.specs.product-type4-filter :refer :all]
            [pinterest-rest-api.specs.audience-definition-response :refer :all]
            [pinterest-rest-api.specs.pin-media-source-images-url :refer :all]
            [pinterest-rest-api.specs.google-product-category0-filter :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-errors :refer :all]
            [pinterest-rest-api.specs.google-product-category5-filter :refer :all]
            [pinterest-rest-api.specs.delete-invites-results-response-array-items-inner :refer :all]
            [pinterest-rest-api.specs.catalogs-retail-feeds-update-request :refer :all]
            [pinterest-rest-api.specs.invite-assets-summary-ad-accounts-inner :refer :all]
            [pinterest-rest-api.specs.ads-analytics-filter-operator :refer :all]
            [pinterest-rest-api.specs.ad-country :refer :all]
            [pinterest-rest-api.specs.pin-media-with-videos :refer :all]
            [pinterest-rest-api.specs.update-invites-results-response-array-items-inner :refer :all]
            [pinterest-rest-api.specs.catalogs-creative-assets-feeds-create-request :refer :all]
            [pinterest-rest-api.specs.update-partner-assets-result :refer :all]
            [pinterest-rest-api.specs.catalogs-report-distribution-stats :refer :all]
            [pinterest-rest-api.specs.ads-credit-redeem-request :refer :all]
            [pinterest-rest-api.specs.advanced-auction-processed-item :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-batch-request :refer :all]
            [pinterest-rest-api.specs.catalogs-feed-product-counts :refer :all]
            [pinterest-rest-api.specs.catalogs-report-stats :refer :all]
            [pinterest-rest-api.specs.ads-list-200-response :refer :all]
            [pinterest-rest-api.specs.bulk-download-request :refer :all]
            [pinterest-rest-api.specs.terms-of-service :refer :all]
            [pinterest-rest-api.specs.updatable-item-attributes :refer :all]
            [pinterest-rest-api.specs.catalogs-creative-assets-product-group-filters-all-of :refer :all]
            [pinterest-rest-api.specs.non-nullable-product-availability-type :refer :all]
            [pinterest-rest-api.specs.business-member-assets-summary-profiles-inner :refer :all]
            [pinterest-rest-api.specs.conversion-events-user-data-any-of-2 :refer :all]
            [pinterest-rest-api.specs.conversion-events-user-data-any-of-1 :refer :all]
            [pinterest-rest-api.specs.item-attributes-request-all-of-image-link :refer :all]
            [pinterest-rest-api.specs.optimization-goal-metadata :refer :all]
            [pinterest-rest-api.specs.cancel-invites-body :refer :all]
            [pinterest-rest-api.specs.book-closed-response :refer :all]
            [pinterest-rest-api.specs.product-group-summary-status :refer :all]
            [pinterest-rest-api.specs.brand-filter :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-item-response :refer :all]
            [pinterest-rest-api.specs.catalogs-delete-retail-item :refer :all]
            [pinterest-rest-api.specs.catalogs-verticals-list-products-by-catalog-based-filter-request :refer :all]
            [pinterest-rest-api.specs.pin-media-with-image :refer :all]
            [pinterest-rest-api.specs.match-type-response :refer :all]
            [pinterest-rest-api.specs.delete-partner-asset-access-body :refer :all]
            [pinterest-rest-api.specs.audience-definition-type :refer :all]
            [pinterest-rest-api.specs.shared-audience-response-common :refer :all]
            [pinterest-rest-api.specs.catalogs-feed-ingestion-info :refer :all]
            [pinterest-rest-api.specs.delete-partner-assets-results-response-array :refer :all]
            [pinterest-rest-api.specs.ad-accounts-country-response-data :refer :all]
            [pinterest-rest-api.specs.media-type-filter :refer :all]
            [pinterest-rest-api.specs.pin-analytics-metrics-response :refer :all]
            [pinterest-rest-api.specs.audience-subcategory :refer :all]
            [pinterest-rest-api.specs.ad-group-update-request :refer :all]
            [pinterest-rest-api.specs.user-following-get-200-response :refer :all]
            [pinterest-rest-api.specs.catalogs-feed-ingestion-details :refer :all]
            [pinterest-rest-api.specs.boards-list-pins-200-response :refer :all]
            [pinterest-rest-api.specs.custom-label4-filter :refer :all]
            [pinterest-rest-api.specs.custom-label0-filter :refer :all]
            [pinterest-rest-api.specs.audience-insight-type :refer :all]
            [pinterest-rest-api.specs.shared-audience-common :refer :all]
            [pinterest-rest-api.specs.catalogs-retail-item-response :refer :all]
            [pinterest-rest-api.specs.budget-type :refer :all]
            [pinterest-rest-api.specs.targeting-spec-shopping-retargeting :refer :all]
            [pinterest-rest-api.specs.match-type :refer :all]
            [pinterest-rest-api.specs.oauth-access-token-response-integration-refresh :refer :all]
            [pinterest-rest-api.specs.ads-credit-redeem-response :refer :all]
            [pinterest-rest-api.specs.country-filter :refer :all]
            [pinterest-rest-api.specs.catalogs-vertical-product-group-create-request :refer :all]
            [pinterest-rest-api.specs.ssio-account-address :refer :all]
            [pinterest-rest-api.specs.media-upload-all-of-upload-parameters :refer :all]
            [pinterest-rest-api.specs.base-invite-data-response-invite-data :refer :all]
            [pinterest-rest-api.specs.create-asset-access-request-body :refer :all]
            [pinterest-rest-api.specs.summary-pin :refer :all]
            [pinterest-rest-api.specs.auth-respond-invites-body-invites-inner :refer :all]
            [pinterest-rest-api.specs.catalogs-creative-assets-product-group :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-creative-assets-product :refer :all]
            [pinterest-rest-api.specs.keywords-common :refer :all]
            [pinterest-rest-api.specs.catalogs-feed-processing-result :refer :all]
            [pinterest-rest-api.specs.get-mmm-report-response :refer :all]
            [pinterest-rest-api.specs.lead-form-array-response :refer :all]
            [pinterest-rest-api.specs.keyword-update :refer :all]
            [pinterest-rest-api.specs.ad-pin-id :refer :all]
            [pinterest-rest-api.specs.keywords-get-200-response :refer :all]
            [pinterest-rest-api.specs.product-group-promotion-response-element :refer :all]
            [pinterest-rest-api.specs.ads-analytics-campaign-targeting-type :refer :all]
            [pinterest-rest-api.specs.google-product-category2-filter :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-product-group :refer :all]
            [pinterest-rest-api.specs.ads-analytics-ad-targeting-type :refer :all]
            [pinterest-rest-api.specs.catalogs-update-creative-assets-item :refer :all]
            [pinterest-rest-api.specs.ads-credit-discounts-response :refer :all]
            [pinterest-rest-api.specs.item-update-batch-record :refer :all]
            [pinterest-rest-api.specs.ad-create-request :refer :all]
            [pinterest-rest-api.specs.linked-business :refer :all]
            [pinterest-rest-api.specs.catalogs-retail-product-group-update-request :refer :all]
            [pinterest-rest-api.specs.currency :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-report-parameters :refer :all]
            [pinterest-rest-api.specs.catalogs-product-group-multiple-countries-criteria :refer :all]
            [pinterest-rest-api.specs.oauth-access-token-request-code :refer :all]
            [pinterest-rest-api.specs.feeds-list-200-response :refer :all]
            [pinterest-rest-api.specs.audience-demographics :refer :all]
            [pinterest-rest-api.specs.lead-form-create-request :refer :all]
            [pinterest-rest-api.specs.invite-response :refer :all]
            [pinterest-rest-api.specs.campaign-common :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-items-filter :refer :all]
            [pinterest-rest-api.specs.bulk-output-format :refer :all]
            [pinterest-rest-api.specs.search-partner-pins-200-response :refer :all]
            [pinterest-rest-api.specs.quiz-pin-question :refer :all]
            [pinterest-rest-api.specs.google-product-category6-filter :refer :all]
            [pinterest-rest-api.specs.user-single-asset-binding :refer :all]
            [pinterest-rest-api.specs.audience-definition-scope :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-product-group-update-request :refer :all]
            [pinterest-rest-api.specs.catalogs-update-hotel-item :refer :all]
            [pinterest-rest-api.specs.page-visit-conversion-tags-get-200-response :refer :all]
            [pinterest-rest-api.specs.oauth-access-token-request-client-credentials :refer :all]
            [pinterest-rest-api.specs.create-invites-results-response-array-items-inner :refer :all]
            [pinterest-rest-api.specs.lead-form-question :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-feed :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-items-post-filter :refer :all]
            [pinterest-rest-api.specs.get-business-partners-200-response :refer :all]
            [pinterest-rest-api.specs.catalogs-status :refer :all]
            [pinterest-rest-api.specs.placement-group-type :refer :all]
            [pinterest-rest-api.specs.paginated :refer :all]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.catalogs-create-retail-item :refer :all]
            [pinterest-rest-api.specs.pin-media-source-images-url-items-inner :refer :all]
            [pinterest-rest-api.specs.catalogs-product-group-type :refer :all]
            [pinterest-rest-api.specs.related-terms :refer :all]
            [pinterest-rest-api.specs.get-mmm-report-response-data :refer :all]
            [pinterest-rest-api.specs.user-website-verify-request :refer :all]
            [pinterest-rest-api.specs.item-response-any-of-1 :refer :all]
            [pinterest-rest-api.specs.advanced-auction-items-submit-request :refer :all]
            [pinterest-rest-api.specs.customer-lists-list-200-response :refer :all]
            [pinterest-rest-api.specs.board-sections-list-200-response :refer :all]
            [pinterest-rest-api.specs.catalogs-items-batch-request :refer :all]
            [pinterest-rest-api.specs.metrics-reporting-level :refer :all]
            [pinterest-rest-api.specs.bulk-upsert-request-create :refer :all]
            [pinterest-rest-api.specs.auth-respond-invites-body :refer :all]
            [pinterest-rest-api.specs.pins-list-200-response :refer :all]
            [pinterest-rest-api.specs.ad-array-response :refer :all]
            [pinterest-rest-api.specs.catalogs-update-retail-item :refer :all]
            [pinterest-rest-api.specs.optimization-goal-metadata-scrollup-goal-metadata :refer :all]
            [pinterest-rest-api.specs.keyword :refer :all]
            [pinterest-rest-api.specs.pin-media :refer :all]
            [pinterest-rest-api.specs.targeting-template-audience-sizing :refer :all]
            [pinterest-rest-api.specs.advanced-auction-operation :refer :all]
            [pinterest-rest-api.specs.catalogs-retail-product-group :refer :all]
            [pinterest-rest-api.specs.get-business-assets-response :refer :all]
            [pinterest-rest-api.specs.catalogs-items-delete-batch-request :refer :all]
            [pinterest-rest-api.specs.targeting-spec :refer :all]
            [pinterest-rest-api.specs.create-mmm-report-request :refer :all]
            [pinterest-rest-api.specs.trend-type :refer :all]
            [pinterest-rest-api.specs.campaign-create-common :refer :all]
            [pinterest-rest-api.specs.product-group-promotions-list-200-response :refer :all]
            [pinterest-rest-api.specs.ad-accounts-subscriptions-get-list-200-response :refer :all]
            [pinterest-rest-api.specs.catalogs-list-200-response :refer :all]
            [pinterest-rest-api.specs.ssio-order-lines-get-by-ad-account-200-response :refer :all]
            [pinterest-rest-api.specs.get-partner-assets-response :refer :all]
            [pinterest-rest-api.specs.pin-media-source-pin-url :refer :all]
            [pinterest-rest-api.specs.leads-export-create-request :refer :all]
            [pinterest-rest-api.specs.boards-list-200-response :refer :all]
            [pinterest-rest-api.specs.board-media :refer :all]
            [pinterest-rest-api.specs.product-group-promotion-update-request :refer :all]
            [pinterest-rest-api.specs.product-type3-filter :refer :all]
            [pinterest-rest-api.specs.catalogs-product-group-create-request :refer :all]
            [pinterest-rest-api.specs.catalogs-feed-processing-schedule :refer :all]
            [pinterest-rest-api.specs.campaign-is-automated-campaign :refer :all]
            [pinterest-rest-api.specs.campaign-id :refer :all]
            [pinterest-rest-api.specs.update-mask-bid-option-field :refer :all]
            [pinterest-rest-api.specs.lead-form-test-response :refer :all]
            [pinterest-rest-api.specs.audience-demographic-value :refer :all]
            [pinterest-rest-api.specs.catalogs-product-group-filters-request :refer :all]
            [pinterest-rest-api.specs.image-details :refer :all]
            [pinterest-rest-api.specs.item-batch-record :refer :all]
            [pinterest-rest-api.specs.conversion-tag-response :refer :all]
            [pinterest-rest-api.specs.interest :refer :all]
            [pinterest-rest-api.specs.ad-accounts-list-200-response :refer :all]
            [pinterest-rest-api.specs.tracking-urls :refer :all]
            [pinterest-rest-api.specs.top-video-pins-analytics-response :refer :all]
            [pinterest-rest-api.specs.get-business-members-200-response :refer :all]
            [pinterest-rest-api.specs.item-response-any-of :refer :all]
            [pinterest-rest-api.specs.catalogs-creative-assets-product-group-filters :refer :all]
            [pinterest-rest-api.specs.ssio-account-response :refer :all]
            [pinterest-rest-api.specs.single-interest-targeting-option-response :refer :all]
            [pinterest-rest-api.specs.asset-group-binding :refer :all]
            [pinterest-rest-api.specs.order-lines-list-200-response :refer :all]
            [pinterest-rest-api.specs.conversion-events-data-inner :refer :all]
            [pinterest-rest-api.specs.pin-create :refer :all]
            [pinterest-rest-api.specs.ad-group-audience-sizing-request-keywords-inner :refer :all]
            [pinterest-rest-api.specs.deleted-members-response :refer :all]
            [pinterest-rest-api.specs.pin-media-with-images :refer :all]
            [pinterest-rest-api.specs.conversion-events-user-data-any-of :refer :all]
            [pinterest-rest-api.specs.catalogs-creative-assets-attributes :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-product-group-filters-any-of :refer :all]
            [pinterest-rest-api.specs.campaign-create-response :refer :all]
            [pinterest-rest-api.specs.ad-preview-request :refer :all]
            [pinterest-rest-api.specs.follow-user-request :refer :all]
            [pinterest-rest-api.specs.campaign-update-response :refer :all]
            [pinterest-rest-api.specs.pin-media-source-images-base64-items-inner :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-attributes :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-product-group-filters-all-of :refer :all]
            [pinterest-rest-api.specs.optimization-goal-metadata-conversion-tag-v3-goal-metadata-attribution-windows :refer :all]
            [pinterest-rest-api.specs.max-price-filter :refer :all]
            [pinterest-rest-api.specs.ads-analytics-filter-column :refer :all]
            [pinterest-rest-api.specs.business-access-role :refer :all]
            [pinterest-rest-api.specs.business-shared-audience-response :refer :all]
            [pinterest-rest-api.specs.order-line-paid-type :refer :all]
            [pinterest-rest-api.specs.shared-audience-account :refer :all]
            [pinterest-rest-api.specs.order-lines-array-response :refer :all]
            [pinterest-rest-api.specs.lead-form-status :refer :all]
            [pinterest-rest-api.specs.catalogs-report-feed-ingestion-stats :refer :all]
            [pinterest-rest-api.specs.bulk-download-request-campaign-filter :refer :all]
            [pinterest-rest-api.specs.ssio-edit-insertion-order-request :refer :all]
            [pinterest-rest-api.specs.pin-update-carousel-slots-inner :refer :all]
            [pinterest-rest-api.specs.catalogs-retail-product :refer :all]
            [pinterest-rest-api.specs.permissions :refer :all]
            [pinterest-rest-api.specs.create-asset-access-request-body-asset-requests-inner :refer :all]
            [pinterest-rest-api.specs.delete-partner-asset-access-body-accesses-inner :refer :all]
            [pinterest-rest-api.specs.audience-insights-response :refer :all]
            [pinterest-rest-api.specs.multiple-product-groups-inner :refer :all]
            [pinterest-rest-api.specs.delivery-metrics-response :refer :all]
            [pinterest-rest-api.specs.audience-description :refer :all]
            [pinterest-rest-api.specs.bulk-upsert-status-response :refer :all]
            [pinterest-rest-api.specs.ad-groups-list-200-response :refer :all]
            [pinterest-rest-api.specs.user-website-verification-code :refer :all]
            [pinterest-rest-api.specs.top-video-pins-analytics-response-pins-inner :refer :all]
            [pinterest-rest-api.specs.catalogs-list-products-by-filter-request :refer :all]
            [pinterest-rest-api.specs.targeting-template-update-request :refer :all]
            [pinterest-rest-api.specs.related-terms-related-terms-list-inner :refer :all]
            [pinterest-rest-api.specs.audience-data-party :refer :all]
            [pinterest-rest-api.specs.catalogs-db-item :refer :all]
            [pinterest-rest-api.specs.advanced-auction-items-submit-delete-record :refer :all]
            [pinterest-rest-api.specs.customer-list-update-request :refer :all]
            [pinterest-rest-api.specs.order-line-single-response :refer :all]
            [pinterest-rest-api.specs.resource-id-to-roles :refer :all]
            [pinterest-rest-api.specs.conversion-attribution-window-days :refer :all]
            [pinterest-rest-api.specs.item-delete-batch-record :refer :all]
            [pinterest-rest-api.specs.billing-profiles-get-200-response :refer :all]
            [pinterest-rest-api.specs.invite-business-role-binding :refer :all]
            [pinterest-rest-api.specs.catalogs-upsert-creative-assets-item :refer :all]
            [pinterest-rest-api.specs.integrations-get-list-200-response :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-item-error-response :refer :all]
            [pinterest-rest-api.specs.business-members-asset-access-delete-request :refer :all]
            [pinterest-rest-api.specs.top-pins-analytics-response-date-availability :refer :all]
            [pinterest-rest-api.specs.audience-share-type :refer :all]
            [pinterest-rest-api.specs.user-list-operation-type :refer :all]
            [pinterest-rest-api.specs.update-asset-group-response-exceptions-inner :refer :all]
            [pinterest-rest-api.specs.ads-analytics-create-async-request :refer :all]
            [pinterest-rest-api.specs.bid-in-micro-currency :refer :all]
            [pinterest-rest-api.specs.app-type-multipliers :refer :all]
            [pinterest-rest-api.specs.update-partner-asset-access-body-accesses-inner :refer :all]
            [pinterest-rest-api.specs.product-type2-filter :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-product-metadata :refer :all]
            [pinterest-rest-api.specs.advanced-auction-bid-options :refer :all]
            [pinterest-rest-api.specs.catalogs-creative-assets-item-response :refer :all]
            [pinterest-rest-api.specs.gender :refer :all]
            [pinterest-rest-api.specs.keywords-metrics-array-response :refer :all]
            [pinterest-rest-api.specs.auth-respond-invites-body-invites-inner-action :refer :all]
            [pinterest-rest-api.specs.ad-accounts-country-response :refer :all]
            [pinterest-rest-api.specs.business-access-user-summary :refer :all]
            [pinterest-rest-api.specs.quiz-pin-result :refer :all]
            [pinterest-rest-api.specs.catalogs-create-hotel-item :refer :all]
            [pinterest-rest-api.specs.ad-preview-create-from-pin :refer :all]
            [pinterest-rest-api.specs.google-product-category3-filter :refer :all]
            [pinterest-rest-api.specs.ad-common :refer :all]
            [pinterest-rest-api.specs.ad-group-response :refer :all]
            [pinterest-rest-api.specs.catalogs-creative-assets-batch-request :refer :all]
            [pinterest-rest-api.specs.trending-keywords-response-trends-inner :refer :all]
            [pinterest-rest-api.specs.product-group-promotion-create-request :refer :all]
            [pinterest-rest-api.specs.pin-media-with-image-all-of-images :refer :all]
            [pinterest-rest-api.specs.catalogs-retail-batch-request :refer :all]
            [pinterest-rest-api.specs.media-type :refer :all]
            [pinterest-rest-api.specs.conversion-report-attribution-type :refer :all]
            [pinterest-rest-api.specs.catalogs-report-feed-ingestion-filter :refer :all]
            [pinterest-rest-api.specs.audience-create-request :refer :all]
            [pinterest-rest-api.specs.catalogs-feed-validation-errors :refer :all]
            [pinterest-rest-api.specs.line-item :refer :all]
            [pinterest-rest-api.specs.pinterest-tag-event-data :refer :all]
            [pinterest-rest-api.specs.delivery-metrics-response-items-inner :refer :all]
            [pinterest-rest-api.specs.business-role-response :refer :all]
            [pinterest-rest-api.specs.targeting-type-filter :refer :all]
            [pinterest-rest-api.specs.catalogs-create-request :refer :all]
            [pinterest-rest-api.specs.delete-partners-response :refer :all]
            [pinterest-rest-api.specs.ad-preview-create-from-image :refer :all]
            [pinterest-rest-api.specs.campaigns-list-200-response :refer :all]
            [pinterest-rest-api.specs.catalogs-items-upsert-batch-request :refer :all]
            [pinterest-rest-api.specs.conversion-api-response :refer :all]
            [pinterest-rest-api.specs.hotel-processing-record :refer :all]
            [pinterest-rest-api.specs.invite-exception-response :refer :all]
            [pinterest-rest-api.specs.lead-form-question-field-type :refer :all]
            [pinterest-rest-api.specs.bulk-download-response :refer :all]
            [pinterest-rest-api.specs.currency-filter :refer :all]
            [pinterest-rest-api.specs.delete-partner-assets-result :refer :all]
            [pinterest-rest-api.specs.ads-analytics-metrics-filter :refer :all]
            [pinterest-rest-api.specs.campaigns-analytics-response-inner :refer :all]
            [pinterest-rest-api.specs.board :refer :all]
            [pinterest-rest-api.specs.ad-account-create-subscription-request :refer :all]
            [pinterest-rest-api.specs.delete-invites-results-response-array-items-inner-exception :refer :all]
            [pinterest-rest-api.specs.create-asset-invites-request-item :refer :all]
            [pinterest-rest-api.specs.ssio-edit-insertion-order-response :refer :all]
            [pinterest-rest-api.specs.catalogs-delete-hotel-item :refer :all]
            [pinterest-rest-api.specs.catalogs-creative-assets-product-group-product-counts :refer :all]
            [pinterest-rest-api.specs.create-invites-results-response-array-items-inner-invite :refer :all]
            [pinterest-rest-api.specs.advanced-auction-items-submit-record :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-product-group-filters :refer :all]
            [pinterest-rest-api.specs.create-asset-group-response :refer :all]
            [pinterest-rest-api.specs.catalogs-feeds-create-request :refer :all]
            [pinterest-rest-api.specs.trends-supported-region :refer :all]
            [pinterest-rest-api.specs.advanced-auction-operation-error :refer :all]
            [pinterest-rest-api.specs.lead-form-array-response-items-inner :refer :all]
            [pinterest-rest-api.specs.followers-list-200-response :refer :all]
            [pinterest-rest-api.specs.batch-operation :refer :all]
            [pinterest-rest-api.specs.catalogs-creative-assets-items-filter :refer :all]
            [pinterest-rest-api.specs.product-availability-type :refer :all]
            [pinterest-rest-api.specs.catalogs-product-group-pricing-criteria :refer :all]
            [pinterest-rest-api.specs.advanced-auction-items-get-record :refer :all]
            [pinterest-rest-api.specs.integration-request :refer :all]
            [pinterest-rest-api.specs.ssio-insertion-order-status-response :refer :all]
            [pinterest-rest-api.specs.catalogs-product :refer :all]
            [pinterest-rest-api.specs.catalogs-product-group-multiple-media-types-criteria :refer :all]
            [pinterest-rest-api.specs.trending-keywords-response :refer :all]
            [pinterest-rest-api.specs.mmm-reporting-targeting-type :refer :all]
            [pinterest-rest-api.specs.pin-media-with-image-and-video :refer :all]
            [pinterest-rest-api.specs.catalogs-locale :refer :all]
            [pinterest-rest-api.specs.template-response-date-range-absolute-date-range :refer :all]
            [pinterest-rest-api.specs.item-processing-status :refer :all]
            [pinterest-rest-api.specs.business-asset-members-get-200-response :refer :all]
            [pinterest-rest-api.specs.catalogs-product-group-pins-list-200-response :refer :all]
            [pinterest-rest-api.specs.item-validation-event :refer :all]
            [pinterest-rest-api.specs.catalogs-product-groups-list-200-response :refer :all]
            [pinterest-rest-api.specs.template-response-date-range-relative-date-range :refer :all]
            [pinterest-rest-api.specs.ad-account-analytics-response-inner :refer :all]
            [pinterest-rest-api.specs.update-member-asset-access-body :refer :all]
            [pinterest-rest-api.specs.catalogs-report :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-list-products-by-catalog-based-filter-request :refer :all]
            [pinterest-rest-api.specs.ssio-order-line :refer :all]
            [pinterest-rest-api.specs.media-list-200-response :refer :all]
            [pinterest-rest-api.specs.pin-media-source-images-base64 :refer :all]
            [pinterest-rest-api.specs.catalogs-feed-ingestion-errors :refer :all]
            [pinterest-rest-api.specs.catalogs-creative-assets-feed :refer :all]
            [pinterest-rest-api.specs.ssio-insertion-order-status :refer :all]
            [pinterest-rest-api.specs.ad-group-summary-status :refer :all]
            [pinterest-rest-api.specs.integration-logs-invalid-log-response :refer :all]
            [pinterest-rest-api.specs.targeting-template-keyword :refer :all]
            [pinterest-rest-api.specs.error :refer :all]
            [pinterest-rest-api.specs.catalogs-product-group-filters-request-any-of-1 :refer :all]
            [pinterest-rest-api.specs.campaign-create-request :refer :all]
            [pinterest-rest-api.specs.update-asset-group-body :refer :all]
            [pinterest-rest-api.specs.ad-group-array-response-element :refer :all]
            [pinterest-rest-api.specs.action-type :refer :all]
            [pinterest-rest-api.specs.ssio-account-item :refer :all]
            [pinterest-rest-api.specs.business-partner-asset-access-get-200-response :refer :all]
            [pinterest-rest-api.specs.audience-update-request :refer :all]
            [pinterest-rest-api.specs.audience-create-custom-request :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-issue :refer :all]
            [pinterest-rest-api.specs.create-invites-results-response-array :refer :all]
            [pinterest-rest-api.specs.lead-form-response :refer :all]
            [pinterest-rest-api.specs.catalogs-retail-items-batch :refer :all]
            [pinterest-rest-api.specs.analytics-daily-metrics :refer :all]
            [pinterest-rest-api.specs.product-group-promotion :refer :all]
            [pinterest-rest-api.specs.shared-audience :refer :all]
            [pinterest-rest-api.specs.catalogs-creative-assets-items-post-filter :refer :all]
            [pinterest-rest-api.specs.conversion-tag-create :refer :all]
            [pinterest-rest-api.specs.creative-assets-id-filter :refer :all]
            [pinterest-rest-api.specs.advanced-auction-items-get-request :refer :all]
            [pinterest-rest-api.specs.catalogs-product-group-product-counts-vertical :refer :all]
            [pinterest-rest-api.specs.get-invites-200-response :refer :all]
            [pinterest-rest-api.specs.catalogs-feeds-update-request :refer :all]
            [pinterest-rest-api.specs.ad-account-owner :refer :all]
            [pinterest-rest-api.specs.partner-type :refer :all]
            [pinterest-rest-api.specs.catalogs-creative-assets-product-metadata :refer :all]
            [pinterest-rest-api.specs.bulk-entity-type :refer :all]
            [pinterest-rest-api.specs.account :refer :all]
            )
  (:import (java.io File)))


(defn-spec catalogs-create-with-http-info any?
  "Create catalog
  Create a new catalog owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>

Note: this API only supports the catalog type of HOTEL for now."
  ([catalogs-create-request catalogs-create-request, ] (catalogs-create-with-http-info catalogs-create-request nil))
  ([catalogs-create-request catalogs-create-request, {:keys [ad_account_id]} (s/map-of keyword? any?)]
   (check-required-params catalogs-create-request)
   (call-api "/catalogs" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"ad_account_id" ad_account_id }
              :form-params   {}
              :body-param    catalogs-create-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["pinterest_oauth2"]})))

(defn-spec catalogs-create catalog-spec
  "Create catalog
  Create a new catalog owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>

Note: this API only supports the catalog type of HOTEL for now."
  ([catalogs-create-request catalogs-create-request, ] (catalogs-create catalogs-create-request nil))
  ([catalogs-create-request catalogs-create-request, optional-params any?]
   (let [res (:data (catalogs-create-with-http-info catalogs-create-request optional-params))]
     (if (:decode-models *api-context*)
        (st/decode catalog-spec res st/string-transformer)
        res))))


(defn-spec catalogs-list-with-http-info any?
  "List catalogs
  Fetch catalogs owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>"
  ([] (catalogs-list-with-http-info nil))
  ([{:keys [bookmark page_size ad_account_id]} (s/map-of keyword? any?)]
   (call-api "/catalogs" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"bookmark" bookmark "page_size" page_size "ad_account_id" ad_account_id }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["pinterest_oauth2"]})))

(defn-spec catalogs-list catalogs-list-200-response-spec
  "List catalogs
  Fetch catalogs owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>"
  ([] (catalogs-list nil))
  ([optional-params any?]
   (let [res (:data (catalogs-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode catalogs-list-200-response-spec res st/string-transformer)
        res))))


(defn-spec catalogs-product-group-pins-list-with-http-info any?
  "List products by product group
  Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>"
  ([product_group_id string?, ] (catalogs-product-group-pins-list-with-http-info product_group_id nil))
  ([product_group_id string?, {:keys [bookmark page_size ad_account_id pin_metrics]} (s/map-of keyword? any?)]
   (check-required-params product_group_id)
   (call-api "/catalogs/product_groups/{product_group_id}/products" :get
             {:path-params   {"product_group_id" product_group_id }
              :header-params {}
              :query-params  {"bookmark" bookmark "page_size" page_size "ad_account_id" ad_account_id "pin_metrics" pin_metrics }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["pinterest_oauth2"]})))

(defn-spec catalogs-product-group-pins-list catalogs-product-group-pins-list-200-response-spec
  "List products by product group
  Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>"
  ([product_group_id string?, ] (catalogs-product-group-pins-list product_group_id nil))
  ([product_group_id string?, optional-params any?]
   (let [res (:data (catalogs-product-group-pins-list-with-http-info product_group_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode catalogs-product-group-pins-list-200-response-spec res st/string-transformer)
        res))))


(defn-spec catalogs-product-groups-create-with-http-info any?
  "Create product group
  Create product group to use in Catalogs owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>

Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager."
  ([multiple-product-groups-inner multiple-product-groups-inner, ] (catalogs-product-groups-create-with-http-info multiple-product-groups-inner nil))
  ([multiple-product-groups-inner multiple-product-groups-inner, {:keys [ad_account_id]} (s/map-of keyword? any?)]
   (check-required-params multiple-product-groups-inner)
   (call-api "/catalogs/product_groups" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"ad_account_id" ad_account_id }
              :form-params   {}
              :body-param    multiple-product-groups-inner
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["pinterest_oauth2"]})))

(defn-spec catalogs-product-groups-create catalogs-vertical-product-group-spec
  "Create product group
  Create product group to use in Catalogs owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>

Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager."
  ([multiple-product-groups-inner multiple-product-groups-inner, ] (catalogs-product-groups-create multiple-product-groups-inner nil))
  ([multiple-product-groups-inner multiple-product-groups-inner, optional-params any?]
   (let [res (:data (catalogs-product-groups-create-with-http-info multiple-product-groups-inner optional-params))]
     (if (:decode-models *api-context*)
        (st/decode catalogs-vertical-product-group-spec res st/string-transformer)
        res))))


(defn-spec catalogs-product-groups-create-many-with-http-info any?
  "Create product groups
  Create product group to use in Catalogs owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>

Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager."
  ([multiple-product-groups-inner (s/coll-of multiple-product-groups-inner-spec), ] (catalogs-product-groups-create-many-with-http-info multiple-product-groups-inner nil))
  ([multiple-product-groups-inner (s/coll-of multiple-product-groups-inner-spec), {:keys [ad_account_id]} (s/map-of keyword? any?)]
   (check-required-params multiple-product-groups-inner)
   (call-api "/catalogs/product_groups/multiple" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"ad_account_id" ad_account_id }
              :form-params   {}
              :body-param    multiple-product-groups-inner
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["pinterest_oauth2"]})))

(defn-spec catalogs-product-groups-create-many (s/coll-of string?)
  "Create product groups
  Create product group to use in Catalogs owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>

Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager."
  ([multiple-product-groups-inner (s/coll-of multiple-product-groups-inner-spec), ] (catalogs-product-groups-create-many multiple-product-groups-inner nil))
  ([multiple-product-groups-inner (s/coll-of multiple-product-groups-inner-spec), optional-params any?]
   (let [res (:data (catalogs-product-groups-create-many-with-http-info multiple-product-groups-inner optional-params))]
     (if (:decode-models *api-context*)
        (st/decode (s/coll-of string?) res st/string-transformer)
        res))))


(defn-spec catalogs-product-groups-delete-with-http-info any?
  "Delete product group
  Delete a product group owned by the \"operation user_account\" from being in use in Catalogs.
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>"
  ([product_group_id string?, ] (catalogs-product-groups-delete-with-http-info product_group_id nil))
  ([product_group_id string?, {:keys [ad_account_id]} (s/map-of keyword? any?)]
   (check-required-params product_group_id)
   (call-api "/catalogs/product_groups/{product_group_id}" :delete
             {:path-params   {"product_group_id" product_group_id }
              :header-params {}
              :query-params  {"ad_account_id" ad_account_id }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["pinterest_oauth2"]})))

(defn-spec catalogs-product-groups-delete any?
  "Delete product group
  Delete a product group owned by the \"operation user_account\" from being in use in Catalogs.
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>"
  ([product_group_id string?, ] (catalogs-product-groups-delete product_group_id nil))
  ([product_group_id string?, optional-params any?]
   (let [res (:data (catalogs-product-groups-delete-with-http-info product_group_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec catalogs-product-groups-delete-many-with-http-info any?
  "Delete product groups
  Delete product groups owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>"
  ([id (s/coll-of int?), ] (catalogs-product-groups-delete-many-with-http-info id nil))
  ([id (s/coll-of int?), {:keys [ad_account_id]} (s/map-of keyword? any?)]
   (check-required-params id)
   (call-api "/catalogs/product_groups/multiple" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"id" (with-collection-format id :csv) "ad_account_id" ad_account_id }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["pinterest_oauth2"]})))

(defn-spec catalogs-product-groups-delete-many any?
  "Delete product groups
  Delete product groups owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>"
  ([id (s/coll-of int?), ] (catalogs-product-groups-delete-many id nil))
  ([id (s/coll-of int?), optional-params any?]
   (let [res (:data (catalogs-product-groups-delete-many-with-http-info id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec catalogs-product-groups-get-with-http-info any?
  "Get product group
  Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>"
  ([product_group_id string?, ] (catalogs-product-groups-get-with-http-info product_group_id nil))
  ([product_group_id string?, {:keys [ad_account_id]} (s/map-of keyword? any?)]
   (check-required-params product_group_id)
   (call-api "/catalogs/product_groups/{product_group_id}" :get
             {:path-params   {"product_group_id" product_group_id }
              :header-params {}
              :query-params  {"ad_account_id" ad_account_id }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["pinterest_oauth2"]})))

(defn-spec catalogs-product-groups-get catalogs-vertical-product-group-spec
  "Get product group
  Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>"
  ([product_group_id string?, ] (catalogs-product-groups-get product_group_id nil))
  ([product_group_id string?, optional-params any?]
   (let [res (:data (catalogs-product-groups-get-with-http-info product_group_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode catalogs-vertical-product-group-spec res st/string-transformer)
        res))))


(defn-spec catalogs-product-groups-list-with-http-info any?
  "List product groups
  Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>"
  ([] (catalogs-product-groups-list-with-http-info nil))
  ([{:keys [id feed_id catalog_id bookmark page_size ad_account_id]} (s/map-of keyword? any?)]
   (call-api "/catalogs/product_groups" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"id" (with-collection-format id :csv) "feed_id" feed_id "catalog_id" catalog_id "bookmark" bookmark "page_size" page_size "ad_account_id" ad_account_id }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["pinterest_oauth2"]})))

(defn-spec catalogs-product-groups-list catalogs-product-groups-list-200-response-spec
  "List product groups
  Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>"
  ([] (catalogs-product-groups-list nil))
  ([optional-params any?]
   (let [res (:data (catalogs-product-groups-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode catalogs-product-groups-list-200-response-spec res st/string-transformer)
        res))))


(defn-spec catalogs-product-groups-product-counts-get-with-http-info any?
  "Get product counts
  Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>"
  ([product_group_id string?, ] (catalogs-product-groups-product-counts-get-with-http-info product_group_id nil))
  ([product_group_id string?, {:keys [ad_account_id]} (s/map-of keyword? any?)]
   (check-required-params product_group_id)
   (call-api "/catalogs/product_groups/{product_group_id}/product_counts" :get
             {:path-params   {"product_group_id" product_group_id }
              :header-params {}
              :query-params  {"ad_account_id" ad_account_id }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["pinterest_oauth2"]})))

(defn-spec catalogs-product-groups-product-counts-get catalogs-product-group-product-counts-vertical-spec
  "Get product counts
  Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>"
  ([product_group_id string?, ] (catalogs-product-groups-product-counts-get product_group_id nil))
  ([product_group_id string?, optional-params any?]
   (let [res (:data (catalogs-product-groups-product-counts-get-with-http-info product_group_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode catalogs-product-group-product-counts-vertical-spec res st/string-transformer)
        res))))


(defn-spec catalogs-product-groups-update-with-http-info any?
  "Update single product group
  Update product group owned by the \"operation user_account\" to use in Catalogs.
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>

Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager."
  ([product_group_id string?, catalogs-product-groups-update-request catalogs-product-groups-update-request, ] (catalogs-product-groups-update-with-http-info product_group_id catalogs-product-groups-update-request nil))
  ([product_group_id string?, catalogs-product-groups-update-request catalogs-product-groups-update-request, {:keys [ad_account_id]} (s/map-of keyword? any?)]
   (check-required-params product_group_id catalogs-product-groups-update-request)
   (call-api "/catalogs/product_groups/{product_group_id}" :patch
             {:path-params   {"product_group_id" product_group_id }
              :header-params {}
              :query-params  {"ad_account_id" ad_account_id }
              :form-params   {}
              :body-param    catalogs-product-groups-update-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["pinterest_oauth2"]})))

(defn-spec catalogs-product-groups-update catalogs-vertical-product-group-spec
  "Update single product group
  Update product group owned by the \"operation user_account\" to use in Catalogs.
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>

Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager."
  ([product_group_id string?, catalogs-product-groups-update-request catalogs-product-groups-update-request, ] (catalogs-product-groups-update product_group_id catalogs-product-groups-update-request nil))
  ([product_group_id string?, catalogs-product-groups-update-request catalogs-product-groups-update-request, optional-params any?]
   (let [res (:data (catalogs-product-groups-update-with-http-info product_group_id catalogs-product-groups-update-request optional-params))]
     (if (:decode-models *api-context*)
        (st/decode catalogs-vertical-product-group-spec res st/string-transformer)
        res))))


(defn-spec feed-processing-results-list-with-http-info any?
  "List feed processing results
  Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future.
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>"
  ([feed_id string?, ] (feed-processing-results-list-with-http-info feed_id nil))
  ([feed_id string?, {:keys [bookmark page_size ad_account_id]} (s/map-of keyword? any?)]
   (check-required-params feed_id)
   (call-api "/catalogs/feeds/{feed_id}/processing_results" :get
             {:path-params   {"feed_id" feed_id }
              :header-params {}
              :query-params  {"bookmark" bookmark "page_size" page_size "ad_account_id" ad_account_id }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["pinterest_oauth2"]})))

(defn-spec feed-processing-results-list feed-processing-results-list-200-response-spec
  "List feed processing results
  Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future.
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>"
  ([feed_id string?, ] (feed-processing-results-list feed_id nil))
  ([feed_id string?, optional-params any?]
   (let [res (:data (feed-processing-results-list-with-http-info feed_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode feed-processing-results-list-200-response-spec res st/string-transformer)
        res))))


(defn-spec feeds-create-with-http-info any?
  "Create feed
  Create a new feed owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Please, be aware that \"default_country\"
and \"default_locale\" are not required in the spec for forward compatibility
but for now the API will not accept requests without those fields.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.

Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager."
  ([feeds-create-request feeds-create-request, ] (feeds-create-with-http-info feeds-create-request nil))
  ([feeds-create-request feeds-create-request, {:keys [ad_account_id]} (s/map-of keyword? any?)]
   (check-required-params feeds-create-request)
   (call-api "/catalogs/feeds" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"ad_account_id" ad_account_id }
              :form-params   {}
              :body-param    feeds-create-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["pinterest_oauth2" "client_credentials"]})))

(defn-spec feeds-create catalogs-feed-spec
  "Create feed
  Create a new feed owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Please, be aware that \"default_country\"
and \"default_locale\" are not required in the spec for forward compatibility
but for now the API will not accept requests without those fields.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.

Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager."
  ([feeds-create-request feeds-create-request, ] (feeds-create feeds-create-request nil))
  ([feeds-create-request feeds-create-request, optional-params any?]
   (let [res (:data (feeds-create-with-http-info feeds-create-request optional-params))]
     (if (:decode-models *api-context*)
        (st/decode catalogs-feed-spec res st/string-transformer)
        res))))


(defn-spec feeds-delete-with-http-info any?
  "Delete feed
  Delete a feed owned by the \"operating user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>."
  ([feed_id string?, ] (feeds-delete-with-http-info feed_id nil))
  ([feed_id string?, {:keys [ad_account_id]} (s/map-of keyword? any?)]
   (check-required-params feed_id)
   (call-api "/catalogs/feeds/{feed_id}" :delete
             {:path-params   {"feed_id" feed_id }
              :header-params {}
              :query-params  {"ad_account_id" ad_account_id }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["pinterest_oauth2" "client_credentials"]})))

(defn-spec feeds-delete any?
  "Delete feed
  Delete a feed owned by the \"operating user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>."
  ([feed_id string?, ] (feeds-delete feed_id nil))
  ([feed_id string?, optional-params any?]
   (let [res (:data (feeds-delete-with-http-info feed_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec feeds-get-with-http-info any?
  "Get feed
  Get a single feed owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>."
  ([feed_id string?, ] (feeds-get-with-http-info feed_id nil))
  ([feed_id string?, {:keys [ad_account_id]} (s/map-of keyword? any?)]
   (check-required-params feed_id)
   (call-api "/catalogs/feeds/{feed_id}" :get
             {:path-params   {"feed_id" feed_id }
              :header-params {}
              :query-params  {"ad_account_id" ad_account_id }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["pinterest_oauth2" "client_credentials"]})))

(defn-spec feeds-get catalogs-feed-spec
  "Get feed
  Get a single feed owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>."
  ([feed_id string?, ] (feeds-get feed_id nil))
  ([feed_id string?, optional-params any?]
   (let [res (:data (feeds-get-with-http-info feed_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode catalogs-feed-spec res st/string-transformer)
        res))))


(defn-spec feeds-ingest-with-http-info any?
  "Ingest feed items
  Ingest items for a given feed owned by the \"operation user_account\".

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>

Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager."
  ([feed_id string?, ] (feeds-ingest-with-http-info feed_id nil))
  ([feed_id string?, {:keys [ad_account_id]} (s/map-of keyword? any?)]
   (check-required-params feed_id)
   (call-api "/catalogs/feeds/{feed_id}/ingest" :post
             {:path-params   {"feed_id" feed_id }
              :header-params {}
              :query-params  {"ad_account_id" ad_account_id }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["pinterest_oauth2"]})))

(defn-spec feeds-ingest catalogs-feed-ingestion-spec
  "Ingest feed items
  Ingest items for a given feed owned by the \"operation user_account\".

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>

Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager."
  ([feed_id string?, ] (feeds-ingest feed_id nil))
  ([feed_id string?, optional-params any?]
   (let [res (:data (feeds-ingest-with-http-info feed_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode catalogs-feed-ingestion-spec res st/string-transformer)
        res))))


(defn-spec feeds-list-with-http-info any?
  "List feeds
  Fetch feeds owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>."
  ([] (feeds-list-with-http-info nil))
  ([{:keys [bookmark page_size catalog_id ad_account_id]} (s/map-of keyword? any?)]
   (call-api "/catalogs/feeds" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"bookmark" bookmark "page_size" page_size "catalog_id" catalog_id "ad_account_id" ad_account_id }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["pinterest_oauth2" "client_credentials"]})))

(defn-spec feeds-list feeds-list-200-response-spec
  "List feeds
  Fetch feeds owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>."
  ([] (feeds-list nil))
  ([optional-params any?]
   (let [res (:data (feeds-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode feeds-list-200-response-spec res st/string-transformer)
        res))))


(defn-spec feeds-update-with-http-info any?
  "Update feed
  Update a feed owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.

Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager."
  ([feed_id string?, feeds-update-request feeds-update-request, ] (feeds-update-with-http-info feed_id feeds-update-request nil))
  ([feed_id string?, feeds-update-request feeds-update-request, {:keys [ad_account_id]} (s/map-of keyword? any?)]
   (check-required-params feed_id feeds-update-request)
   (call-api "/catalogs/feeds/{feed_id}" :patch
             {:path-params   {"feed_id" feed_id }
              :header-params {}
              :query-params  {"ad_account_id" ad_account_id }
              :form-params   {}
              :body-param    feeds-update-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["pinterest_oauth2" "client_credentials"]})))

(defn-spec feeds-update catalogs-feed-spec
  "Update feed
  Update a feed owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.

Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager."
  ([feed_id string?, feeds-update-request feeds-update-request, ] (feeds-update feed_id feeds-update-request nil))
  ([feed_id string?, feeds-update-request feeds-update-request, optional-params any?]
   (let [res (:data (feeds-update-with-http-info feed_id feeds-update-request optional-params))]
     (if (:decode-models *api-context*)
        (st/decode catalogs-feed-spec res st/string-transformer)
        res))))


(defn-spec items-batch-get-with-http-info any?
  "Get item batch status
  Get a single catalogs items batch owned by the \"operating user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a>
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager."
  ([batch_id string?, ] (items-batch-get-with-http-info batch_id nil))
  ([batch_id string?, {:keys [ad_account_id]} (s/map-of keyword? any?)]
   (check-required-params batch_id)
   (call-api "/catalogs/items/batch/{batch_id}" :get
             {:path-params   {"batch_id" batch_id }
              :header-params {}
              :query-params  {"ad_account_id" ad_account_id }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["pinterest_oauth2" "client_credentials"]})))

(defn-spec items-batch-get catalogs-items-batch-spec
  "Get item batch status
  Get a single catalogs items batch owned by the \"operating user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a>
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager."
  ([batch_id string?, ] (items-batch-get batch_id nil))
  ([batch_id string?, optional-params any?]
   (let [res (:data (items-batch-get-with-http-info batch_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode catalogs-items-batch-spec res st/string-transformer)
        res))))


(defn-spec items-batch-post-with-http-info any?
  "Operate on item batch
  This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a>
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

Note:
- Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager.
- The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager to get assistance."
  ([items-batch-post-request items-batch-post-request, ] (items-batch-post-with-http-info items-batch-post-request nil))
  ([items-batch-post-request items-batch-post-request, {:keys [ad_account_id]} (s/map-of keyword? any?)]
   (check-required-params items-batch-post-request)
   (call-api "/catalogs/items/batch" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"ad_account_id" ad_account_id }
              :form-params   {}
              :body-param    items-batch-post-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["pinterest_oauth2" "client_credentials"]})))

(defn-spec items-batch-post catalogs-items-batch-spec
  "Operate on item batch
  This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a>
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

Note:
- Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager.
- The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager to get assistance."
  ([items-batch-post-request items-batch-post-request, ] (items-batch-post items-batch-post-request nil))
  ([items-batch-post-request items-batch-post-request, optional-params any?]
   (let [res (:data (items-batch-post-with-http-info items-batch-post-request optional-params))]
     (if (:decode-models *api-context*)
        (st/decode catalogs-items-batch-spec res st/string-transformer)
        res))))


(defn-spec items-get-with-http-info any?
  "Get catalogs items
  Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a>
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

Note: this endpoint is deprecated and will be deleted soon. Please use <a href='/docs/api/v5/#operation/items/post'>Get catalogs items (POST)</a> instead."
  ([country string?, language string?, ] (items-get-with-http-info country language nil))
  ([country string?, language string?, {:keys [ad_account_id item_ids filters]} (s/map-of keyword? any?)]
   (check-required-params country language)
   (call-api "/catalogs/items" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"ad_account_id" ad_account_id "country" country "language" language "item_ids" (with-collection-format item_ids :multi) "filters" filters }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["pinterest_oauth2"]})))

(defn-spec items-get catalogs-items-spec
  "Get catalogs items
  Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a>
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

Note: this endpoint is deprecated and will be deleted soon. Please use <a href='/docs/api/v5/#operation/items/post'>Get catalogs items (POST)</a> instead."
  ([country string?, language string?, ] (items-get country language nil))
  ([country string?, language string?, optional-params any?]
   (let [res (:data (items-get-with-http-info country language optional-params))]
     (if (:decode-models *api-context*)
        (st/decode catalogs-items-spec res st/string-transformer)
        res))))


(defn-spec items-issues-list-with-http-info any?
  "List item issues
  List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future.
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

Note: To get a list of all affected items instead of sampled issues, please refer to <a href='/docs/api/v5/#operation/reports/create'>Build catalogs report</a> and <a href='/docs/api/v5/#operation/reports/get'>Get catalogs report</a> endpoints. Moreover, they support multiple types of catalogs.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>"
  ([processing_result_id string?, ] (items-issues-list-with-http-info processing_result_id nil))
  ([processing_result_id string?, {:keys [bookmark page_size item_numbers item_validation_issue ad_account_id]} (s/map-of keyword? any?)]
   (check-required-params processing_result_id)
   (call-api "/catalogs/processing_results/{processing_result_id}/item_issues" :get
             {:path-params   {"processing_result_id" processing_result_id }
              :header-params {}
              :query-params  {"bookmark" bookmark "page_size" page_size "item_numbers" (with-collection-format item_numbers :multi) "item_validation_issue" item_validation_issue "ad_account_id" ad_account_id }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["pinterest_oauth2"]})))

(defn-spec items-issues-list items-issues-list-200-response-spec
  "List item issues
  List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future.
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

Note: To get a list of all affected items instead of sampled issues, please refer to <a href='/docs/api/v5/#operation/reports/create'>Build catalogs report</a> and <a href='/docs/api/v5/#operation/reports/get'>Get catalogs report</a> endpoints. Moreover, they support multiple types of catalogs.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>"
  ([processing_result_id string?, ] (items-issues-list processing_result_id nil))
  ([processing_result_id string?, optional-params any?]
   (let [res (:data (items-issues-list-with-http-info processing_result_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode items-issues-list-200-response-spec res st/string-transformer)
        res))))


(defn-spec items-post-with-http-info any?
  "Get catalogs items (POST)
  Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a>
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager."
  ([catalogs-items-request catalogs-items-request, ] (items-post-with-http-info catalogs-items-request nil))
  ([catalogs-items-request catalogs-items-request, {:keys [ad_account_id]} (s/map-of keyword? any?)]
   (check-required-params catalogs-items-request)
   (call-api "/catalogs/items" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"ad_account_id" ad_account_id }
              :form-params   {}
              :body-param    catalogs-items-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["pinterest_oauth2"]})))

(defn-spec items-post catalogs-items-spec
  "Get catalogs items (POST)
  Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a>
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager."
  ([catalogs-items-request catalogs-items-request, ] (items-post catalogs-items-request nil))
  ([catalogs-items-request catalogs-items-request, optional-params any?]
   (let [res (:data (items-post-with-http-info catalogs-items-request optional-params))]
     (if (:decode-models *api-context*)
        (st/decode catalogs-items-spec res st/string-transformer)
        res))))


(defn-spec products-by-product-group-filter-list-with-http-info any?
  "List products by filter
  List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request.
- This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent.
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

Note: This endpoint only supports RETAIL catalog at the moment.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>"
  ([catalogs-list-products-by-filter-request catalogs-list-products-by-filter-request, ] (products-by-product-group-filter-list-with-http-info catalogs-list-products-by-filter-request nil))
  ([catalogs-list-products-by-filter-request catalogs-list-products-by-filter-request, {:keys [bookmark page_size ad_account_id pin_metrics]} (s/map-of keyword? any?)]
   (check-required-params catalogs-list-products-by-filter-request)
   (call-api "/catalogs/products/get_by_product_group_filters" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"bookmark" bookmark "page_size" page_size "ad_account_id" ad_account_id "pin_metrics" pin_metrics }
              :form-params   {}
              :body-param    catalogs-list-products-by-filter-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["pinterest_oauth2"]})))

(defn-spec products-by-product-group-filter-list catalogs-product-group-pins-list-200-response-spec
  "List products by filter
  List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request.
- This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent.
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

Note: This endpoint only supports RETAIL catalog at the moment.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>"
  ([catalogs-list-products-by-filter-request catalogs-list-products-by-filter-request, ] (products-by-product-group-filter-list catalogs-list-products-by-filter-request nil))
  ([catalogs-list-products-by-filter-request catalogs-list-products-by-filter-request, optional-params any?]
   (let [res (:data (products-by-product-group-filter-list-with-http-info catalogs-list-products-by-filter-request optional-params))]
     (if (:decode-models *api-context*)
        (st/decode catalogs-product-group-pins-list-200-response-spec res st/string-transformer)
        res))))


(defn-spec reports-create-with-http-info any?
  "Build catalogs report
  Async request to create a report of the catalog owned by the \"operation user_account\". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed.
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager."
  ([catalogs-report-parameters catalogs-report-parameters, ] (reports-create-with-http-info catalogs-report-parameters nil))
  ([catalogs-report-parameters catalogs-report-parameters, {:keys [ad_account_id]} (s/map-of keyword? any?)]
   (check-required-params catalogs-report-parameters)
   (call-api "/catalogs/reports" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"ad_account_id" ad_account_id }
              :form-params   {}
              :body-param    catalogs-report-parameters
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["pinterest_oauth2"]})))

(defn-spec reports-create catalogs-create-report-response-spec
  "Build catalogs report
  Async request to create a report of the catalog owned by the \"operation user_account\". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed.
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager."
  ([catalogs-report-parameters catalogs-report-parameters, ] (reports-create catalogs-report-parameters nil))
  ([catalogs-report-parameters catalogs-report-parameters, optional-params any?]
   (let [res (:data (reports-create-with-http-info catalogs-report-parameters optional-params))]
     (if (:decode-models *api-context*)
        (st/decode catalogs-create-report-response-spec res st/string-transformer)
        res))))


(defn-spec reports-get-with-http-info any?
  "Get catalogs report
  This returns a URL to a report given a token returned from <a href='/docs/api/v5/#operation/reports/create'>Build catalogs report</a>. You can use the URL to download the report.
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager."
  ([token string?, ] (reports-get-with-http-info token nil))
  ([token string?, {:keys [ad_account_id]} (s/map-of keyword? any?)]
   (check-required-params token)
   (call-api "/catalogs/reports" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"ad_account_id" ad_account_id "token" token }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["pinterest_oauth2"]})))

(defn-spec reports-get catalogs-report-spec
  "Get catalogs report
  This returns a URL to a report given a token returned from <a href='/docs/api/v5/#operation/reports/create'>Build catalogs report</a>. You can use the URL to download the report.
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager."
  ([token string?, ] (reports-get token nil))
  ([token string?, optional-params any?]
   (let [res (:data (reports-get-with-http-info token optional-params))]
     (if (:decode-models *api-context*)
        (st/decode catalogs-report-spec res st/string-transformer)
        res))))


(defn-spec reports-stats-with-http-info any?
  "List report stats
  List aggregated numbers of issues for a catalog owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager."
  ([parameters catalogs-report-parameters, ] (reports-stats-with-http-info parameters nil))
  ([parameters catalogs-report-parameters, {:keys [ad_account_id page_size bookmark]} (s/map-of keyword? any?)]
   (check-required-params parameters)
   (call-api "/catalogs/reports/stats" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"ad_account_id" ad_account_id "page_size" page_size "bookmark" bookmark "parameters" parameters }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["pinterest_oauth2"]})))

(defn-spec reports-stats reports-stats-200-response-spec
  "List report stats
  List aggregated numbers of issues for a catalog owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager."
  ([parameters catalogs-report-parameters, ] (reports-stats parameters nil))
  ([parameters catalogs-report-parameters, optional-params any?]
   (let [res (:data (reports-stats-with-http-info parameters optional-params))]
     (if (:decode-models *api-context*)
        (st/decode reports-stats-200-response-spec res st/string-transformer)
        res))))


