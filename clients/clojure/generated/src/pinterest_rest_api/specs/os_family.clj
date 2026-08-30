(ns pinterest-rest-api.specs.os-family
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def os-family-data
  {
   })

(def os-family-spec
  (ds/spec
    {:name ::os-family
     :spec os-family-data}))
