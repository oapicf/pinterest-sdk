(ns pinterest-rest-api.specs.update-member-results-response-array
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.update-member-result :refer :all]
            )
  (:import (java.io File)))


(def update-member-results-response-array-data
  {
   (ds/opt :items) (s/coll-of update-member-result-spec)
   })

(def update-member-results-response-array-spec
  (ds/spec
    {:name ::update-member-results-response-array
     :spec update-member-results-response-array-data}))
