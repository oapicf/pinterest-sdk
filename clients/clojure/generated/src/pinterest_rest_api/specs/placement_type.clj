(ns pinterest-rest-api.specs.placement-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def placement-type-data
  {
   })

(def placement-type-spec
  (ds/spec
    {:name ::placement-type
     :spec placement-type-data}))
