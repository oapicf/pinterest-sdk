(ns pinterest-rest-api.specs.item-response-any-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-type :refer :all]
            [pinterest-rest-api.specs.pin :refer :all]
            [pinterest-rest-api.specs.catalogs-creative-assets-attributes :refer :all]
            )
  (:import (java.io File)))


(def item-response-any-of-data
  {
   (ds/req :catalog_type) catalogs-type-spec
   (ds/opt :item_id) string?
   (ds/opt :pins) (s/coll-of pin-spec)
   (ds/opt :attributes) catalogs-creative-assets-attributes-spec
   (ds/opt :hotel_id) string?
   (ds/opt :creative_assets_id) string?
   })

(def item-response-any-of-spec
  (ds/spec
    {:name ::item-response-any-of
     :spec item-response-any-of-data}))
