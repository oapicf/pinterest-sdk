(ns pinterest-rest-api.specs.catalogs-local-stores-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.local-store :refer :all]
            )
  (:import (java.io File)))


(def catalogs-local-stores-list-200-response-data
  {
   (ds/opt :bookmark) string?
   (ds/req :items) (s/coll-of local-store-spec)
   })

(def catalogs-local-stores-list-200-response-spec
  (ds/spec
    {:name ::catalogs-local-stores-list-200-response
     :spec catalogs-local-stores-list-200-response-data}))
