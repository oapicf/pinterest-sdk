(ns pinterest-rest-api.specs.exception
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def exception-data
  {
   (ds/opt :code) int?
   (ds/opt :message) string?
   })

(def exception-spec
  (ds/spec
    {:name ::exception
     :spec exception-data}))
