(ns pinterest-rest-api.specs.catalogs-items-post-filters
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-items-post-filters-data
  {
   (ds/opt :catalog_id) string?
   (ds/req :catalog_type) string?
   (ds/req :item_ids) (s/coll-of string?)
   (ds/req :hotel_ids) (s/coll-of string?)
   (ds/req :creative_assets_ids) (s/coll-of string?)
   })

(def catalogs-items-post-filters-spec
  (ds/spec
    {:name ::catalogs-items-post-filters
     :spec catalogs-items-post-filters-data}))
