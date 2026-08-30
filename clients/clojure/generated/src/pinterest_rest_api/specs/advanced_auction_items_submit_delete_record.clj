(ns pinterest-rest-api.specs.advanced-auction-items-submit-delete-record
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.advanced-auction-operation-error :refer :all]
            [pinterest-rest-api.specs.language :refer :all]
            )
  (:import (java.io File)))


(def advanced-auction-items-submit-delete-record-data
  {
   (ds/req :country) country-spec
   (ds/opt :errors) (s/coll-of advanced-auction-operation-error-spec)
   (ds/req :item_id) string?
   (ds/req :language) language-spec
   (ds/req :operation) string?
   })

(def advanced-auction-items-submit-delete-record-spec
  (ds/spec
    {:name ::advanced-auction-items-submit-delete-record
     :spec advanced-auction-items-submit-delete-record-data}))
