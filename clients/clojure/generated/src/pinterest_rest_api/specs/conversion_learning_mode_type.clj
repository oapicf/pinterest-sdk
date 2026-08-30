(ns pinterest-rest-api.specs.conversion-learning-mode-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def conversion-learning-mode-type-data
  {
   })

(def conversion-learning-mode-type-spec
  (ds/spec
    {:name ::conversion-learning-mode-type
     :spec conversion-learning-mode-type-data}))
