(ns pinterest-rest-api.specs.item-response-any-of-1
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-type :refer :all]
            [pinterest-rest-api.specs.item-validation-event :refer :all]
            )
  (:import (java.io File)))


(def item-response-any-of-1-data
  {
   (ds/req :catalog_type) catalogs-type-spec
   (ds/opt :item_id) string?
   (ds/opt :errors) (s/coll-of item-validation-event-spec)
   (ds/opt :hotel_id) string?
   (ds/opt :creative_assets_id) string?
   })

(def item-response-any-of-1-spec
  (ds/spec
    {:name ::item-response-any-of-1
     :spec item-response-any-of-1-data}))
