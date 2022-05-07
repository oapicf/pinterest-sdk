(ns pinterest-rest-api.specs.ads-analytics-create-async-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.granularity :refer :all]
            [pinterest-rest-api.specs.conversion-attribution-window-days :refer :all]
            [pinterest-rest-api.specs.conversion-attribution-window-days :refer :all]
            [pinterest-rest-api.specs.conversion-attribution-window-days :refer :all]
            [pinterest-rest-api.specs.conversion-report-time-type :refer :all]
            [pinterest-rest-api.specs.conversion-report-attribution-type :refer :all]
            [pinterest-rest-api.specs.reporting-column-async :refer :all]
            [pinterest-rest-api.specs.metrics-reporting-level :refer :all]
            [pinterest-rest-api.specs.data-output-format :refer :all]
            [pinterest-rest-api.specs.campaign-summary-status :refer :all]
            [pinterest-rest-api.specs.objective-type :refer :all]
            [pinterest-rest-api.specs.ad-group-summary-status :refer :all]
            [pinterest-rest-api.specs.pin-promotion-summary-status :refer :all]
            [pinterest-rest-api.specs.product-group-summary-status :refer :all]
            [pinterest-rest-api.specs.ads-analytics-targeting-type :refer :all]
            [pinterest-rest-api.specs.ads-analytics-metrics-filter :refer :all]
            )
  (:import (java.io File)))


(def ads-analytics-create-async-request-data
  {
   (ds/req :start_date) string?
   (ds/req :end_date) string?
   (ds/req :granularity) granularity-spec
   (ds/opt :click_window_days) conversion-attribution-window-days-spec
   (ds/opt :engagement_window_days) conversion-attribution-window-days-spec
   (ds/opt :view_window_days) conversion-attribution-window-days-spec
   (ds/opt :conversion_report_time) conversion-report-time-type-spec
   (ds/opt :attribution_types) (s/coll-of conversion-report-attribution-type-spec)
   (ds/req :columns) (s/coll-of reporting-column-async-spec)
   (ds/req :level) metrics-reporting-level-spec
   (ds/opt :report_format) data-output-format-spec
   (ds/opt :campaign_ids) (s/coll-of string?)
   (ds/opt :campaign_statuses) (s/coll-of campaign-summary-status-spec)
   (ds/opt :campaign_objective_types) (s/coll-of objective-type-spec)
   (ds/opt :ad_group_ids) (s/coll-of string?)
   (ds/opt :ad_group_statuses) (s/coll-of ad-group-summary-status-spec)
   (ds/opt :ad_ids) (s/coll-of string?)
   (ds/opt :ad_statuses) (s/coll-of pin-promotion-summary-status-spec)
   (ds/opt :product_group_ids) (s/coll-of string?)
   (ds/opt :product_group_statuses) (s/coll-of product-group-summary-status-spec)
   (ds/opt :product_item_ids) (s/coll-of string?)
   (ds/opt :targeting_types) (s/coll-of ads-analytics-targeting-type-spec)
   (ds/opt :metrics_filters) (s/coll-of ads-analytics-metrics-filter-spec)
   })

(def ads-analytics-create-async-request-spec
  (ds/spec
    {:name ::ads-analytics-create-async-request
     :spec ads-analytics-create-async-request-data}))
