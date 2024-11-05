(ns pinterest-rest-api.specs.advanced-auction-processed-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.advanced-auction-operation :refer :all]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.language :refer :all]
            [pinterest-rest-api.specs.advanced-auction-bid-options :refer :all]
            [pinterest-rest-api.specs.update-mask-bid-option-field :refer :all]
            [pinterest-rest-api.specs.advanced-auction-operation-error :refer :all]
            )
  (:import (java.io File)))


(def advanced-auction-processed-item-data
  {
   (ds/req :operation) advanced-auction-operation-spec
   (ds/req :item_id) string?
   (ds/req :country) country-spec
   (ds/req :language) language-spec
   (ds/req :bid_options) advanced-auction-bid-options-spec
   (ds/req :update_mask) (s/coll-of update-mask-bid-option-field-spec)
   (ds/opt :errors) (s/coll-of advanced-auction-operation-error-spec)
   })

(def advanced-auction-processed-item-spec
  (ds/spec
    {:name ::advanced-auction-processed-item
     :spec advanced-auction-processed-item-data}))
