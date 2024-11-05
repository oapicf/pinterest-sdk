(ns pinterest-rest-api.specs.catalogs-delete-creative-assets-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-delete-creative-assets-item-data
  {
   (ds/req :creative_assets_id) string?
   (ds/req :operation) string?
   })

(def catalogs-delete-creative-assets-item-spec
  (ds/spec
    {:name ::catalogs-delete-creative-assets-item
     :spec catalogs-delete-creative-assets-item-data}))
