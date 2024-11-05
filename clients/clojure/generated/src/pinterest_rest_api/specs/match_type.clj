(ns pinterest-rest-api.specs.match-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def match-type-data
  {
   })

(def match-type-spec
  (ds/spec
    {:name ::match-type
     :spec match-type-data}))
