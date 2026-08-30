(ns pinterest-rest-api.specs.mmm-report-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.mmm-reporting-column :refer :all]
            [pinterest-rest-api.specs.targeting-advertiser-country :refer :all]
            [pinterest-rest-api.specs.mmm-report-granularity :refer :all]
            [pinterest-rest-api.specs.mmm-report-level :refer :all]
            [pinterest-rest-api.specs.mmm-reporting-targeting-type :refer :all]
            )
  (:import (java.io File)))


(def mmm-report-create-data
  {
   (ds/opt :advertiser_ids) (s/coll-of string?)
   (ds/req :columns) (s/coll-of mmm-reporting-column-spec)
   (ds/opt :countries) (s/coll-of targeting-advertiser-country-spec)
   (ds/opt :custom_column_ids) (s/coll-of string?)
   (ds/req :end_date) string?
   (ds/req :granularity) mmm-report-granularity-spec
   (ds/req :level) mmm-report-level-spec
   (ds/req :report_name) string?
   (ds/req :start_date) string?
   (ds/req :targeting_types) (s/coll-of mmm-reporting-targeting-type-spec)
   })

(def mmm-report-create-spec
  (ds/spec
    {:name ::mmm-report-create
     :spec mmm-report-create-data}))
