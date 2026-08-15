(ns pinterest-rest-api.specs.pinterest/lib/status204
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pinterest/lib/status204-data
  {
   (ds/req :statusCode) float?
   })

(def pinterest/lib/status204-spec
  (ds/spec
    {:name ::pinterest/lib/status204
     :spec pinterest/lib/status204-data}))
