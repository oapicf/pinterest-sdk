(ns pinterest-rest-api.specs.form-factor
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def form-factor-data
  {
   })

(def form-factor-spec
  (ds/spec
    {:name ::form-factor
     :spec form-factor-data}))
