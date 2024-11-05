(ns pinterest-rest-api.specs.search-partner-pins-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.summary-pin :refer :all]
            )
  (:import (java.io File)))


(def search-partner-pins-200-response-data
  {
   (ds/req :items) (s/coll-of summary-pin-spec)
   (ds/opt :bookmark) string?
   })

(def search-partner-pins-200-response-spec
  (ds/spec
    {:name ::search-partner-pins-200-response
     :spec search-partner-pins-200-response-data}))
