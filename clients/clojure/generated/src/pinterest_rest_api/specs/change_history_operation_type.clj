(ns pinterest-rest-api.specs.change-history-operation-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def change-history-operation-type-data
  {
   })

(def change-history-operation-type-spec
  (ds/spec
    {:name ::change-history-operation-type
     :spec change-history-operation-type-data}))
