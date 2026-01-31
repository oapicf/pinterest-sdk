(ns pinterest-rest-api.specs.gender-bucket
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def gender-bucket-data
  {
   })

(def gender-bucket-spec
  (ds/spec
    {:name ::gender-bucket
     :spec gender-bucket-data}))
