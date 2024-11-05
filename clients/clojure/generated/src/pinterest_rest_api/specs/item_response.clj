(ns pinterest-rest-api.specs.item-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-type :refer :all]
            [pinterest-rest-api.specs.pin :refer :all]
            [pinterest-rest-api.specs.catalogs-creative-assets-attributes :refer :all]
            [pinterest-rest-api.specs.item-validation-event :refer :all]
            )
  (:import (java.io File)))


(def item-response-data
  {
   (ds/req :catalog_type) catalogs-type-spec
   (ds/opt :item_id) string?
   (ds/opt :pins) (s/coll-of pin-spec)
   (ds/opt :attributes) catalogs-creative-assets-attributes-spec
   (ds/opt :hotel_id) string?
   (ds/opt :creative_assets_id) string?
   (ds/opt :errors) (s/coll-of item-validation-event-spec)
   })

(def item-response-spec
  (ds/spec
    {:name ::item-response
     :spec item-response-data}))
