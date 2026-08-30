(ns pinterest-rest-api.specs.local-inventory-items-batch-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.local-inventory-operation :refer :all]
            )
  (:import (java.io File)))


(def local-inventory-items-batch-create-data
  {
   (ds/req :operations) (s/coll-of local-inventory-operation-spec)
   })

(def local-inventory-items-batch-create-spec
  (ds/spec
    {:name ::local-inventory-items-batch-create
     :spec local-inventory-items-batch-create-data}))
