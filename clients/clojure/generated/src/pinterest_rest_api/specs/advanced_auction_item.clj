(ns pinterest-rest-api.specs.advanced-auction-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.advanced-auction-bid-options :refer :all]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.language :refer :all]
            )
  (:import (java.io File)))


(def advanced-auction-item-data
  {
   (ds/req :bid_options) advanced-auction-bid-options-spec
   (ds/req :country) country-spec
   (ds/req :item_id) string?
   (ds/req :language) language-spec
   })

(def advanced-auction-item-spec
  (ds/spec
    {:name ::advanced-auction-item
     :spec advanced-auction-item-data}))
