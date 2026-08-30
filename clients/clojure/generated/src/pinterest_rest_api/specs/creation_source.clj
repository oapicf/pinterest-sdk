(ns pinterest-rest-api.specs.creation-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def creation-source-data
  {
   })

(def creation-source-spec
  (ds/spec
    {:name ::creation-source
     :spec creation-source-data}))
