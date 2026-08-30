(ns pinterest-rest-api.specs.targeting-spec-list-operation
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def targeting-spec-list-operation-data
  {
   })

(def targeting-spec-list-operation-spec
  (ds/spec
    {:name ::targeting-spec-list-operation
     :spec targeting-spec-list-operation-data}))
