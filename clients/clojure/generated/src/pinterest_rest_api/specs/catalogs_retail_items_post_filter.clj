(ns pinterest-rest-api.specs.catalogs-retail-items-post-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-retail-items-post-filter-data
  {
   (ds/req :catalog_type) string?
   (ds/req :item_ids) (s/coll-of string?)
   (ds/opt :catalog_id) string?
   })

(def catalogs-retail-items-post-filter-spec
  (ds/spec
    {:name ::catalogs-retail-items-post-filter
     :spec catalogs-retail-items-post-filter-data}))
