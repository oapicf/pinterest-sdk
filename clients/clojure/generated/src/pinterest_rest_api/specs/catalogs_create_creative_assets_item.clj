(ns pinterest-rest-api.specs.catalogs-create-creative-assets-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-creative-assets-attributes :refer :all]
            )
  (:import (java.io File)))


(def catalogs-create-creative-assets-item-data
  {
   (ds/req :creative_assets_id) string?
   (ds/req :operation) string?
   (ds/req :attributes) catalogs-creative-assets-attributes-spec
   })

(def catalogs-create-creative-assets-item-spec
  (ds/spec
    {:name ::catalogs-create-creative-assets-item
     :spec catalogs-create-creative-assets-item-data}))
