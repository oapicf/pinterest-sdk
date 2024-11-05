(ns pinterest-rest-api.specs.delete-invites-results-response-array
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.delete-invites-results-response-array-items-inner :refer :all]
            )
  (:import (java.io File)))


(def delete-invites-results-response-array-data
  {
   (ds/opt :items) (s/coll-of delete-invites-results-response-array-items-inner-spec)
   })

(def delete-invites-results-response-array-spec
  (ds/spec
    {:name ::delete-invites-results-response-array
     :spec delete-invites-results-response-array-data}))
