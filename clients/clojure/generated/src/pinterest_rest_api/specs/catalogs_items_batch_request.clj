(ns pinterest-rest-api.specs.catalogs-items-batch-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.language :refer :all]
            [pinterest-rest-api.specs.batch-operation :refer :all]
            [pinterest-rest-api.specs.item-batch-record :refer :all]
            )
  (:import (java.io File)))


(def catalogs-items-batch-request-data
  {
   (ds/opt :country) country-spec
   (ds/opt :language) language-spec
   (ds/opt :operation) batch-operation-spec
   (ds/opt :items) (s/coll-of item-batch-record-spec)
   })

(def catalogs-items-batch-request-spec
  (ds/spec
    {:name ::catalogs-items-batch-request
     :spec catalogs-items-batch-request-data}))
