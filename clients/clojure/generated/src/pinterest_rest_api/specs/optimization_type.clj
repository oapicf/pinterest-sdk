(ns pinterest-rest-api.specs.optimization-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def optimization-type-data
  {
   })

(def optimization-type-spec
  (ds/spec
    {:name ::optimization-type
     :spec optimization-type-data}))
