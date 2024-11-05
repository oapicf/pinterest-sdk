(ns pinterest-rest-api.specs.update-partner-results-response-array
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.update-partner-results-response-array-items-inner :refer :all]
            )
  (:import (java.io File)))


(def update-partner-results-response-array-data
  {
   (ds/opt :items) (s/coll-of update-partner-results-response-array-items-inner-spec)
   })

(def update-partner-results-response-array-spec
  (ds/spec
    {:name ::update-partner-results-response-array
     :spec update-partner-results-response-array-data}))
