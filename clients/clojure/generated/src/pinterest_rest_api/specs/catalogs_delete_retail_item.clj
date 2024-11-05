(ns pinterest-rest-api.specs.catalogs-delete-retail-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-delete-retail-item-data
  {
   (ds/req :item_id) string?
   (ds/req :operation) string?
   })

(def catalogs-delete-retail-item-spec
  (ds/spec
    {:name ::catalogs-delete-retail-item
     :spec catalogs-delete-retail-item-data}))
