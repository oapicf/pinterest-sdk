(ns pinterest-rest-api.specs.match-type-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def match-type-response-data
  {
   })

(def match-type-response-spec
  (ds/spec
    {:name ::match-type-response
     :spec match-type-response-data}))
