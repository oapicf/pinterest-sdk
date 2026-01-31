(ns pinterest-rest-api.specs.conversion-product-report-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.objective-type :refer :all]
            [pinterest-rest-api.specs.conversion-attribution-window-days :refer :all]
            [pinterest-rest-api.specs.conversion-product-reporting-column :refer :all]
            [pinterest-rest-api.specs.conversion-report-time-type :refer :all]
            [pinterest-rest-api.specs.conversion-attribution-window-days :refer :all]
            )
  (:import (java.io File)))


(def conversion-product-report-request-data
  {
   (ds/opt :ad_group_ids) (s/coll-of string?)
   (ds/opt :campaign_ids) (s/coll-of string?)
   (ds/opt :campaign_objective_types) (s/coll-of objective-type-spec)
   (ds/opt :click_window_days) conversion-attribution-window-days-spec
   (ds/req :columns) (s/coll-of conversion-product-reporting-column-spec)
   (ds/opt :conversion_product_attribution_type) string?
   (ds/opt :conversion_product_breakdown) string?
   (ds/opt :conversion_report_time) conversion-report-time-type-spec
   (ds/req :end_date) string?
   (ds/req :granularity) string?
   (ds/req :level) string?
   (ds/opt :product_sku_ids) (s/coll-of string?)
   (ds/req :report_name) string?
   (ds/req :start_date) string?
   (ds/opt :view_window_days) conversion-attribution-window-days-spec
   })

(def conversion-product-report-request-spec
  (ds/spec
    {:name ::conversion-product-report-request
     :spec conversion-product-report-request-data}))
