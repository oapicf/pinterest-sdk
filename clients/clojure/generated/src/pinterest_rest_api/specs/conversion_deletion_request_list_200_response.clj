(ns pinterest-rest-api.specs.conversion-deletion-request-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.conversion-deletion-request :refer :all]
            )
  (:import (java.io File)))


(def conversion-deletion-request-list-200-response-data
  {
   (ds/opt :bookmark) string?
   (ds/req :items) (s/coll-of conversion-deletion-request-spec)
   })

(def conversion-deletion-request-list-200-response-spec
  (ds/spec
    {:name ::conversion-deletion-request-list-200-response
     :spec conversion-deletion-request-list-200-response-data}))
