(ns pinterest-rest-api.specs.catalogs-creative-assets-item-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-creative-assets-attributes :refer :all]
            [pinterest-rest-api.specs.pin :refer :all]
            )
  (:import (java.io File)))


(def catalogs-creative-assets-item-response-data
  {
   (ds/opt :attributes) catalogs-creative-assets-attributes-spec
   (ds/req :catalog_type) string?
   (ds/opt :creative_assets_id) string?
   (ds/req :item_response_kind) string?
   (ds/opt :pins) (s/coll-of pin-spec)
   })

(def catalogs-creative-assets-item-response-spec
  (ds/spec
    {:name ::catalogs-creative-assets-item-response
     :spec catalogs-creative-assets-item-response-data}))
