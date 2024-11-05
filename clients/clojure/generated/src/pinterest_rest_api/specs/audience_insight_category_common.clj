(ns pinterest-rest-api.specs.audience-insight-category-common
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audience-insight-category-common-data
  {
   (ds/opt :key) string?
   (ds/opt :name) string?
   (ds/opt :ratio) float?
   (ds/opt :index) float?
   (ds/opt :id) string?
   })

(def audience-insight-category-common-spec
  (ds/spec
    {:name ::audience-insight-category-common
     :spec audience-insight-category-common-data}))
