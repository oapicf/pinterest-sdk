(ns pinterest-rest-api.specs.catalogs-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalog :refer :all]
            )
  (:import (java.io File)))


(def catalogs-list-200-response-data
  {
   (ds/req :items) (s/coll-of catalog-spec)
   (ds/opt :bookmark) string?
   })

(def catalogs-list-200-response-spec
  (ds/spec
    {:name ::catalogs-list-200-response
     :spec catalogs-list-200-response-data}))
