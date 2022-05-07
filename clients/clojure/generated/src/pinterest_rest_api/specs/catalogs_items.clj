(ns pinterest-rest-api.specs.catalogs-items
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.item-batch-record :refer :all]
            )
  (:import (java.io File)))


(def catalogs-items-data
  {
   (ds/opt :items) (s/coll-of item-batch-record-spec)
   })

(def catalogs-items-spec
  (ds/spec
    {:name ::catalogs-items
     :spec catalogs-items-data}))
