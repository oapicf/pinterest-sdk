(ns pinterest-rest-api.specs.enhanced-match-status-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def enhanced-match-status-type-data
  {
   })

(def enhanced-match-status-type-spec
  (ds/spec
    {:name ::enhanced-match-status-type
     :spec enhanced-match-status-type-data}))
