(ns pinterest-rest-api.specs.attribution-model
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def attribution-model-data
  {
   })

(def attribution-model-spec
  (ds/spec
    {:name ::attribution-model
     :spec attribution-model-data}))
