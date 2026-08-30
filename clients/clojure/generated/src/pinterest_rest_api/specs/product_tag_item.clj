(ns pinterest-rest-api.specs.product-tag-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def product-tag-item-data
  {
   (ds/req :pin_id) string?
   })

(def product-tag-item-spec
  (ds/spec
    {:name ::product-tag-item
     :spec product-tag-item-data}))
