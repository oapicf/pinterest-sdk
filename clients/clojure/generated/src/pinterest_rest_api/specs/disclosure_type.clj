(ns pinterest-rest-api.specs.disclosure-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def disclosure-type-data
  {
   })

(def disclosure-type-spec
  (ds/spec
    {:name ::disclosure-type
     :spec disclosure-type-data}))
