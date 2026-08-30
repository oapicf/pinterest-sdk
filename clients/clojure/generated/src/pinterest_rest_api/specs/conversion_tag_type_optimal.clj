(ns pinterest-rest-api.specs.conversion-tag-type-optimal
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def conversion-tag-type-optimal-data
  {
   })

(def conversion-tag-type-optimal-spec
  (ds/spec
    {:name ::conversion-tag-type-optimal
     :spec conversion-tag-type-optimal-data}))
