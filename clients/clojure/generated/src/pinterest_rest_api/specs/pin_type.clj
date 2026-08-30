(ns pinterest-rest-api.specs.pin-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pin-type-data
  {
   })

(def pin-type-spec
  (ds/spec
    {:name ::pin-type
     :spec pin-type-data}))
