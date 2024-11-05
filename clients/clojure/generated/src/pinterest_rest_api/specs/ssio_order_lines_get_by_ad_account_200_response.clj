(ns pinterest-rest-api.specs.ssio-order-lines-get-by-ad-account-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ssio-order-line :refer :all]
            )
  (:import (java.io File)))


(def ssio-order-lines-get-by-ad-account-200-response-data
  {
   (ds/req :items) (s/coll-of ssio-order-line-spec)
   (ds/opt :bookmark) string?
   })

(def ssio-order-lines-get-by-ad-account-200-response-spec
  (ds/spec
    {:name ::ssio-order-lines-get-by-ad-account-200-response
     :spec ssio-order-lines-get-by-ad-account-200-response-data}))
