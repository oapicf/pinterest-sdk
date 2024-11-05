(ns pinterest-rest-api.specs.user-list-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def user-list-type-data
  {
   })

(def user-list-type-spec
  (ds/spec
    {:name ::user-list-type
     :spec user-list-type-data}))
