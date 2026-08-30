(ns pinterest-rest-api.specs.attribution-match-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def attribution-match-type-data
  {
   })

(def attribution-match-type-spec
  (ds/spec
    {:name ::attribution-match-type
     :spec attribution-match-type-data}))
