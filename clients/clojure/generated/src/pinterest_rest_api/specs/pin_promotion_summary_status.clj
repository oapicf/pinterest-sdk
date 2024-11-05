(ns pinterest-rest-api.specs.pin-promotion-summary-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pin-promotion-summary-status-data
  {
   })

(def pin-promotion-summary-status-spec
  (ds/spec
    {:name ::pin-promotion-summary-status
     :spec pin-promotion-summary-status-data}))
