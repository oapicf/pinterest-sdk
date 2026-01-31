(ns pinterest-rest-api.specs.catalogs-retail-items-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-retail-items-filter-data
  {
   (ds/opt :catalog_id) string?
   (ds/req :catalog_type) string?
   (ds/req :item_ids) (s/coll-of string?)
   })

(def catalogs-retail-items-filter-spec
  (ds/spec
    {:name ::catalogs-retail-items-filter
     :spec catalogs-retail-items-filter-data}))
