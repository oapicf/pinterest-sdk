(ns pinterest-rest-api.specs.bulk-request-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def bulk-request-status-data
  {
   })

(def bulk-request-status-spec
  (ds/spec
    {:name ::bulk-request-status
     :spec bulk-request-status-data}))
