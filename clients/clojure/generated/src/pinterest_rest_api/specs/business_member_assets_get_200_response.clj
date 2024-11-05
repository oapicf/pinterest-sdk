(ns pinterest-rest-api.specs.business-member-assets-get-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.asset-id-permissions :refer :all]
            )
  (:import (java.io File)))


(def business-member-assets-get-200-response-data
  {
   (ds/req :items) (s/coll-of asset-id-permissions-spec)
   (ds/opt :bookmark) string?
   })

(def business-member-assets-get-200-response-spec
  (ds/spec
    {:name ::business-member-assets-get-200-response
     :spec business-member-assets-get-200-response-data}))
