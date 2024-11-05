(ns pinterest-rest-api.specs.catalogs-update-creative-assets-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-updatable-creative-assets-attributes :refer :all]
            )
  (:import (java.io File)))


(def catalogs-update-creative-assets-item-data
  {
   (ds/req :creative_assets_id) string?
   (ds/req :operation) string?
   (ds/req :attributes) catalogs-updatable-creative-assets-attributes-spec
   })

(def catalogs-update-creative-assets-item-spec
  (ds/spec
    {:name ::catalogs-update-creative-assets-item
     :spec catalogs-update-creative-assets-item-data}))
