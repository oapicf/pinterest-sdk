(ns pinterest-rest-api.specs.token-type-hint
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def token-type-hint-data
  {
   })

(def token-type-hint-spec
  (ds/spec
    {:name ::token-type-hint
     :spec token-type-hint-data}))
