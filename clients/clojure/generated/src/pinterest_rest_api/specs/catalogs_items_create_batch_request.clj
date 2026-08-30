(ns pinterest-rest-api.specs.catalogs-items-create-batch-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.item-create-batch-record :refer :all]
            )
  (:import (java.io File)))


(def catalogs-items-create-batch-request-data
  {
   (ds/req :country) country-spec
   (ds/req :items) (s/coll-of item-create-batch-record-spec)
   (ds/req :language) string?
   (ds/req :operation) string?
   })

(def catalogs-items-create-batch-request-spec
  (ds/spec
    {:name ::catalogs-items-create-batch-request
     :spec catalogs-items-create-batch-request-data}))
