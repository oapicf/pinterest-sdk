(ns pinterest-rest-api.specs.placement-group-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def placement-group-type-data
  {
   })

(def placement-group-type-spec
  (ds/spec
    {:name ::placement-group-type
     :spec placement-group-type-data}))
