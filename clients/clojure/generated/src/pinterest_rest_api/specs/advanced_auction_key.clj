(ns pinterest-rest-api.specs.advanced-auction-key
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.language :refer :all]
            )
  (:import (java.io File)))


(def advanced-auction-key-data
  {
   (ds/req :item_id) string?
   (ds/req :country) country-spec
   (ds/req :language) language-spec
   })

(def advanced-auction-key-spec
  (ds/spec
    {:name ::advanced-auction-key
     :spec advanced-auction-key-data}))
