(ns pinterest-rest-api.specs.pacing-delivery-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pacing-delivery-type-data
  {
   })

(def pacing-delivery-type-spec
  (ds/spec
    {:name ::pacing-delivery-type
     :spec pacing-delivery-type-data}))
