(ns pinterest-rest-api.specs.asset-type-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def asset-type-response-data
  {
   })

(def asset-type-response-spec
  (ds/spec
    {:name ::asset-type-response
     :spec asset-type-response-data}))
