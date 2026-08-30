(ns pinterest-rest-api.specs.trends-gender
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def trends-gender-data
  {
   })

(def trends-gender-spec
  (ds/spec
    {:name ::trends-gender
     :spec trends-gender-data}))
