(ns pinterest-rest-api.specs.asset-access-request-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def asset-access-request-error-data
  {
   (ds/opt :code) int?
   (ds/opt :messages) (s/coll-of string?)
   })

(def asset-access-request-error-spec
  (ds/spec
    {:name ::asset-access-request-error
     :spec asset-access-request-error-data}))
