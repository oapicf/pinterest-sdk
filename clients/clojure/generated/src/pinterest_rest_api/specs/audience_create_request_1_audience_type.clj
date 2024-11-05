(ns pinterest-rest-api.specs.audience-create-request-1-audience-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audience-create-request-1-audience-type-data
  {
   })

(def audience-create-request-1-audience-type-spec
  (ds/spec
    {:name ::audience-create-request-1-audience-type
     :spec audience-create-request-1-audience-type-data}))
