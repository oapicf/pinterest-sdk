(ns pinterest-rest-api.specs.catalogs-creative-assets-batch-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-updatable-creative-assets-attributes :refer :all]
            )
  (:import (java.io File)))


(def catalogs-creative-assets-batch-item-data
  {
   (ds/req :creative_assets_id) string?
   (ds/req :operation) string?
   (ds/req :attributes) catalogs-updatable-creative-assets-attributes-spec
   })

(def catalogs-creative-assets-batch-item-spec
  (ds/spec
    {:name ::catalogs-creative-assets-batch-item
     :spec catalogs-creative-assets-batch-item-data}))
