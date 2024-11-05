(ns pinterest-rest-api.specs.advanced-auction-items-submit-upsert-record
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.language :refer :all]
            [pinterest-rest-api.specs.advanced-auction-bid-options :refer :all]
            [pinterest-rest-api.specs.update-mask-bid-option-field :refer :all]
            )
  (:import (java.io File)))


(def advanced-auction-items-submit-upsert-record-data
  {
   (ds/req :item_id) string?
   (ds/req :country) country-spec
   (ds/req :language) language-spec
   (ds/req :bid_options) advanced-auction-bid-options-spec
   (ds/req :update_mask) (s/coll-of update-mask-bid-option-field-spec)
   })

(def advanced-auction-items-submit-upsert-record-spec
  (ds/spec
    {:name ::advanced-auction-items-submit-upsert-record
     :spec advanced-auction-items-submit-upsert-record-data}))
