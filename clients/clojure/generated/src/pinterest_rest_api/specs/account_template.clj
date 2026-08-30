(ns pinterest-rest-api.specs.account-template
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs.reporting-column :refer :all]
            [pinterest-rest-api.specs.conversion-report-time-type :refer :all]
            [pinterest-rest-api.specs.creation-source :refer :all]
            [pinterest-rest-api.specs.granularity :refer :all]
            [pinterest-rest-api.specs.ingestion-source :refer :all]
            [pinterest-rest-api.specs.data-output-format :refer :all]
            [pinterest-rest-api.specs.metrics-reporting-level :refer :all]
            [pinterest-rest-api.specs.reporting-time-zone :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def account-template-data
  {
   (ds/opt :ad_account_id) string?
   (ds/opt :ad_account_ids) (s/coll-of string?)
   (ds/opt :ade_columns) (s/coll-of string?)
   (ds/opt :attribution_type) any-type-spec
   (ds/opt :click_window_days) float?
   (ds/opt :columns) (s/coll-of reporting-column-spec)
   (ds/opt :conversion_report_time_type) conversion-report-time-type-spec
   (ds/opt :creation_source) creation-source-spec
   (ds/opt :custom_column_ids) (s/coll-of string?)
   (ds/opt :display_metadata) string?
   (ds/opt :engagement_window_days) float?
   (ds/opt :filters_json) string?
   (ds/opt :granularity) granularity-spec
   (ds/req :id) string?
   (ds/opt :ingestion_sources) (s/coll-of ingestion-source-spec)
   (ds/opt :is_default) boolean?
   (ds/opt :is_deleted) boolean?
   (ds/opt :is_owned_by_user) boolean?
   (ds/opt :is_scheduled) boolean?
   (ds/opt :name) string?
   (ds/opt :report_end_relative_days_in_past) float?
   (ds/opt :report_format) data-output-format-spec
   (ds/opt :report_level) metrics-reporting-level-spec
   (ds/opt :report_start_relative_days_in_past) float?
   (ds/opt :reporting_time_zone) reporting-time-zone-spec
   (ds/opt :sort_by) any-type-spec
   (ds/opt :type) string?
   (ds/opt :updated_time) float?
   (ds/opt :user_id) string?
   (ds/opt :view_window_days) float?
   })

(def account-template-spec
  (ds/spec
    {:name ::account-template
     :spec account-template-data}))
