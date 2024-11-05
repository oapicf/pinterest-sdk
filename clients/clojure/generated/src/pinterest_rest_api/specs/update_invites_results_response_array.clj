(ns pinterest-rest-api.specs.update-invites-results-response-array
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.update-invites-results-response-array-items-inner :refer :all]
            )
  (:import (java.io File)))


(def update-invites-results-response-array-data
  {
   (ds/opt :items) (s/coll-of update-invites-results-response-array-items-inner-spec)
   })

(def update-invites-results-response-array-spec
  (ds/spec
    {:name ::update-invites-results-response-array
     :spec update-invites-results-response-array-data}))
