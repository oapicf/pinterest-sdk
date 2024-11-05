(ns pinterest-rest-api.specs.gender
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def gender-data
  {
   })

(def gender-spec
  (ds/spec
    {:name ::gender
     :spec gender-data}))
