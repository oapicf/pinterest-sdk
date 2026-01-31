(ns pinterest-rest-api.specs.audience-definition-scope
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audience-definition-scope-data
  {
   (ds/opt :scope) string?
   })

(def audience-definition-scope-spec
  (ds/spec
    {:name ::audience-definition-scope
     :spec audience-definition-scope-data}))
