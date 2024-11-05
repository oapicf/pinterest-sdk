(ns pinterest-rest-api.specs.catalogs-product-group-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-product-group-status-data
  {
   })

(def catalogs-product-group-status-spec
  (ds/spec
    {:name ::catalogs-product-group-status
     :spec catalogs-product-group-status-data}))
