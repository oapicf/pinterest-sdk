(ns pinterest-rest-api.specs.template-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.template-response-date-range :refer :all]
            [pinterest-rest-api.specs.metrics-reporting-level :refer :all]
            [pinterest-rest-api.specs.data-output-format :refer :all]
            [pinterest-rest-api.specs.granularity :refer :all]
            )
  (:import (java.io File)))


(def template-response-data
  {
   (ds/opt :id) string?
   (ds/opt :ad_account_id) string?
   (ds/opt :ad_account_ids) (s/coll-of string?)
   (ds/opt :user_id) string?
   (ds/opt :name) string?
   (ds/opt :report_start_relative_days_in_past) float?
   (ds/opt :report_end_relative_days_in_past) float?
   (ds/opt :date_range) template-response-date-range-spec
   (ds/opt :report_level) metrics-reporting-level-spec
   (ds/opt :report_format) data-output-format-spec
   (ds/opt :columns) (s/coll-of string?)
   (ds/opt :granularity) granularity-spec
   (ds/opt :view_window_days) float?
   (ds/opt :click_window_days) float?
   (ds/opt :engagement_window_days) float?
   (ds/opt :conversion_report_time_type) string?
   (ds/opt :filters_json) string?
   (ds/opt :is_owned_by_user) boolean?
   (ds/opt :is_scheduled) boolean?
   (ds/opt :creation_source) string?
   (ds/opt :is_deleted) boolean?
   (ds/opt :updated_time) float?
   (ds/opt :custom_column_ids) (s/coll-of string?)
   (ds/opt :type) string?
   (ds/opt :ingestion_sources) (s/coll-of string?)
   })

(def template-response-spec
  (ds/spec
    {:name ::template-response
     :spec template-response-data}))
