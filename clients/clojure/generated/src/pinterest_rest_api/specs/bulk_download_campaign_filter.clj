(ns pinterest-rest-api.specs.bulk-download-campaign-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.summary-status :refer :all]
            [pinterest-rest-api.specs.conversion-objective-type :refer :all]
            )
  (:import (java.io File)))


(def bulk-download-campaign-filter-data
  {
   (ds/opt :campaign_status) (s/coll-of summary-status-spec)
   (ds/opt :end_time) string?
   (ds/opt :name) string?
   (ds/opt :objective_type) (s/coll-of conversion-objective-type-spec)
   (ds/opt :start_time) string?
   })

(def bulk-download-campaign-filter-spec
  (ds/spec
    {:name ::bulk-download-campaign-filter
     :spec bulk-download-campaign-filter-data}))
