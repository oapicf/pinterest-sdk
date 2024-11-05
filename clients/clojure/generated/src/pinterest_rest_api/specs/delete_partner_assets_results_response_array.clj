(ns pinterest-rest-api.specs.delete-partner-assets-results-response-array
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.delete-partner-assets-result :refer :all]
            )
  (:import (java.io File)))


(def delete-partner-assets-results-response-array-data
  {
   (ds/opt :items) (s/coll-of delete-partner-assets-result-spec)
   })

(def delete-partner-assets-results-response-array-spec
  (ds/spec
    {:name ::delete-partner-assets-results-response-array
     :spec delete-partner-assets-results-response-array-data}))
