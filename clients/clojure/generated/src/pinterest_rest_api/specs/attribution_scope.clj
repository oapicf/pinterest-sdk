(ns pinterest-rest-api.specs.attribution-scope
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def attribution-scope-data
  {
   })

(def attribution-scope-spec
  (ds/spec
    {:name ::attribution-scope
     :spec attribution-scope-data}))
