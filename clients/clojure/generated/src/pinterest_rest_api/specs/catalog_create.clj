(ns pinterest-rest-api.specs.catalog-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-type :refer :all]
            )
  (:import (java.io File)))


(def catalog-create-data
  {
   (ds/req :catalog_type) catalogs-type-spec
   (ds/req :name) string?
   })

(def catalog-create-spec
  (ds/spec
    {:name ::catalog-create
     :spec catalog-create-data}))
