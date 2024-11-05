(ns pinterest-rest-api.specs.conversion-tag-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def conversion-tag-type-data
  {
   })

(def conversion-tag-type-spec
  (ds/spec
    {:name ::conversion-tag-type
     :spec conversion-tag-type-data}))
