(ns pinterest-rest-api.specs.audience-definition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audience-definition-data
  {
   (ds/opt :date) string?
   (ds/opt :type) string?
   (ds/opt :scope) string?
   })

(def audience-definition-spec
  (ds/spec
    {:name ::audience-definition
     :spec audience-definition-data}))
