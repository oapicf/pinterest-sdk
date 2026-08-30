(ns pinterest-rest-api.specs.catalogs-items-batch-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.item-delete-batch-record :refer :all]
            )
  (:import (java.io File)))


(def catalogs-items-batch-request-data
  {
   (ds/req :country) country-spec
   (ds/req :items) (s/coll-of item-delete-batch-record-spec)
   (ds/req :language) string?
   (ds/req :operation) string?
   })

(def catalogs-items-batch-request-spec
  (ds/spec
    {:name ::catalogs-items-batch-request
     :spec catalogs-items-batch-request-data}))
