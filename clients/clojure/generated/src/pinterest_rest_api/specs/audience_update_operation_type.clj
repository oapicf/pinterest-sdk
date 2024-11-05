(ns pinterest-rest-api.specs.audience-update-operation-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audience-update-operation-type-data
  {
   })

(def audience-update-operation-type-spec
  (ds/spec
    {:name ::audience-update-operation-type
     :spec audience-update-operation-type-data}))
