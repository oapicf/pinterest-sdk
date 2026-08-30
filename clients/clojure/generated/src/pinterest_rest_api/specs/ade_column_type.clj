(ns pinterest-rest-api.specs.ade-column-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ade-column-type-data
  {
   })

(def ade-column-type-spec
  (ds/spec
    {:name ::ade-column-type
     :spec ade-column-type-data}))
