(ns pinterest-rest-api.specs.item-response-one-of-1
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-type :refer :all]
            [pinterest-rest-api.specs.item-validation-event :refer :all]
            )
  (:import (java.io File)))


(def item-response-one-of-1-data
  {
   (ds/req :catalog_type) catalogs-type-spec
   (ds/req :errors) (s/coll-of item-validation-event-spec)
   (ds/opt :item_id) string?
   (ds/opt :hotel_id) string?
   (ds/opt :creative_assets_id) string?
   })

(def item-response-one-of-1-spec
  (ds/spec
    {:name ::item-response-one-of-1
     :spec item-response-one-of-1-data}))
