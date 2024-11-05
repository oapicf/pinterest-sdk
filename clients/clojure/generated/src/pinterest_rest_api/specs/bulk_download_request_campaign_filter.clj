(ns pinterest-rest-api.specs.bulk-download-request-campaign-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.campaign-summary-status :refer :all]
            [pinterest-rest-api.specs.objective-type :refer :all]
            )
  (:import (java.io File)))


(def bulk-download-request-campaign-filter-data
  {
   (ds/opt :start_time) string?
   (ds/opt :end_time) string?
   (ds/opt :name) string?
   (ds/opt :campaign_status) (s/coll-of campaign-summary-status-spec)
   (ds/opt :objective_type) (s/coll-of objective-type-spec)
   })

(def bulk-download-request-campaign-filter-spec
  (ds/spec
    {:name ::bulk-download-request-campaign-filter
     :spec bulk-download-request-campaign-filter-data}))
