(ns pinterest-rest-api.specs.conversion-product-report-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.conversion-objective-type :refer :all]
            [pinterest-rest-api.specs.conversion-attribution-window-days :refer :all]
            [pinterest-rest-api.specs.conversion-product-reporting-column :refer :all]
            [pinterest-rest-api.specs.conversion-product-attribution-type :refer :all]
            [pinterest-rest-api.specs.conversion-product-report-breakdown-type :refer :all]
            [pinterest-rest-api.specs.conversion-report-time-type :refer :all]
            [pinterest-rest-api.specs.conversion-product-report-granularity :refer :all]
            [pinterest-rest-api.specs.conversion-product-report-level :refer :all]
            [pinterest-rest-api.specs.conversion-attribution-window-days :refer :all]
            )
  (:import (java.io File)))


(def conversion-product-report-create-data
  {
   (ds/opt :ad_group_ids) (s/coll-of string?)
   (ds/opt :campaign_ids) (s/coll-of string?)
   (ds/opt :campaign_objective_types) (s/coll-of conversion-objective-type-spec)
   (ds/opt :click_window_days) conversion-attribution-window-days-spec
   (ds/req :columns) (s/coll-of conversion-product-reporting-column-spec)
   (ds/opt :conversion_product_attribution_type) conversion-product-attribution-type-spec
   (ds/opt :conversion_product_breakdown) conversion-product-report-breakdown-type-spec
   (ds/opt :conversion_report_time) conversion-report-time-type-spec
   (ds/req :end_date) string?
   (ds/req :granularity) conversion-product-report-granularity-spec
   (ds/req :level) conversion-product-report-level-spec
   (ds/opt :product_sku_ids) (s/coll-of string?)
   (ds/req :report_name) string?
   (ds/req :start_date) string?
   (ds/opt :view_window_days) conversion-attribution-window-days-spec
   })

(def conversion-product-report-create-spec
  (ds/spec
    {:name ::conversion-product-report-create
     :spec conversion-product-report-create-data}))
