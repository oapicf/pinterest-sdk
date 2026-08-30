(ns pinterest-rest-api.specs.delete-partner-asset-access-results-response-array
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.delete-partner-asset-access-result :refer :all]
            )
  (:import (java.io File)))


(def delete-partner-asset-access-results-response-array-data
  {
   (ds/opt :items) (s/coll-of delete-partner-asset-access-result-spec)
   })

(def delete-partner-asset-access-results-response-array-spec
  (ds/spec
    {:name ::delete-partner-asset-access-results-response-array
     :spec delete-partner-asset-access-results-response-array-data}))
