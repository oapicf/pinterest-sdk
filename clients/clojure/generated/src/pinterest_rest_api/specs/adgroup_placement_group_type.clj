(ns pinterest-rest-api.specs.adgroup-placement-group-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def adgroup-placement-group-type-data
  {
   })

(def adgroup-placement-group-type-spec
  (ds/spec
    {:name ::adgroup-placement-group-type
     :spec adgroup-placement-group-type-data}))
