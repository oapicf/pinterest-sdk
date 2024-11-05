(ns pinterest-rest-api.specs.advanced-auction-items-get-record
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.language :refer :all]
            )
  (:import (java.io File)))


(def advanced-auction-items-get-record-data
  {
   (ds/req :item_id) string?
   (ds/req :country) country-spec
   (ds/req :language) language-spec
   })

(def advanced-auction-items-get-record-spec
  (ds/spec
    {:name ::advanced-auction-items-get-record
     :spec advanced-auction-items-get-record-data}))
