(ns pinterest-rest-api.specs.catalogs-items-update-batch-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.catalogs-items-request-language :refer :all]
            [pinterest-rest-api.specs.batch-operation :refer :all]
            [pinterest-rest-api.specs.item-update-batch-record :refer :all]
            )
  (:import (java.io File)))


(def catalogs-items-update-batch-request-data
  {
   (ds/req :country) country-spec
   (ds/req :language) catalogs-items-request-language-spec
   (ds/req :operation) batch-operation-spec
   (ds/req :items) (s/coll-of item-update-batch-record-spec)
   })

(def catalogs-items-update-batch-request-spec
  (ds/spec
    {:name ::catalogs-items-update-batch-request
     :spec catalogs-items-update-batch-request-data}))
