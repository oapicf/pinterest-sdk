(ns pinterest-rest-api.specs.catalogs-upsert-creative-assets-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-creative-assets-attributes :refer :all]
            )
  (:import (java.io File)))


(def catalogs-upsert-creative-assets-item-data
  {
   (ds/req :attributes) catalogs-creative-assets-attributes-spec
   (ds/req :creative_assets_id) string?
   (ds/req :operation) string?
   })

(def catalogs-upsert-creative-assets-item-spec
  (ds/spec
    {:name ::catalogs-upsert-creative-assets-item
     :spec catalogs-upsert-creative-assets-item-data}))
