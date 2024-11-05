(ns pinterest-rest-api.specs.data-output-format
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def data-output-format-data
  {
   })

(def data-output-format-spec
  (ds/spec
    {:name ::data-output-format
     :spec data-output-format-data}))
