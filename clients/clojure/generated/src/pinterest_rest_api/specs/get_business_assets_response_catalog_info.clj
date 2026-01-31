(ns pinterest-rest-api.specs.get-business-assets-response-catalog-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def get-business-assets-response-catalog-info-data
  {
   (ds/opt :catalog_type) string?
   (ds/opt :id) string?
   (ds/opt :name) string?
   })

(def get-business-assets-response-catalog-info-spec
  (ds/spec
    {:name ::get-business-assets-response-catalog-info
     :spec get-business-assets-response-catalog-info-data}))
