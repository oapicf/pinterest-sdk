(ns pinterest-rest-api.specs.trends-l1-interest
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def trends-l1-interest-data
  {
   })

(def trends-l1-interest-spec
  (ds/spec
    {:name ::trends-l1-interest
     :spec trends-l1-interest-data}))
