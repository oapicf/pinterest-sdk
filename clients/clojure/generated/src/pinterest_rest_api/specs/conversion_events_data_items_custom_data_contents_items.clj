(ns pinterest-rest-api.specs.conversion-events-data-items-custom-data-contents-items
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def conversion-events-data-items-custom-data-contents-items-data
  {
   (ds/opt :id) string?
   (ds/opt :item_brand) string?
   (ds/opt :item_brand_id) string?
   (ds/opt :item_category) string?
   (ds/opt :item_name) string?
   (ds/opt :item_price) string?
   (ds/opt :quantity) int?
   })

(def conversion-events-data-items-custom-data-contents-items-spec
  (ds/spec
    {:name ::conversion-events-data-items-custom-data-contents-items
     :spec conversion-events-data-items-custom-data-contents-items-data}))
