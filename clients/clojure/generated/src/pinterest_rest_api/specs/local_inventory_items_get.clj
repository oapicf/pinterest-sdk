(ns pinterest-rest-api.specs.local-inventory-items-get
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.local-inventory-item-response :refer :all]
            )
  (:import (java.io File)))


(def local-inventory-items-get-data
  {
   (ds/req :items) (s/coll-of local-inventory-item-response-spec)
   })

(def local-inventory-items-get-spec
  (ds/spec
    {:name ::local-inventory-items-get
     :spec local-inventory-items-get-data}))
