(ns pinterest-rest-api.specs.audience-definition-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audience-definition-type-data
  {
   (ds/opt :scope) string?
   })

(def audience-definition-type-spec
  (ds/spec
    {:name ::audience-definition-type
     :spec audience-definition-type-data}))
