(ns pinterest-rest-api.specs.attribution-action-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def attribution-action-type-data
  {
   })

(def attribution-action-type-spec
  (ds/spec
    {:name ::attribution-action-type
     :spec attribution-action-type-data}))
