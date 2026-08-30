(ns pinterest-rest-api.specs.business-member-assets-get-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.asset-id-permissions :refer :all]
            [pinterest-rest-api.specs.total-count-by-entity-status :refer :all]
            )
  (:import (java.io File)))


(def business-member-assets-get-response-data
  {
   (ds/opt :bookmark) string?
   (ds/req :items) (s/coll-of asset-id-permissions-spec)
   (ds/req :total_data_count) int?
   (ds/opt :total_data_count_by_status) total-count-by-entity-status-spec
   })

(def business-member-assets-get-response-spec
  (ds/spec
    {:name ::business-member-assets-get-response
     :spec business-member-assets-get-response-data}))
