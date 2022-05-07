(ns pinterest-rest-api.specs.campaign-response-all-of-1
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.objective-type :refer :all]
            )
  (:import (java.io File)))


(def campaign-response-all-of-1-data
  {
   (ds/opt :objective_type) objective-type-spec
   (ds/opt :created_time) int?
   (ds/opt :updated_time) int?
   (ds/opt :type) string?
   })

(def campaign-response-all-of-1-spec
  (ds/spec
    {:name ::campaign-response-all-of-1
     :spec campaign-response-all-of-1-data}))
