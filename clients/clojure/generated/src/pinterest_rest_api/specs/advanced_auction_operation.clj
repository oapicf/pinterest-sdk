(ns pinterest-rest-api.specs.advanced-auction-operation
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def advanced-auction-operation-data
  {
   })

(def advanced-auction-operation-spec
  (ds/spec
    {:name ::advanced-auction-operation
     :spec advanced-auction-operation-data}))
