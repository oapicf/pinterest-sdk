(ns pinterest-rest-api.specs.catalogs-creative-assets-item-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-type :refer :all]
            [pinterest-rest-api.specs.pin :refer :all]
            [pinterest-rest-api.specs.catalogs-creative-assets-attributes :refer :all]
            )
  (:import (java.io File)))


(def catalogs-creative-assets-item-response-data
  {
   (ds/req :catalog_type) catalogs-type-spec
   (ds/opt :creative_assets_id) string?
   (ds/opt :pins) (s/coll-of pin-spec)
   (ds/opt :attributes) catalogs-creative-assets-attributes-spec
   })

(def catalogs-creative-assets-item-response-spec
  (ds/spec
    {:name ::catalogs-creative-assets-item-response
     :spec catalogs-creative-assets-item-response-data}))
