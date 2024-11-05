(ns pinterest-rest-api.specs.catalog
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-type :refer :all]
            )
  (:import (java.io File)))


(def catalog-data
  {
   (ds/req :created_at) inst?
   (ds/req :id) string?
   (ds/req :updated_at) inst?
   (ds/req :name) string?
   (ds/req :catalog_type) catalogs-type-spec
   })

(def catalog-spec
  (ds/spec
    {:name ::catalog
     :spec catalog-data}))
