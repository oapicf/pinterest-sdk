(ns pinterest-rest-api.specs.catalogs-retail-item-error-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.item-validation-event :refer :all]
            )
  (:import (java.io File)))


(def catalogs-retail-item-error-response-data
  {
   (ds/req :catalog_type) string?
   (ds/req :errors) (s/coll-of item-validation-event-spec)
   (ds/opt :item_id) string?
   (ds/req :item_response_kind) string?
   })

(def catalogs-retail-item-error-response-spec
  (ds/spec
    {:name ::catalogs-retail-item-error-response
     :spec catalogs-retail-item-error-response-data}))
