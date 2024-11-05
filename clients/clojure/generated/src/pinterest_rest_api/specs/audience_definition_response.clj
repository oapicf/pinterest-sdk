(ns pinterest-rest-api.specs.audience-definition-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.audience-definition :refer :all]
            )
  (:import (java.io File)))


(def audience-definition-response-data
  {
   (ds/opt :items) (s/coll-of audience-definition-spec)
   })

(def audience-definition-response-spec
  (ds/spec
    {:name ::audience-definition-response
     :spec audience-definition-response-data}))
