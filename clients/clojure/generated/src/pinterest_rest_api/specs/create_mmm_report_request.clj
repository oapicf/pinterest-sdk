(ns pinterest-rest-api.specs.create-mmm-report-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.mmm-reporting-targeting-type :refer :all]
            [pinterest-rest-api.specs.mmm-reporting-column :refer :all]
            [pinterest-rest-api.specs.targeting-advertiser-country :refer :all]
            )
  (:import (java.io File)))


(def create-mmm-report-request-data
  {
   (ds/req :report_name) string?
   (ds/req :start_date) string?
   (ds/req :end_date) string?
   (ds/req :granularity) string?
   (ds/req :level) string?
   (ds/req :targeting_types) (s/coll-of mmm-reporting-targeting-type-spec)
   (ds/req :columns) (s/coll-of mmm-reporting-column-spec)
   (ds/opt :countries) (s/coll-of targeting-advertiser-country-spec)
   })

(def create-mmm-report-request-spec
  (ds/spec
    {:name ::create-mmm-report-request
     :spec create-mmm-report-request-data}))
