(ns pinterest-rest-api.specs.item-id-store-code-pair
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def item-id-store-code-pair-data
  {
   (ds/req :item_id) string?
   (ds/req :store_code) string?
   })

(def item-id-store-code-pair-spec
  (ds/spec
    {:name ::item-id-store-code-pair
     :spec item-id-store-code-pair-data}))
