(ns pinterest-rest-api.specs.billing-profiles-get-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.billing-profiles-response :refer :all]
            )
  (:import (java.io File)))


(def billing-profiles-get-200-response-data
  {
   (ds/req :items) (s/coll-of billing-profiles-response-spec)
   (ds/opt :bookmark) string?
   })

(def billing-profiles-get-200-response-spec
  (ds/spec
    {:name ::billing-profiles-get-200-response
     :spec billing-profiles-get-200-response-data}))
