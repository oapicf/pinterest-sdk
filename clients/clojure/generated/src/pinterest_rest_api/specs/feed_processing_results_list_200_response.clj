(ns pinterest-rest-api.specs.feed-processing-results-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-feed-processing-result :refer :all]
            )
  (:import (java.io File)))


(def feed-processing-results-list-200-response-data
  {
   (ds/req :items) (s/coll-of catalogs-feed-processing-result-spec)
   (ds/opt :bookmark) string?
   })

(def feed-processing-results-list-200-response-spec
  (ds/spec
    {:name ::feed-processing-results-list-200-response
     :spec feed-processing-results-list-200-response-data}))
