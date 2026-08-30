(ns pinterest-rest-api.specs.catalogs-creative-assets-item-error-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.item-validation-event :refer :all]
            )
  (:import (java.io File)))


(def catalogs-creative-assets-item-error-response-data
  {
   (ds/req :catalog_type) string?
   (ds/opt :creative_assets_id) string?
   (ds/req :errors) (s/coll-of item-validation-event-spec)
   (ds/req :item_response_kind) string?
   })

(def catalogs-creative-assets-item-error-response-spec
  (ds/spec
    {:name ::catalogs-creative-assets-item-error-response
     :spec catalogs-creative-assets-item-error-response-data}))
