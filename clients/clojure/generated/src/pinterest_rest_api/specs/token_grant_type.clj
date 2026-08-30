(ns pinterest-rest-api.specs.token-grant-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def token-grant-type-data
  {
   })

(def token-grant-type-spec
  (ds/spec
    {:name ::token-grant-type
     :spec token-grant-type-data}))
