(ns pinterest-rest-api.specs.audience-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audience-type-data
  {
   })

(def audience-type-spec
  (ds/spec
    {:name ::audience-type
     :spec audience-type-data}))
