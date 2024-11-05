(ns pinterest-rest-api.specs.conversion-events-data-inner-custom-data-contents-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def conversion-events-data-inner-custom-data-contents-inner-data
  {
   (ds/opt :id) string?
   (ds/opt :item_price) string?
   (ds/opt :quantity) int?
   (ds/opt :item_name) string?
   (ds/opt :item_category) string?
   (ds/opt :item_brand) string?
   })

(def conversion-events-data-inner-custom-data-contents-inner-spec
  (ds/spec
    {:name ::conversion-events-data-inner-custom-data-contents-inner
     :spec conversion-events-data-inner-custom-data-contents-inner-data}))
