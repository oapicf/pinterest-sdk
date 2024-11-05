(ns pinterest-rest-api.specs.pins-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.pin :refer :all]
            )
  (:import (java.io File)))


(def pins-list-200-response-data
  {
   (ds/req :items) (s/coll-of pin-spec)
   (ds/opt :bookmark) string?
   })

(def pins-list-200-response-spec
  (ds/spec
    {:name ::pins-list-200-response
     :spec pins-list-200-response-data}))
