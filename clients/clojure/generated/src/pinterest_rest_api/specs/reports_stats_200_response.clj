(ns pinterest-rest-api.specs.reports-stats-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-report-stats :refer :all]
            )
  (:import (java.io File)))


(def reports-stats-200-response-data
  {
   (ds/opt :bookmark) string?
   (ds/req :items) (s/coll-of catalogs-report-stats-spec)
   })

(def reports-stats-200-response-spec
  (ds/spec
    {:name ::reports-stats-200-response
     :spec reports-stats-200-response-data}))
