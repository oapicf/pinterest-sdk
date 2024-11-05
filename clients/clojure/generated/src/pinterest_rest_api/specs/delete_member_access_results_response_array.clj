(ns pinterest-rest-api.specs.delete-member-access-results-response-array
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.delete-member-access-result :refer :all]
            )
  (:import (java.io File)))


(def delete-member-access-results-response-array-data
  {
   (ds/opt :items) (s/coll-of delete-member-access-result-spec)
   })

(def delete-member-access-results-response-array-spec
  (ds/spec
    {:name ::delete-member-access-results-response-array
     :spec delete-member-access-results-response-array-data}))
