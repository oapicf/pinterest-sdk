(ns pinterest-rest-api.specs.pinterest/lib/error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pinterest/lib/error-data
  {
   (ds/req :code) int?
   (ds/req :message) string?
   })

(def pinterest/lib/error-spec
  (ds/spec
    {:name ::pinterest/lib/error
     :spec pinterest/lib/error-data}))
