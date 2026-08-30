(ns pinterest-rest-api.specs.update-invites-results-response-array
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.invite-action-result-item :refer :all]
            )
  (:import (java.io File)))


(def update-invites-results-response-array-data
  {
   (ds/opt :items) (s/coll-of invite-action-result-item-spec)
   })

(def update-invites-results-response-array-spec
  (ds/spec
    {:name ::update-invites-results-response-array
     :spec update-invites-results-response-array-data}))
