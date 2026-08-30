(ns pinterest-rest-api.specs.catalog-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-type :refer :all]
            )
  (:import (java.io File)))


(def catalog-update-data
  {
   (ds/opt :catalog_type) catalogs-type-spec
   (ds/opt :name) string?
   })

(def catalog-update-spec
  (ds/spec
    {:name ::catalog-update
     :spec catalog-update-data}))
