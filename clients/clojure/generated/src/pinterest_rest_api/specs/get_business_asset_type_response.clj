(ns pinterest-rest-api.specs.get-business-asset-type-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def get-business-asset-type-response-data
  {
   })

(def get-business-asset-type-response-spec
  (ds/spec
    {:name ::get-business-asset-type-response
     :spec get-business-asset-type-response-data}))
