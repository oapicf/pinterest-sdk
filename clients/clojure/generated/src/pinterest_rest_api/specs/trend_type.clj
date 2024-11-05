(ns pinterest-rest-api.specs.trend-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def trend-type-data
  {
   })

(def trend-type-spec
  (ds/spec
    {:name ::trend-type
     :spec trend-type-data}))
