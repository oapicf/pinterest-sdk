(ns pinterest-rest-api.specs.catalogs-upsert-retail-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.item-attributes-request :refer :all]
            )
  (:import (java.io File)))


(def catalogs-upsert-retail-item-data
  {
   (ds/req :item_id) string?
   (ds/req :operation) string?
   (ds/req :attributes) item-attributes-request-spec
   })

(def catalogs-upsert-retail-item-spec
  (ds/spec
    {:name ::catalogs-upsert-retail-item
     :spec catalogs-upsert-retail-item-data}))
