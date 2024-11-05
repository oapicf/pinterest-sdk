(ns pinterest-rest-api.specs.create-invites-results-response-array
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.create-invites-results-response-array-items-inner :refer :all]
            )
  (:import (java.io File)))


(def create-invites-results-response-array-data
  {
   (ds/opt :items) (s/coll-of create-invites-results-response-array-items-inner-spec)
   })

(def create-invites-results-response-array-spec
  (ds/spec
    {:name ::create-invites-results-response-array
     :spec create-invites-results-response-array-data}))
