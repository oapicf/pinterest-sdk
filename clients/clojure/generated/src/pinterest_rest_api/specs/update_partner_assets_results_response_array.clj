(ns pinterest-rest-api.specs.update-partner-assets-results-response-array
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.update-partner-assets-result :refer :all]
            )
  (:import (java.io File)))


(def update-partner-assets-results-response-array-data
  {
   (ds/opt :items) (s/coll-of update-partner-assets-result-spec)
   })

(def update-partner-assets-results-response-array-spec
  (ds/spec
    {:name ::update-partner-assets-results-response-array
     :spec update-partner-assets-results-response-array-data}))
