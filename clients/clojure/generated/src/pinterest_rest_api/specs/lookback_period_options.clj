(ns pinterest-rest-api.specs.lookback-period-options
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def lookback-period-options-data
  {
   })

(def lookback-period-options-spec
  (ds/spec
    {:name ::lookback-period-options
     :spec lookback-period-options-data}))
