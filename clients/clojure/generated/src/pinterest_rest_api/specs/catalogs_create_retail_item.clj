(ns pinterest-rest-api.specs.catalogs-create-retail-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.item-attributes-request :refer :all]
            )
  (:import (java.io File)))


(def catalogs-create-retail-item-data
  {
   (ds/req :item_id) string?
   (ds/req :operation) string?
   (ds/req :attributes) item-attributes-request-spec
   })

(def catalogs-create-retail-item-spec
  (ds/spec
    {:name ::catalogs-create-retail-item
     :spec catalogs-create-retail-item-data}))
