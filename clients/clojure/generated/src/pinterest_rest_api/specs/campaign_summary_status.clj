(ns pinterest-rest-api.specs.campaign-summary-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def campaign-summary-status-data
  {
   })

(def campaign-summary-status-spec
  (ds/spec
    {:name ::campaign-summary-status
     :spec campaign-summary-status-data}))
