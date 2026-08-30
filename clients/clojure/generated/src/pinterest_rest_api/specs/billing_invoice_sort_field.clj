(ns pinterest-rest-api.specs.billing-invoice-sort-field
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def billing-invoice-sort-field-data
  {
   })

(def billing-invoice-sort-field-spec
  (ds/spec
    {:name ::billing-invoice-sort-field
     :spec billing-invoice-sort-field-data}))
