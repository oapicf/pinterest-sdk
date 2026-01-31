(ns pinterest-rest-api.specs.content-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def content-type-data
  {
   })

(def content-type-spec
  (ds/spec
    {:name ::content-type
     :spec content-type-data}))
