(ns pinterest-rest-api.specs.catalogs-creative-assets-product-metadata
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.creative-assets-visibility-type :refer :all]
            )
  (:import (java.io File)))


(def catalogs-creative-assets-product-metadata-data
  {
   (ds/req :creative_assets_id) string?
   (ds/req :visibility) creative-assets-visibility-type-spec
   })

(def catalogs-creative-assets-product-metadata-spec
  (ds/spec
    {:name ::catalogs-creative-assets-product-metadata
     :spec catalogs-creative-assets-product-metadata-data}))
