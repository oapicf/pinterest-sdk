(ns pinterest-rest-api.specs.business-shared-audience-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.role :refer :all]
            )
  (:import (java.io File)))


(def business-shared-audience-response-data
  {
   (ds/opt :audience_id) string?
   (ds/opt :permissions) (s/coll-of role-spec)
   (ds/opt :recipient_business_ids) (s/coll-of string?)
   })

(def business-shared-audience-response-spec
  (ds/spec
    {:name ::business-shared-audience-response
     :spec business-shared-audience-response-data}))
