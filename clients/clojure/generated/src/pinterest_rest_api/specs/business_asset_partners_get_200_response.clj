(ns pinterest-rest-api.specs.business-asset-partners-get-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.user-single-asset-binding :refer :all]
            )
  (:import (java.io File)))


(def business-asset-partners-get-200-response-data
  {
   (ds/req :items) (s/coll-of user-single-asset-binding-spec)
   (ds/opt :bookmark) string?
   })

(def business-asset-partners-get-200-response-spec
  (ds/spec
    {:name ::business-asset-partners-get-200-response
     :spec business-asset-partners-get-200-response-data}))
