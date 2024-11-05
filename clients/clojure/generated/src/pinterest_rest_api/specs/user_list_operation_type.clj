(ns pinterest-rest-api.specs.user-list-operation-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def user-list-operation-type-data
  {
   })

(def user-list-operation-type-spec
  (ds/spec
    {:name ::user-list-operation-type
     :spec user-list-operation-type-data}))
