(ns pinterest-rest-api.specs.business-partner-asset-access-get-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.get-partner-assets-response :refer :all]
            )
  (:import (java.io File)))


(def business-partner-asset-access-get-200-response-data
  {
   (ds/req :items) (s/coll-of get-partner-assets-response-spec)
   (ds/opt :bookmark) string?
   })

(def business-partner-asset-access-get-200-response-spec
  (ds/spec
    {:name ::business-partner-asset-access-get-200-response
     :spec business-partner-asset-access-get-200-response-data}))
