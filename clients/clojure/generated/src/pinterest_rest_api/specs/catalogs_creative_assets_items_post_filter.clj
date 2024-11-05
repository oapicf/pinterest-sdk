(ns pinterest-rest-api.specs.catalogs-creative-assets-items-post-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-creative-assets-items-post-filter-data
  {
   (ds/req :catalog_type) string?
   (ds/req :creative_assets_ids) (s/coll-of string?)
   (ds/opt :catalog_id) string?
   })

(def catalogs-creative-assets-items-post-filter-spec
  (ds/spec
    {:name ::catalogs-creative-assets-items-post-filter
     :spec catalogs-creative-assets-items-post-filter-data}))
