(ns pinterest-rest-api.specs.conversion-deletion-request-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def conversion-deletion-request-status-data
  {
   })

(def conversion-deletion-request-status-spec
  (ds/spec
    {:name ::conversion-deletion-request-status
     :spec conversion-deletion-request-status-data}))
