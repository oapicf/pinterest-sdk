(ns pinterest-rest-api.specs.shared-audiences-for-business-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.audience :refer :all]
            )
  (:import (java.io File)))


(def shared-audiences-for-business-list-200-response-data
  {
   (ds/opt :bookmark) string?
   (ds/req :items) (s/coll-of audience-spec)
   })

(def shared-audiences-for-business-list-200-response-spec
  (ds/spec
    {:name ::shared-audiences-for-business-list-200-response
     :spec shared-audiences-for-business-list-200-response-data}))
