(ns pinterest-rest-api.specs.ad-group-summary-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ad-group-summary-status-data
  {
   })

(def ad-group-summary-status-spec
  (ds/spec
    {:name ::ad-group-summary-status
     :spec ad-group-summary-status-data}))
