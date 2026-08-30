(ns pinterest-rest-api.specs.http-method
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def http-method-data
  {
   })

(def http-method-spec
  (ds/spec
    {:name ::http-method
     :spec http-method-data}))
