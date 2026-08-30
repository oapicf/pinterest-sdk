(ns pinterest-rest-api.specs.business-assets-get-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.business-assets :refer :all]
            )
  (:import (java.io File)))


(def business-assets-get-200-response-data
  {
   (ds/opt :bookmark) string?
   (ds/req :items) (s/coll-of business-assets-spec)
   })

(def business-assets-get-200-response-spec
  (ds/spec
    {:name ::business-assets-get-200-response
     :spec business-assets-get-200-response-data}))
