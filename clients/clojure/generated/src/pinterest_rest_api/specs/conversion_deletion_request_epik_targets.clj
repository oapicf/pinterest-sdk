(ns pinterest-rest-api.specs.conversion-deletion-request-epik-targets
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def conversion-deletion-request-epik-targets-data
  {
   (ds/req :epiks) (s/coll-of string?)
   })

(def conversion-deletion-request-epik-targets-spec
  (ds/spec
    {:name ::conversion-deletion-request-epik-targets
     :spec conversion-deletion-request-epik-targets-data}))
