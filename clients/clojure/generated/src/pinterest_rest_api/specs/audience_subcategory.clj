(ns pinterest-rest-api.specs.audience-subcategory
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audience-subcategory-data
  {
   (ds/opt :id) string?
   (ds/opt :index) float?
   (ds/opt :key) string?
   (ds/opt :name) string?
   (ds/opt :ratio) float?
   })

(def audience-subcategory-spec
  (ds/spec
    {:name ::audience-subcategory
     :spec audience-subcategory-data}))
