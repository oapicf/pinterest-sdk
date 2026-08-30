(ns pinterest-rest-api.specs.pinner-list-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pinner-list-type-data
  {
   })

(def pinner-list-type-spec
  (ds/spec
    {:name ::pinner-list-type
     :spec pinner-list-type-data}))
