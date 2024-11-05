(ns pinterest-rest-api.specs.advanced-auction-operation-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def advanced-auction-operation-error-data
  {
   (ds/opt :code) int?
   (ds/opt :message) string?
   })

(def advanced-auction-operation-error-spec
  (ds/spec
    {:name ::advanced-auction-operation-error
     :spec advanced-auction-operation-error-data}))
