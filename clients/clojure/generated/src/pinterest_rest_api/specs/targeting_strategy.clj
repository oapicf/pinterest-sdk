(ns pinterest-rest-api.specs.targeting-strategy
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def targeting-strategy-data
  {
   })

(def targeting-strategy-spec
  (ds/spec
    {:name ::targeting-strategy
     :spec targeting-strategy-data}))
