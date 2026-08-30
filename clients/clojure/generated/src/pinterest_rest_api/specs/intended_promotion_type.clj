(ns pinterest-rest-api.specs.intended-promotion-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def intended-promotion-type-data
  {
   })

(def intended-promotion-type-spec
  (ds/spec
    {:name ::intended-promotion-type
     :spec intended-promotion-type-data}))
