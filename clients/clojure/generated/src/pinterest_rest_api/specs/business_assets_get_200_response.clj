(ns pinterest-rest-api.specs.business-assets-get-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.get-business-assets-response :refer :all]
            )
  (:import (java.io File)))


(def business-assets-get-200-response-data
  {
   (ds/req :items) (s/coll-of get-business-assets-response-spec)
   (ds/opt :bookmark) string?
   })

(def business-assets-get-200-response-spec
  (ds/spec
    {:name ::business-assets-get-200-response
     :spec business-assets-get-200-response-data}))
