(ns pinterest-rest-api.specs.trends-supported-region
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def trends-supported-region-data
  {
   })

(def trends-supported-region-spec
  (ds/spec
    {:name ::trends-supported-region
     :spec trends-supported-region-data}))
