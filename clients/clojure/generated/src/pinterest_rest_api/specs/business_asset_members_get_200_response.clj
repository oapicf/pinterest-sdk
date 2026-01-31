(ns pinterest-rest-api.specs.business-asset-members-get-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.user-single-asset-binding :refer :all]
            )
  (:import (java.io File)))


(def business-asset-members-get-200-response-data
  {
   (ds/opt :bookmark) string?
   (ds/req :items) (s/coll-of user-single-asset-binding-spec)
   })

(def business-asset-members-get-200-response-spec
  (ds/spec
    {:name ::business-asset-members-get-200-response
     :spec business-asset-members-get-200-response-data}))
