(ns pinterest-rest-api.specs.keyword-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def keyword-info-data
  {
   (ds/req :name) string?
   (ds/opt :pct_growth_mom) float?
   })

(def keyword-info-spec
  (ds/spec
    {:name ::keyword-info
     :spec keyword-info-data}))
