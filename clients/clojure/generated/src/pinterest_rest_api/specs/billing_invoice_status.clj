(ns pinterest-rest-api.specs.billing-invoice-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def billing-invoice-status-data
  {
   })

(def billing-invoice-status-spec
  (ds/spec
    {:name ::billing-invoice-status
     :spec billing-invoice-status-data}))
