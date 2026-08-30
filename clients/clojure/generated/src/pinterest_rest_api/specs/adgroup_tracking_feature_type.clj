(ns pinterest-rest-api.specs.adgroup-tracking-feature-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def adgroup-tracking-feature-type-data
  {
   })

(def adgroup-tracking-feature-type-spec
  (ds/spec
    {:name ::adgroup-tracking-feature-type
     :spec adgroup-tracking-feature-type-data}))
