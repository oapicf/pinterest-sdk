(ns pinterest-rest-api.specs.catalog-binding
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalog-binding-data
  {
   (ds/opt :catalog_type) string?
   (ds/opt :id) string?
   (ds/opt :name) string?
   })

(def catalog-binding-spec
  (ds/spec
    {:name ::catalog-binding
     :spec catalog-binding-data}))
