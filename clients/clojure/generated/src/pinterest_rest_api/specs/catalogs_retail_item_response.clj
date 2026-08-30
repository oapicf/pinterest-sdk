(ns pinterest-rest-api.specs.catalogs-retail-item-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.item-attributes :refer :all]
            [pinterest-rest-api.specs.pin :refer :all]
            )
  (:import (java.io File)))


(def catalogs-retail-item-response-data
  {
   (ds/opt :attributes) item-attributes-spec
   (ds/req :catalog_type) string?
   (ds/opt :item_id) string?
   (ds/req :item_response_kind) string?
   (ds/opt :pins) (s/coll-of pin-spec)
   })

(def catalogs-retail-item-response-spec
  (ds/spec
    {:name ::catalogs-retail-item-response
     :spec catalogs-retail-item-response-data}))
