(ns pinterest-rest-api.specs.catalogs-hotel-items-post-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-hotel-items-post-filter-data
  {
   (ds/req :catalog_type) string?
   (ds/req :hotel_ids) (s/coll-of string?)
   (ds/opt :catalog_id) string?
   })

(def catalogs-hotel-items-post-filter-spec
  (ds/spec
    {:name ::catalogs-hotel-items-post-filter
     :spec catalogs-hotel-items-post-filter-data}))
